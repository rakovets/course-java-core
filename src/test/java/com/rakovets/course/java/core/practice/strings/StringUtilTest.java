package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();

    static Stream<Arguments> provideArgumentsGlue() {
        return Stream.of(
                Arguments.of("123", "456", "123456"),
                Arguments.of("123", "", "123"),
                Arguments.of("", "456", "456"),
                Arguments.of(null, "456", "null456"),
                Arguments.of("123", null, "123null"),
                Arguments.of(null, null, "nullnull")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGlue")
    void testGlue (String str1, String str2, String expected) {

        String actual = stringUtil.glue(str1, str2);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetIndexOfChar() {
        return Stream.of(
                Arguments.of("Load up on guns", 'u', 5),
                Arguments.of("bring your friends", 'k', -1),
                Arguments.of(null, 'j', -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetIndexOfChar")
    void testGetIndexOfChar (String str, char a, int expected) {

        int actual = stringUtil.getIndexOfChar(str, a);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetStringComparison() {
        return Stream.of(
                Arguments.of("It's fun to lose", "It's fun to lose", true),
                Arguments.of("It's fun to lose", "IT'S FUN TO LOSE", false),
                Arguments.of("It's fun to lose", "and to pretend", false),
                Arguments.of("She's over bored", null, false),
                Arguments.of(null, "and self assured", false),
                Arguments.of(null, null, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetStringComparison")
    void testGetStringComparison (String str1, String str2, boolean expected) {

        boolean actual = stringUtil.getStringComparison(str1, str2);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetSubstring() {
        return Stream.of(
                Arguments.of("I want to break free", 3, 9, "ant to"),
                Arguments.of("I want to break free", 10, 25, "You went out of bounds"),
                Arguments.of("I want to break free from your lies", -1, 10, "You went out of bounds"),
                Arguments.of("You're so self-satisfied I don't need you", 3, -2, "You went out of bounds"),
                Arguments.of(null, 3, 9, "It's null bro")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetSubstring")
    void testGetSubstring (String str, int beginIndex, int endIndex, String expected) {

        String actual = stringUtil.getSubstring(str, beginIndex, endIndex);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetReplaceEmoji() {
        return Stream.of(
                Arguments.of("Hello :( I'm sad :(:(", "Hello :) I'm sad :):)"),
                Arguments.of(null, "It's null bro")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetReplaceEmoji")
    void testGetReplaceEmoji (String str, String expected) {

        String actual = stringUtil.getReplaceEmoji(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetRegionMatches() {
        return Stream.of(
                Arguments.of("The show must go on The show", "The show", true),
                Arguments.of("The show must go on", "The show", false),
                Arguments.of(null, "The show must go on The show", false),
                Arguments.of("The show must go on The show", null, false),
                Arguments.of(null, null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetRegionMatches")
    void testGetRegionMatches (String text, String word, boolean expected) {

        boolean actual = stringUtil.getRegionMatches(text, word);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetNumberOfEnglishVowels() {
        return Stream.of(
                Arguments.of("Another one bites the dust", 9),
                Arguments.of("Еще один повержен в прах", 0),
                Arguments.of("Ещё один bites the dust", 4),
                Arguments.of(null, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetNumberOfEnglishVowels")
    void testGetNumberOfEnglishVowels (String str, int expected) {

        int actual = stringUtil.getNumberOfEnglishVowels(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetNumberOfPunctuation() {
        return Stream.of(
                Arguments.of("Another one bites the dust", 0),
                Arguments.of("Another. one, bites! the? dust", 4),
                Arguments.of("Another! one? bites? the* dust%", 3),
                Arguments.of(null, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetNumberOfPunctuation")
    void testGetNumberOfPunctuation (String str, int expected) {

        int actual = stringUtil.getNumberOfPunctuation(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetPalindrome() {
        return Stream.of(
                Arguments.of("It's a palindrome", false),
                Arguments.of("Madam, I'm Adam", true),
                Arguments.of(null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetPalindrome")
    void testGetPalindrome (String str, boolean expected) {

        boolean actual = stringUtil.getPalindrome(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetArrayOfEqualParts() {
        return Stream.of(
                Arguments.of("Divide", 1, new String[]{"D", "i", "v", "i", "d", "e"}),
                Arguments.of("Divide", 4, new String[]{"Divi", "de"}),
                Arguments.of("12305", 2, new String[]{"12", "30", "5"}),
                Arguments.of(null, 5, new String[]{"It's null bro"})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetArrayOfEqualParts")
    void testGetArrayOfEqualParts(String str, int divider, String[] expected) {

        String[] actual = stringUtil.getArrayOfEqualParts(str, divider);

        Assertions.assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetWordCount() {
        return Stream.of(
                Arguments.of("Divide et impera", 3),
                Arguments.of("Carum est, quod rarum est.", 5),
                Arguments.of("Only    three    word", 3),
                Arguments.of(null, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetWordCount")
    void testGetWordCount(String str, int expected) {

        int actual = stringUtil.getWordCount(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetNameInitials() {
        return Stream.of(
                Arguments.of("Jim Beam", "JB"),
                Arguments.of("Jack Daniels", "JD"),
                Arguments.of("Johnnie Walker", "JW"),
                Arguments.of(null, "It's null bro")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetNameInitials")
    void testGetNameInitials(String str, String expected) {

        String actual = stringUtil.getNameInitials(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetAllNumbersInString() {
        return Stream.of(
                Arguments.of("One1 One1 Two", "11"),
                Arguments.of("11 Three 5Five5 ", "1155"),
                Arguments.of("5345345", "5345345"),
                Arguments.of(null, "It's null bro")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetAllNumbersInString")
    void testGetAllNumbersInString(String str, String expected) {

        String actual = stringUtil.getAllNumbersInString(str);

        Assertions.assertEquals(expected, actual);
    }
}
