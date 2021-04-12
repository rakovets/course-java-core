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


}
