package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task5Test {

    @Test
    void task5() {
        String bossName = null;
        String expectedMessage = "";
        String actualMessage = "";

        try {
            int i = bossName.length();
        } catch (NullPointerException e) {
            expectedMessage = e.getMessage();
        }

        try {
            char ch = Task5.getFirstLetter(bossName);
        } catch (Task5BossException e) {
            actualMessage = e.getMessage();
        }

        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}
