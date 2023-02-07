package com.rakovets.course.java.core.practice.exception_handling.demo_classes;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.TwoExceptionsSimulation;

public class CallTwoExceptionsDemo {
    public static void main(String[] args) {
        int number = 5;
        try {
            new TwoExceptionsSimulation().callException(number);
        } catch (CustomException exception) {
            exception.printStackTrace();
        } finally {
            number = 0;
        }
    }
}
