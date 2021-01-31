package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.CustomException;
import com.rakovets.course.java.core.practice.exception_handling.Task3;

public class Task3Demo {
    public static void main(String[] args) {
        try {
            Task3.concatination(null, "13234");
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
