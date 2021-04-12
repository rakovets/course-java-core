package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {
    static StringUtil stringUtil;

    @BeforeAll
    static void beforeAll() {
        stringUtil = new StringUtil();
    }



    static Stream<Arguments> provideArgumentsForPaste() {
        return Stream.of(
                Arguments.of("", "123", "123"),
                Arguments.of("123", "", "123"),
                Arguments.of("", "", "")
        );
    }

    @ParameterizedTest(name = "Str1 - {0}, Str2 - {1}, Expected: {2}")
    @MethodSource("provideArgumentsForPaste")
    void pasteTest(String str1, String str2, String expected) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.pasteTogether(str1, str2);
        assertEquals(expected, actual);
    }


    static Stream<Arguments> provideArgumentsForFindSymbol() {
        return Stream.of(
                Arguments.of("Exotic", "x", 1),
                Arguments.of("Belarus", "l", 2),
                Arguments.of("q", "q", 0),
                Arguments.of("x", "x", 0),
                Arguments.of("Xx", "x", 1)
        );
    }
    @ParameterizedTest(name = "x - {0}, findX - {1}")
    @MethodSource("provideArgumentsForFindSymbol")
    void FindSymbolTest(String x, String findX, int expected) {
        int actual = stringUtil.findSymbol(x, findX);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForEqualSymbols() {
        return Stream.of(
                Arguments.of("Hello", "Hello", true),
                Arguments.of("Hello", "hello", false),
                Arguments.of("Goodbye", "Hello", false),
                Arguments.of("Goodbye", "Gоodbye", false) //"о" - str2 - кириллица
        );
    }
    @ParameterizedTest(name = "Str1 - {0}, Str2 - {1}, Expected: {2}")
    @MethodSource("provideArgumentsForEqualSymbols")
    void EqualSymbolTest(String str1, String str2, boolean expected) {
        boolean actual = stringUtil.equalStrings(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForStringTrim() {
        return Stream.of(
                Arguments.of("  Hello  ", "hello"),
                Arguments.of("Hello", "hello"),
                Arguments.of(" Hel lo", "hel lo")
        );
    }
    @ParameterizedTest(name = "Str1 - {0}")
    @MethodSource("provideArgumentsForStringTrim")
    void StringTrimTest(String str, String expected) {
        String actual = stringUtil.trimString(str);
        Assertions.assertEquals(expected, actual);
    }




    static Stream<Arguments> provideArgumentsFromSubString() {
        return Stream.of(
                Arguments.of("Hello there", 1, 7, "ello t"),
                Arguments.of("     Hello there", 0, 4, "    "),
                Arguments.of(" Hello there", 0, 0, ""),
                Arguments.of("Hello there", 0, 11, "Hello there")
        );
    }
    @ParameterizedTest(name = "necessaryString - {0}, startNumber - {1}, endNumber - {2}")
    @MethodSource("provideArgumentsFromSubString")
    void subStringTest(String necessaryString, int startNumber, int endNumder, String expected) {
        String actual = stringUtil.returnNecessaryString(necessaryString, startNumber, endNumder);
        Assertions.assertEquals(expected, actual);
    }


    static Stream<Arguments> provideFromReplacedSymbol() {
        return Stream.of(
                Arguments.of("Hello Dmitry", "Hello", "Bye", "Bye Dmitry"),
                Arguments.of(":(", ":(", ":)", ":)"),
                Arguments.of(":) :) :( :( :( :(", ":(", ":)",":) :) :) :) :) :)")
        );
    }
    @ParameterizedTest(name = "str1234 - {0}, replaceSymbol - {1}, insertSymbol - {2}")
    @MethodSource("provideFromReplacedSymbol")
    void replaceSymbolTest(String str1234, String replaceSymbol, String insertSymbol, String expected) {
        String actual = stringUtil.replaceTheSymbol(str1234, replaceSymbol, insertSymbol);
        Assertions.assertEquals(expected, actual);
    }


    static Stream<Arguments> provideArgumentsFromAnywayStartEnd() {
        return Stream.of(
                Arguments.of("hookah", "h", true),
                Arguments.of("dad", "d", true),
                Arguments.of("Dad", "d", false)
        );
    }
    @ParameterizedTest(name = "text - {0}, word - {1}")
    @MethodSource("provideArgumentsFromAnywayStartEnd")
    void startEndTest(String text, String word, boolean expected) {
        boolean actual = stringUtil.startEndAnyway(text, word);
        Assertions.assertEquals(expected, actual);
    }



    static Stream<Arguments> provideArgumetsForVowelsAmount() {
        return Stream.of(
                Arguments.of("Wise men speak", 5)
        );
    }
    @ParameterizedTest(name = "text - {0}, Expected: {1}")
    @MethodSource("provideArgumetsForVowelsAmount")
    void VowelsAmountTest(String text, int expected) {
        int actual = stringUtil.vowelsAmount(text);
        Assertions.assertEquals(expected, actual);
    }



    static Stream<Arguments> provideArgumetsForPunctuationSymbols() {
        return Stream.of(
                Arguments.of("Here we go again", 3),
                Arguments.of("     ", 5),
                Arguments.of(" .,?!", 5),
                Arguments.of("", 0)
        );
    }
    @ParameterizedTest(name = "text - {0}")
    @MethodSource("provideArgumetsForPunctuationSymbols")
    void PunctSymbolsAmountTest(String text, int expected) {
        int actual = stringUtil.punctSymbolAmount(text);
        Assertions.assertEquals(expected, actual);
    }




    static Stream<Arguments> provideArgumentsForPalindromeStrings() {
        return Stream.of(
                Arguments.of("Do geese see God", true),
                Arguments.of("1991", true),
                Arguments.of("deed", true)
        );
    }
    @ParameterizedTest(name = "text - {0}")
    @MethodSource("provideArgumentsForPalindromeStrings")
    void palindomeTest(String text, boolean expected) {
        boolean actual = stringUtil.palindromeText(text);
        Assertions.assertEquals(expected, actual);
    }


    static Stream<Arguments> provideArgumentsNumberForNumberOfWords() {
        return Stream.of(
                Arguments.of("Hi there", 2),
                Arguments.of("a aa a a a a", 6),
                Arguments.of("", 0)
        );
    }
    @ParameterizedTest(name = "str12345 - {0}")
    @MethodSource("provideArgumentsNumberForNumberOfWords")
    void numberOfWordsTest(String text, int expected) {
        int actual = stringUtil.numberOfWords(text);
        Assertions.assertEquals(expected, actual);
    }


    static Stream<Arguments> provideArgumentsForDigitInText() {
        return Stream.of(
                Arguments.of("Hell0 my name 1s A1eksey", 3),
                Arguments.of("", 0),
                Arguments.of("0000000 0000000", 14)
                );
    }
    @ParameterizedTest(name = "str16 - {0}")
    @MethodSource("provideArgumentsForDigitInText")
    void digitInTextTest(String str16, int expected) {
        int actual = stringUtil.digitInText(str16);
        Assertions.assertEquals(expected, actual);
    }



}
