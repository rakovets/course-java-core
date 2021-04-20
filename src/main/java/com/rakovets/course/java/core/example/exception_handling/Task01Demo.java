package com.rakovets.course.java.core.example.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.Task01;

public class Task01Demo {
    public static void main(String[] args) {
        try {
            Task01.throwSomeException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}
