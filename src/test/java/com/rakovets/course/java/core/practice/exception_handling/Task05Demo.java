package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CheckingCorrectEnteredPhoneNumberException;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.JavaUtilLogging.logger;

public class Task05Demo {
    public static void main(String[] args) {
        Task05 task = new Task05();
        String enteredPhoneNumber = "3751242a";

        try {
            logger.info(String.valueOf(task.checkingEnteredPhoneNumber(enteredPhoneNumber)));
        } catch (CheckingCorrectEnteredPhoneNumberException ex) {
            logger.severe(ex.getMessage());
        }
    }
}
