package com.rakovets.course.java.core.practice.exception_handling;

public class Task06Demo {
    public static void main(String[] args) {
        try {
            Task06.randomException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
