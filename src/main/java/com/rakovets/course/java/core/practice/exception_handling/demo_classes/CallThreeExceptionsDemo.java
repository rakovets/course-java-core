package com.rakovets.course.java.core.practice.exception_handling.demo_classes;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.NumberIsLessThanZeroException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.NumberIsMoreThanZeroException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.NumberIsValidException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.ThreeExceptionsSimulation;

public class CallThreeExceptionsDemo {
    public static void main(String[] args) {
        int number = 5;
        try {
            new ThreeExceptionsSimulation().callExceptions(number);
        } catch (NumberIsMoreThanZeroException | NumberIsLessThanZeroException exception) {
            number = 0;
        } catch (NumberIsValidException exception) {
            exception.printStackTrace();
        }
    }
}
