package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    private StringUtil stringUtil = new StringUtil();

    @Test
    void testConcatWithTwoValues() {
        testConcat("123", "456", "123456");
    }

    @Test
    void testConcatWithOneValue() {
        testConcat("123", "", "123");
    }

    @Test
    void testConcat(String input1, String input2, String expected) {
        String actual = StringUtil.concat(input1, input2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIndexOf(String input1, char x, int expected) {
        int actual = stringUtil.indexOf(input1, x);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIndexOf1() {
        testIndexOf("Hello", 'l', 2);
    }

    @Test
    void testIndexOf2() {
        testIndexOf("", 'e', -1);
    }

}

