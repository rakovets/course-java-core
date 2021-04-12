package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

public class StringUtilTest {

    static Stream<Arguments> provideArgumentsForStringConcatenate() {
        return Stream.of(
                Arguments.of("Hello World", "Hello ", "World"),
                Arguments.of("Hello", "", "Hello"),
                Arguments.of(null, "Hello", null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForStringConcatenate")
    void stringConcatenate(String expectedString, String str1, String str2) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.stringConcatenate(str1, str2);

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> provideArgumentsForGetIndex() {
        return Stream.of(
                Arguments.of(6, "Hello World", 'W'),
                Arguments.of(-1, "", 'x'),
                Arguments.of(-1, null, 'x'),
                Arguments.of(-1, "Hello", 'x'),
                Arguments.of(2, "1000", "0")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetIndex")
    void getIndex(int expectedInt, String str1, char x) {
        // GIVEN

        // WHEN
        int actualInt = StringUtil.getIndex(str1, x);

        // THEN
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForStringsEquals() {
        return Stream.of(
                Arguments.of(true, "Hello", "Hello"),
                Arguments.of(false, "Car", "Tree"),
                Arguments.of(false, "Car", ""),
                Arguments.of(false, null, "Hello"),
                Arguments.of(false, null, null),
                Arguments.of(false, "Tree", "tree")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForStringsEquals")
    void stringsEquals(boolean expectedBoolean, String str1, String str2) {
        // GIVEN

        // WHEN
        boolean actualBoolean = StringUtil.stringsEquals(str1, str2);

        // THEN
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    static Stream<Arguments> provideArgumentsForTrimmedUpperCase() {
        return Stream.of(
                Arguments.of("WORLD", " world "),
                Arguments.of(null, null),
                Arguments.of("WORLD", " World  ")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTrimmedUpperCase")
    void trimmedUpperCase(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.trimmedUpperCase(str1);

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }


    static Stream<Arguments> provideArgumentsForGetSubstring() {
        return Stream.of(
                Arguments.of("Hell", 0, 4, "Hello World"),
                Arguments.of("o W", 4, 6, "Hello World")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetSubstring")
    void getSubstring(String expectedString, String str1, int num1, int num2) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.getSubstring(str1, num1, num2);

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> provideArgumentsForReplaceSadEmojiToHappyEmoji() {
        return Stream.of(
                Arguments.of(":)", ":("),
                Arguments.of(null, null),
                Arguments.of("How are you:)", "How are you:("),
                Arguments.of(":) (: )):)", ":) (: )):(")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForReplaceSadEmojiToHappyEmoji")
    void replaceSadEmojiToHappyEmoji(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.replaceSadEmojiToHappyEmoji(str1);

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> provideArgumentsForStringIncludeWord() {
        return Stream.of(
                Arguments.of(true, "Hello", "Hello"),
                Arguments.of(true, "Toyota is my favorite car", "Toyota"),
                Arguments.of(false, null, "CAR"),
                Arguments.of(false, "Car", null),
                Arguments.of(false, "Car", "CAR")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForStringIncludeWord")
    void stringIncludeWord(boolean expectedBoolean, String str1, String str2) {
        // GIVEN

        // WHEN
        boolean actualBoolean = StringUtil.stringIncludeWord(str1, str2);

        // THEN
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    static Stream<Arguments> provideArgumentsForEnglishVowelsCounter() {
        return Stream.of(
                Arguments.of(3, "Hello World"),
                Arguments.of(15, "Never give up. Just try else and you will win."),
                Arguments.of(0, "BMW")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForEnglishVowelsCounter")
    void englishVowelsCounter(int expectedInt, String str1) {
        // GIVEN

        // WHEN
        int actualInt = StringUtil.englishVowelsCounter(str1);

        // THEN
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForPunctuationMarksCounter() {
        return Stream.of(
                Arguments.of(0, "Hello World"),
                Arguments.of(5, "Did you see it??? I don't understand, how this work!")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPunctuationMarksCounter")
    void punctuationMarksCounter(int expectedInt, String str1) {
        // GIVEN

        // WHEN
        int actualInt = StringUtil.punctuationMarksCounter(str1);

        // THEN
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForIsPalindrome() {
        return Stream.of(
                Arguments.of(true, "deed"),
                Arguments.of(true, "live not on evil"),
                Arguments.of(false, "Hello World"),
                Arguments.of(false, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsPalindrome")
    void isPalindrome(boolean expectedBoolean, String str1) {
        // GIVEN

        // WHEN
        boolean actualBoolean = StringUtil.isPalindrome(str1);

        // THEN
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // task 11. Метод разбивает строку на равные части по n символов возвращает массив из этих частей
    // В случае строки равной null возвращает null.
    static Stream<Arguments> provideArgumentsForSplitEqualsParts() {
        return Stream.of(
                Arguments.of(new String []{"123","456", "789", "0"}, "1234567890", 3),
                Arguments.of(new String []{"abcde","fghij", "klmno", "pqrst", "uvwxy","z"}, "abcdefghijklmnopqrstuvwxyz", 5),
                Arguments.of(new String []{"H","e", "l", "l", "o"}, "Hello", 1),
                Arguments.of(new String []{"Several"}, "Several", 7),
                Arguments.of(null, null, 1),
                Arguments.of(null, "Hello", -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSplitEqualsParts")
    void splitEqualsParts(String[] expectedString, String str1, int n) {
        // GIVEN

        // WHEN
        String[] actualString = StringUtil.splitEqualsParts(str1, n);

        // THEN
        assertArrayEquals(expectedString, actualString);
    }

    static Stream<Arguments> provideArgumentsForWordsInTextCounter() {
        return Stream.of(
                Arguments.of(1, "  Hello "),
                Arguments.of(10, "Did you see it??? I don't understand, how this work!")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForWordsInTextCounter")
    void wordsInTextCounter(int expectedInt, String str1) {
        // GIVEN

        // WHEN
        int actualInt = StringUtil.wordsInTextCounter(str1);

        // THEN
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForGetInitials() {
        return Stream.of(
                Arguments.of("DR", "DmitRY RakOVets"),
                Arguments.of(null, null),
                Arguments.of("IP", "Igor Popov")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetInitials")
    void getInitials(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.getInitials(str1);

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> provideArgumentsForDigitsCounter() {
        return Stream.of(
                Arguments.of("", "Hello World"),
                Arguments.of(null, null),
                Arguments.of("375292792597", "tel: +375(29)2792597; "),
                Arguments.of("19231", "fdsfsdg1923dsd1")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForDigitsCounter")
    void digitsCounter(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.digitsCounter(str1);

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }
}
