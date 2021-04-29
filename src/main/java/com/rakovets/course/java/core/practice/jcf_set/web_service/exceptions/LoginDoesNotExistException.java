package com.rakovets.course.java.core.practice.jcf_set.web_service.exceptions;

public class LoginDoesNotExistException extends Exception {
    public LoginDoesNotExistException() {
        super("Wrong Login, please try again");
    }
}
