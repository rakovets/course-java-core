package com.rakovets.course.java.core.practice.exception_handling.task7;

public class TwoExceptions {
    private int exceptionNumber;

    public TwoExceptions(int exceptionNumber) {
        this.exceptionNumber = exceptionNumber;
    }

    public void trowException() {
        try {
            switch (this.exceptionNumber) {
                case 1:
                    exceptionNumber++;
                    throw new NullPointerException();
                case 2:
                    throw new RuntimeException();
                default:
                    System.out.println("To throw exception, please create class with 1 to 3 constructor parameter");
            }
        } catch (NullPointerException exception) {
            System.out.println("Hello! You got an Error in your code!");
        } finally {
            System.out.println("Block finally done");
        }
    }
}
