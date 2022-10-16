package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CheckingCorrectEnteredPhoneNumberException;

public class Task05 {
    public int checkingEnteredPhoneNumber(String enteredPhoneNumber) throws CheckingCorrectEnteredPhoneNumberException {
        int phoneNumber;

        try {
            if (!enteredPhoneNumber.matches("\\d+")) {
                throw new NumberFormatException("Incorrectly entered phone number!");
            } else {
                phoneNumber = Integer.parseInt(enteredPhoneNumber);
            }
        } catch (NumberFormatException ex) {
            throw new CheckingCorrectEnteredPhoneNumberException(ex.getMessage());
        }

        return phoneNumber;
    }
}
