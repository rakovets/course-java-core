package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringUtil {
    StringUtil stringUtil = new StringUtil();
    @Test
    void testConcatWithTwoValues() {
        testValues("123", "456", "123456");
    }

    @Test
    void testConcatWithEmptyValues() {testValues("", "", "");}

    @Test
    void testGetIndexOfSymbol() {
        testValues("Hello", "l", String.valueOf(2));
    }

    @Test
    void testGetIndexOfSymbolIfWrong() {
        testValues("Hello", "b", String.valueOf(-1));
    }

    void testValues(String input1, String input2, String expected) {}
}

