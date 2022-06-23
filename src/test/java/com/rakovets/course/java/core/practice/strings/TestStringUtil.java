package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringUtil {
    StringUtil actualString = new StringUtil();
    @Test
    void testConcatWithTwoValues() {
        testConcat("123", "456", "123456");
    }

    @Test
    void testConcatWithEmptyValues() {
        testConcat("", "","");
    }

    void testConcat(String input1, String input2, String expected) {}
}
