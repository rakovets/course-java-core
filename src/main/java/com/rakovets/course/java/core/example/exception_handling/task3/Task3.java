package com.rakovets.course.java.core.example.exception_handling.task3;

public class Task3{
    public static int positiveNumber(int number) throws WrongPositivNumberException {
        if (number > 0) {
            return number;
        } else {
            throw new WrongPositivNumberException();
        }
    }
}
