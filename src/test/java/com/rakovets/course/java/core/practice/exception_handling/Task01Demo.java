package com.rakovets.course.java.core.practice.exception_handling;

public class Task01Demo {
    public static void main(String[] args) {

        try {
            Task01.throwException();
        } catch (NullPointerException e) {
            System.out.println("This is NullPointerException");
        }
    }
}
