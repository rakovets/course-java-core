package com.rakovets.course.java.core.practice.jcf_set.web_service.Exceptions;

public class LoginAlreadyExistsException extends Exception {
    public LoginAlreadyExistsException(){
        super("Login already exist. Please choose another Login and try again");
    }
}
