package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    /**
     * Task 1.
     * Using the methods of the String class, output the string that is the result of concatenating two strings.
     */
    private final StringUtil stringUtil = new StringUtil();

    @Test
    void testConcatWithTwoValues() {
        testConcat("123", "456", "123456");
    }

    @Test
    void testConcatOneEmpty() {
        testConcat("", "456", "456");
    }

    @Test
    void testConcatOneSpace() {
        testConcat(" ", "456", " 456");
    }

    @Test
    void testConcatOneNull() {
        testConcat("null", "456", "null456");
    }

    void testConcat(String input1, String input2, String expected) {
        String actual = stringUtil.concat(input1, input2);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Task 2.
     * Find the index of the character x (x is the character entered by the user) in the string.
     * If there is no such character, then -1.
     */
    @Test
    void testFindCharNoSymbol() {
        testFindChar("helo", 'm', -1);
    }

    @Test
    void testFindCharSymbolSpase() {
        testFindChar("Zak go to", ' ', 3);
    }

    @Test
    void testFindCharSymbolSymbol1() {
        testFindChar("Zak go to", 'Z', 0);
    }

    void testFindChar(String searchLine, char simbol, int expected) {
        int actual = stringUtil.receiveIndexOf(searchLine, simbol);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Task 3.
     * Determine if two strings are the same considering case
     */
    @Test
    void testeEqualsString() {
        testeEqualsString("he", "he", true);
    }

    @Test
    void testeEqualsStringAndNumbers() {
        testeEqualsString("he", "124", false);
    }

    @Test
    void testeEqualsStringRegister() {
        testeEqualsString("Hello World", "hello world", false);
    }

    void testeEqualsString(String firsStr, String secondStr, boolean expected) {
        boolean actual = stringUtil.equalsString(firsStr, secondStr);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Task 4.
     * Remove spaces at the beginning and end of the string.
     * Make sure that the entire string consists of uppercase letters.
     */
    @Test
    void testeTrimAndLowerCaseRegisterAndSpase() {
        testeTrimAndLowerCase("  Hello World  ", "hello world");
    }

    void testeTrimAndLowerCase(String str, String expected) {
        String actual = stringUtil.trimAndLowerCase(str);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Task 5.
     * Extract a substring from the string starting from the nth character and up to the mth character.
     */
    @Test
    void testeSubstringBetweenIndicesNumbers() {
        testeSubstringBetweenIndices("Hello World", 0, 4, "Hell");
    }

    @Test
    void testeSubstringBetweenIndicesNumbersRandom() {
        testeSubstringBetweenIndices("Hello World", 2, 7, "llo W");
    }

    void testeSubstringBetweenIndices(String str, int indices1, int indices2, String expected) {
        String actual = stringUtil.substringBetweenIndices(str, indices1, indices2);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Task 6.
     * Replace all sad emoji :( in the string with happy ones :).
     */
    @Test
    void testeReplaceСhangeEmoji() {
        testeReplacEemoji("Hello :(", ":(", ":)", "Hello :)");
    }

    void testeReplacEemoji(String str1, String oldChar, String newChar, String expected) {
        String actual = stringUtil.replace(str1, oldChar, newChar);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Task 7.
     * Write a method that takes 2 parameters text and word, and returns: true if the string starts
     * and ends with this word or false in all others.
     */

    @Test
    void testeStartAndEndStringNew() {
        testedStartAndEndString("text Hello Vadim Voropai text", "new", false);
    }

    @Test
    void testeStartAndEndStringWorld() {
        testedStartAndEndString("text Hello Vadim Voropai ", "text", false);
    }

    @Test
    void testeStartAndEndStringWorldTwoText() {
        testedStartAndEndString("text1 Hello Vadim Voropai text1", "text1", true);
    }

    void testedStartAndEndString(String text, String world, boolean expected) {
        boolean actual = stringUtil.startAndEndString(text, world);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Task 8.
     * Determine the number of English vowels in a sentence.
     */
    @Test
    void testeSearchForEnglishVowels() {
        testeSearchForEnglishVowels("e", 1);
    }

    @Test
    void testeSearchForEnglishVowelsNull() {
        testeSearchForEnglishVowels("grrrl", 0);
    }

    @Test
    void testeSearchForEnglishVowelsSimbol() {
        testeSearchForEnglishVowels("@@@+-fueioyck@@@+-.,", 5);
    }

    void testeSearchForEnglishVowels(String text, int expected) {
        int actual = stringUtil.searchForEnglishVowels(text);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Task 9.
     * Count the total number of punctuation marks (periods, commas, question marks, and exclamation marks) in a string.
     */
    @Test
    void testeSearchPunctuationMarksNull() {
        testeSearchPunctuationMarks("Null", 0);
    }

    @Test
    void testeSearchPunctuationMarksSimbol() {
        testeSearchPunctuationMarks("Shanghai, China ? Mexico City. Moscow!", 4);
    }

    void testeSearchPunctuationMarks(String text, int expected) {
        int actual = stringUtil.searchPunctuationMarks(text);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Task 10.
     * Check if the input string is a palindrome.
     */
    @Test
    void testeStringIsPalindromeNo() {
        testeStringIsPalindrome("text1 Hello Vadim Voropai text1", false);
    }

    @Test
    void testeStringIsPalindromeYes() {
        testeStringIsPalindrome("Do geese see God?", true);
    }

    @Test
    void testeStringIsPalindromeNum() {
        testeStringIsPalindrome(" 1 9 91 ?", true);
    }

    void testeStringIsPalindrome(String text, boolean expected) {
        boolean actual = stringUtil.stringIsPalindrome(text);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Task 11.
     * Split the string into equal parts of n characters each and store the individual parts in an array.
     */
    @Test
    void testeSplitNewPartsInText() {
        testeSplitNewParts("Do geese", 3, new String[]{"Do ", "gee", "se"});
    }

    @Test
    void testeSplitNewPartsInTextNum() {
        testeSplitNewParts("123451234512345", 5, new String[]{"12345", "12345", "12345"});
    }

    @Test
    void testeSplitNewPartsInTextNull() {
        testeSplitNewParts("123451234512345", 0, new String[]{"123451234512345"});
    }

    void testeSplitNewParts(String userString, int n, String[] expected) {
        String[] actual = StringUtil.splitNewParts(userString, n);
        Assertions.assertArrayEquals(expected, actual);
    }

    /**
     * Task 12.
     * Count the number of words in the text. Note that words can be separated by multiple spaces.
     */
    @Test
    void testeSplitNewWordsInAText1() {
        testeSplitNewWordsInAText("   Note        that   ", 2);
    }

    @Test
    void testeSplitNewWordsInAText2() {
        testeSplitNewWordsInAText("    ", 0);
    }

    void testeSplitNewWordsInAText(String userString, int expected) {
        int actual = stringUtil.splitNewWordsInAText(userString);
        Assertions.assertEquals(expected, actual);
    }

    /**
     *  Task 13.
     * Last name and first name are given as one line. Return initials according to the FL pattern,
     * for example: DmitRY RakOVets → DR. Please note that the input parameters can be in any case,
     * and the resulting string must be in the upper case.
     * */
    @Test
    void testeInitialsFirstName() {
        testeInitials("DmitRY  RakOVets", "DR");
    }

    @Test
    void testeInitialsFirstNameTwoSpase() {
        testeInitials("     VaDim      VorOpai   ", "VV");
    }

    void testeInitials(String userString, String expected) {
        String actual = stringUtil.initials(userString);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Task 14.
     * Return a string that contains all the digits in the text.
     */
    @Test
    void testeReceiveNumbersText1() {
        testeReceiveNumbersText("vaDin123voropai456", "123456");
    }

    void testeReceiveNumbersText(String userString, String expected) {
        String actual = stringUtil.receiveNumbersText(userString);
        Assertions.assertEquals(expected, actual);
    }
}
