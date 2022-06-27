package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();

    //task 1
    @Test
    void testJoinTwoStrings() {
        //Given
        String expected = "Done";
        //When
        String actual = stringUtil.joinTwoStrings("Do", "ne");
        //Then
        Assertions.assertEquals(expected, actual);
    }

    //task 2
    @Test
    void testFindIndex() {
        //Given
        int expected = 0;
        //When
        int actual = stringUtil.findIndex("distance", "d");
        //Then
        Assertions.assertEquals(expected, actual);
    }

    //task 3
    @Test
    void testFindMissingCharIndex() {
        //Given
        int expected = -1;
        //When
        int actual = stringUtil.findIndex("distance", "l");
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindMiddleIndex() {
        //Given
        int expected = 4;
        //When
        int actual = stringUtil.findIndex("distance", "a");
        //Then
        Assertions.assertEquals(expected, actual);
    }

    //task 4
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
        testCompareStrings("", "any", false);
        testCompareStrings("null", "any", false);
    }

    //task 5
    @Test
    void testDeleteSpacesAndChangeToLowerCase(String currentString, String expected) {
        //When
        String actual = stringUtil.deleteSpacesAndChangeToLowerCase(currentString);
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingDeleteSpacesAndFrontAndChangeToLowerCase() {
        testDeleteSpacesAndChangeToLowerCase(" Dave Smith ", "dave smith");
        testDeleteSpacesAndChangeToLowerCase("Dave Smith ", "dave smith");
        testDeleteSpacesAndChangeToLowerCase(" Dave Smith", "dave smith");
    }

    //task 5
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
    }

    //task 6
    @Test
    void testReplaceSadEmojiWithGladEmoji(String currentString, String expected) {
        //When
        String actual = stringUtil.replaceSadEmojiWithGladEmoji(currentString);
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingReplaceSadEmojiWithGladEmoji() {
        testReplaceSadEmojiWithGladEmoji(":(", ":)" );
        testReplaceSadEmojiWithGladEmoji("Hey world:(", "Hey world:)" );
        testReplaceSadEmojiWithGladEmoji("Hey:(, world:(", "Hey:), world:)" );
        testReplaceSadEmojiWithGladEmoji("( Hey world:( )", "( Hey world:) )" );
    }

    //task 7
    @Test
    void testCompareStartAndEndWord (String text, String word, boolean expected) {
        boolean actual = stringUtil.compareStartAndEndWord(text,word);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingCompareStartAndEndWord() {
        testCompareStartAndEndWord("hello world hello", "hello", true);
        testCompareStartAndEndWord("world hello", "hello", false);
        testCompareStartAndEndWord("hello world", "hello", false);
        testCompareStartAndEndWord("hello hello", "hello", true);
    }

    //task 8
    @Test
    void testCountNumberOfVowels (String stringToCheck, int expected){
        int actual = stringUtil.countNumberOfVowels(stringToCheck);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingCountNumberOfVowels () {
        testCountNumberOfVowels("Hello Ann", 3);
        testCountNumberOfVowels("Everything is changing, Alice.", 10);
        testCountNumberOfVowels ("BRB", 0);
    }

    //task 9
    @Test
    void testCountNumberOfPunctuationMarks (String stringToCheck, int expected) {
        int actual = stringUtil.countNumberOfPunctuationMarks(stringToCheck);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingCountNumberOfPunctuationMarks () {
        testCountNumberOfPunctuationMarks("Sir, wait!", 2);
        testCountNumberOfPunctuationMarks("What is it, Kelly-jelly?", 3);
        testCountNumberOfPunctuationMarks("It is cold", 0);
    }
}
