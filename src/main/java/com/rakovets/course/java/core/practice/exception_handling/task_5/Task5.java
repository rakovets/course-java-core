package com.rakovets.course.java.core.practice.exception_handling.task_5;

public class Task5 {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (ExistObjectException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void someMethod() throws ExistObjectException {
        try {
            doCheck();
        } catch (NullPointerException e) {
            throw new ExistObjectException(e, e.getMessage());
        }
    }

    public static void doCheck() throws NullPointerException {
        throw new NullPointerException("MESSAGE OF NullPointerException");
    }

}
