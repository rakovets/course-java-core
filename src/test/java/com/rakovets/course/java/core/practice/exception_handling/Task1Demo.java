package com.rakovets.course.java.core.practice.exception_handling;

public class Task1Demo {
    public static void main(String[] args) {
        try {
            Task1.throwSomeException();
        } catch (NullPointerException ex) {
            System.out.println("String is null");
        }
    }
}
