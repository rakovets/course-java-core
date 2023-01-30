package com.rakovets.course.java.core.practice.exception_handling.task7;

public class TwoExceptions {
    private final int exceptionNumber;

    public TwoExceptions(int exceptionNumber) {
        this.exceptionNumber = exceptionNumber;
    }

    public void trowException() {
        switch (exceptionNumber) {
            case 1:
                throw new NullPointerException();
            case 2:
                throw new RuntimeException();
            default:
                System.out.println("To throw exception, please create class with 1 to 3 constructor parameter");
        }
    }
}
