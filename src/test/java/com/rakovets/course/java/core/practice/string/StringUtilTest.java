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
                Arguments.of("abcd", "a", 0),
                Arguments.of("abcd", "c", 2),
                Arguments.of("abcd", "q", -1));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForCharacterIndex")
    void characterIndex(String str1, String str2, int expected) {
        int actual = stringUtil.characterIndex(str1, str2);
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
                Arguments.of(":(", ":(", ":)", ":)"),
                Arguments.of("JavaOrNothing :(", ":(", ":)", "JavaOrNothing :)"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask6")
    void task6(String text, String str1, String str2, String expected) {
        String actual = stringUtil.task6(text, str1, str2);
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
                Arguments.of("123456789", 3, new String[]{"123", "456", "789"}));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask11")
    void task11(String text, int length, String[] expected) {
        String[] actual = stringUtil.task11(text, length);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTask12() {
        return Stream.of(
                Arguments.of("123 456 789", 3),
                Arguments.of("123  456  789", 3),
                Arguments.of("123 456 ", 2),
                Arguments.of("123", 1));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask12")
    void task12(String text, int expected) {
        int actual = stringUtil.task12(text);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTask13() {
        return Stream.of(
                Arguments.of("DmitRY RakOVets", "DR"),
                Arguments.of("evgeni ermakov", "EE"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask13")
    void task13(String text, String expected) {
        String actual = stringUtil.task13(text);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTask14() {
        return Stream.of(
                Arguments.of("900Java8orJava11", "900811"),
                Arguments.of("900$ or 4$", "9004"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask14")
    void task14(String text, String expected) {
        String actual = stringUtil.task14(text);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTask15() {
        return Stream.of(
                Arguments.of("12345678vet", "1234567889privet", "89pri"),
                Arguments.of("Java", "JavaOrNothing", "OrNothing"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask15")
    void task15(String text, String text2, String expected) {
        String actual = stringUtil.task15(text, text2);
        Assertions.assertEquals(expected, actual);
    }


    static Stream<Arguments> provideArgumentsForTask16() {
        return Stream.of(
                Arguments.of(new String[]{"Java", "Or", "Nothing"}, new String[]{"Or", "Java", "Nothing"}, true),
                Arguments.of(new String[]{"Java", "Or", "Nothing"}, new String[]{"Or", "Java", "Nothing", "Java"}, false),
                Arguments.of(new String[]{"Java", "Or", "Nothing", "?"}, new String[]{"Or", "Java", "Nothing"}, false));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask16")
    void task16(String[] array, String[] array2, boolean expected) {
        boolean actual = stringUtil.task16(array, array2);
        Assertions.assertEquals(expected, actual);
    }


    static Stream<Arguments> provideArgumentsForTask17() {
        return Stream.of(
                Arguments.of(new String[]{"Java"}, true));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask17")
    void task17(String[] array, boolean expected) {
        boolean actual = stringUtil.task17(array);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTask18() {
        return Stream.of(
                Arguments.of("11", "1"),
                Arguments.of("HHi222", "Hi2"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask18")
    void task18(String text, String expected) {
        String actual = stringUtil.task18(text);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTask19() {
        return Stream.of(
                Arguments.of("MCMLXIV", 1964),
                Arguments.of("DCCC", 800),
                Arguments.of("CM", 900),
                Arguments.of("I", 1),
                Arguments.of("MMMCMXCIX", 3999),
                Arguments.of(null, -1),
                Arguments.of("HI", -1));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTask19")
    void task19(String text, int expected) {
        int actual = stringUtil.task19(text);
        Assertions.assertEquals(expected, actual);
    }

}
