package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTask5 {

    @Test
    void checkHeight() throws Height.HeightException {
        Height acceptableHeight = new Height(150);
        int expectedHeight = 150;

        int actualHeight = acceptableHeight.checkHeight(150);

        Assertions.assertEquals(expectedHeight, actualHeight);




    }
}
