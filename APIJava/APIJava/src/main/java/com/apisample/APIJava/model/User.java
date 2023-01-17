package com.apisample.APIJava.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {


    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(name = "user_name")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

    public User(long id, String username, String email, String password) {
        this.Id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public long getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
