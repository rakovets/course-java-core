package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {
    static StringUtil stringUtil;

    @BeforeAll
    static void beforeAll() {
        stringUtil = new StringUtil();
    }

    // task 1 test
    static Stream<Arguments> getConcatProviderArguments() {
        return Stream.of(
                Arguments.of("156", "78", "15678"),
                Arguments.of("Hello ", "Java", "Hello Java"),
                Arguments.of("", "", ""),
                Arguments.of(" ", "356", " 356")
        );
    }

    @ParameterizedTest
    @MethodSource("getConcatProviderArguments")
    void getConcatTest(String str1, String str2, String expectedString) {
        String actualString = StringUtil.getStringConcat(str1, str2);
        Assertions.assertEquals(expectedString, actualString);
    }

    // task 2 test
    static Stream<Arguments> getIndexOfProviderArguments() {
        return Stream.of(
                Arguments.of("Hello", "o", 4),
                Arguments.of(null, "d", -1),
                Arguments.of("Java", "x", -1),
                Arguments.of("JVM", "v", -1)
        );
    }

    @ParameterizedTest
    @MethodSource("getIndexOfProviderArguments")
    void getIndexOfTest(String str, char symbol, int expectedInt) {
        int actualInt = StringUtil.getIndexOf(str, symbol);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // task 3 test
    static Stream<Arguments> isEqualsProviderArguments() {
        return Stream.of(
                Arguments.of("Hello", "Hello", true),
                Arguments.of("Hello", "hello", false),
                Arguments.of(null, "Hello", false),
                Arguments.of("", "Hello", false)
        );
    }

    @ParameterizedTest
    @MethodSource("isEqualsProviderArguments")
    void isEqualsTest(String str1, String str2, boolean expectedBoolean) {
        boolean actualBoolean = StringUtil.isEquals(str1, str2);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // task 4 test
    static Stream<Arguments> getTrimAndUpperCaseProviderArguments() {
        return Stream.of(
                Arguments.of(" Hello world ", "HELLO WORLD"),
                Arguments.of(" hello world", "HELLO WORLD"),
                Arguments.of(null, null),
                Arguments.of(" I like JAva ", "I LIKE JAVA")
        );
    }

    @ParameterizedTest
    @MethodSource("getTrimAndUpperCaseProviderArguments")
    void getTrimAndUpperCaseTest(String str, String expectedString) {
        String actualString = StringUtil.getTrimAndUpperCase(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    // task 5 test
    static Stream<Arguments> getSubstringProviderArguments() {
        return Stream.of(
                Arguments.of("Hello world!", 6, 11, "world"),
                Arguments.of("IT-academy.by", -5, 5, null),
                Arguments.of("IT-academy.by", 10, 5, null),
                Arguments.of("IT-academy.by", 2, 15, null),
                Arguments.of(null, 8, 10, null),
                Arguments.of(" I like java ", 3, 10, "like ja")
        );
    }

    @ParameterizedTest
    @MethodSource("getSubstringProviderArguments")
    void getSubstringTest(String str, int start, int end, String expectedString) {
        String actualString = StringUtil.getSubstring(str, start, end);
        Assertions.assertEquals(expectedString, actualString);
    }

    // task 6 test
    static Stream<Arguments> getReplaceProviderArguments() {
        return Stream.of(
                Arguments.of("Hello :(", "(", ")", "Hello :)"),
                Arguments.of(":( Hello :(", "(", ")", ":) Hello :)"),
                Arguments.of(":(:( Hello:( :(", "(", ")", ":):) Hello:) :)"),
                Arguments.of(null, "(", ")", null)
        );
    }

    @ParameterizedTest
    @MethodSource("getReplaceProviderArguments")
    void getReplaceTest(String str, char oldChar, char newChar, String expectedString) {
        String actualString = StringUtil.getReplace(str, oldChar, newChar);
        Assertions.assertEquals(expectedString, actualString);
    }

    // task 7 test
    static Stream<Arguments> isStartEndLastWorldProviderArguments() {
        return Stream.of(
                Arguments.of("text by text", "text", true),
                Arguments.of("world my world", "world", true),
                Arguments.of("text by text", "world", false),
                Arguments.of("world my world", "text", false),
                Arguments.of("I like this text", "text", false),
                Arguments.of("text with world", "text", false),
                Arguments.of("my end my", "my", false),
                Arguments.of(null, "world", false)
        );
    }

    @ParameterizedTest
    @MethodSource("isStartEndLastWorldProviderArguments")
    void isStartEndLastWorldTest(String str, String testWorld, boolean expectedBoolean) {
        boolean actualBoolean = StringUtil.isStartEndLastWorld(str, testWorld);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // task 8 test
    static Stream<Arguments> getVowelEnglishLettersProviderArguments() {
        return Stream.of(
                Arguments.of("Hello java", 4),
                Arguments.of("I like Minsk", 4),
                Arguments.of("Жыве Беларусь", 0),
                Arguments.of("БЕЛАЯ STRIPE", 2),
                Arguments.of("CMD", 0),

                Arguments.of(null, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getVowelEnglishLettersProviderArguments")
    void getVowelEnglishLettersTest(String str, int expectedInt) {
        int actualInt = StringUtil.getVowelEnglishLetters(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // task 9 test
    static Stream<Arguments> getPunctuasionMarksProviderArguments() {
        return Stream.of(
                Arguments.of("Hello java!", 1),
                Arguments.of("I like Minsk", 0),
                Arguments.of("Hello!!! What are you doing?", 4),
                Arguments.of("Hey! I know seven colors of the rainbow: red, orange, yellow, green, cyan, blue, purple. And you?", 10),
                Arguments.of(null, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getPunctuasionMarksProviderArguments")
    void getPunctuasionMarksTest(String str, int expectedInt) {
        int actualInt = StringUtil.getPunctuasionMarks(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // task 10 test
    static Stream<Arguments> isPalindromProviderArguments() {
        return Stream.of(
                Arguments.of("text by text", false),
                Arguments.of("deed", true),
                Arguments.of("Do geese see God?", true),
                Arguments.of(null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("isPalindromProviderArguments")
    void isPalindromTest(String str, boolean expectedBoolean) {
        boolean actualBoolean = StringUtil.isPalindrom(str);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // task 11 test
    static Stream<Arguments> getSplitStringProviderArguments() {
        return Stream.of(
                Arguments.of("Hello Java", 2, "[He, ll, o , Ja, va]"),
                Arguments.of("I like Minsk", 5, "[I lik, e Min, sk]"),
                Arguments.of("Hello Java", 0, null),
                Arguments.of("Hello Java", -8, null),
                Arguments.of(null, 8, null)
        );
    }

    @ParameterizedTest
    @MethodSource("getSplitStringProviderArguments")
    void getSplitStringTest(String str, int numberSimbols, String expectedString) {
        String actualString = StringUtil.getSplitString(str, numberSimbols);
        Assertions.assertEquals(expectedString, actualString);
    }

    // task 12 test
    static Stream<Arguments> getNumberWordsInTextProviderArguments() {
        return Stream.of(
                Arguments.of("Hello java!", 2),
                Arguments.of("I like      Minsk", 3),
                Arguments.of("Hello!!! What are      you doing?", 5),
                Arguments.of(null, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getNumberWordsInTextProviderArguments")
    void getNumberWordsInTextTest(String str, int expectedInt) {
        int actualInt = StringUtil.getNumberWordsInText(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // task 13 test
    static Stream<Arguments> getInitialsProviderArguments() {
        return Stream.of(
                Arguments.of("Aleksandr Lukyanovich", "AL"),
                Arguments.of("aleksandr lukyanovich", "AL"),
                Arguments.of("ALeksaNdr lukyaNOVich", "AL"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("getInitialsProviderArguments")
    void getInitialsTest(String str, String expectedString) {
        String actualString = StringUtil.getInitials(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    // task 14 test
    static Stream<Arguments> getAllDigitsInStringProviderArguments() {
        return Stream.of(
                Arguments.of("125Alex785", "125785"),
                Arguments.of("125Alex   785", "125785"),
                Arguments.of("Alex", ""),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("getAllDigitsInStringProviderArguments")
    void getAllDigitsInStringTest(String str, String expectedString) {
        String actualString = StringUtil.getAllDigitsInString(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    // task 15 test
    static Stream<Arguments> getDifferentLettersInWordsProviderArguments() {
        return Stream.of(
                Arguments.of("crocodile", "holiwood", "crcehw"),
                Arguments.of("Java", "forest", "Javaforest"),
                Arguments.of(null, "Alex", null),
                Arguments.of(null, null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("getDifferentLettersInWordsProviderArguments")
    void getDifferentLettersInWordsTest(String firstWord, String secondWord, String expectedString) {
        String actualString = StringUtil.getDifferentLettersInWords(firstWord, secondWord);
        Assertions.assertEquals(expectedString, actualString);
    }

    // task 16 test
    static Stream<Arguments> isEqualsArraysProviderArguments() {
        return Stream.of(


                Arguments.of(new String[]{"Java", "Hello"}, new String[]{"Hello", "Java"}, true),
                Arguments.of(new String[]{"I", "like", "Java"}, new String[]{"like", "Java"}, false),
                Arguments.of(new String[]{"125", "38", "1500"}, new String[]{"1500", "125", "38"}, true),
                Arguments.of(new String[]{"658", "48", "IT", "75", "Academy"}, new String[]{"48", "Academy", "75", "658", "IT"}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("isEqualsArraysProviderArguments")
    void isEqualsArraysTest(String[] arr1, String[] arr2, boolean expectedBoolean) {
        boolean actualBoolean = StringUtil.isEqualsArrays(arr1, arr2);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // task 18 test
    static Stream<Arguments> getReplaceIdenticalSymbolsInStringProviderArguments() {
        return Stream.of(
                Arguments.of("11AAAaalexxxxx", "1Aalex"),
                Arguments.of("Java", "Java"),
                Arguments.of("JJavva    accccord___////", "Java acord_/"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("getReplaceIdenticalSymbolsInStringProviderArguments")
    void getReplaceIdenticalSymbolsInStringTest(String str, String expectedString) {
        String actualString = StringUtil.getReplaceIdenticalSymbolsInString(str);
        Assertions.assertEquals(expectedString, actualString);
    }
}
