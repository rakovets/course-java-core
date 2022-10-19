package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.NegativeNumberException;

public class Task04Demo {
    public static void main(String[] args) {
        Task04 task04 = new Task04();
        try {
           task04.numberIsNegativeException(-2);
        } catch (NegativeNumberException e) {
            e.getMessage();
            e.printStackTrace();
        }

    }
}
