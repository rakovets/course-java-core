package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Task5Test {
    @Test
    void getCorrectNameThrowsCorrectException() {
        // GIVEN
        String test = null;
        String actualMessage = "";

        // WHEN
        try {
            Task5.getCorrectName(test);
        } catch(ImpossibleAccountNameException invalidName) {
            actualMessage = invalidName.getMessage();
        }

        // THEN
        Assertions.assertEquals("Invalid name: String value is null", actualMessage);
    }

    @Test
    void getCorrectName() {
        // GIVEN
        String correctName = "anton";
        String actualName = "";

        // WHEN
        try {
            actualName = Task5.getCorrectName(correctName);
        } catch (ImpossibleAccountNameException invalidName) {
            actualName = invalidName.getMessage();
        }

        // THEN
        Assertions.assertEquals("ANTON123", actualName);
    }
}
