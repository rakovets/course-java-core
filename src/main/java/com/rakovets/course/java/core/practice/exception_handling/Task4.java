package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.EmptinessException;

public class Task4 {
    public String getText(String txt) throws EmptinessException {
        if (txt == null) {
            throw new EmptinessException("Enter text");
        } else return txt;
    }
}
