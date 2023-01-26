package com.rakovets.course.java.core.practice.exception_handling.task6;

public class ManyExceptionsDemo {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            ManyExceptions exception = new ManyExceptions(i);
            exception.trowException();
        }
    }
}
