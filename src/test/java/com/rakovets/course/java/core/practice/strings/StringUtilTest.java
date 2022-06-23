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
        String actual = stringUtil.concat(input1, input2);
        Assertions.assertEquals(expected, actual);
    }


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

    void testEquals(String input1, String input2, boolean expected) {
        boolean actual = stringUtil.equals(input1, input2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testEquals1() {
        testEquals("Hello", "Hello", true);
    }

    @Test
    void testEquals2() {
        testEquals("Java", "java", false);
    }

    void testTrimSpaceLowerCase(String input1, String expected) {
        String actual = stringUtil.trimSpaceLowerCase(input1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testTrimSpaceLowerCase1() {
        testTrimSpaceLowerCase("   Hello    ", "hello");
    }

    @Test
    void testTrimSpaceLowerCase2() {
        testTrimSpaceLowerCase("    JA VA   ", "ja va");
    }

    void testSubstringSymbol(String input1, char n, char m, String expected) {
        String actual = stringUtil.substringSymbol(input1, n, m);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSubstringSymbol1() {
        testSubstringSymbol("Hello Java", 'J', 'a', "Ja");
    }

    @Test
    void testSubstringSymbol2() {
        testSubstringSymbol("gGit", 'G', 't', "Git");
    }

}

