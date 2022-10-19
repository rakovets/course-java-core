package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.DivisionTwoNumbersExcepton;

public class Task05Demo {
    public static void main(String[] args) {
        Task05 task05 = new Task05();
        try {
            task05.divisionTwoNumber(2, 0);
        } catch (DivisionTwoNumbersExcepton e) {
             e.getMessage();
            e.printStackTrace();
        }
    }
}
