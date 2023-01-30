package com.rakovets.course.java.core.practice.exception_handling.task7;

public class TwoExceptionsDemo {
    public static void main(String[] args) {
        try {
            for (int i = 1; i < 3; i++) {
                TwoExceptions exceptions = new TwoExceptions(i);
                exceptions.trowException();
            }
        } catch (NullPointerException exceptionNull) {
            System.out.println("Hello! You got an Error in your code!");
        } finally {
            System.out.println("Block finally done");
        }
    }
}
