package com.rakovets.course.java.core.practice.jcf_set.web_service.Exceptions;

public class LoginDoesNotExistException extends Exception {
    public LoginDoesNotExistException() {
        super("Wrong Login, please try again");
    }
}
