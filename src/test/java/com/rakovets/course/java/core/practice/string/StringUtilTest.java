package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class StringUtilTest {

    // TASK 1
    static Stream<Arguments> getConcatProviderArguments() {
        return Stream.of(
                Arguments.of("LearnJava", "Learn", "Java"),
                Arguments.of("Java", "", "Java"),
                Arguments.of("Learn", "Learn", "")
        );
    }

    @ParameterizedTest
    @MethodSource("getConcatProviderArguments")
    void getConcat(String expectedString, String str1, String str2) {
        String actualString = StringUtil.getConcat(str1, str2);
        Assertions.assertEquals(expectedString, actualString);
    }

    // TASK 2
    static Stream<Arguments> getIndexProviderArguments() {
        return Stream.of(
                Arguments.of("4", "Index", "x"),
                Arguments.of("-1", "Cat", "x"),
                Arguments.of("-1", "", "x"),
                Arguments.of("0", "Xenophobia", "X")
        );
    }

    @ParameterizedTest
    @MethodSource("getIndexProviderArguments")
    void getIndex(int expectedInt, String str, char x) {
        int actualInt = StringUtil.getIndex(str, x);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // TASK 3
    static Stream<Arguments> getEqualsProviderArguments() {
        return Stream.of(
                Arguments.of("true", "apple", "apple"),
                Arguments.of("false", "APPLE", "apple"),
                Arguments.of("false", "Apple", "apple"),
                Arguments.of("false", "Apple", "applE"),
                Arguments.of("true", "Apple", "Apple"),
                Arguments.of("false", "", "Apple"),
                Arguments.of("true", "111", "111"),
                Arguments.of("false", "121", "111")
        );
    }

    @ParameterizedTest
    @MethodSource("getEqualsProviderArguments")
    void getEquals(boolean expectedBoolean, String str1, String str2) {
        boolean actualBoolean = StringUtil.getEquals(str1, str2);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // TASK 4
    static Stream<Arguments> getTrimAndUpperCaseProviderArguments() {
        return Stream.of(
                Arguments.of("JAVA", " Java "),
                Arguments.of("JAVA", "Java "),
                Arguments.of("JAVA", " Java"),
                Arguments.of("JAVA", "Java"),
                Arguments.of("JAVA", "JavA"),
                Arguments.of("JAVA", " JAVA ")
        );
    }

    @ParameterizedTest
    @MethodSource("getTrimAndUpperCaseProviderArguments")
    void getTrimAndUpperCase(String expectedString, String str) {
        String actualString = StringUtil.getTrimAndUpperCase(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    // TASK 5
    static Stream<Arguments> getSubstringProviderArguments() {
        return Stream.of(
                Arguments.of("ticle, we'll provide a ", "In this article, we'll provide a brief explanation"),
                Arguments.of("ticle", "In this article"),
                Arguments.of("0", "01234567890")
        );
    }

    @ParameterizedTest
    @MethodSource("getSubstringProviderArguments")
    void getSubstring(String expectedString, String str) {
        String actualString = StringUtil.getSubstring(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    // TASK 6
    static Stream<Arguments> getReplaceProviderArguments() {
        return Stream.of(
                Arguments.of(":)", ":("),
                Arguments.of("In :) this article:)", "In :( this article:("),
                Arguments.of("In this article", "In this article")
        );
    }

    @ParameterizedTest
    @MethodSource("getReplaceProviderArguments")
    void getReplace(String expectedString, String str) {
        String actualString = StringUtil.getReplace(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    // TASK 7
    static Stream<Arguments> getStartsAndEndsWithProviderArguments() {
        return Stream.of(
                Arguments.of("true", "string starts with a given string", "string"),
                Arguments.of("true", "STRING starts with a given string", "string"),
                Arguments.of("false", "starts with a given string", "starts"),
                Arguments.of("false", " string starts with a given string", "string"),
                Arguments.of("true", "1string starts with a given string1", "1"),
                Arguments.of("true", " string starts with a given string ", " ")
        );
    }

    @ParameterizedTest
    @MethodSource("getStartsAndEndsWithProviderArguments")
    void getStartsAndEndsWith(boolean expectedBoolean, String str, String word) {
        boolean actualBoolean = StringUtil.getStartsAndEndsWith(str, word);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // TASK 8
    static Stream<Arguments> getVowelsProviderArguments() {
        return Stream.of(
                Arguments.of("7", "Write a Java method"),
                Arguments.of("7", "WRITE A JAVA method"),
                Arguments.of("0", "GMT")
        );
    }

    @ParameterizedTest
    @MethodSource("getVowelsProviderArguments")
    void getVowels(int expectedInt, String str) {
        int actualInt = StringUtil.getVowels(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // TASK 9
    static Stream<Arguments> getPeriodsCommasExclamationMarksProviderArguments() {
        return Stream.of(
                Arguments.of("4", "!To append a floating point value!, use String.format():"),
                Arguments.of("0", "To append a floating point value")
        );
    }

    @ParameterizedTest
    @MethodSource("getPeriodsCommasExclamationMarksProviderArguments")
    void getPeriodsCommasExclamationMarks(int expectedInt, String str) {
        int actualInt = StringUtil.getPeriodsCommasExclamationMarks(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // TASK 10
    static Stream<Arguments> getPalindromeProviderArguments() {
        return Stream.of(
                Arguments.of("true", "civic"),
                Arguments.of("true", "Civic"),
                Arguments.of("false", "palindrome")
        );
    }

    @ParameterizedTest
    @MethodSource("getPalindromeProviderArguments")
    void getPalindrome(boolean expectedBoolean, String str) {
        boolean actualBoolean = StringUtil.getPalindrome(str);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // TASK 11
    static Stream<Arguments> getArrayProviderArguments() {
        return Stream.of(
                Arguments.of("[Divide, string]", "Dividestring", "2"),
                Arguments.of("[Divide , string]", "Divide string", "2"),
                Arguments.of("[six , six , five]", "six six five", "3"),
                Arguments.of("[six, six, fiv, e]", "sixsixfive", "3")
        );
    }

    @ParameterizedTest
    @MethodSource("getArrayProviderArguments")
    void getArray(String expectedString, String str, int n) {
        String actualString = StringUtil.getArray(str, n);
        Assertions.assertEquals(expectedString, actualString);
    }

    // TASK 12
    static Stream<Arguments> getNumberOfWordsProviderArguments() {
        return Stream.of(
                Arguments.of("6", "This solution uses the regular expression"),
                Arguments.of("5", "See The      Complete Java MasterClass"),
                Arguments.of("1", "See    ")
        );
    }

    @ParameterizedTest
    @MethodSource("getNumberOfWordsProviderArguments")
    void getNumberOfWords(int expectedInt, String str) {
        int actualInt = StringUtil.getNumberOfWords(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // TASK 13
    static Stream<Arguments> getInitialsProviderArguments() {
        return Stream.of(
                Arguments.of("P.O.A.", "Peregud", "Oxana", "Aleksandrovna"),
                Arguments.of("P.O.A.", "peregud", "oxana", "aleksandrovna")
        );
    }

    @ParameterizedTest
    @MethodSource("getInitialsProviderArguments")
    void getInitials(String expectedString, String surname, String name, String patronymic) {
        String actualString = StringUtil.getInitials(surname, name, patronymic);
        Assertions.assertEquals(expectedString, actualString);
    }

    // TASK 14
    static Stream<Arguments> getAllNumbersProviderArguments() {
        return Stream.of(
                Arguments.of("11", "In11this article"),
                Arguments.of("211105612", "2Extract1 1digits10 from56 string1 -2 StringUtils Java")
        );
    }

    @ParameterizedTest
    @MethodSource("getAllNumbersProviderArguments")
    void getAllNumbers(String expectedString, String str) {
        String actualString = StringUtil.getAllNumbers(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    // TASK 15
    static Stream<Arguments> getDifferentLettersProviderArguments() {
        return Stream.of(
                Arguments.of("m o v i n g p a t d", "removing", "repeated"),
                Arguments.of("a t t i b u t e f o m", "attribute", "from")
        );
    }

    @ParameterizedTest
    @MethodSource("getDifferentLettersProviderArguments")
    void getDifferentLetters(String expectedString, String str1, String str2) {
        String actualString = StringUtil.getDifferentLetters(str1, str2);
        Assertions.assertEquals(expectedString, actualString);
    }

    // TASK 16
    static Stream<Arguments> getAreArraysIdenticalProviderArguments() {
        return Stream.of(
                Arguments.of("true", new String[]{"Java", "Learn"}, new String[]{"Learn", "Java"}),
                Arguments.of("false", new String[]{"JavaLang", "Learn"}, new String[]{"Learn", "Java"}),
                Arguments.of("true", new String[]{"1", "2", "3"}, new String[]{"2", "3", "1"}),
                Arguments.of("false", new String[]{"1", "2", "3", "4"}, new String[]{"1", "2", "3"}),
                Arguments.of("true", new String[]{"Class", "2", "Java", "3"}, new String[]{"2", "Java", "3", "Class"})
        );
    }

    @ParameterizedTest
    @MethodSource("getAreArraysIdenticalProviderArguments")
    void getAreArraysIdentical(boolean expectedBoolean, String[] arr1, String[] arr2) {
        boolean actualBoolean = StringUtil.getAreArraysIdentical(arr1, arr2);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // TASK 17
    static Stream<Arguments> getExecutionTimeProviderArguments() {
        return Stream.of(
                Arguments.of("true", 100),
                Arguments.of("true", 10),
                Arguments.of("false", 100000),
                Arguments.of("false", 1000000)
        );
    }

    @ParameterizedTest
    @MethodSource("getExecutionTimeProviderArguments")
    void getExecutionTime(boolean expectedBoolean, int numberOfAdditions) {
        boolean actualBoolean = StringUtil.getExecutionTime(numberOfAdditions);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // TASK 18
    static Stream<Arguments> getReplacedIdenticalCharactersProviderArguments() {
        return Stream.of(
                Arguments.of("abcdef", "aaabbcdeef"),
                Arguments.of("157", "111115555577777"),
                Arguments.of("1a", "11111aaaaaaaaa")
        );
    }

    @ParameterizedTest
    @MethodSource("getReplacedIdenticalCharactersProviderArguments")
    void getReplacedIdenticalCharacters(String expectedString, String str) {
        String actualString = StringUtil.getReplacedIdenticalCharacters(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    // TASK 19
    static Stream<Arguments> getConversionFromRomanToArabicProviderArguments() {
        return Stream.of(
                Arguments.of("707", "DCCVII"),
                Arguments.of("3724", "MMMDCCXXIV"),
                Arguments.of("2614", "MMDCXIV"),
                Arguments.of("10", "X")
        );
    }

    @ParameterizedTest
    @MethodSource("getConversionFromRomanToArabicProviderArguments")
    void getConversionFromRomanToArabic(int expectedString, String str) {
        int actualString = StringUtil.getConversionFromRomanToArabic(str);
        Assertions.assertEquals(expectedString, actualString);
    }
}
