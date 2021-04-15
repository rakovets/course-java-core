package com.rakovets.course.java.core.practice.exception_handling;

public class Task01Demo {
    public static void main(String[] args) {
        Task01 task01 = new Task01();
        try {
            task01.throwSomeException();
        } catch (NullPointerException e) {
            System.err.println("NullPointerException");
        }
    }
}
