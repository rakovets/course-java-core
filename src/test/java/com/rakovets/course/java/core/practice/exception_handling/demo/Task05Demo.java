package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task05;
import com.rakovets.course.java.core.practice.exception_handling.exception.IncorrectValuesWhenWorkingWithAnArray;

public class Task05Demo {
    public static void main(String[] args) {
        String indexArray;

        int index = 5;
        int number = -4;

        try {
            indexArray = Task05.getIndexArray(index, number);
        } catch (IncorrectValuesWhenWorkingWithAnArray e) {
            indexArray = e.getMessage();
            e.printStackTrace();
        }
        System.out.println(indexArray);
    }
}
