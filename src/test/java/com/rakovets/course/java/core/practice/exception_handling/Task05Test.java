package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task05Test {

    @Test
    void catchAndChangeException() {
        String str = null;
        String actualMessage = "";
        String expectedMessage = "";

        try {
            str = str.toString();;
        } catch (Exception e) {
            expectedMessage = e.getMessage();
        }

        try {
            Task05.catchAndChangeException(str);
        } catch (CustomNullException ex) {
            actualMessage = ex.getMessage();
        }

        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}
