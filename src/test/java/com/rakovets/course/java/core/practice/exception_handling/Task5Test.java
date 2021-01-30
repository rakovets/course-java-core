package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Locale;

public class Task5Test {
    @Test
    void getCorrectNameThrowsCorrectException() {
        // GIVEN
        String test = null;
        String actualMessage = "";
        String expectedMessage = "";

        // WHEN
        try {
            test.toUpperCase(Locale.ROOT);
        } catch (NullPointerException nullPointer) {
            expectedMessage = nullPointer.getMessage();
        }

        try {
            Task5.getCorrectName(test);
        } catch(ImpossibleAccountNameException invalidName) {
            actualMessage = invalidName.getMessage();
        }

        // THEN
        Assertions.assertEquals(expectedMessage, actualMessage);
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
