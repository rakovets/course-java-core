package com.rakovets.course.java.core.practice.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
//test 1
class AutoAssuranceWithJUnitString {
    static Stream<Arguments> concatProviderArguments() {
        return Stream.of(
                Arguments.of("HelloJava", "Hello", "Java"),
                Arguments.of("Java", "", "Java"),
                Arguments.of("Hello", "Hello", "")
        );
    }

    @ParameterizedTest
    @MethodSource("concatProviderArguments")
    void glueTest(String expectedString, String str1, String str2) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.glue(str1, str2);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
//test 2
        static Stream<Arguments> indexOfProviderArguments() {
            return Stream.of(
                    Arguments.of(0, "Hello", "H"),
                    Arguments.of(4, "Hello", "o"),
                    Arguments.of(-1, "Hello", "u")
            );
        }

        @ParameterizedTest
        @MethodSource("indexOfProviderArguments")
        void symbolIndexTest(int expectedInt, String str1, String str2) {
            // GIVEN

            // WHEN
            int actualString = StringUtil.symbolIndex(str1, str2);

            // THAT
            Assertions.assertEquals(expectedInt, actualString);
        }
//test 3
    static Stream<Arguments> equalsProviderArguments() {
        return Stream.of(
                Arguments.of(false, "Hello", "hello"),
                Arguments.of(true, "Hello", "Hello")
        );
    }

    @ParameterizedTest
    @MethodSource("equalsProviderArguments")
    void stringComparisonTest(boolean expectedBoolean, String str1, String str2) {
        // GIVEN

        // WHEN
        boolean actualString = StringUtil.stringComparison(str1, str2);

        // THAT
        Assertions.assertEquals(expectedBoolean, actualString);
    }
//test 4
    static Stream<Arguments> trimProviderArguments() {
        return Stream.of(
                Arguments.of("HELLO", " Hello "),
                Arguments.of("HELLO", " hello"),
                Arguments.of("HELLO JAVA", " Hello java ")
        );
    }

