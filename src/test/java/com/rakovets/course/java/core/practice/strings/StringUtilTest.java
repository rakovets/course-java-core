package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    private final StringUtil stringUtil = new StringUtil();

    void stringConcatTest(String string1, String string2, String stringExpected) {
        String actual = stringUtil.concat(string1, string2);
        Assertions.assertEquals(stringExpected, actual);
    }

    @Test
    void stringConcatTest() {
        stringConcatTest("Hello ", "Java!", "Hello Java!");
        stringConcatTest("", "Java", "Java");
        stringConcatTest("", "", "");
    }

    void intIndexOfTest(String string, char symbol, int expected) {
        int actual = stringUtil.indexOf(string, symbol);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void intIndexOfTest() {
        intIndexOfTest("Hello Java", 'J', 6);
        intIndexOfTest("Hello Java", 'j', -1);
    }

    void booleanEqualsTest(String string1, String string2, boolean expected) {
        boolean actual = stringUtil.equals(string1, string2);
    }

    @Test
    void booleanEqualsTest() {
        booleanEqualsTest("Hello Java", "Hello Java", true);
        booleanEqualsTest("Hello Java", "Hello java", false);
    }

    void stringTrimAndToUpperCaseTest(String string, String stringExpected) {
        String actual = stringUtil.trimAndToUpperCase(string);
        Assertions.assertEquals(stringExpected, actual);
    }

    @Test
    void stringTrimAndToUpperCaseTest() {
        stringTrimAndToUpperCaseTest(" Hello Java ", "HELLO JAVA");
        stringTrimAndToUpperCaseTest("HELLO", "HELLO");
        stringTrimAndToUpperCaseTest("  ", "");
    }

    void stringSubstringTest(String string, char symbolBegin, char symbolEnd, String stringExpected) {
        String actual = stringUtil.substring(string, symbolBegin, symbolEnd);
        Assertions.assertEquals(stringExpected, actual);
    }

    @Test
    void stringSubstringTest() {
        stringSubstringTest("Hello Java!", 'J', '!', "Java!");
        stringSubstringTest("Hello Java!", 'l', ' ', "llo ");
    }

    void stringReplaceTest(String string, String oldEmoji, String newEmoji, String stringExpected) {
        String actual = stringUtil.replace(string, oldEmoji, newEmoji);
    }

    @Test
    void stringReplaceTest() {
        stringReplaceTest("Hello Java :( ", ":(", ":)", "Hello Java :) ");
    }

    void booleanStartsWithAndEndsWithTest(String text, String word, boolean stringExpected) {
        boolean actual = stringUtil.startsWithAndEndsWith(text, word);
    }

    @Test
    void booleanStartsWithAndEndsWithTest() {
        booleanStartsWithAndEndsWithTest("Hello Java. It's all right", "Hello", false);
        booleanStartsWithAndEndsWithTest("Hello Java. It's all right. Hello", "Hello", true);
        booleanStartsWithAndEndsWithTest(" Hello Java. It's all right. Hello", "Hello", false);
    }

    void intNumberEnglishVowelsTest(String string, int vowelsExpected) {
        int actual = stringUtil.numberEnglishVowels(string);
        Assertions.assertEquals(vowelsExpected, actual);
    }

    @Test
    void intNumberEnglishVowelsTest() {
        intNumberEnglishVowelsTest("Hello Java. It's all right", 7);
        intNumberEnglishVowelsTest("HELLO JAVA", 4);
        intNumberEnglishVowelsTest("Текст на русском или 123", 0);
    }

    void intNumberPunctuationMarks(String string, int punctuationExpected) {
        int actual = stringUtil.numberPunctuationMarks(string);
        Assertions.assertEquals(punctuationExpected, actual);
    }

    @Test
    void intNumberPunctuationMarks() {
        intNumberPunctuationMarks("Hello, Java! Is it OK? It's OK.", 4);
        intNumberPunctuationMarks("Hello Java", 0);
    }

    void booleanCheckPalindromeTest(String palindrome, boolean stringExpected) {
        boolean actual = stringUtil.checkPalindrome(palindrome);
        Assertions.assertEquals(stringExpected, actual);
    }

    @Test
    void booleanCheckPalindromeTest() {
        booleanCheckPalindromeTest("No lemon no melon", true);
        booleanCheckPalindromeTest("Hello Java", false);
    }

    void stringSplitIntoEqualPatsTest(String string, int n, String[] stringExpected) {
        String[] actual = stringUtil.stringSplitIntoEqualPats(string, n);
        Assertions.assertArrayEquals(stringExpected, actual);
    }

    @Test
    void stringSplitIntoEqualPatsTest() {
        stringSplitIntoEqualPatsTest("Hello Java!", 5, new String[]{"Hello", " Java", "!"});
        stringSplitIntoEqualPatsTest("123456", 3, new String[]{"123", "456"});
        stringSplitIntoEqualPatsTest("Hello Java!", 0, new String[]{"Hello Java!"});
    }

    void theNumberOfWordsInTheTextTest(String string, int wordsExpected) {
        int actual = stringUtil.theNumberOfWordsInTheText(string, wordsExpected);
        Assertions.assertEquals(wordsExpected, actual);
    }

    @Test
    void theNumberOfWordsInTheTextTest() {
        theNumberOfWordsInTheTextTest(" Hello Java! ", 2);
        theNumberOfWordsInTheTextTest("Hello, Java!     Is it OK? It's OK. ", 7);
        theNumberOfWordsInTheTextTest("  ", 0);
    }

    void nameInitialsTheUpperCaseTest(String  stringFirstNameSurnameName, String stringInitialsExpected) {
        String actual = stringUtil.nameInitialsTheUpperCase(stringFirstNameSurnameName);
        Assertions.assertEquals(stringInitialsExpected, actual);
    }

    @Test
    void nameInitialsTheUpperCaseTest() {
        nameInitialsTheUpperCaseTest(" IrynA pakhoMAVA", "IP");
        nameInitialsTheUpperCaseTest("DmitRY     RakOVets  ", "DR");
    }

    void stringAllTheNumbersInTheTextTest(String string, String stringExpected) {
        String actual = stringUtil.stringAllTheNumbersInTheText(string);
        Assertions.assertEquals(stringExpected, actual);
    }

    @Test
    void stringAllTheNumbersInTheTextTest() {
        stringAllTheNumbersInTheTextTest("  Hello, Java! 12 Is it 345OK? It's OK. 6789 ", "123456789");
    }
}
