package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();

    @Test
    void testJoinTwoStrings(String inputString, String anotherInputString, String expected) {
        String actual = stringUtil.joinTwoStrings(inputString, anotherInputString);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingJoinTwoStrings() {
        testJoinTwoStrings("Do", "ne", "Done");
        testJoinTwoStrings("", "done", "done");
        testJoinTwoStrings("null", "done", "nulldone");
    }

    @Test
    void testFindIndex(String currentString, String userString, int expected) {
        int actual = stringUtil.findIndex(currentString, userString);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingFindIndex() {
        testFindIndex("Hello world", "w", 6);
        testFindIndex("Hello world", " ", 5);
        testFindIndex("Hello world", "H", 0);
        testFindIndex("Hello world", "h", -1);
        testFindIndex("Hello world", "l", 2);
    }

    @Test
    void testCompareStrings(String string1, String string2, boolean expected) {
        //When
        boolean actual = stringUtil.compareTwoStrings(string1, string2);
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingCompareStrings() {
        testCompareStrings("any", "any", true);
        testCompareStrings("any", "Any", false);
        testCompareStrings("any ", "any", false);
        testCompareStrings(" any", "any", false);
        testCompareStrings("", "any", false);
        testCompareStrings("null", "any", false);
        testCompareStrings("any case", "any case", true);
        testCompareStrings("anycase", "any case", false);
    }

    @Test
    void testDeleteSpacesAndChangeToLowerCase(String currentString, String expected) {
        String actual = stringUtil.deleteSpacesAndChangeToLowerCase(currentString);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingDeleteSpacesAndFrontAndChangeToLowerCase() {
        testDeleteSpacesAndChangeToLowerCase(" Dave Smith ", "dave smith");
        testDeleteSpacesAndChangeToLowerCase("Dave Smith ", "dave smith");
        testDeleteSpacesAndChangeToLowerCase(" Dave Smith", "dave smith");
        testDeleteSpacesAndChangeToLowerCase("Dave Smith", "dave smith");
        testDeleteSpacesAndChangeToLowerCase("  Dave Smith     ", "dave smith");
    }

    @Test
    void testGetCharsFromToExactChar(String currentString, int startExtractingIndex, int endExtractingIndex, int startCounterIndex, String expected) {
        //When
        String actual = stringUtil.getCharsFromToExactChar(currentString, startExtractingIndex, endExtractingIndex, startCounterIndex);
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingGetCharsFromToExactChar() {
        testGetCharsFromToExactChar("hello world!", 6, 11, 0, "world");
        testGetCharsFromToExactChar("hello world!", 0, 5, 0, "hello");
        testGetCharsFromToExactChar("hello world!", 3, 8, 0, "lo wo");
    }

    @Test
    void testReplaceSadEmojiWithGladEmoji(String currentString, String expected) {
        //When
        String actual = stringUtil.replaceSadEmojiWithGladEmoji(currentString);
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingReplaceSadEmojiWithGladEmoji() {
        testReplaceSadEmojiWithGladEmoji(":(", ":)");
        testReplaceSadEmojiWithGladEmoji("Hey world:(", "Hey world:)");
        testReplaceSadEmojiWithGladEmoji("Hey:(, world:(", "Hey:), world:)");
        testReplaceSadEmojiWithGladEmoji("( Hey world:( )", "( Hey world:) )");
    }

    @Test
    void testCompareStartAndEndWord(String text, String word, boolean expected) {
        boolean actual = stringUtil.compareStartAndEndWord(text, word);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingCompareStartAndEndWord() {
        testCompareStartAndEndWord("hello world hello", "hello", true);
        testCompareStartAndEndWord("world hello", "hello", false);
        testCompareStartAndEndWord("hello world", "hello", false);
        testCompareStartAndEndWord("hello hello", "hello", true);
        testCompareStartAndEndWord("   ", "hello", false);
        testCompareStartAndEndWord("null", "hello", false);
        testCompareStartAndEndWord("hello hello", " ", false);
        testCompareStartAndEndWord(" hello hello ", "hello", false);
        testCompareStartAndEndWord(" hello hello ", " ", true);
    }

    @Test
    void testCountNumberOfVowels(String stringToCheck, int expected) {
        int actual = stringUtil.countNumberOfVowels(stringToCheck);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingCountNumberOfVowels() {
        testCountNumberOfVowels("Hello Ann", 3);
        testCountNumberOfVowels("Everything is changing, Alice.", 10);
        testCountNumberOfVowels("BRB", 0);
    }

    //task 9
    @Test
    void testCountNumberOfPunctuationMarks(String stringToCheck, int expected) {
        int actual = stringUtil.countNumberOfPunctuationMarks(stringToCheck);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingCountNumberOfPunctuationMarks() {
        testCountNumberOfPunctuationMarks("Sir, wait!", 2);
        testCountNumberOfPunctuationMarks("What is it, Kelly-jelly?", 3);
        testCountNumberOfPunctuationMarks("It is cold", 0);
    }

    @Test
    void testIsTheStringPalindrome(String theStringToCheck, boolean expected) {
        boolean actual = stringUtil.isTheStringPalindrome(theStringToCheck);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testingIsTheStringPalindrome() {
        testIsTheStringPalindrome("dad", true);
        testIsTheStringPalindrome("dad ", false);
        testIsTheStringPalindrome(" dad", false);
        testIsTheStringPalindrome("step on no pets", true);
        testIsTheStringPalindrome("Dad", true);
        testIsTheStringPalindrome("Dammit, I'm mad!", false);
        testIsTheStringPalindrome("Dammit I'm mad", false);
        testIsTheStringPalindrome("Dammit I m mad", false);
    }

    @Test
    void testDivideIntoEqualParts(String givenString, int index, String[] expected) {
        String[] actual = StringUtil.divideIntoEqualParts(givenString, index);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testingDivideIntoEqualParts() {
        testDivideIntoEqualParts("Hello world!", 3, new String[]{"Hel", "lo ", "wor", "ld!"});
        testDivideIntoEqualParts("Hello worl", 3, new String[]{"Hel", "lo ", "wor", "l"});
        testDivideIntoEqualParts("Hel lo", 1, new String[]{"H", "e", "l", " ", "l", "o"});
        testDivideIntoEqualParts("Hello", 0, new String[]{"Hello"});
        testDivideIntoEqualParts("Hello", 10, new String[]{"Hello"});
    }

    @Test
    void testCountNumberWords(String currentString, int expected) {
        int actual = stringUtil.countNumberWords(currentString);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingCountNumberWords() {
        testCountNumberWords("Hello world", 2);
        testCountNumberWords("Hello, world!", 2);
        testCountNumberWords(" Hello world ", 2);
        testCountNumberWords("Hello   world", 2);
        testCountNumberWords(" ", 0);
    }

    @Test
    void testGetInitialsReturnUpperCase (String fullName, String expected) {
        String actual = stringUtil.getInitialsReturnUpperCase(fullName);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingGetInitialsReturnUpperCase () {
        testGetInitialsReturnUpperCase("Tom Smith", "TS");
        testGetInitialsReturnUpperCase(" Tom Smith ", "TS");
        testGetInitialsReturnUpperCase("tom Smith", "TS");
        testGetInitialsReturnUpperCase("TOM Smith", "TS");
        testGetInitialsReturnUpperCase("TomSmith", "T");
    }

    @Test
    void testGetAllNumbers(String currentString, String expected) {
        String actual = stringUtil.getAllNumbers(currentString);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingGetAllNumbers() {
        testGetAllNumbers("123 string1", "1231");
        testGetAllNumbers(" 123 string1", "1231");
        testGetAllNumbers("thy123 string1  ", "1231");
        testGetAllNumbers("hnDBNHfgc,.{}((())[[]]", "");
        testGetAllNumbers("", "");
    }
}
