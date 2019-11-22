package com.rakovets.course.challenge.exception_handling;

public class MyException extends Exception {
    private int age;

    public int getAge() {
        return age;
    }

    public MyException(String message, int age) {
        super(message);
        this.age = age;
    }
}
