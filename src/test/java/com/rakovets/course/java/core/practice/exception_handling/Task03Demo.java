package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.AgeException;

public class Task03Demo {
    public static void main(String[] args) {
        Task03 task03 = new Task03();
        try {
             task03.adult(17);
        } catch (AgeException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
