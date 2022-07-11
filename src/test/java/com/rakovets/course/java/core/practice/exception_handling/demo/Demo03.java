package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task03;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.isPositiveException;

public class Demo03 {
    public static void main(String[] args) {
        Task03 task03 = new Task03();
        int number = -23;
        String result;
        try {
            result = task03.isPositive(number);
        } catch (isPositiveException e) {
            e.printStackTrace();
            result = e.getMessage();
        }
        System.out.println(result);
    }
}
