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
    void testConcat(String str1, String str2, String expected) {
        String actual = stringUtil.concat(str1, str2);
        Assertions.assertEquals(expected, actual);
    }


    void testIndexOf(String str1, char symbol, int expected) {
        int actual = stringUtil.indexOf(str1, symbol);
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

    void testEquals(String str1, String str2, boolean expected) {
        boolean actual = stringUtil.equals(str1, str2);
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

    void testTrimSpaceLowerCase(String str1, String expected) {
        String actual = stringUtil.trimSpaceLowerCase(str1);
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

    void testSubstringSymbol(String str1, char firstSymbol, char secondSymbol, String expected) {
        String actual = stringUtil.substringSymbol(str1, firstSymbol, secondSymbol);
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

    void testReplace(String str1, String oldValue, String newValue, String expected) {
        String actual = stringUtil.replace(str1, oldValue, newValue);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testReplace1() {
        testReplace("Hello Java:(", ":(", ":)", "Hello Java:)");
    }

    @Test
    void testReplace2() {
        testReplace("Hello() Java:(", ":(", ":)", "Hello() Java:)");
    }

    void testStartAndEndWithWord(String str1, String word, Boolean expected) {
        Boolean actual = stringUtil.startAndEndWithWord(str1, word);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testStartAndEndWithWord1() {
        testStartAndEndWithWord("Hello,Java,Hello", "hello", false);
    }

    @Test
    void testStartAndEndWithWord2() {
        testStartAndEndWithWord("Hello,Java,Hello", "Hello", true);
    }

    @Test
    void testStartAndEndWithWord3() {
        testStartAndEndWithWord("Hello,Java", "Hello", false);
    }

    @Test
    void testStartAndEndWithWord4() {
        testStartAndEndWithWord("Java, hello", "hello", false);
    }

    void testCountVowels(String str1, int expected) {
        int actual = stringUtil.countVowels(str1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCountVowels1() {
        testCountVowels("Hello", 2);
    }

    @Test
    void testCountVowels2() {
        testCountVowels("GIT is SOFTWARE for tracking changes", 10);
    }


}

