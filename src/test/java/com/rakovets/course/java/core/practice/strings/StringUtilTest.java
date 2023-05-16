package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("234", "567", "234567"),
                Arguments.of("", "567", "567"),
                Arguments.of("234", "", "234")
        );
    }
    static Stream<Arguments> provideArgumentsToEquals() {
        return Stream.of(
                Arguments.of("123", "123", true),
                Arguments.of("HELLO", "HELLO", true),
                Arguments.of("Hello", "HELLO", false)
        );
    }
    static Stream<Arguments> provideArgumentsToTrim() {
        return Stream.of(
                Arguments.of("     Helllo      ", "HELLLO"),
                Arguments.of("HELLO ", "HELLO"),
                Arguments.of("Hello", "HELLO")
        );
    }
    static Stream<Arguments> provideArgumentsToReplace() {
        return Stream.of(
                Arguments.of(":( HELLO :(", ":) HELLO :)"),
                Arguments.of("HELLO", "HELLO"),
                Arguments.of(":) HELLO", ":) HELLO"),
                Arguments.of(":( HELLO", ":) HELLO")
        );
    }
    static Stream<Arguments> provideArgumentsToFind() {
        return Stream.of(
                Arguments.of("text is bad ", "amazing word", true),
                Arguments.of("tex is bad", "amazing word", false),
                Arguments.of("text is bad", "amazing ", false),
                Arguments.of("Hello", "Hello", false)
        );
    }
    static Stream<Arguments> provideArgumentsToPunctuation() {
        return Stream.of(
                Arguments.of("text, is ! bad.", 3),
                Arguments.of("tex is bad?", 1),
                Arguments.of("text is bad", 0),
                Arguments.of("Hello!!!", 3)
        );
    }
    @ParameterizedTest(name = "GetConcatStr: ''{0}'' -> ''{1}''")
    @MethodSource("provideArguments")
    void testGetConcatStr(String firstStr, String secondStr, String expected) {


        String actual = stringUtil.getConcatStr(firstStr, secondStr);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testGetIndexOfChar() {

        int actual = stringUtil.getIndexOfChar("01234", '4');

        Assertions.assertEquals(4, actual);
    }
    @ParameterizedTest(name = "GetEqualsString: ''{0}'' -> ''{1}''")
    @MethodSource("provideArgumentsToEquals")
    void testGetEqualsString(String firstStr, String secondStr, boolean expected) {

        boolean actual = stringUtil.getEqualsString(firstStr, secondStr, expected);

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest(name = "GetTrimToUpperCase: ''{0}'' -> ''{1}''")
    @MethodSource("provideArgumentsToTrim")
    void testGetTrimToUpperCase(String firstStr, String expected) {

        String actual = stringUtil.getTrimToUpperCase(firstStr, expected);

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest(name = "GetReplaceString: ''{0}'' -> ''{1}''")
    @MethodSource("provideArgumentsToReplace")
    void testGetReplaceString(String firstStr, String expected) {

        String actual = stringUtil.getRepalceEmoji(firstStr, expected);

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest(name = "GetFindWord: ''{0}'' -> ''{1}''")
    @MethodSource("provideArgumentsToFind")
    void testGetFindWord(String text, String word, boolean expected) {

        boolean actual = stringUtil.getFindWord(text, word, expected);

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest(name = "getPunctuation: ''{0}'' -> ''{1}''")
    @MethodSource("provideArgumentsToPunctuation")
    void testgetPunctuation(String firstStr, int expected) {

        int actual = stringUtil.getPunctuation(firstStr, expected);

        Assertions.assertEquals(expected, actual);
    }
}
