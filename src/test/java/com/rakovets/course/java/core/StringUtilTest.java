package com.rakovets.course.java.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class StringUtilTest {

    static Stream<Arguments> Test1() {
        return Stream.of(
                Arguments.of("HelloJava", "Hello", "Java"),
                Arguments.of("Java", "", "Java"),
                Arguments.of("Hello", "Hello", ""),
                Arguments.of(null, null, null),
                Arguments.of(null, "sdf", null)
        );
    }

    @ParameterizedTest
    @MethodSource("Test1")
    void getConcat(String expectedString, String one, String two) {
        String actualString = StringUtil.getConcat(one, two);
        Assertions.assertEquals(actualString, expectedString);
    }

    static Stream<Arguments> Test2() {
        return Stream.of(
                Arguments.of(1, "Exit", 'x'),
                Arguments.of(-1, "Exit", 'o'),
                Arguments.of(2, "ExitExit", 'i'),
                Arguments.of(-1, "Exit", ' '),
                Arguments.of(-1, " ", 'n')
        );
    }

    @ParameterizedTest
    @MethodSource("Test2")
    void getIndex(int expectedInt, String str, char x) {
        int actualInt = StringUtil.getIndex(str, x);
        Assertions.assertEquals(actualInt, expectedInt);
    }

    static Stream<Arguments> Test3() {
        return Stream.of(
                Arguments.of(true, "Anton", "Anton"),
                Arguments.of(false, "Anton", "anton"),
                Arguments.of(false, "Anton", " "),
                Arguments.of(false, "Anton", null),
                Arguments.of(false, null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("Test3")
    void getEquals(boolean expectedBoolean, String one, String two) {
        boolean actualBoolean = StringUtil.getEquals(one, two);
        Assertions.assertEquals(actualBoolean, expectedBoolean);
    }

    static Stream<Arguments> Test4() {
        return Stream.of(
                Arguments.of("anton", "  anton  "),
                Arguments.of("anton khramau", "   anton khramau   "),
                Arguments.of("", " "),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("Test4")
    void getTrim(String expectedString, String str) {
        String actualString = StringUtil.getTrim(str);
        Assertions.assertEquals(actualString, expectedString);
    }

    static Stream<Arguments> Test5() {
        return Stream.of(
                Arguments.of("01234567890123", "1234567890123456789012345678901234567890", 10, 23),
                Arguments.of("67890 1234567890 1234567890 1", "1234567890 1234567890 1234567890 1234567890", 6, 34),
                Arguments.of(null, "12345", 10, 20),
                Arguments.of(null, "1234567890 1234567890 1234", 10, 40),
                Arguments.of(null, null, 5, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("Test5")
    void getSubString(String expectedString, String str, int start, int finish) {
        String actualString = StringUtil.getSubString(str, start, finish);
        Assertions.assertEquals(actualString, expectedString);
    }

    static Stream<Arguments> Test6() {
        return Stream.of(
                Arguments.of("Anton :)", "Anton :("),
                Arguments.of("Anton :) :) :)", "Anton :( :) :("),
                Arguments.of(null, null),
                Arguments.of("Anton", "Anton")
        );
    }

    @ParameterizedTest
    @MethodSource("Test6")
    void getReplace(String expectedString, String str) {
        String actualString = StringUtil.getReplace(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> Test7() {
        return Stream.of(
                Arguments.of(true, "AT word AT", "AT"),
                Arguments.of(false, "AT word", "AT"),
                Arguments.of(false, " word AT", "AT"),
                Arguments.of(true, "at word At", "AT"),
                Arguments.of(true, "AT word AT", "at"),
                Arguments.of(false, " word AT", null),
                Arguments.of(false, null, "AT"),
                Arguments.of(false, null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("Test7")
    void getTrueFalse(boolean expectedBoolean, String string, String word) {
        boolean actualBoolean = StringUtil.getTrueFalse(string, word);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    static Stream<Arguments> Test8() {
        return Stream.of(
                Arguments.of(2, "true"),
                Arguments.of(5, "I am Superman"),
                Arguments.of(6, "How are you?"),
                Arguments.of(0, null)
        );

    }

    @ParameterizedTest
    @MethodSource("Test8")
    void getConsonants(int expectedInt, String str) {
        int actualInt = StringUtil.getConsonants(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> Test9() {
        return Stream.of(
                Arguments.of(4, "A, b!, c."),
                Arguments.of(3, ",How. are you!"),
                Arguments.of(1, "How are you?"),
                Arguments.of(0, null)
        );
    }

    @ParameterizedTest
    @MethodSource("Test9")
    void getPunctuationMarks(int expectedInt, String str) {
        int actualInt = StringUtil.getPunctuationMarks(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> Test10() {
        return Stream.of(
                Arguments.of(true, "101"),
                Arguments.of(true, "1 0 1"),
                Arguments.of(false, "123"),
                Arguments.of(true, "asdDSA"),
                Arguments.of(false, null)
        );
    }

    @ParameterizedTest
    @MethodSource("Test10")
    void getPalindrome(boolean expectedBoolean, String str) {
        boolean actualBoolean = StringUtil.getPalindrome(str);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    static Stream<Arguments> Test11() {
        return Stream.of(
                Arguments.of(new String[]{"How", "are", "you"}, "Howareyou", 3),
                Arguments.of(null, "How are you?", 7),
                Arguments.of(new String[]{"H", "o", "w", "a", "r", "e", "y", "o", "u"}, "Howareyou", 1),
                Arguments.of(null, "How are", -1),
                Arguments.of(null, "How are you?", 20)
        );
    }

    @ParameterizedTest
    @MethodSource("Test11")
    void getParseString(String[] expectedArray, String str, int n) {
        String[] actualArray = StringUtil.getParseString(str, n);
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    static Stream<Arguments> Test12() {
        return Stream.of(
                Arguments.of(3, "How are you?"),
                Arguments.of(3, "   How are     you?   "),
                Arguments.of(0, null)
        );
    }

    @ParameterizedTest
    @MethodSource("Test12")
    void getSplit(int expectedInt, String str) {
        int actualInt = StringUtil.getSplit(str);
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> Test13() {
        return Stream.of(
                Arguments.of("A.K.V.", "Anton Khramau Vitalievich"),
                Arguments.of("A.K.V.", "anton Khramau vitalievich"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("Test13")
    void getFullName(String expectedString, String nameSurnamePatronymic) {
        String actualString = StringUtil.getFullName(nameSurnamePatronymic);
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> Test14() {
        return Stream.of(
                Arguments.of("12323243423", "go12 32 324, break one 3 4 frodo23Kevin"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("Test14")
    void getNumbers(String expectedString, String text) {
        String actualString = StringUtil.getNumbers(text);
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> Test15() {
        return Stream.of(
                Arguments.of("H w a v r y a y I o n o t h ", "He likes walk every day", "I do not like she"),
                Arguments.of("", "war", "war"),
                Arguments.of(null, null, "war"),
                Arguments.of(null, "war", null)
        );
    }

    @ParameterizedTest
    @MethodSource("Test15")
    void getFind(String expectedString, String one, String two) {
        String actualString = StringUtil.getFind(one, two);
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> Test16() {
        return Stream.of(
                Arguments.of(true, new String[]{"1", "2", "3"}, new String[]{"1", "2", "3"}),
                Arguments.of(true, new String[]{"1", "2", "3"}, new String[]{"3", "1", "2"}),
                Arguments.of(true, new String[]{"s", "f", "n"}, new String[]{"f", "s", "n"}),
                Arguments.of(false, new String[]{"1", "2", "0"}, new String[]{"1", "2", "3"}),
                Arguments.of(false, new String[]{"1", "2", "3"}, new String[]{null}),
                Arguments.of(false, new String[]{null}, new String[]{"1", "2", "3"})
        );
    }

    @ParameterizedTest
    @MethodSource("Test16")
    void getArrayString(boolean expectedBoolean, String[] one, String[] two) {
        boolean actualBoolean = StringUtil.getArrayString(one, two);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    static Stream<Arguments> Test17() {
        return Stream.of(
                Arguments.of(-1, "adadfrefe")
        );
    }

    @ParameterizedTest
    @MethodSource("Test17")
    void compareStringMethods(int expected, String str) {
        int actual = StringUtil.compareStringMethods(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> Test18() {
        return Stream.of(
                Arguments.of("adadfrefe", "aaadddadfrefffee"),
                Arguments.of("a1d2adf3refe", "aaa111ddd222adf3refffee"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("Test18")
    void getCopy(String expectedString, String str) {
        String actualString = StringUtil.getCopy(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> Test19() {
        return Stream.of(
                Arguments.of(21, "XXI"),
                Arguments.of(900, "cm"),
                Arguments.of(1999, "mcmxcix")
        );
    }

    @ParameterizedTest
    @MethodSource("Test19")
    void getRomeNumbers(int expectedString, String str) {
       int actualString = StringUtil.getRomeNumbers(str);
       Assertions.assertEquals(expectedString, actualString);
    }
}

