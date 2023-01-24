package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.example.exception_handling.tasks.Task01;

public class Task01Demo {
    public static void main(String[] args) {
        String str = null;
        try {
            str = String.valueOf(Task01.getSubstring(str));
        } catch (NullPointerException e) {
            e.printStackTrace();
            str = e.getMessage();
        }
        System.out.println(str);
    }
}
