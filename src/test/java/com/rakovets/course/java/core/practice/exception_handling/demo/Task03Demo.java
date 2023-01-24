package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.exception.IsPositiveNumberException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Task03;

public class Task03Demo {
    public static void main(String[] args) throws IsPositiveNumberException {
        int number;
        String num;

        try {
            num = Task03.getIsPositiveNumber(-5);
        } catch (IsPositiveNumberException e) {
            num = e.getMessage();
            e.printStackTrace();
        }
        System.out.println(num);
    }
}
