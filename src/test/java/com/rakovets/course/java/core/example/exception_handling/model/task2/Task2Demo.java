package com.rakovets.course.java.core.example.exception_handling.model.task2;

import com.rakovets.course.java.core.example.exception_handling.task2.Task2;

public class Task2Demo {
    public static void main(String[] args) {
        try {
            Task2.throwSomeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array so small!");
        }
    }
}
