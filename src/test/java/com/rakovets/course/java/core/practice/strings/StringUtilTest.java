package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();

    @Test
    void testConcatWithTwoStrings() {
        testConcat("123", "456", "123456");
    }

    @Test
    void testConcatWithOneEmpty() {
        testConcat(null, "456", "null456");
    }

    void testConcat(String input1, String input2, String expected) {
        String actual = stringUtil.concat(input1, input2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetIndexOfWithChar() {
        testGetIndexOf("Hello world!", 'e', 1);
    }

    @Test
    void testGetIndexOfWithNonexistentChar() {
        testGetIndexOf("Hello world!", 'E', -1);
    }

    void testGetIndexOf(String input1, char input2, int expected) {
        int actual = stringUtil.getIndexOf(input1, input2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIsEqualWithDifferentRegister() {
        testIsEqual("HELLO WORLD!", "Hello world", false);
    }

    @Test
    void testIsEqualWithIdenticalStrings() {
        testIsEqual("Hello world!", "Hello world!", true);
    }

    @Test
    void testIsEqualWithDifferentStrings() {
        testIsEqual("Hello world!", "Java world", false);
    }

    void testIsEqual(String input1, String input2, boolean expected) {
        boolean actual = stringUtil.isEqual(input1, input2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testTrimAndToUpperCaseWithSpacesAndLowercaseLetters() {
        testTrimAndToUpperCase("  Hello world!  ", "HELLO WORLD!");
    }

    @Test
    void testTrimAndToUpperCaseWithLowercaseWordAndNumbers() {
        testTrimAndToUpperCase("java132  ", "JAVA132");
    }

    @Test
    void testTrimAndToUpperCaseWithSpaces() {
        testTrimAndToUpperCase("        ", "");
    }

    void testTrimAndToUpperCase(String input, String expected) {
        String actual = stringUtil.trimAndToUpperCase(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetSubstringsFromBeginning() {
        testGetSubstring("Hello world!", 0, 5, "Hello");
    }

    @Test
    void testGetSubstringsFromBeginningToEnd() {
        testGetSubstring("Hello world!", 0, 12, "Hello world!");
    }

    void testGetSubstring(String input, int beginIndex, int endIndex, String expected) {
        String actual = stringUtil.getSubstring(input, beginIndex, endIndex);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testReplaceSadEmojiWithOneSadEmoji() {
        testReplaceSadEmoji("Hello world! :(", "Hello world! :)");
    }

    @Test
    void testReplaceSadEmojiWithFourSadEmoji() {
        testReplaceSadEmoji(":( Hello :( world! :( :(", ":) Hello :) world! :) :)");
    }

    void testReplaceSadEmoji(String input, String expected) {
        String actual = stringUtil.replaceSadEmoji(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIsStartAndEndWordWithCorrectCondition() {
        testIsStartAndEndWord("Java script isn't Java", "Java", true);
    }

    @Test
    void testIsStartAndEndWordWithIncorrectCondition() {
        testIsStartAndEndWord("Java isn't Java script", "Java", false);
    }

    @Test
    void testIsStartAndEndWordWithOneWord() {
        testIsStartAndEndWord("Java", "Java", true);
    }

    void testIsStartAndEndWord(String str, String word, boolean expected) {
        boolean actual = stringUtil.isStartAndEndWord(str, word);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCountEnglishVowelsWithString() {
        testCountEnglishVowels("Java it's cool!", 5);
    }

    @Test
    void testCountEnglishVowelsWithSpaces() {
        testCountEnglishVowels("     ", 0);
    }

    @Test
    void testCountEnglishVowelsWithEmpty() {
        testCountEnglishVowels("", 0);
    }

    void testCountEnglishVowels(String str, int expected) {
        int actual = stringUtil.countEnglishVowels(str);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCountPunctuationMarksWithString() {
        testCountPunctuationMarks("Hello world! It's first string... Isn't it?", 5);
    }

    @Test
    void testCountPunctuationMarksWithSpaces() {
        testCountPunctuationMarks("     ", 0);
    }

    @Test
    void testCountPunctuationMarksWithEmpty() {
        testCountPunctuationMarks("", 0);
    }

    void testCountPunctuationMarks(String str, int expected) {
        int actual = stringUtil.countPunctuationMarks(str);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIsPalindromeSingleWord() {
        testIsPalindrome("Anna", true);
    }

    @Test
    void testIsPalindromePhrase() {
        testIsPalindrome("no lemon, no melon", true);
    }

    @Test
    void testIsPalindromeSentence() {
        testIsPalindrome("Eva, can I see bees in a cave?", true);
    }

    @Test
    void testIsPalindromeFalse() {
        testIsPalindrome("Java isn't palindrome", false);
    }

    void testIsPalindrome(String str, boolean expected) {
        boolean actual = stringUtil.isPalindrome(str);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSplitEqualPartsNumbers() {
        testSplitEqualParts("123456", 2, new String[]{"12", "34", "56"});
    }

    @Test
    void testSplitEqualPartsString() {
        testSplitEqualParts("Hello world!", 4, new String[]{"Hell", "o wo", "rld!"});
    }

    void testSplitEqualParts(String str, int n, String[] expected) {
        String[] actual = stringUtil.splitEqualParts(str, n);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testCountWordsWithEmpty() {
        testCountWords("", 0);
    }

    @Test
    void testCountWordsWithSpaces() {
        testCountWords("    ", 0);
    }

    @Test
    void testCountWordsWithSentense() {
        testCountWords("  Hey come on  you lazy    wake up  ", 7);
    }

    void testCountWords(String str, int expected) {
        int actual = stringUtil.countWords(str);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetInitialsWithDifferentCase() {
        testGetInitials("dmitRY RakOVets ", "DR");
    }

    @Test
    void testGetInitialsWithSpaces() {
        testGetInitials("  Evgeniy   Antonovich   ", "EA");
    }

    void testGetInitials(String str, String expected) {
        String actual = stringUtil.getInitials(str);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetAllNumbersWithSpaces() {
        testGetAllNumbers("  1  23  4 5  ", "12345");
    }

    @Test
    void testGetAllNumbersWithSpacesAndLetters() {
        testGetAllNumbers(" Get12 all34Numbers5 6 ", "123456");
    }

    void testGetAllNumbers(String str, String expected) {
        String actual = stringUtil.getAllNumbers(str);
        Assertions.assertEquals(expected, actual);
    }
}
