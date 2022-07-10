package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task03;
import com.rakovets.course.java.core.practice.exception_handling.exception.AgeException;

public class Task03Demo {
    public static void main(String[] args) {
        String welcomeToClub;

        int age = 17;

        try {
            welcomeToClub = Task03.checkAge(age);
        } catch (AgeException e) {
            welcomeToClub = e.getMessage();
            e.printStackTrace();
        }
        System.out.println(welcomeToClub);
    }
}
