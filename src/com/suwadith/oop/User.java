package com.suwadith.oop;

public class User {

    private String username;

    public User() {
        this.username = "unknown";
    }

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
