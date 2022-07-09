package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task01;

public class Task01Demo {
    public static void main(String[] args) {
        String firstString = null;
        String stringLength;

        try {
            stringLength = Task01.getStringLength(firstString);
        } catch (NullPointerException e) {
            e.printStackTrace();
            stringLength = e.getMessage();
        }
        System.out.println(stringLength);
    }
}
