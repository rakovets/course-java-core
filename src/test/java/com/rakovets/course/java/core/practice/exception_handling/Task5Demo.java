package com.rakovets.course.java.core.practice.exception_handling;

public class Task5Demo {
    public static void main(String[] args) {
        try {
            Task5.myException();
        } catch (MyOwnException e) {
            System.err.println(e.getMessage());
        }
    }
}
