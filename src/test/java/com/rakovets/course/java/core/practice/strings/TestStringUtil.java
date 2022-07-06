package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringUtil {
    private final StringUtil stringUtilTest = new StringUtil();

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

    @Test
    void testCompareStringCaseSensitive() {
        boolean expected = true;

        boolean actual = StringUtil.compareStringCaseSensitive("Hello", "Hello");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCompareStringCaseSensitiveWithDifferentCase() {
        boolean expected = false;

        boolean actual = StringUtil.compareStringCaseSensitive("hello", "Hello");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testRemoveSpaceAndUppercase() {
       String expected = "GOOD MORNING";

       String actual = StringUtil.removeSpaceAndUppercase(" Good morning ");

       Assertions.assertEquals(expected, actual);
    }

    @Test
    void testRemoveSpaceAndUppercaseDifferentCase() {
        String expected = "GOOD MORNING";

        String actual = StringUtil.removeSpaceAndUppercase("gOOd mOrNiNg ");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testExtractSubstring() {
        String expected = "morning";

        String actual= StringUtil.extractSubstring("Good morning", 5, 12);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testExtractSubstringWithEndingAndBeginning0() {
        String expected = "";

        String actual= StringUtil.extractSubstring("HELLO PEOPLE", 0, 0);

        Assertions.assertEquals(expected, actual);}

    @Test
    void  testReplaceEmoji() {
        String expected = "Good morning :)";

        String actual = StringUtil.replaceEmoji("Good morning :(", ":(", ":)");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void  testReplaceEmojiWithoutEmoji() {
        String expected = "Good morning";

        String actual = StringUtil.replaceEmoji("Good morning", ":(", ":)");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testReceiveIfEndAndBeginningIsWord() {
        boolean expected = true;

        boolean actual = StringUtil.receiveIfEndAndBeginningIsWord("good morning good", "good");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testReceiveIfEndAndBeginningIsWordWithDifferentCase() {
        boolean expected = false;

        boolean actual = StringUtil.receiveIfEndAndBeginningIsWord("Good morning good", "good");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetNumberOfVowels() {
        int actual = StringUtil.getNumberOfVowels("Good morning");

        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetNumberOfVowelsWithoutVowels() {
        int actual = StringUtil.getNumberOfVowels("GBTRDSRT");

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetNumberOfPunctuationMarks() {
        int actual = StringUtil.getNumberOfPunctuationMarks("Добрый вечер! Как твои дела?");

        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetNumberOfPunctuationMarksWithoutPunctuationMarks() {
        int actual = StringUtil.getNumberOfPunctuationMarks("Добрый вечер");

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testisPalindrome() {
        boolean actual = StringUtil.isPalindrome("Do geese see God?");

        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testisNotPalindrome() {
        boolean actual = StringUtil.isPalindrome("Do geese see?");

        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testsSplitToEqualParts() {
        String[] expected = {"Go", "od", " m", "or", "ni", "ng"};

        String[] actual = StringUtil.splitToEqualParts("Good morning", 2);

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void testsSplitToEqualPartsWithAllSymbols() {
        String[] expected = {"Good morning"};

        String[] actual = StringUtil.splitToEqualParts("Good morning", 12);

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void testCountWordsNumber() {
        int actual = StringUtil.countWordsNumber("Good  morning");

        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCountWordsNumberEmpty() {
        int actual = StringUtil.countWordsNumber("");

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetInitials() {
        String actual = StringUtil.getInitials("Alina dubrovina");

        String expected = "AD";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetInitialsWithEmpty() {
        String actual = StringUtil.getInitials(" ");

        String expected = "";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetNumbers() {
        String expected = "123";

        String actual = StringUtil.getNumbers("Hello123");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetNumbersWithoutNumbers() {
        String expected = "";

        String actual = StringUtil.getNumbers("Hello");

        Assertions.assertEquals(expected, actual);
    }
}
