package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.AgeException;

public class Task03Demo {
    public static void main(String[] args) {
        Task03 task03 = new Task03();
        String result = "";
        try {
            result += task03.adult(17);
        } catch (AgeException e) {
            result += e.getMessage();
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
