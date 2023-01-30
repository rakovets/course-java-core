package com.rakovets.course.java.core.practice.exception_handling.task6;

public class ManyExceptionsDemo {
    public static void main(String[] args) {
        try {
            for (int i = 0; i <= 4; i++) {
                ManyExceptions exception = new ManyExceptions(i);
                exception.trowException();
            }
        } catch (NullPointerException | IndexOutOfBoundsException exception) {
            System.out.println("Hello! You got an Error in your code!");
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
