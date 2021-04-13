package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {
    static Stream<Arguments> concatProviderArguments() {
        return Stream.of(
                Arguments.of("HelloJava", "Hello", "Java"),
                Arguments.of("Java", "", "Java"),
                Arguments.of("Hello", "Hello", "")
        );
    }

    @ParameterizedTest
    @MethodSource("concatProviderArguments")
    void Glue(String expectedString, String str1, String str2) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.glue(str1, str2);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> indexSymbol() {
        return Stream.of(
                Arguments.of("l", "HelloJava"),
                Arguments.of("v", "Java"),
                Arguments.of("m", "Symbol")
        );
    }

    @ParameterizedTest
    @MethodSource("indexSymbol")
    void Glue(String expectedSymbol, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.indexSymbol(str1);

        // THAT
        Assertions.assertEquals(expectedSymbol, actualString);
    }

    static Stream<Arguments> identicalStrings() {
        return Stream.of(
                Arguments.of("true", "Hello", "Hello"),
                Arguments.of("false", "Hello", "hello"),
                Arguments.of("true", " ", " ")
        );
    }

    @ParameterizedTest
    @MethodSource("identicalStrings")
    void identicalStrings(String expectedSymbol, String str1, String str2) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.identicalStrings(str1, str2);

        // THAT
        Assertions.assertEquals(expectedSymbol, actualString);
    }

    static Stream<Arguments> removeSpacesAroundCastLowerCase() {
        return Stream.of(
                Arguments.of("hello", "Hello "),
                Arguments.of("hello", " HeLlo"),
                Arguments.of("", " ")
        );
    }

    @ParameterizedTest
    @MethodSource("removeSpacesAroundCastLowerCase")
    void removeSpacesAroundCastLowerCase(String expectedSymbol, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.removeSpacesAroundCastLowerCase(str1);

        // THAT
        Assertions.assertEquals(expectedSymbol, actualString);
    }

    static Stream<Arguments> extractionSubstring() {
        return Stream.of(
                Arguments.of("ll", "Hello  "),
                Arguments.of("l", " HeLlo"),
                Arguments.of("lati", "Relationship")
        );
    }

    @ParameterizedTest
    @MethodSource("extractionSubstring")
    void extractionSubstring(String expectedSymbol, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.extractionSubstring(str1);

        // THAT
        Assertions.assertEquals(expectedSymbol, actualString);
    }

    static Stream<Arguments>happyEmoji() {
        return Stream.of(
                Arguments.of("Hello:)  ", "Hello:(  "),
                Arguments.of(" HeLlo)", " HeLlo("),
                Arguments.of(":):):)", ":(:(:(")
        );
    }

    @ParameterizedTest
    @MethodSource("happyEmoji")
    void happyEmoji(String expectedSymbol, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.happyEmoji(str1);

        // THAT
        Assertions.assertEquals(expectedSymbol, actualString);
    }

    static Stream<Arguments>line() {
        return Stream.of(
                Arguments.of("true", "Hi!", "Java"),
                Arguments.of("false", "hi !", " Java"),
                Arguments.of("false", "!Hi", "java")
        );
    }

    @ParameterizedTest
    @MethodSource("line")
    void line(String expectedSymbol, String text, String word) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.line(text, word);

        // THAT
        Assertions.assertEquals(expectedSymbol, actualString);
    }

    static Stream<Arguments>vowels() {
        return Stream.of(
                Arguments.of("2", "Hello!"),
                Arguments.of("6", "qwertyuiop[]';lkjhgfdsazxcvbnm,./"),
                Arguments.of("5", "ololooo")
        );
    }

    @ParameterizedTest
    @MethodSource("vowels")
    void vowels(String expectedSymbol, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.vowels(str1);

        // THAT
        Assertions.assertEquals(expectedSymbol, actualString);
    }

    static Stream<Arguments>punctuations() {
        return Stream.of(
                Arguments.of("1", "Hello!"),
                Arguments.of("2", "qwertyuiop[]';lkjhgfdsazxcvbnm,./"),
                Arguments.of("6", ",o.l?o!!.looo")
        );
    }

    @ParameterizedTest
    @MethodSource("punctuations")
    void punctuations(String expectedSymbol, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.punctuations(str1);

        // THAT
        Assertions.assertEquals(expectedSymbol, actualString);
    }

    static Stream<Arguments>palindrome() {
        return Stream.of(
                Arguments.of("true", "deed"),
                Arguments.of("false", "deeds"),
                Arguments.of("true", "1991")
        );
    }

    @ParameterizedTest
    @MethodSource("palindrome")
    void palindrome(String expectedSymbol, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.palindrome(str1);

        // THAT
        Assertions.assertEquals(expectedSymbol, actualString);
    }

    static Stream<Arguments>samePartsString() {
        return Stream.of(
                Arguments.of(new String[] {"Hel", "lo ", "Jav", "a!"}, "Hello Java!", "3"),
                Arguments.of(new String[] {"Hello", " Java", "!"}, "Hello Java!", "5")
        );
    }

    @ParameterizedTest
    @MethodSource("samePartsString")
    void samePartsString(String[] expectedSymbol, String str1, int i) {
        // GIVEN

        // WHEN
        String[] actualString = StringUtil.samePartsString(str1, i);

        // THAT
        Assertions.assertArrayEquals(expectedSymbol, actualString);
    }

    static Stream<Arguments>wordCount() {
        return Stream.of(
                Arguments.of("2", "Hello Java!"),
                Arguments.of("7", "ajfk afnoiafn iwfn qwjfjn,oiaf. oauhf! Fqwf?"),
                Arguments.of("1", "1991")
        );
    }

    @ParameterizedTest
    @MethodSource("wordCount")
    void wordCount(String expectedSymbol, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.wordCount(str1);

        // THAT
        Assertions.assertEquals(expectedSymbol, actualString);
    }

    static Stream<Arguments>initialsFullName() {
        return Stream.of(
                Arguments.of("EK", "Evgen Kolesnik"),
                Arguments.of("AA", "ajfk afnoiafn iwfn qwjfjn,oiaf. oauhf! Fqwf?"),
                Arguments.of("PO", "pasfasf,owfwf")
        );
    }

    @ParameterizedTest
    @MethodSource("initialsFullName")
    void initialsFullName(String expectedSymbol, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.initialsFullName(str1);

        // THAT
        Assertions.assertEquals(expectedSymbol, actualString);
    }

    static Stream<Arguments>allNumbers() {
        return Stream.of(
                Arguments.of("1", "Evgen Kolesn1k"),
                Arguments.of("1231244", "ajfk afnoiafn iwf123,1244afsf"),
                Arguments.of("", "pafqf")
        );
    }

    @ParameterizedTest
    @MethodSource("allNumbers")
    void allNumbers(String expectedSymbol, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.allNumbers(str1);

        // THAT
        Assertions.assertEquals(expectedSymbol, actualString);
    }
}
