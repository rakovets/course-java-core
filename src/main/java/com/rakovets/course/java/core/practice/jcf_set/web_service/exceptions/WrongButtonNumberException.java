package com.rakovets.course.java.core.practice.jcf_set.web_service.exceptions;

public class WrongButtonNumberException extends Exception {
    public WrongButtonNumberException() {
        super("Wrong button number, please choose from the Following");
    }
}