    @ParameterizedTest
    @MethodSource("trimProviderArguments")
    void trimAndUpperCaseTest(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.trimAndUpperCase(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
//test 5
    static Stream<Arguments> substringProviderArguments() {
        return Stream.of(
                Arguments.of("lo w", "Hello world ", 3, 7),
                Arguments.of("hell", "hello", 0, 4),
                Arguments.of("Java", "Hello Java", 6, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("substringProviderArguments")
    void stringRetrievalTest(String expectedString, String str,int startIndex,int  endIndex) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.stringRetrieval(str,startIndex, endIndex);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
//test 6
    static Stream<Arguments> replaceProviderArguments() {
        return Stream.of(
                Arguments.of("Try to change :) on :)", "Try to change :( on :)", ":(", ":)")
        );
    }

    @ParameterizedTest
    @MethodSource("replaceProviderArguments")
    void replaceSmylesTest(String expectedString, String str,String letter1,String letter2) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.replaceSmyles(str,letter1, letter2);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
//test 7
    static Stream<Arguments> startWithProviderArguments() {
        return Stream.of(
                Arguments.of(true, "We comparison first and second words We", "We"),
                Arguments.of(false, "We comparison firs and second words", "We"),
                Arguments.of(false, "", "We"),
                Arguments.of(false, "comparison firs and second words", "We"),
                Arguments.of(false, "comparison firs and second words We", "We")
        );
    }

    @ParameterizedTest
    @MethodSource("startWithProviderArguments")
    void comparisonStartEndLastWordsTest(boolean expectedBoolean, String text, String word) {
        // GIVEN

        // WHEN
        boolean actualString = StringUtil.comparisonStartEndLastWords(text, word);

        // THAT
        Assertions.assertEquals(expectedBoolean, actualString);
    }
//test 8
    static Stream<Arguments> countVowelsInTextProviderArguments() {
        return Stream.of(
                Arguments.of(14, "I am trying to count all the vowels in the text"),
                Arguments.of(0, ""),
                Arguments.of(7, "AaEebbbbbYyY")
        );
    }

    @ParameterizedTest
    @MethodSource("countVowelsInTextProviderArguments")
    void numberOfEnglishVowelsTest(int expectedInt, String text) {
        // GIVEN

        // WHEN
        int actualInt = StringUtil.numberOfEnglishVowels(text);

        // THAT
        Assertions.assertEquals(expectedInt, actualInt);
    }
//test 9
    static Stream<Arguments> numberOfPunctuationsMarksProviderArguments() {
        return Stream.of(
                Arguments.of(3, ".<?!"),
                Arguments.of(0, ""),
                Arguments.of(5, "Aa,Ee,bb?b!bb!YyY")
        );
    }

    @ParameterizedTest
    @MethodSource("numberOfPunctuationsMarksProviderArguments")
    void numberOfPunctuationsMarksTest(int expectedInt, String text) {
        // GIVEN

        // WHEN
        int actualInt = StringUtil.numberOfPunctuationsMarks(text);

        // THAT
        Assertions.assertEquals(expectedInt, actualInt);
    }
//test 10
    static Stream<Arguments> palindromeProviderArguments() {
        return Stream.of(

                Arguments.of(true, "Do geese see god?"),
                Arguments.of(true, "1991"),
                Arguments.of(true, "deed"),
                Arguments.of(true, "Gorod dorog"),
                Arguments.of(false, "Do geese see godd")
        );
    }

    @ParameterizedTest
    @MethodSource("palindromeProviderArguments")
    void palindromeTest(boolean expectedBoolean, String text) {
        // GIVEN

        // WHEN
        boolean actualString = StringUtil.palindrome(text);

        // THAT
        Assertions.assertEquals(expectedBoolean, actualString);
    }
//test 11
    static Stream<Arguments> splitArrayProviderArguments() {
        return Stream.of(
                Arguments.of(new String[] {"Hel","lo ","wor","ld"}, "Hello world", 3),
                Arguments.of(new String[] {"Hello world"}, "Hello world", 0),
                Arguments.of(new String[] {"Hello ","Java"}, "Hello Java", 6)
        );
    }

    @ParameterizedTest (name = "Expected: {0},Text - {1}, n = {2}")
    @MethodSource("splitArrayProviderArguments")
    void splitArrayTest(String[] expected, String text,int n) {
        // GIVEN

        // WHEN
        String[] actual = StringUtil.splitArray(text,n);

        // THAT
        Assertions.assertArrayEquals(expected, actual);
    }
//test 12
    static Stream<Arguments> wordsCountProvideArguments() {
        return Stream.of(
                Arguments.of("Hello World", 2),
                Arguments.of(" Test me please ", 3),
                Arguments.of("Hello Java World", 3),
                Arguments.of("    ", 0)
        );
    }

    @ParameterizedTest(name = "Str1 - {0}, Expected: {1}")
    @MethodSource("wordsCountProvideArguments")
    void wordsCountTest(String text, int expected) {
        int actual = StringUtil.wordsCount(text);
        Assertions.assertEquals(expected, actual);
    }
//test 13
    static Stream<Arguments> initialsProvideArguments() {
        return Stream.of(
                Arguments.of("Eric Cartman", "EC"),
                Arguments.of("John DoRIen", "JD"),
                Arguments.of(" Kirill Ermolovich ", "KE")
        );
    }

    @ParameterizedTest(name = "Str1 - {0}, Expected: {1}")
    @MethodSource("initialsProvideArguments")
    void patternInitialsTest(String text, String expected) {
        String actual = StringUtil.initials(text);
        Assertions.assertEquals(expected, actual);
    }
// test 14
    static Stream<Arguments> digitStringPovideArguments() {
        return Stream.of(
                Arguments.of("Biosystem 2020327", "2020327"),
                Arguments.of("0123456789", "0123456789"),
                Arguments.of("321qwe654asd", "321654"),
                Arguments.of(" Bender says : 101000101010", "101000101010")
        );
    }

    @ParameterizedTest(name = "Text - {0}, Expected: {1}")
    @MethodSource("digitStringPovideArguments")
    void digitStringTest(String text, String expected) {
        String actual = StringUtil.digitString(text);
        Assertions.assertEquals(expected, actual);
    }




}
