package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    static Stream<Arguments> concatProviderArguments() {//task01
        return Stream.of(
                Arguments.of("HelloJava", "Hello", "Java"),
                Arguments.of("Java", "", "Java"),
                Arguments.of("Hello", "Hello", "")
        );
    }

    @ParameterizedTest
    @MethodSource("concatProviderArguments")
    void getOneStringOfTwo(String expectedString, String str1, String str2) {
        String actualString = StringUtil.getOneStringOfTwo(str1, str2);
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> findIndexProviderArguments() {//Task02
        return Stream.of(
                Arguments.of(7, "v", "Hello everybody!"),
                Arguments.of(-1, "z", "Good job!"),
                Arguments.of(5, "a", " You are velcom  ")
        );
    }

    @ParameterizedTest
    @MethodSource("findIndexProviderArguments")
    void getIndexOfChar(int expectedIndex, char c, String str) {
        int actualIndex = StringUtil.getIndexOfChar(c, str);
        Assertions.assertEquals(expectedIndex, actualIndex);
    }

    static Stream<Arguments> equalsProviderArguments() {//task03
        return Stream.of(
                Arguments.of(true, "How do you do?", "How do you do?"),
                Arguments.of(false, " How do you do?", "How do you do?"),
                Arguments.of(false, "How Do you do?", "How do you do?"),
                Arguments.of(false, " ", "How do you do?")
        );
    }

    @ParameterizedTest
    @MethodSource("equalsProviderArguments")
    void isEqualsTwoStrings(boolean expectedValue, String str1, String str2) {
        boolean actualValue = StringUtil.isEqualsTwoStrings(str1, str2);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    static Stream<Arguments> trimProviderArguments() {//task04
        return Stream.of(
                Arguments.of("HOW DO YOU DO?", "How Do you do?"),
                Arguments.of("HOW DO YOU DO?", "  How do yoU do?   "),
                Arguments.of("HOW   DO YOU DO?", "How   do yoU do? "),
                Arguments.of("HOW   DO YOU DO?", "   How   do yoU do?")
        );
    }

    @ParameterizedTest
    @MethodSource("trimProviderArguments")
    void getTrimAndLowerCase(String expectedString, String str) {
        String actualString = StringUtil.getTrimAndLowerCase(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> getSubProviderArguments() {//task05
        return Stream.of(
                Arguments.of("o you do?", "how do you do?", 5),
                Arguments.of("would be nice to get 10", "It would be nice to get 10 points for homework", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("getSubProviderArguments")
    void getPartOfString(String expectedString, String str, int start) {
        String actualString = StringUtil.getPartOfString(str, start);
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> ReplaceProviderArguments() {//task06
        return Stream.of(
                Arguments.of("Hop hei :) halalej :)", "Hop hei :( halalej :)"),
                Arguments.of(":):):)", ":):(:("),
                Arguments.of(" ", " ")
        );
    }

    @ParameterizedTest
    @MethodSource("ReplaceProviderArguments")
    void replaceSmiles(String expectedString, String str) {
        String actualString = StringUtil.replaceSmiles(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> ProvideArgumentsForStartAndEndWordMethod() {//task07
        return Stream.of(
                Arguments.of(true, "hello It would be nice to get 10 points for homework hello", "hello"),
                Arguments.of(false, "hello It would be nice to get 10 points for homework", "hello"),
                Arguments.of(false, " It would be nice to get 10 points for homework hello", "hello"),
                Arguments.of(false, "It would be nice to get 10 points for homework", "hello"),
                Arguments.of(false, "Hello It would be nice to get 10 points for homework hello", "hello")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForStartAndEndWordMethod")
    void startAndEndWord(boolean expected, String str1, String word) {
        boolean actual = StringUtil.startAndEndWord(str1, word);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForGetVowelsMethod() {//task08
        return Stream.of(
                Arguments.of(14, "it would be nice to get 10 points for homework"),
                Arguments.of(0, "ddd 55 fff"),
                Arguments.of(0, " "),
                Arguments.of(14, "It woUld be nice to get 10 points for homEwork")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForGetVowelsMethod")
    void getVowels(int expected, String str) {
        int actual = StringUtil.getVowels(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForgetSumOfSymbolsMethod() {//task09
        return Stream.of(
                Arguments.of(9, "A man!, .a p!l,an.. a c,anal-Pa!nama"),
                Arguments.of(1, "A man, a plan a canal-Panama"),
                Arguments.of(0, "A man a plan a canal-Panama")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForgetSumOfSymbolsMethod")
    void isPalindrome(int expected, String str) {
        int actual = StringUtil.getSumOfSymbols(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForPalindromeMethod() {//task10
        return Stream.of(
                Arguments.of(true, "A man, a plan a canal-Panama"),
                Arguments.of(true, "A man, a plan a canal-Panama  "),
                Arguments.of(false, "A man, aa plan a canal-Panama")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForPalindromeMethod")
    void isPalindrome(boolean expected, String str) {
        boolean actual = StringUtil.isPalindrome(str);
        Assertions.assertEquals(expected, actual);
    }

    //task11
    static Stream<Arguments> ProvideArgumentsForGetPartsOfStringMethod() {
        return Stream.of(
                Arguments.of(new String[] {"How", " ar", "e y", "ou?"}, "How are you?", 3),
                Arguments.of(new String[] {"12", "34", "5"}, "12345", 2),
                Arguments.of(new String[] {"t", "o", "d", "a", "y"}, "today", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForGetPartsOfStringMethod")
    void getPartsOfString(String[] expected, String str, int parts) {
        String[] actual = StringUtil.getPartsOfString(str, parts);
        Assertions.assertArrayEquals(expected, actual);
    }
}
