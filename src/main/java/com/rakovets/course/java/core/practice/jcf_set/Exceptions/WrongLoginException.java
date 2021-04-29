package com.rakovets.course.java.core.practice.jcf_set.Exceptions;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Wrong Login, please try again");
    }
}
