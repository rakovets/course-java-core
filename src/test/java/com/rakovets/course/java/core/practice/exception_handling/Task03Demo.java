package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.customExceptions.CustomGetException;

public class Task03Demo {
    public static void main(String[] args) {
        try {
            Task03 object = new Task03();
            object.throwGetException();
        } catch (CustomGetException exception){
            System.out.println(exception.getStackTrace());
            System.out.println(exception.getMessage());

        }
    }
}
