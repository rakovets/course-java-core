package com.rakovets.course.java.core.example.exception_handling.model.task6;

import com.rakovets.course.java.core.example.exception_handling.task6.Task6;

import java.util.Random;

public class Task6Demo {
    public static void main (String[] args) {
        try {
            Task6.myExceptionMetod();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Warning the program is not working");
        } catch (NullPointerException e) {
            System.err.println("Not exist value");
        }
    }
}
