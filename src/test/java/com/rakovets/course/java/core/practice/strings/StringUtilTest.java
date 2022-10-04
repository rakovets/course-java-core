package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.stream.Stream;

public class StringUtilTest {

    StringUtil stringUtil = new StringUtil();

    static Stream<Arguments> provideArgumentsGlueStrings() {
        return Stream.of(
                Arguments.of("Hello", " world", "Hello world"),
                Arguments.of("", "world", "world"),
                Arguments.of("Hello", "", "Hello"),
                Arguments.of("", "", "")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGlueStrings")
    public void testGlueStrings(String firstParameter, String secondParameter, String expectedResult) {
        String actualResult = stringUtil.glueStrings(firstParameter, secondParameter);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> provideArgumentsGetIndexOfChar() {
        return Stream.of(
                Arguments.of("Hello", "l", "2"),
                Arguments.of("Hello", "X", "-1")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetIndexOfChar")
    public void testGetIndexOfChar(String str, char c, int expectedResult) {
        int actualResult = stringUtil.getIndexOfChar(str, c);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> provideArgumentsСompareStringCaseSensitive() {
        return Stream.of(
                Arguments.of("Hello", "Hello", "true"),
                Arguments.of("Hello", "hello", "false")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsСompareStringCaseSensitive")
    public void testСompareStringCaseSensitive(String firstParameter, String secondParameter, boolean expectedResult) {
        boolean actualResult = stringUtil.compareStringCaseSensitive(firstParameter, secondParameter);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> provideArgumentsRemoveStartEndSpacesConvertToUpperCase() {
        return Stream.of(
                Arguments.of("   Hello world   ", "HELLO WORLD"),
                Arguments.of("Java   ", "JAVA"),
                Arguments.of("   Java", "JAVA")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsRemoveStartEndSpacesConvertToUpperCase")
    public void testRemoveStartEndSpacesConvertToUpperCase(String str, String expectedResult) {
        String actualResult = stringUtil.removeStartEndSpacesConvertToUpperCase(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> provideArgumentsExtractSubstringBetweenIndexes() {
        return Stream.of(
                Arguments.of("Hello world", "0", "5", "Hello"),
                Arguments.of("Java", "2", "3", "v")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsExtractSubstringBetweenIndexes")
    public void testExtractSubstringBetweenIndexes(String str, int firstIndex, int lastIndex, String expectedResult) {
        String actualResult = stringUtil.extractSubstringBetweenIndexes(str, firstIndex, lastIndex);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> provideArgumentsChangeSmileSadToHappy() {
        return Stream.of(
                Arguments.of(":(", ":)"),
                Arguments.of("Hello :(", "Hello :)"),
                Arguments.of(":)", ":)"),
                Arguments.of("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsChangeSmileSadToHappy")
    public void testExtractSubstringBetweenIndexes(String providedString, String expectedResult) {
        String actualResult = stringUtil.changeSmileSadToHappy(providedString);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> provideArgumentsCheckStringStartEndWithWord() {
        return Stream.of(
                Arguments.of("Hello world", "Hello", "true"),
                Arguments.of("Hello world", "hello", "false"),
                Arguments.of("Hello world", "world", "true"),
                Arguments.of("Hello world", "World", "false")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsCheckStringStartEndWithWord")
    public void testCheckStringStartEndWithWord(String text, String word, boolean expectedResult) {
        boolean actualResult = stringUtil.checkStringStartEndWithWord(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> provideArgumentsCountNumberOfVowels() {
        return Stream.of(
                Arguments.of("Hello", "2"),
                Arguments.of("hEllO", "2"),
                Arguments.of("XXX", "0"),
                Arguments.of("AeIoU", "5"),
                Arguments.of("", "0"),
                Arguments.of(".!,", "0")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsCountNumberOfVowels")
    public void testCountNumberOfVowels(String str, int expectedResult) {
        int actualResult = stringUtil.countNumberOfVowels(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> provideArgumentsCountPunctuationMarks() {
        return Stream.of(
                Arguments.of("Hello", "0"),
                Arguments.of("Hello!", "1"),
                Arguments.of("H,e.l?lo!", "4"),
                Arguments.of("!.,?", "4"),
                Arguments.of("", "0")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsCountPunctuationMarks")
    public void testCountPunctuationMarks(String str, int expectedResult) {
        int actualResult = stringUtil.countPunctuationMarks(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> provideArgumentsCheckPalindrome() {
        return Stream.of(
                Arguments.of("deed", "true"),
                Arguments.of("dead", "false"),
                Arguments.of("Dead", "false"),
                Arguments.of("1991", "true"),
                Arguments.of("1999", "false"),
                Arguments.of("X", "true"),
                Arguments.of("dog god", "true"),
                Arguments.of("", "true")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsCheckPalindrome")
    public void testCheckPalindrome(String str, boolean expectedResult) {
        boolean actualResult = stringUtil.checkPalindrome(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> provideArgumentsSplitStringByDefinedNumberElements() {
        return Stream.of(
                Arguments.of("123", "1", "[1, 2, 3]"),
                Arguments.of("abcdef", "2", "[ab, cd, ef]"),
                Arguments.of("A b C d E F", "3", "[A b,  C , d E,  F]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsSplitStringByDefinedNumberElements")
    public void testSplitStringByDefinedNumberElements(String str, int chunkSize, String expectedResult) {
        String actualResult = Arrays.toString(stringUtil.splitStringByDefinedNumberElements(str, chunkSize));

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> provideArgumentsCountWordsUsingSplit() {
        return Stream.of(
                Arguments.of(null, "0"),
                Arguments.of("", "0"),
                Arguments.of("Hello world", "2"),
                Arguments.of("Hello       world", "2"),
                Arguments.of("Hello   ", "1"),
                Arguments.of("Hello world bro", "3")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsCountWordsUsingSplit")
    public void testCountWordsUsingSplit(String str, int expectedResult) {
        int actualResult = stringUtil.countWordsUsingSplit(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> provideArgumentsExtractFirstLettersNameSurnameToUpperCase() {
        return Stream.of(
                Arguments.of("DmitRY RakOVets", "DR"),
                Arguments.of("dmitRY rakOVets", "DR")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsExtractFirstLettersNameSurnameToUpperCase")
    public void testExtractFirstLettersNameSurnameToUpperCase(String str, String expectedResult) {
        String actualResult = stringUtil.extractFirstLettersNameSurnameToUpperCase(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> provideArgumentsExtractDigitsFromString() {
        return Stream.of(
                Arguments.of("Hello world", ""),
                Arguments.of("00 7", "007"),
                Arguments.of("Hello world1", "1"),
                Arguments.of("12345", "12345"),
                Arguments.of("q1w.e2r*t5y", "125")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsExtractDigitsFromString")
    public void testExtractDigitsFromString(String str, String expectedResult) {
        String actualResult = stringUtil.extractDigitsFromString(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
