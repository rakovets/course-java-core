package com.rakovets.course.java.core.example.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.Task02;

public class Task02Demo {
    public static void main(String[] args) {
        try {
            Task02.takeAwayArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
