package com.rakovets.course.java.core.practice.exception_handling.task6;

public class ManyExceptionsDemo {
    public static void main(String[] args) {
        ManyExceptions exception1 = new ManyExceptions(4);

        exception1.trowException();
    }
}
