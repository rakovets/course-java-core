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

    static Stream<Arguments> provideArgumentsForGlue() {
        return Stream.of(
                Arguments.of("2", "1", "21"),
                Arguments.of("pri", "vet", "privet"),
                Arguments.of("How much ", "does it take?", "How much does it take?"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForGlue")
    void glueText(String str1, String str2, String expected) {
        String actual = stringUtil.glue(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCharacterIndex() {
        return Stream.of(
                Arguments.of("a", 0),
                Arguments.of("c", 2),
                Arguments.of("a2b", -1));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForCharacterIndex")
    void characterIndex(String str1, int expected) {
        int actual = stringUtil.characterIndex(str1);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCompare() {
        return Stream.of(
                Arguments.of("a", "a", 0),
                Arguments.of("a", "aaaa", -3),
                Arguments.of("aa", "a", 1));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForCompare")
    void compare(String str1, String str2, int expected) {
        int actual = stringUtil.compare(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForRemoveSpace() {
        return Stream.of(
                Arguments.of("aa", "AA"),
                Arguments.of(" aa", "AA"),
                Arguments.of(" aa ", "AA"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForRemoveSpace")
    void remove(String str1, String expected) {
        String actual = stringUtil.removeSpace(str1);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTask5() {
        return Stream.of(
                Arguments.of("JavaOrNothing", 0, 4, "Java"),
                Arguments.of("JavaOrNothing", 4, 6, "Or"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask5")
    void task5(String str1, int indexOne, int indexTwo, String expected) {
        String actual = stringUtil.task5(str1, indexOne, indexTwo);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTask6() {
        return Stream.of(
                Arguments.of(":(", ":)"),
                Arguments.of("JavaOrNothing :(", "JavaOrNothing :)"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask6")
    void task6(String str1, String expected) {
        String actual = stringUtil.task6(str1);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTask7() {
        return Stream.of(
                Arguments.of("JavaOrNothing", "Java", false),
                Arguments.of("JavaOrNothingJava", "Java", true));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask7")
    void task7(String str1, String word, boolean expected) {
        boolean actual = stringUtil.task7(str1, word);
        Assertions.assertEquals(expected, actual);
    }


    static Stream<Arguments> provideArgumentsForTask8() {
        return Stream.of(
                Arguments.of("JavaOrNothing", 5),
                Arguments.of("aeyuio", 6),
                Arguments.of("AEYUIO", 6),
                Arguments.of("qwAEYUIOaeqw", 8));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask8")
    void task8(String str, int expected) {
        int actual = stringUtil.task8(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTask9() {
        return Stream.of(
                Arguments.of("Java!OrNothing?", 2),
                Arguments.of(",!?", 3),
                Arguments.of("In PVP I'm second to NONE", 0));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask9")
    void task9(String str, int expected) {
        int actual = stringUtil.task9(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTask10() {
        return Stream.of(
                Arguments.of("Do geese see God?", true),
                Arguments.of("DD geese see God?", false),
                Arguments.of(" 1991 ", true));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask10")
    void task10(String str, boolean expected) {
        boolean actual = stringUtil.task10(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTask11() {
        return Stream.of(
                Arguments.of("123456789",3, new String[]{"123","456","789"}));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask11")
    void task11(String text, int length, String[] expected) {
        String[] actual = stringUtil.task11(text, length);
        Assertions.assertEquals(expected, actual);
    }

}
