package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringUtil {
    private final StringUtil stringUtilTest = new StringUtil();
    //Task 1 tests
    @Test
    void testConcatWithTwoValues() {
        String expected = "123456";
        String actual = StringUtil.concatTwoStrings("123", "456");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testConcatWithEmptyValues() {
        String expected = " 1234";
        String actual = StringUtil.concatTwoStrings(" ", "1234");
        Assertions.assertEquals(expected, actual);
    }

    //Task 2 test
    @Test
    void testGetIndexOfSymbol() {
        int actual1 = StringUtil.getIndexOfSymbol("Hello", "l");
        int expected1 = 2;
        Assertions.assertEquals(expected1, actual1);
        int expected2 = -1;
        int actual2 = StringUtil.getIndexOfSymbol("Hello", "b");
        Assertions.assertEquals(expected2, actual2);
    }

    //Task 3 test
    @Test
    void testCompareStringCaseSensitive() {
        boolean expected = true;
        boolean actual = StringUtil.compareStringCaseSensitive("Hello", "Hello");
        Assertions.assertEquals(expected, actual);
    }

    //Task 4 test
    @Test
    void testRemoveSpaceAndUppercase() {
       String expected = "GOOD MORNING";
       String actual = StringUtil.removeSpaceAndUppercase(" Good morning ");
       Assertions.assertEquals(expected, actual);
    }

    //Task 5 test
    @Test
    void testExtractSubstring() {
        String expected = "morning";
        String actual= StringUtil.extractSubstring("Good morning", 5, 12);
        Assertions.assertEquals(expected, actual);
    }

    //Task 6 test
    @Test
    void  testReplaceEmoji() {
        String expected = "Good morning :)";
        String actual = StringUtil.replaceEmoji("Good morning :(", ":(", ":)");
        Assertions.assertEquals(expected, actual);
    }

    //Task 7 test
    @Test
    void testReceiveIfEndAndBeginningIsWord() {
        boolean expected = true;
        boolean actual = StringUtil.receiveIfEndAndBeginningIsWord("good morning good", "good");
        Assertions.assertEquals(expected, actual);
    }

    //Task 8 test
    @Test
    void testGetNumberOfVowels() {
        int actual = StringUtil.getNumberOfVowels("Good morning");
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    //Task 9 test
    @Test
    void testgetNumberOfPunctuationMarks() {
        int actual = StringUtil.getNumberOfPunctuationMarks("Добрый вечер! Как твои дела?");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    //Task 10 test
    @Test
    void testisPalindrome() {
        boolean actual = StringUtil.isPalindrome("Do geese see God?");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    //Task 11 test
    @Test
    void testsSplitToEqualParts() {
        String[] expected = {"Go", "od", " m", "or", "ni", "ng"};
        String[] actual = StringUtil.splitToEqualParts("Good morning", 2);
        Assertions.assertArrayEquals(actual, expected);
    }

    //Task 12 test
    @Test
    void testCountWordsNumber() {
        int actual = StringUtil.countWordsNumber("Good  morning");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    //Task 13 test
    @Test
    void testGetInitials() {
        String actual = StringUtil.getInitials("Alina dubrovina");
        String expected = "AD";
        Assertions.assertEquals(expected, actual);
    }

    //Task 14 test
    @Test
    void testGetNumbers() {
        String expected = "123";
        String actual = StringUtil.getNumbers("Hello123");
        Assertions.assertEquals(expected, actual);
    }
}
