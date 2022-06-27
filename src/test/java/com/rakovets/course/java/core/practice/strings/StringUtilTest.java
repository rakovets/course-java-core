package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    /**
     * Task 1.
     */
    StringUtil stringUtil = new StringUtil();

    void testConcatenationOfTwoStrings(String stringOne, String stringTwo, String expected) {
        String actual = stringUtil.concatenationOfTwoStrings(stringOne, stringTwo);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testConcatenationOfTwoStrings() {
        testConcatenationOfTwoStrings("123", "456", "123456");
    }

    @Test
    void testConcatOneEmpty() {
        testConcatenationOfTwoStrings("", "456", "456");
    }

    @Test
    void testConcatOneSpace() {
        testConcatenationOfTwoStrings(" ", "456", "456 ");
    }

    @Test
    void testConcatOneNull() {
        testConcatenationOfTwoStrings("null", "456", "null456");
    }

    /**
     * Task 2.
     */
    void testReceivingIndexOfEnteringSymbol(String string, char symbol, int expected) {
        int actual = stringUtil.receivingIndexOfEnteringSymbol(string, symbol);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testFindCharNoSymbol() {
        testReceivingIndexOfEnteringSymbol("helo", 'm', -1);
    }

    @Test
    void testFindCharSymbolSpase() {
        testReceivingIndexOfEnteringSymbol("Hello everyone", ' ', 6);
    }

    @Test
    void testFindCharFirstSymbol() {
        testReceivingIndexOfEnteringSymbol("Hello everyone", 'H', 0);
    }

    /**
     * Task 3
     */
    void testEquivalenceOfTwoStringsCaseInsensitive(String stringOne, String stringTwo, boolean expected) {
        boolean actual = stringUtil.equivalenceOfTwoStringsCaseInsensitive(stringOne, stringTwo);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testEqualsString() {
        testEquivalenceOfTwoStringsCaseInsensitive("hi", "hi", true);
    }

    @Test
    void testEqualsStringAndNumbers() {
        testEquivalenceOfTwoStringsCaseInsensitive("hi", "124", false);
    }

    @Test
    void testEqualsStringRegister() {
        testEquivalenceOfTwoStringsCaseInsensitive("Hello everyone", "hello everyone", false);
    }

    /**
     * Task 4
     */
    void testMakeTrimAndUpperCaseInString(String string, String expected) {
        String actual = stringUtil.makeTrimAndUpperCaseInString(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testTrimAndUpperCase() {
        testMakeTrimAndUpperCaseInString("  Hello World  ", "HELLO WORLD");
    }

    /**
     * Task 5
     */
    void testExtractingSubstringFromNToMsymbols(String string, char symbolN, char symbolM, String expected) {
        String actual = stringUtil.extractingSubstringFromNToMsymbols(string, symbolN, symbolM);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSubstringFromNToMsymbols() {
        testExtractingSubstringFromNToMsymbols("Hello World", 'e', 'o', "ello");
    }

    /**
     * Task 6
     */
    void testReplacingOldValueOfStringToNewValue(String string, String oldValue, String newValue, String expected) {
        String actual = stringUtil.replacingOldValueOfStringToNewValue(string, oldValue, newValue);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSadEmojiToHappyOnes() {
        testReplacingOldValueOfStringToNewValue("Hello everyone :(", ":(", ":)", "Hello everyone :)");
    }

    /**
     * Task 7
     */
    void testCheckingIfStringStartingAndEndingAtWordParametr(String text, String word, boolean expected) {
        boolean actual = stringUtil.checkingIfStringStartingAndEndingAtWordParametr(text, word);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testStringStartingAndEndingAtNotExpectedWord() {
        testCheckingIfStringStartingAndEndingAtWordParametr("hey today is a good day hey", "nope", false);
    }

    @Test
    void testStringOnlyStartingAtExpectingWord() {
        testCheckingIfStringStartingAndEndingAtWordParametr("hey today is a good day ", "hey", false);
    }

    void testStringOnlyEndingAtExpectingWord() {
        testCheckingIfStringStartingAndEndingAtWordParametr("today is a good day hey", "hey", false);
    }

    @Test
    void testStringStartingAndEndingAtExpectedWord() {
        testCheckingIfStringStartingAndEndingAtWordParametr("hey today is a good day hey", "hey", true);
    }

    /**
     * Task 8
     */
    void testNubmerOfEnglishVowelsInASentence(String string, int expected) {
        int actual = stringUtil.nubmerOfEnglishVowelsInASentence(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testStringWithEnglishVowels() {
        testNubmerOfEnglishVowelsInASentence("hello everyone", 7);
    }

    @Test
    void testStringWithoutEnglishVowels() {
        testNubmerOfEnglishVowelsInASentence("grrrl", 0);
    }

    /**
     * Task 9
     */
    void testNubmerOfPunctuationMarksInAString(String string, int expected) {
        int actual = stringUtil.nubmerOfPunctuationMarksInAString(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testStringWithEnglishVowelsPunctuationMarks() {
        testNubmerOfPunctuationMarksInAString("Just string", 0);
    }

    @Test
    void testStringWithoutEnglishVowelsPunctuationMarks() {
        testNubmerOfPunctuationMarksInAString("To be, or not to be, that is the question! Right? I think...", 7);
    }

    /**
     * Task 10
     */
    void testCheckingForStringIsAPalindrome(String string, boolean expected) {
        boolean actual = stringUtil.checkingForStringIsAPalindrome(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testStringIsNotPalindrome() {
        testCheckingForStringIsAPalindrome("Dogma I oops am God", false);
    }

    @Test
    void testStringIsPalindrome() {
        testCheckingForStringIsAPalindrome("Was it a car or a cat I saw", true);
    }

    /**
     * Task 11
     */
    void testSplitTheStringIntoEqualPartsOfN(String string, int n, String[] expected) {
        String[] actual = StringUtil.splitTheStringIntoEqualPartsOfN(string, n);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testSplitNewPartsInText() {
        testSplitTheStringIntoEqualPartsOfN("Hello everyone", 3, new String[]{"Hel", "lo ", "eve", "ryo", "ne"});
    }

    @Test
    void testSplitNewPartsInTextNumbers() {
        testSplitTheStringIntoEqualPartsOfN("859752164784", 4, new String[]{"8597", "5216", "4784"});
    }

    @Test
    void testSplitNewPartsInTextNull() {
        testSplitTheStringIntoEqualPartsOfN("Another day, another WUT", 0, new String[]{"Another day, another WUT"});
    }

    /**
     * Task 12
     */
    void testReceivingTheNumberOfWordsInAText(String string, int expected) {
        int actual = stringUtil.receivingTheNumberOfWordsInAText(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNumberOfWordsInATextOne() {
        testReceivingTheNumberOfWordsInAText("   Two          words   ", 2);
    }

    @Test
    void testSplitNewWordsInATextTwo() {
        testReceivingTheNumberOfWordsInAText("    ", 0);
    }

    /**
     *  Task 13
     * */
    void testReceivingInitials(String string, String expected) {
        String actual = StringUtil.receivingInitials(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testInitialsFirstNameSecondName() {
        testReceivingInitials("AlBert EinSTein", "AE");
    }

    @Test
    void testInitialsFirstNameSecondNameAndManySpaces() {
        testReceivingInitials("  AlexAnDer     AmoSOvich  ", "AA");
    }

    /**
     * Task 14
     */
    void testNumberOfDigitsInTheText(String string, String expected) {
        String actual = stringUtil.numberOfDigitsInTheText(string);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testReceiveNumbersInTheText() {
        testNumberOfDigitsInTheText("fghdfgdhASDF7661234iiiii6671o", "76612346671");
    }
}
