package com.apisample.APIJava.repository;

import com.apisample.APIJava.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
