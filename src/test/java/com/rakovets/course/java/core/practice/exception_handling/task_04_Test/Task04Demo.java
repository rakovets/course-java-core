package com.rakovets.course.java.core.practice.exception_handling.task_04_Test;

import com.rakovets.course.java.core.practice.exception_handling.task_04.MathOperations;

import java.util.Arrays;

public class Task04Demo {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        try {
            MathOperations.divide(num1, num2);
        } catch (RuntimeException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
