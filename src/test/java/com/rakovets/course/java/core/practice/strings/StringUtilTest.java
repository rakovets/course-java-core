package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringUtilTest {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("asd", "asd", "asdasd"),
                Arguments.of("", "", ""),
                Arguments.of(null, "", ""),
                Arguments.of("", null, ""),
                Arguments.of(null, null, ""),
                Arguments.of(null, "asd", "asd")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void glueTest(String str1, String str2, String expected) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.glue(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsSerchIndex() {
        return Stream.of(
                Arguments.of("qwerty", 'e', 2),
                Arguments.of("123ews3", '3', 2),
                Arguments.of(" 234", ' ', 0),
                Arguments.of("qwerty", '2', -1),
                Arguments.of("qwerty", 'Q', -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsSerchIndex")
    void serchSymbalByTest(String str, char symbal, int expected) {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.serchSymbalBy(str, symbal);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideEquals() {
        return Stream.of(
                Arguments.of("asd", "asd", true),
                Arguments.of("asd", "Asd", false),
                Arguments.of("asd", null, false),
                Arguments.of("asd asd", "asd asd", true),
                Arguments.of("   ", "   ", true),
                Arguments.of("asd!", "asd|", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideEquals")
    void equalsObjectTest(String str1, String str2, boolean expected) {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.equalsObject(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideDelete() {
        return Stream.of(
                Arguments.of(" sadDsda", "SADDSDA"),
                Arguments.of("  asd  ", "ASD"),
                Arguments.of("asd asd", "ASD ASD"),
                Arguments.of("4ASD", "4ASD"),
                Arguments.of(" ", "")
        );
    }

    @ParameterizedTest
    @MethodSource("provideDelete")
    void deleteSpaceAndUpperCaseTest(String str1, String expected) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.deleteSpaceAndUpperCase(str1);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideSubstring() {
        return Stream.of(
                Arguments.of("1234567", '3', '6', "345"),
                Arguments.of("asdfgh", 'd', 'h', "dfg"),
                Arguments.of(" asd sd", 's', 'd', "s")
        );
    }

    @ParameterizedTest
    @MethodSource("provideSubstring")
    void GetSubStringTest(String str, int startSymbal, int endSymbal, String expected) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.subString(str, startSymbal, endSymbal);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideSwitchSymbal() {
        return Stream.of(
                Arguments.of(":(", ":)"),
                Arguments.of(":):(", ":):)"),
                Arguments.of(":)asd:(:(", ":)asd:):)"),
                Arguments.of("  :(:))asd", "  :):))asd")
        );
    }

    @ParameterizedTest
    @MethodSource("provideSwitchSymbal")
    void switchSymbalTest(String str1, String expected) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.switchSymbal(str1);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> providestartAndEndWord() {
        return Stream.of(
                Arguments.of("asddsa", "a", true),
                Arguments.of("123321", "2", false),
                Arguments.of(" 123321", "1", false),
                Arguments.of("1111111", "1", true),
                Arguments.of("1111111!", "1", false)
        );
    }

    @ParameterizedTest
    @MethodSource("providestartAndEndWord")
    void startAndEndWordTest(String str, String startOrEndWord, boolean expected) {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.startAndEndWord(str, startOrEndWord);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> providenumberOfVowels() {
        return Stream.of(
                Arguments.of("asdasd", 2),
                Arguments.of("Asdasd", 2),
                Arguments.of("Аsdasd", 1),
                Arguments.of("asdqwe", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("providenumberOfVowels")
    void numberOfVowelsTest(String str, int expected) {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.numberOfVowels(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> providepunctuationMarks() {
        return Stream.of(
                Arguments.of("...", 3),
                Arguments.of("    ", 0),
                Arguments.of(",.!?", 4),
                Arguments.of(",asf.asf?asd!", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("providepunctuationMarks")
    void punctuationMarksTest(String str, int expected) {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.punctuationMarks(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> providepalindrom() {
        return Stream.of(
                Arguments.of("qweqwe", false),
                Arguments.of("qweewq", true),
                Arguments.of("asd!!dsa!", true),
                Arguments.of("11111", true),
                Arguments.of("123321", true)
        );
    }

    @ParameterizedTest
    @MethodSource("providepalindrom")
    void providepalindromTest(String str, boolean expected) {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.palindrom(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> providesplitString() {
        return Stream.of(
                Arguments.of("123123", 3, new String[]{"123", "123"}),
                Arguments.of("12345", 1, new String[]{"1", "2", "3", "4", "5"}),
                Arguments.of("  3456", 3, new String[]{"  3", "456"}),
                Arguments.of("!23456  ", 2, new String[]{"!2", "34", "56", "  "}),
                Arguments.of("123", 3, new String[]{"123"}),
                Arguments.of("asdasd", 3, new String[]{"asd", "asd"})
        );
    }

    @ParameterizedTest
    @MethodSource("providesplitString")
    void providesplitStringTest(String str, int n, String[] expected) {
        StringUtil stringUtil = new StringUtil();
        String[] actual = stringUtil.splitString(str, n);
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    static Stream<Arguments> providecountWord() {
        return Stream.of(
                Arguments.of("asd asd", 2),
                Arguments.of("asd asd asd", 3),
                Arguments.of(" asd  asd", 2),
                Arguments.of("   ", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("providecountWord")
    void providecountWord(String str, int expected) {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.countWord(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> providefirstNameLastName() {
        return Stream.of(
                Arguments.of("Rus Zha","RZ"),
                Arguments.of("  Rus zha","RZ"),
                Arguments.of("RuS zhA","RZ"),
                Arguments.of("Rus   ZHa Rus","RZ")
        );
    }

    @ParameterizedTest
    @MethodSource("providefirstNameLastName")
    void providefirstNameLastName(String str, String expected) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.firstNameLastName(str);
        Assertions.assertEquals(expected, actual);
    }
}
