package com.octopus.teraHire.service;

import com.octopus.teraHire.exception.UserNotFound;
import com.octopus.teraHire.model.AuthUser;
import com.octopus.teraHire.model.User;
import com.octopus.teraHire.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {



    private UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;

    }



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByEmail(username).get();

        if(user == null){
            throw new UserNotFound("Email "+ username +"not found.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),getGrantedAuthority(user));
    }

    private Collection<GrantedAuthority> getGrantedAuthority(User user){
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        if(user.getUserTypeId() == 201){
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return authorities;
    }
}
