package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();

    //Task 1 tests
    @Test
    void concatTwoStringsTest() {
        String expected = "789123";
        String actual = stringUtil.concatTwoStrings("789", "123");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void concatTwoEmptyStringsTest() {
        String expected = "";
        String actual = stringUtil.concatTwoStrings("", "");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void concatWithFirstEmptyStringTest() {
        String expected = "aBc";
        String actual = stringUtil.concatTwoStrings("", "aBc");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void concatWithSecondEmptyStringTest() {
        String expected = "100 $";
        String actual = stringUtil.concatTwoStrings("100 $", "");
        Assertions.assertEquals(actual, expected);
    }

    //Task 2 tests
    @Test
    void findStringSymbolIndexTest() {
        int expected = 1;
        int actual = stringUtil.findStringSymbolIndex("Hello", 'e');
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findStringSymbolZeroIndexTest() {
        int expected = 0;
        int actual = stringUtil.findStringSymbolIndex("Hello", 'H');
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findStringSymbolLastIndexTest() {
        int expected = 4;
        int actual = stringUtil.findStringSymbolIndex("Hello", 'o');
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findStringNotExistingSymbolIndexTest() {
        int expected = -1;
        int actual = stringUtil.findStringSymbolIndex("Hello", 'F');
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findEmptyStringSymbolIndexTest() {
        int expected = -1;
        int actual = stringUtil.findStringSymbolIndex("", 'n');
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void findStringSymbolDuplicateIndexTest() {
        int expected = 7;
        int actual = stringUtil.findStringSymbolIndex("Hello Java", 'a');
        Assertions.assertEquals(actual, expected);
    }

    //Task 3 tests
    @Test
    void isStringsEqualsTest() {
        boolean expected = true;
        boolean actual = stringUtil.isStringsEquals("Hello123", "Hello123");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isStringsEqualsDifferentCasesTest() {
        boolean expected = false;
        boolean actual = stringUtil.isStringsEquals("Hello", "hello");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isStringsEqualsBothEmptyTest() {
        boolean expected = true;
        boolean actual = stringUtil.isStringsEquals("", "");
        Assertions.assertEquals(actual, expected);
    }

    //Task 4 tests
    @Test
    void stringTrimAndUpperCaseTest() {
        String expected = "TEST";
        String actual = stringUtil.stringTrimAndUpperCase(" test ");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void stringTrimAndUpperEmptyStringTest() {
        String expected = "";
        String actual = stringUtil.stringTrimAndUpperCase("");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void stringTrimAndUpperCaseAlreadyUpperCaseTest() {
        String expected = "TEST";
        String actual = stringUtil.stringTrimAndUpperCase("TEST");
        Assertions.assertEquals(actual, expected);
    }

    //Task 5 tests
    @Test
    void removeSubstringTest() {
        String expected = "is test";
        String actual = stringUtil.removeSubstring("This is test message", 5, 12);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void removeSubstringSpacesTest() {
        String expected = "test    ";
        String actual = stringUtil.removeSubstring("This is test       ", 8, 16);
        Assertions.assertEquals(actual, expected);
    }

    //Task 6 tests
    @Test
    void replaceSadFaceInStringTest() {
        String expected = ":) just a sad face. It should look like this :)";
        String actual = stringUtil.replaceSadFaceInString(":( just a sad face. It should look like this :)");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void replaceSadFaceInStringBrokenEmojiTest() {
        String expected = "The face is sad : (. But this one - not :))";
        String actual = stringUtil.replaceSadFaceInString("The face is sad : (. But this one - not :()");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void replaceSadFaceInStringMultipleEmojiTest() {
        String expected = ":):):):)";
        String actual = stringUtil.replaceSadFaceInString(":(:(:(:(");
        Assertions.assertEquals(actual, expected);
    }

    //Task 7 tests
    @Test
    void isStringStartAndFinishWithTest() {
        boolean expected = true;
        boolean actual = stringUtil.isStringStartAndFinishWith("hello its hello", "hello");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isStringStartAndFinishWithDifferentWordsTest() {
        boolean expected = false;
        boolean actual = stringUtil.isStringStartAndFinishWith("hello its hell", "hello");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isStringStartAndFinishWithTextAndWordSimilarTest() {
        boolean expected = true;
        boolean actual = stringUtil.isStringStartAndFinishWith("hello", "hello");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isStringStartAndFinishWithEmptyStringAndTestTest() {
        boolean expected = true;
        boolean actual = stringUtil.isStringStartAndFinishWith(" ", " ");
        Assertions.assertEquals(actual, expected);
    }

    //Task 8 tests
    @Test
    void vowelsCounterInStringTest() {
        int expected = 1;
        int actual = stringUtil.vowelsCounterInString("test");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void vowelsCounterInStringNoVowelsTest() {
        int expected = 0;
        int actual = stringUtil.vowelsCounterInString("tst");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void vowelsCounterInStringMultipleVowelsTest() {
        int expected = 11;
        int actual = stringUtil.vowelsCounterInString("this is test message for the counter");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void vowelsCounterInStringUpperAndLowerCaseTest() {
        int expected = 11;
        int actual = stringUtil.vowelsCounterInString("thIs is test messagE for the cOunter");
        Assertions.assertEquals(actual, expected);
    }

    //Task 9 tests
    @Test
    void specialSymbolsCounterInStringTest() {
        int expected = 2;
        int actual = stringUtil.specialSymbolsCounterInString("Hello! What is your name?");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void specialSymbolsCounterInStringNoSymbolsTest() {
        int expected = 0;
        int actual = stringUtil.specialSymbolsCounterInString("My name is test");
        Assertions.assertEquals(actual, expected);
    }

    //Task 10 tests
    @Test
    void isStringPalindromeTest() {
        boolean expected = true;
        boolean actual = stringUtil.isStringPalindrome("one eno");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isStringPalindromeBothCasesTest() {
        boolean expected = true;
        boolean actual = stringUtil.isStringPalindrome("one EnO");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void isStringPalindromeEmptyStringTest() {
        boolean expected = false;
        boolean actual = stringUtil.isStringPalindrome("");
        Assertions.assertEquals(actual, expected);
    }

    //Task 11 tests
    @Test
    void stringSplitToArraysTest() {
        String[] expected = {"Thi", "s i", "s t", "est", " me", "ssa", "ge"};
        String[] actual = stringUtil.stringSplitToArrays("This is test message", 3);
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void stringSplitToArraysSymbolPerStringTest() {
        String[] expected = {"H", "e", "l", "l", "o"};
        String[] actual = stringUtil.stringSplitToArrays("Hello", 1);
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void stringSplitToArraysAllSymbolsInOneStringTest() {
        String[] expected = {"Hello"};
        String[] actual = stringUtil.stringSplitToArrays("Hello", 5);
        Assertions.assertArrayEquals(actual, expected);
    }

    //Task 12 tests
    @Test
    void wordsInStringCounterTest() {
        int expected = 6;
        int actual = stringUtil.wordsInStringCounter("Hey there! This is test message.");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void wordsInStringCounterBlankStringTest() {
        int expected = 0;
        int actual = stringUtil.wordsInStringCounter("");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void wordsInStringCounterMultipleSpacesTest() {
        int expected = 6;
        int actual = stringUtil.wordsInStringCounter("Hey   there!  This is    test message.");
        Assertions.assertEquals(actual, expected);
    }

    //Task 13 tests
    @Test
    void parseInitialsFromNameAndSurnameTest() {
        String expected = "MB";
        String actual = stringUtil.parseInitialsFromNameAndSurname("Maksim Bondar");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void parseInitialsFromNameAndSurnameLowerCaseTest() {
        String expected = "MB";
        String actual = stringUtil.parseInitialsFromNameAndSurname("maksim bondar");
        Assertions.assertEquals(actual, expected);
    }

    //Task 14 tests
    @Test
    void parseDigitsFromStringTest() {
        String expected = "0123456789";
        String actual = stringUtil.parseDigitsFromString("0a 12b3 test 456 78x __ 9");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void parseDigitsFromStringEmptyStringTest() {
        String expected = "";
        String actual = stringUtil.parseDigitsFromString("");
        Assertions.assertEquals(actual, expected);
    }
}





