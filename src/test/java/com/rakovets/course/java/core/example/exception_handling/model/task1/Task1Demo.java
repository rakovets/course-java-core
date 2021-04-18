package com.rakovets.course.java.core.example.exception_handling.model.task1;

import com.rakovets.course.java.core.example.exception_handling.task1.Task1;

public class Task1Demo {
    public static void main(String[] args) {
        try {
            Task1.throwSomeException();
        } catch (NullPointerException e) {
            System.out.println("Str is empty");
        }
    }
}
