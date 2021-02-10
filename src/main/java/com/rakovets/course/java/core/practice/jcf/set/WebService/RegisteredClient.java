package com.rakovets.course.java.core.practice.jcf.set.WebService;

public class RegisteredClient {
    private final String password;

    public RegisteredClient(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "password: " + password;
    }
}
