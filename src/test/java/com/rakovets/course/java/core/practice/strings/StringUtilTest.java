package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    private StringUtil stringUtil = new StringUtil();

    //Test for Task1
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

    //Test for Task2
    void testIndexOf(String str1, char symbol, int expected) {
        int actual = stringUtil.indexOf(str1, symbol);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIndexOfWithSymbol() {
        testIndexOf("Hello", 'l', 2);
    }

    @Test
    void testIndexOfWithoutSymbol() {
        testIndexOf("", 'e', -1);
    }

    //Test for Task3
    void testEquals(String str1, String str2, boolean expected) {
        boolean actual = stringUtil.equals(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testEqualsCaseSensitive() {
        testEquals("Hello", "Hello", true);
    }

    @Test
    void testEqualsCaseInsensitive() {
        testEquals("Java", "java", false);
    }

    //Test for Task4
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

    //Test for Task5
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

    //Test for Task6
    void testReplace(String str1, String oldValue, String newValue, String expected) {
        String actual = stringUtil.replace(str1, oldValue, newValue);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testReplace1() {
        testReplace("Hello Java:(", ":(", ":)", "Hello Java:)");
    }

    @Test
    void testReplaceParenthesisCheck() {
        testReplace("Hello() Java:(", ":(", ":)", "Hello() Java:)");
    }

    //Test for Task7
    void testStartAndEndWithWord(String str1, String word, Boolean expected) {
        Boolean actual = stringUtil.startAndEndWithWord(str1, word);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testStartAndEndWithWordCaseSensitive() {
        testStartAndEndWithWord("Hello,Java,Hello", "hello", false);
    }

    @Test
    void testStartAndEndWithWord2() {
        testStartAndEndWithWord("Hello,Java,Hello", "Hello", true);
    }

    @Test
    void testStartAndEndWithWordOnlyStart() {
        testStartAndEndWithWord("Hello,Java", "Hello", false);
    }

    @Test
    void testStartAndEndWithWordOnlyEnd() {
        testStartAndEndWithWord("Java, hello", "hello", false);
    }

    //Test for Task8
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

    //Test for Task9
    void testPunctuationMarks(String str1, int expected) {
        int actual = stringUtil.punctuationMarks(str1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPunctuationMarks1() {
        testPunctuationMarks("Hello, Java!!!", 4);
    }

    @Test
    void testPunctuationMarks2() {
        testPunctuationMarks("Is it Git and GitHub the same? No,different! Okay...", 6);
    }

    //Test for Task10
    void testIfPalindrome(String str1, boolean expected) {
        boolean actual = stringUtil.ifPalindrome(str1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIfPalindrome1() {
        testIfPalindrome("Deed", true);
    }

    @Test
    void testIfPalindrome2() {
        testIfPalindrome("Java", false);
    }

    @Test
    void testIfPalindromePunctuationAccounting() {
        testIfPalindrome("Do geese see God?", true);
    }

    @Test
    void testIfPalindromeNumbers() {
        testIfPalindrome("1991", true);
    }

    //    Test for Task11
    void testSplitToArray(String str1, int numberSymbolsInEveryNewArray, String[] expected) {
        String[] actual = stringUtil.splitToArray(str1, numberSymbolsInEveryNewArray);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testSplitToArrayEvenAmount() {
        testSplitToArray("Hello!", 2, new String[]{"He", "ll", "o!"});
    }

    @Test
    void testSplitToArrayOddAmount() {
        testSplitToArray("Hello", 2, new String[]{"He", "ll", "o"});
    }

    //Test for Task12
    void testCountNumberWords(String str1, int expected) {
        int actual = stringUtil.countNumberWords(str1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCountNumberWordsNotOneWhiteSpace() {
        testCountNumberWords(" Hello    Java Java ", 3);
    }

    @Test
    void testCountNumberWordsPunctuationAccording() {
        testCountNumberWords(" Hello,0 va Java Java! ", 5);
    }

    //Test for Task13
    void testGetFirstCharacters(String str1, String expected) {
        String actual = stringUtil.getFirstCharacters(str1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetFirstCharacters1() {
        testGetFirstCharacters("Alena Trafimovich", "AT");
    }

    @Test
    void testGetFirstCharacters2() {
        testGetFirstCharacters("alena  trafimovich", "AT");
    }

    //Test for Task14
    void testGetNumbers (String str1, String expected) {
        String actual = stringUtil.getNumbers(str1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetNumbers1 () {
        testGetNumbers("Hello1234","1234");
    }


}
