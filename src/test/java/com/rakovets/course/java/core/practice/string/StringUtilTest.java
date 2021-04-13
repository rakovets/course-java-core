package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {

    static Stream<Arguments> gluingTwoStringsProviderArguments() {
        return Stream.of(
                Arguments.of("Hello", "Java", "HelloJava"),
                Arguments.of("", "Java", "Java"),
                Arguments.of("Girl", "Boy", "GirlBoy"),
                Arguments.of("123", "456", "123456"),
                Arguments.of("Hello", "", "Hello")
        );
    }

    @ParameterizedTest
    @MethodSource("gluingTwoStringsProviderArguments")
    void gluingTwoStringsTest(String string1, String string2, String expectedString) {
        String actualString = StringUtil.gluingTwoStrings(string1, string2);
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> searchIndexCharacterProvideArguments() {
        return Stream.of(
                Arguments.of("J", "Java", "0"),
                Arguments.of("T", "is The best", "3"),
                Arguments.of("m", "programming", "6"),
                Arguments.of("b", "language", "-1"),
                Arguments.of(" ", "in the universe", "2")
        );
    }

    @ParameterizedTest
    @MethodSource("searchIndexCharacterProvideArguments")
    void searchIndexCharacterTest(char character, String string, int expectedIndex) {
        int actualIndex = StringUtil.searchIndexCharacter(character, string);
        Assertions.assertEquals(expectedIndex, actualIndex);
    }

    static Stream<Arguments> caseSensitiveStringComparisonProvideArguments() {
        return Stream.of(
                Arguments.of("language", "language", true),
                Arguments.of("***", "***", true),
                Arguments.of("Peace", "peace", false),
                Arguments.of(" ", "  ", false),
                Arguments.of("124", "1244", false)
        );
    }

    @ParameterizedTest
    @MethodSource("caseSensitiveStringComparisonProvideArguments")
    void caseSensitiveStringComparisonTest(String string1, String string2, boolean expectedComparison) {
        boolean actual = StringUtil.caseSensitiveStringComparison(string1, string2);
        Assertions.assertEquals(expectedComparison, actual);
    }

    static Stream<Arguments> removeSpacesStringAndUppercaseLettersProvideArguments() {
        return Stream.of(
                Arguments.of("  Java  ", "JAVA"),
                Arguments.of("is The best ", "IS THE BEST"),
                Arguments.of(" programming", "PROGRAMMING"),
                Arguments.of(" 1 ", "1"),
                Arguments.of("J", "J")
        );
    }

    @ParameterizedTest
    @MethodSource("removeSpacesStringAndUppercaseLettersProvideArguments")
    void removeSpacesStringAndUppercaseLettersTest(String string, String expected) {
        String actualString = StringUtil.removeSpacesStringAndUppercaseLetters(string);
        Assertions.assertEquals(expected, actualString);
    }

    static Stream<Arguments> extractSubstringFromStringProvideArguments() {
        return Stream.of(
                Arguments.of(1, 3, "Java", "av"),
                Arguments.of(3, 6, "is The best", "The"),
                Arguments.of(11, 12, "programming ", " "),
                Arguments.of(0, 2, "  language  ", "  "),
                Arguments.of(6, 9, "in the  universe", "  u")
        );
    }

    @ParameterizedTest
    @MethodSource("extractSubstringFromStringProvideArguments")
    void extractSubstringFromStringTest(int beginCharacter, int endCharacter, String string, String expected) {
        String actualString = StringUtil.extractSubstringFromString(string, beginCharacter, endCharacter);
        Assertions.assertEquals(expected, actualString);
    }

    static Stream<Arguments> replaceSadEmojisWithFunnyOnesProvideArguments() {
        return Stream.of(
                Arguments.of(":(", ":)", "Java :(", "Java :)"),
                Arguments.of(":(", ":)", " :( is The best", " :) is The best"),
                Arguments.of(":(", ":)", ":(", ":)"),
                Arguments.of(":(", ":)", "  :(  ", "  :)  "),
                Arguments.of(":(", ":)", "language:(in the  universe:(", "language:)in the  universe:)")
        );
    }

    @ParameterizedTest
    @MethodSource("replaceSadEmojisWithFunnyOnesProvideArguments")
    void replaceSadEmojisWithFunnyOnesTest(String sadEmoji, String funnyEmoji, String string, String expected) {
        String actualString = StringUtil.replaceSadEmojisWithFunnyOnes(string, sadEmoji, funnyEmoji);
        Assertions.assertEquals(expected, actualString);
    }

    static Stream<Arguments> textStartsAndEndsWithWordProvideArguments() {
        return Stream.of(
                Arguments.of("Java is The best Java", "Java", true),
                Arguments.of(" is The best ", " ", true),
                Arguments.of(" programming", " ", false),
                Arguments.of("1 language 1", "1", true),
                Arguments.of(":) in the  universe :)", ":)", true)
        );
    }

    @ParameterizedTest
    @MethodSource("textStartsAndEndsWithWordProvideArguments")
    void textStartsAndEndsWithWordTest(String text, String word, boolean expected) {
        boolean actualString = StringUtil.textStartsAndEndsWithWord(text, word);
        Assertions.assertEquals(expected, actualString);
    }

    static Stream<Arguments> numberEnglishVowelsProvideArguments() {
        return Stream.of(
                Arguments.of("Java", 2),
                Arguments.of(" is The best", 3),
                Arguments.of("programmiiiing", 6),
                Arguments.of("   ", 0),
                Arguments.of("iii iii iii", 9)
        );
    }

    @ParameterizedTest
    @MethodSource("numberEnglishVowelsProvideArguments")
    void numberEnglishVowelsTest(String string, int expected) {
        int actual = StringUtil.numberEnglishVowels(string);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> numberPunctuationMarksProvideArguments() {
        return Stream.of(
                Arguments.of("Java..", 2),
                Arguments.of(" is. The, best !!", 4),
                Arguments.of("programmiiiing", 0),
                Arguments.of(" ,,,...!!!???  ", 12),
                Arguments.of(".", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("numberPunctuationMarksProvideArguments")
    void numberPunctuationMarksTest(String string, int expected) {
        int actual = StringUtil.numberPunctuationMarks(string);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> checkEnteredPalindromeProvideArguments() {
        return Stream.of(
                Arguments.of("Java", false),
                Arguments.of("prog gorp", true),
                Arguments.of("1234554321", true),
                Arguments.of("1 1", true),
                Arguments.of("babBa b", true)
        );
    }

    @ParameterizedTest
    @MethodSource("checkEnteredPalindromeProvideArguments")
    void checkEnteredPalindromeTest(String string, boolean expected) {
        boolean actual = StringUtil.checkEnteredPalindrome(string);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> splitTextEqualPartsStoreArrayProvideArguments() {
        return Stream.of(
                Arguments.of("Java", 2, "[Ja, va]"),
                Arguments.of("is The best", 6, "[is The,  best]"),
                Arguments.of("programming", 5, "[progr, ammin, g]"),
                Arguments.of("123456789", 2, "[12, 34, 56, 78, 9]"),
                Arguments.of("in the  universe", 15, "[in the  univers, e]")
        );
    }

    @ParameterizedTest
    @MethodSource("splitTextEqualPartsStoreArrayProvideArguments")
    void splitTextEqualPartsStoreArrayTest(String text, int n, String expected) {
        String actual = StringUtil.splitTextEqualPartsStoreArray(text, n);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> countNumberWordsProvideArguments() {
        return Stream.of(
                Arguments.of("Java", 1),
                Arguments.of("is The best", 3),
                Arguments.of("prog  ramming", 2),
                Arguments.of("lan  gua  ge", 3),
                Arguments.of("in the  universe 11", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("countNumberWordsProvideArguments")
    void countNumberWordsTest(String text, int expected) {
        int actual = StringUtil.countNumberWords(text);
        Assertions.assertEquals(expected, actual);
    }
}
