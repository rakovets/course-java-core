package com.rakovets.course.java.core.example.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.OutOfRangeRuntimeException;
import com.rakovets.course.java.core.practice.exception_handling.Task04;

public class Task04Demo {
    public static void main(String[] args) {
        try {
            Task04 object = new Task04();
            object.outOfRangeRuntimeException();
        } catch (OutOfRangeRuntimeException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getStackTrace());
        }
    }
}
