package com.example.mvvmexample.model;

/**
 * Created by ahmad Mansour on 07,January,2020
 */
public class User {

    private String email;
    private String password;
    public String emailHint;
    public String passwordHint;

    public User(String emailHint, String passwordHint) {
        this.emailHint = emailHint;
        this.passwordHint = passwordHint;
    }
}
