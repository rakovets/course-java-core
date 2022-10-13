package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.ExceptionNegativeNumber;

public class Task04Demo {
    public static void main(String[] args) {
        Task04 task04 = new Task04();
        String result = "";
        try {
            result += task04.numberIsNegativeException(-2);
        } catch (ExceptionNegativeNumber e) {
            result += e.getMessage();
        }
        System.out.println(result);
    }
}
