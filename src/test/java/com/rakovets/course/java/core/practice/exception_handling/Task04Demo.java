package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.customExceptions.CustomRuntimeException;

public class Task04Demo {
    public static void main(String[] args) {
        try {
            Task04 object = new Task04();
            object.throwCustomRuntimeException();
        } catch (CustomRuntimeException exception){
            System.out.println(exception.getMessage());
        }
    }
}
