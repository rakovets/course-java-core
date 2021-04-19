package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.customExceptions.CustomNoDataException;

public class Task05Demo {
    public static void main(String[] args) {
        Task05 print = new Task05(null);
        try {
            print.printException();
        } catch (CustomNoDataException exception) {
            System.out.println(exception.toString());
        }
    }
}
