package com.rakovets.course.java.core.example.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.DivisionZeroException;
import com.rakovets.course.java.core.practice.exception_handling.Task05;

public class Task05Demo {
    public static void main(String[] args) {
        Task05 devision = new Task05();

        try {
            System.out.println(devision.getDevisionNumbers(20, 5));
        } catch (ArithmeticException ex) {
            throw new DivisionZeroException(ex.getMessage());
        }
    }
}
