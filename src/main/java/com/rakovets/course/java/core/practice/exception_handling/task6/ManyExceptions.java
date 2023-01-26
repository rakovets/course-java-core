package com.rakovets.course.java.core.practice.exception_handling.task6;

public class ManyExceptions {
    private final int exceptionNumber;

    public ManyExceptions(int exceptionNumber) {
            this.exceptionNumber = exceptionNumber;
    }

    public void trowException() {
        try {
            switch (this.exceptionNumber) {
                case 1:
                    throw new NullPointerException();
                case 2:
                    throw new RuntimeException();
                case 3:
                    throw new IndexOutOfBoundsException();
                default:
                    System.out.println("To throw exception, please create class with 1 to 3 constructor parameter");
            }
        } catch (NullPointerException | IndexOutOfBoundsException exception) {
            System.out.println("Hello! You got an Error in your code!");
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
