package com.rakovets.course.java.core.practice.exception_handling;

public class Task07 {
    public static void main(String[] args) {
        try {
            partOfTheTimeException();
        } catch (NullPointerException e) {
            System.out.println("String is null");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Program completed");
    }

    public static void partOfTheTimeException() throws NullPointerException {
        if ((int) (Math.random() * 2) == 1) {
            throw new NullPointerException();
        }
    }
}
