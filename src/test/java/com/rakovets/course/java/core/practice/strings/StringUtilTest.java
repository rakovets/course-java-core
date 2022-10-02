package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();

    static Stream<Arguments> provideArgumentsForGlue() {
        return Stream.of(
                Arguments.of("123", "456", "123456"),
                Arguments.of("", "456", "456"),
                Arguments.of("123", "", "123"),
                Arguments.of(null, "456", "null456"),
                Arguments.of("123", null, "123null")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGlue")
    void testGlue(String str1, String str2, String expected) {
        String actual = stringUtil.glue(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetIndexOfChar() {
        return Stream.of(
                Arguments.of("123", "1", 0),
                Arguments.of("", "1", -1),
                Arguments.of("123456", '2', 1),
                Arguments.of("123456", 'c', -1)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetIndexOfChar")
    void testGetIndexOfChar(String str, char c, int expected) {
        int actual = stringUtil.getIndexOfChar(str, c);
        Assertions.assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsForIsIdentical() {
        return Stream.of(
                Arguments.of("123", "123", true),
                Arguments.of("123", "456", false),
                Arguments.of("123456", null, false),
                Arguments.of("qwerty", "qwErty", false),
                Arguments.of("qwerty", "QWERTY", false),
                Arguments.of("123456", " ", false)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForIsIdentical")
    void testIsIdentical(String str1, String str2, boolean expected) {
        boolean actual = stringUtil.isIdentical(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOnlyLetters() {
        return Stream.of(
                Arguments.of(" Qwerty", "qwerty"),
                Arguments.of("qwerTy ", "qwerty"),
                Arguments.of("Qwerty qwerty  ", "qwerty qwerty"),
                Arguments.of(" ", ""),
                Arguments.of("     123   456    ", "123   456")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForOnlyLetters")
    void testOnlyLetters(String str1, String expected) {
        String actual = stringUtil.onlyLetters(str1);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetPartOfString() {
        return Stream.of(
                Arguments.of("qwerty", 3, 4, "er"),
                Arguments.of("qwerty ", 1, 2, "qw"),
                Arguments.of("red cat", 3, 7, "d cat"),
                Arguments.of(" ", 1, 1, " "),
                Arguments.of("123-456", 4, 6, "-45")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetPartOfString")
    void testGetPartOfString(String str, int n, int m, String expected) {
        String actual = stringUtil.getPartOfString(str, n, m);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForChangeEmogi() {
        return Stream.of(
                Arguments.of(":(Hello:(", ":)Hello:)"),
                Arguments.of("bad day or not :(:(:(",  "bad day or not :):):)"),
                Arguments.of("yes: :) no: :(", "yes: :) no: :)"),
                Arguments.of("(((((:(:(:( ", "(((((:):):) "),
                Arguments.of("      ","      ")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForChangeEmogi")
    void testChangeEmogi(String str, String expected) {
        String actual = stringUtil.changeEmogi(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsStartsAndEndWith() {
        return Stream.of(
                Arguments.of("cat sleeps with another cat", "cat", true),
                Arguments.of("cat sleeps ", "cat", false),
                Arguments.of("another cat", "cat", false),
                Arguments.of(" ", "cat", false),
                Arguments.of("12345678901", "1", true)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForIsStartsAndEndWith")
    void testIsStartsAndEndWith(String text, String word, boolean expected) {
        boolean actual = stringUtil.isStartsAndEndWith(text, word);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetAmountOfEnglishVowels() {
        return Stream.of(
                Arguments.of("cat sleeps", 3),
                Arguments.of("wow, cat sleeps", 4),
                Arguments.of("My cat Angee sleeps", 7),
                Arguments.of("123456", 0),
                Arguments.of(" ", 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAmountOfEnglishVowels")
    void testGetAmountOfEnglishVowels(String str,int expected) {
        int actual = stringUtil.getAmountOfEnglishVowels(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetAmountOfPunctuationMarks() {
        return Stream.of(
                Arguments.of("cat sleeps!!!", 3),
                Arguments.of("wow, cat sleeps?", 2),
                Arguments.of("My cat Angee sleeps)))", 0),
                Arguments.of("!?!?...", 7),
                Arguments.of(" ", 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAmountOfPunctuationMarks")
    void testGetAmountOfPunctuationMarks(String str,int expected) {
        int actual = stringUtil.getAmountOfPunctuationMarks(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsPalindrom() {
        return Stream.of(
                Arguments.of("deed", true),
                Arguments.of("Do geese see God?", true),
                Arguments.of("1991", true),
                Arguments.of("Allo", false),
                Arguments.of("123210 ", false)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForIsPalindrom")
    void testIsPalindrom(String str,boolean expected) {
        boolean actual = stringUtil.isPalindrom(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetArrayOfPartsOfString() {
        return Stream.of(
                Arguments.of("catdogman", 3, new String[]{"cat", "dog", "man"}),
                Arguments.of("123456", 1, new String[]{"1", "2", "3", "4", "5", "6"}),
                Arguments.of("mamam", 2, new String[]{"ma", "ma", "m"})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetArrayOfPartsOfString")
    void testGetArrayOfPartsOfString(String str, int n, String[] expected) {
        String[] actual = stringUtil.getArrayOfPartsOfString(str, n);
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    static Stream<Arguments> provideArgumentsForGetWordsCount() {
        return Stream.of(
                Arguments.of("My name is Olga", 4),
                Arguments.of("Hello my   dear   friend", 4),
                Arguments.of("Man", 1),
                Arguments.of(null, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetWordsCount")
    void testGetWordsCount(String str, int expected) {
        int actual = stringUtil.getWordsCount(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetInitials() {
        return Stream.of(
                Arguments.of("Komlik Olga", "KO"),
                Arguments.of("komlik Olga", "KO"),
                Arguments.of("komlik olga", "KO"),
                Arguments.of("KOMLIK OLGA", "KO")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetInitials")
    void testGetInitials(String str, String expected) {
        String actual = stringUtil.getInitials(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetDigitsFromText() {
        return Stream.of(
                Arguments.of("Komlik1234Olga", "1234"),
                Arguments.of("456", "456"),
                Arguments.of("...111...", "111")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetDigitsFromText")
    void testGetDigitsFromText(String str, String expected) {
        String actual = stringUtil.getDigitsFromText(str);
        Assertions.assertEquals(expected, actual);
    }
}
