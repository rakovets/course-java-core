package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.ExceptionAge;

public class Task03Demo {
    public static void main(String[] args) {
        Task03 task03 = new Task03();
        String result = "";
        try {
            result += task03.adult(17);
        } catch (ExceptionAge e) {
            result += e.getMessage();
        }
        System.out.println(result);
    }
}
