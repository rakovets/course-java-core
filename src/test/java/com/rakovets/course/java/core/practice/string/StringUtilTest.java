package com.rakovets.course.java.core.practice.string;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class StringUtilTest {
    // Test for Specification of task 1
    static Stream<Arguments> providerArgumentsForConcatProviderArguments() {
        return Stream.of(
                Arguments.of("Cocoamaloa", "Cocoa", "maloa"),
                Arguments.of("Java", "", "Java"),
                Arguments.of("Hello", "Hello", "")
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForConcatProviderArguments")
    void concat(String expectedString, String str1, String str2) {
        // WHEN
        String actualString = StringUtil.concat(str1, str2);
        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    // Test for Specification of task 2
    static Stream<Arguments> providerArgumentsForGetIndexProviderArguments() {
        return Stream.of(
                Arguments.of(13, "I have an apple", 'l'),
                Arguments.of(-1, "Java", '1'),
                Arguments.of(-1, "Give me money", 'q'),
                Arguments.of(5, "Give me money", 'm'),
                Arguments.of(-1, "Give me money", 'g')
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForGetIndexProviderArguments")
    void getIndex(int expectedInt, String str, char s) {
        int actualInt = StringUtil.getIndex(str, s);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // Test for Specification of task 3
    static Stream<Arguments> providerArgumentsForIsEqualsProviderArguments() {
        return Stream.of(
                Arguments.of(true, "I have an apple", "I have an apple"),
                Arguments.of(true, "Java", "Java"),
                Arguments.of(false, "Java", " Java"),
                Arguments.of(false, "Give me money", "Give me moneY"),
                Arguments.of(false, "78148", "78140")
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForIsEqualsProviderArguments")
    void isEquals(boolean expectedInt, String str1, String str2) {
        boolean actualBoolean = StringUtil.isEquals(str1, str2);
        Assertions.assertEquals(expectedInt, actualBoolean);
    }

    // Test for Specification of task 4
    static Stream<Arguments> providerArgumentsForGetLowerCaseAndTrim() {
        return Stream.of(
                Arguments.of("i have an apple", " I have an Apple "),
                Arguments.of("296259", " 296259 "),
                Arguments.of("qwerty", " QWERTY  "),
                Arguments.of("good morning !", " GoOd MornInG ! "),
                Arguments.of("qwerty", "  QWERTY")
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForGetLowerCaseAndTrim")
    void getLowerCaseAndTrim(String expectedString, String str) {
        String actualString = StringUtil.getLowerCaseAndTrim(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    // Test for Specification of task 5
    static Stream<Arguments> providerArgumentsForGetSubstring() {
        return Stream.of(
                Arguments.of("apple and i have a pen, ", "i have an apple and i have a pen, ooo, i have an applepen"),
                Arguments.of("apple", "i have an apple"),
                Arguments.of("Inputted less 11 characters", "i have"),
                Arguments.of("Inputted less 11 characters", "12345")
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForGetSubstring")
    void getSubstring(String expectedString, String str) {
        String actualString = StringUtil.getSubstring(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    // Test for Specification of task 6
    static Stream<Arguments> providerArgumentsForChangeSmiles() {
        return Stream.of(
                Arguments.of("Заменить все грустные emoji :) в строке на весёлые :)", "Заменить все грустные emoji :( в строке на весёлые :)"),
                Arguments.of(":):):):):)", ":(:(:(:(:)"),
                Arguments.of(":): :", ":(: :"),
                Arguments.of(")::)m(: ", ")::)m(: ")
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForChangeSmiles")
    void changeSmiles(String expectedString, String str) {
        String actualString = StringUtil.changeSmiles(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    // Test for Specification of task 7
    static Stream<Arguments> providerArgumentsForIsStringContentsWord() {
        return Stream.of(
                Arguments.of(true, "Hi", "Hi, how are, Hi"),
                Arguments.of(true, "-", "-Hi, how-"),
                Arguments.of(false, "-", "-Hi, how!"),
                Arguments.of(false, "  ", " 484  ")
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForIsStringContentsWord")
    void isStringContentsWord(boolean expectedBoolean, String word, String string) {
        boolean actualBoolean = StringUtil.isStringContentsWord(word, string);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // Test for Specification of task 8
    static Stream<Arguments> providerArgumentsForCountVowelInSentence() {
        return Stream.of(
                Arguments.of(3, "Outum"),
                Arguments.of(10, "aaaeevtrouUEO"),
                Arguments.of(0, "VDFGH3F785H")
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForCountVowelInSentence")
    void countVowelInSentence(int expectedInt, String sentence) {
        int actualInt = StringUtil.countVowelInSentence(sentence);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // Test for Specification of task 9
    static Stream<Arguments> providerArgumentsForCountSpecialSymbol() {
        return Stream.of(
                Arguments.of(5, "!@#$,%^&*.()_+|\\=-0987.6543!21"),
                Arguments.of(0, "@#$%^&thrt5*()_+|\\=-0987654321"),
                Arguments.of(21, "!!!!!!!,,,,,,,,,,....Hi")
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForCountSpecialSymbol")
    void countSpecialSymbol(int expectedInt, String str) {
        int actualInt = StringUtil.countSpecialSymbol(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // Test for Specification of task 10
    static Stream<Arguments> providerArgumentsForIsPolindrom() {
        return Stream.of(
                Arguments.of(true, "momom"),
                Arguments.of(true, "Was it a car or a cat I saw?"),
                Arguments.of(true, "01234543210"),
                Arguments.of(true, "Громилы мыли гроб"),
                Arguments.of(false, "Громиsлы мыли гробf")
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForIsPolindrom")
    void isPolindrom(boolean expectedBoolean, String str) {
        boolean actualBoolean = StringUtil.isPolindrom(str);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // Test for Specification of task 11
    static Stream<Arguments> providerArgumentsForSpliteString() {
        return Stream.of(
                Arguments.of(new String[]{"abc", "def", "ghi", "jkl"}, "abcdefghijkl", 3),
                Arguments.of(new String[]{" ", " ", "t"}, "  t", 1),
                Arguments.of(null, null, 2)
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForSpliteString")
    void spiteString(String[] expectedString, String str, int n) {
        String[] actualString = StringUtil.spliteString(str, n);
        Assertions.assertArrayEquals(expectedString, actualString);
    }

    // Test for Specification of task 12
    static Stream<Arguments> providerArgumentsForGetNumberWords() {
        return Stream.of(
                Arguments.of(10, "I  look (48) into tomorrow  day and i don't 4 see nothing "),
                Arguments.of(0, "123  489 4"),
                Arguments.of(4, "  word1  word2. Word3!  Word4?"),
                Arguments.of(0, "  "),
                Arguments.of(1, "word")

        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForGetNumberWords")
    void getNumberWords(int expectedInt, String str) {
        int actualInt = StringUtil.getNumberWords(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    // Test for Specification of task 13
    static Stream<Arguments> providerArgumentsForGetInitials() {
        return Stream.of(
                Arguments.of("DR", "DmitRY RakOVets"),
                Arguments.of("AR", "aLiaksei Rudoi")

        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForGetInitials")
    void getInitials(String expectedString, String str) {
        String actualString = StringUtil.getInitials(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    // Test for Specification of task 14
    static Stream<Arguments> providerArgumentsForGetAllDigit() {
        return Stream.of(
                Arguments.of("3543", "qwe r3543!"),
                Arguments.of("10092", " 1g00- 9 2 ?")

        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForGetAllDigit")
    void getAllDigit(String expectedString, String str) {
        String actualString = StringUtil.getAllDigit(str);
        Assertions.assertEquals(expectedString, actualString);
    }
}
