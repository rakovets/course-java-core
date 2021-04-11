package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Locale;
import java.util.stream.Stream;



public class StringUtilTest {
    static Stream<Arguments> provideArgumentsforconcat() {
        return Stream.of(
                Arguments.of("5", "1", "51"),
                Arguments.of("", "5", "5"),
                Arguments.of("5", "", "5"),
                Arguments.of("", "", "")
        );
    }

    @ParameterizedTest(name = "concatforstringTest")
    @MethodSource("provideArgumentsforconcat")
    void test(String str1, String str2, String concatforstring) {
        StringUtil stringUtil = new StringUtil();
        stringUtil.concatforstring(str1, str2);
    }


    static Stream<Arguments> provideArgumentsforfindIndex() {
        return Stream.of(
                Arguments.of("x", "hello", "-1"),
                Arguments.of("e", "hello", "1"),
                Arguments.of("d", "world", "4"),
                Arguments.of(" ", " ", "0")
        );
    }


    @ParameterizedTest(name = "findIndexOfTest")
    @MethodSource("provideArgumentsforfindIndex")
    void test(String symbol, String text, int expected) {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.findIndexOf(symbol, text);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsforSimularStrings() {
        return Stream.of(
                Arguments.of("hello", "hello", true),
                Arguments.of("Hello", "hello", false),
                Arguments.of(" ", " ", true),
                Arguments.of("zZzZz", "zzzzz", false)
        );
    }


    @ParameterizedTest(name = "SimularStrings")
    @MethodSource("provideArgumentsforSimularStrings")
    void test(String first, String second, boolean expected) {
        StringUtil stringUtil = new StringUtil();
        boolean actual = first.equals(second);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsforlowerCaseAndNoEmptySpaces() {
        return Stream.of(
                Arguments.of("  Hello  ", "hello"),
                Arguments.of("HELLO", "hello"),
                Arguments.of(" ", ""),
                Arguments.of("        zZzZz", "zzzzz")
        );
    }


    @ParameterizedTest(name = "lowerCaseAndNoEmptySpaces")
    @MethodSource("provideArgumentsforlowerCaseAndNoEmptySpaces")
    void test(String nospaces, String expected) {
        StringUtil stringUtil = new StringUtil();
        String actual = nospaces.toLowerCase(Locale.ROOT).trim();
        ;
        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsforsubstring() {
        return Stream.of(
                Arguments.of("hello", 0, 4, "hell"),
                Arguments.of("HELLO", 2, 4, "LL"),
                Arguments.of("zZzZz", 0, 3, "zZz")
        );
    }


    @ParameterizedTest(name = "substring")
    @MethodSource("provideArgumentsforsubstring")
    void test(String placeForRetrieving, int first, int end, String expected) {
        StringUtil stringUtil = new StringUtil();
        String actual = placeForRetrieving.substring(first, end);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsforreplaces() {
        return Stream.of(
                Arguments.of(":(:(:(", "(", ")", ":):):)"),
                Arguments.of(":):(", "(", ")", ":):)")
        );
    }


    @ParameterizedTest(name = "replaces")
    @MethodSource("provideArgumentsforreplaces")
    void test(String placeforchanging, String first, String second, String expected) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.replaces(placeforchanging, first, second);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsforcheckForWord() {
        return Stream.of(
                Arguments.of("hello", "hello", true),
                Arguments.of("Hello Hello", "Hello", true),
                Arguments.of(" Hello  ", "Hello", false),
                Arguments.of(" checking for spaces ", " ", true)
        );
    }


    @ParameterizedTest(name = "checkForWord")
    @MethodSource("provideArgumentsforcheckForWord")
    void checkForWord(String text, String word, boolean expected) {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.checkForWord(text, word);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsforamountOfLetters() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("Hello Hello", 4),
                Arguments.of("ZzZzZz  ", 0),
                Arguments.of("zAaAaAaAaz", 8)
        );
    }


    @ParameterizedTest(name = "amountOfLetters")
    @MethodSource("provideArgumentsforamountOfLetters")
    void amountOfLetters(String text, int expected) {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.amountOfLetters(text);
        assertEquals(expected, actual);


    }
    static Stream<Arguments> provideArgumentsforamountOfSymbols() {
        return Stream.of(
                Arguments.of("how many ? do u see?", 2),
                Arguments.of("Hello Hello", 0),
                Arguments.of("?!!?.,..,,.?  ", 12),
                Arguments.of(")(*&^%$#@", 0)
        );
    }


    @ParameterizedTest(name = "amountOfSymbols")
    @MethodSource("provideArgumentsforamountOfSymbols")
    void amountOfSymbols(String text, int expected) {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.amountOfSymbols(text);
        assertEquals(expected, actual);


    }
    static Stream<Arguments> provideArgumentsforcheckForInversion() {
        return Stream.of(
                Arguments.of("deed", true),
                Arguments.of("Do geese see God", true),
                Arguments.of("1991", true),
                Arguments.of(" ", true)
        );
    }


    @ParameterizedTest(name = "checkForInversion")
    @MethodSource("provideArgumentsforcheckForInversion")
    void checkForInversionTest(String text, boolean expected) {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.checkForInversion(text);
        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsforpartsofwords() {
        return Stream.of(
                Arguments.of("hello", 0, new String[]{"hello"}),
                Arguments.of("HELLO", 1, new String[]{"H","E", "L", "L", "O"}),
                Arguments.of("zZzzZzzZz", 3, new String[]{"zZz", "zZz", "zZz"})
        );
    }


    @ParameterizedTest(name = "partsofwords")
    @MethodSource("provideArgumentsforpartsofwords")
    void partsofwordsTest(String text, int amountofparts, String[] expected) {
        StringUtil stringUtil = new StringUtil();
        String[] actual = stringUtil.partsofwords(text,amountofparts);
        assertArrayEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsforamountOfWords() {
        return Stream.of(
                Arguments.of("hello   hello hello", 3),
                Arguments.of("Hello Hello", 2),
                Arguments.of("ZzZzZz  ", 1),
                Arguments.of(" ", 0)
        );
    }


    @ParameterizedTest(name = "amountOfWords")
    @MethodSource("provideArgumentsforamountOfWords")
    void amountOfWordsTest(String text, int expected) {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.amountOfWords(text);
        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsFL() {
        return Stream.of(
                Arguments.of("SergeI IvanoV", "SI"),
                Arguments.of("Hello Hello", "HH"),
                Arguments.of("Paul Beliakovich", "PB"),
                Arguments.of("paul beliakovich", "PB")
        );
    }


    @ParameterizedTest(name = "FL")
    @MethodSource("provideArgumentsFL")
    void FLTest(String text, String expected) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.FL(text);
        assertEquals(expected, actual);


    }
    static Stream<Arguments> provideArgumentsforamountOfDigit() {
        return Stream.of(
                Arguments.of("84521", 5),
                Arguments.of(" ", 0),
                Arguments.of("1122334455", 10),
                Arguments.of("1 2 3", 3)
        );
    }


    @ParameterizedTest(name = "amountOfDigit")
    @MethodSource("provideArgumentsforamountOfDigit")
    void amountOfDigit(String text, int expected) {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.amountOfDigit(text);
        assertEquals(expected, actual);


    }



}





