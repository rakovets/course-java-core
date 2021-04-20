package com.rakovets.course.java.core.example.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.NotFoundGetException;
import com.rakovets.course.java.core.practice.exception_handling.Task03;

public class Task03Demo {
    public static void main(String[] args) {
        try {
            Task03 object = new Task03();
            object.notFoundGetException();
        } catch (NotFoundGetException exception){
            System.out.println(exception.getStackTrace());
            System.out.println(exception.getMessage());
        }
    }
}
