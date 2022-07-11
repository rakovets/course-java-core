package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task01;

public class Demo01 {
    public static void main(String[] args) {
        Task01 task01 = new Task01();
        String string = null;
        String result;
        try {
            result = task01.getStringLenght(string);
        } catch (NullPointerException e) {
            e.printStackTrace();
            result = e.getMessage();
        }
        System.out.println(result);
    }
}
