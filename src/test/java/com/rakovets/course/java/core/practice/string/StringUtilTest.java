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
    static void beforeAll(){
        stringUtil = new StringUtil();
    }

    //task1
    static Stream<Arguments> provideArgumentsForGlue() {
        return Stream.of(
                Arguments.of("", "", ""),
                Arguments.of("5", "", "5"),
                Arguments.of("", "2", "2"),
                Arguments.of("1234", "2", "12342")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGlue")
    void glueTest(String str1, String str2, String expected) {
        //GIVEN
        //WHEN
        String actual = stringUtil.glue(str1, str2);

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    //task2
    static Stream<Arguments> provideArgumentsForIndexSearch() {
        return Stream.of(
                Arguments.of("Learning", 'L', 0),
                Arguments.of("World", 'r', 2),
                Arguments.of("Arguments", 't', 7),
                Arguments.of("Method", 'x', -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIndexSearch")
    void indexSearchTest(String str, char symbol, int expected) {
        //GIVEN
        //WHEN
         int actual = stringUtil.indexSearch(str, symbol);

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    //task3
    static Stream<Arguments> provideArgumentsForComparingString() {
        return Stream.of(
                Arguments.of("Hello", "Hello", true),
                Arguments.of("Hello", "hello", false),
                Arguments.of("Arguments", "World", false),
                Arguments.of("", "x", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForComparingString")
    void comparingStringTest(String str1, String str2, boolean expected) {
        //GIVEN
        //WHEN
        boolean actual = stringUtil.comparingString(str1, str2);

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    //task4
    static Stream<Arguments> provideArgumentsForModificationString() {
        return Stream.of(
                Arguments.of("  Hello  ", "HELLO"),
                Arguments.of(" World", "WORLD"),
                Arguments.of(" Hello world ", "HELLO WORLD"),
                Arguments.of("x", "X")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForModificationString")
    void modificationStringTest(String str, String expected) {
        //GIVEN
        //WHEN
        String actual = stringUtil.modificationString(str);

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    //task5
    static Stream<Arguments> provideArgumentsForGetSubstring() {
        return Stream.of(
                Arguments.of(0, 4, "Hello", "Hell"),
                Arguments.of(0, 5, "World ", "World"),
                Arguments.of(2, 7, "Hello world", "llo w"),
                Arguments.of(0, 1, "x ", "x")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetSubstring")
    void getSubstringTest(int begin, int end, String str, String expected) {
        //GIVEN
        //WHEN
        String actual = stringUtil.getSubstring(str, begin, end);

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    //task6
    static Stream<Arguments> provideArgumentsForReplaceEmoji() {
        return Stream.of(
                Arguments.of(":(", ":)", "Hello :(", "Hello :)"),
                Arguments.of(":(", ":)", "I like :(", "I like :)"),
                Arguments.of(":(", ":)", "Mur-mur:(", "Mur-mur:)"),
                Arguments.of(":(", ":)", ":(", ":)")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForReplaceEmoji")
    void replaceEmojiTest(String symbol1, String symbol2, String str, String expected) {
        //GIVEN
        //WHEN
        String actual = stringUtil.replaceEmoji(str, symbol1, symbol2);

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    //task7
    static Stream<Arguments> provideArgumentsForStartEndWith() {
        return Stream.of(
                Arguments.of("my and only my", "my", true),
                Arguments.of("my love", "my", false),
                Arguments.of("it-academy.by", "by", false),
                Arguments.of("Hello world", "java", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForStartEndWith")
    void startEndWithTest(String text, String word, boolean expected) {
        //GIVEN
        //WHEN
        boolean actual = stringUtil.startEndWith(text, word);

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    //task8
    static Stream<Arguments> provideArgumentsForCountEnglishVowelLetters() {
        return Stream.of(
                Arguments.of("my and only my", 5),
                Arguments.of("SRC", 0),
                Arguments.of("It-academy.by", 6),
                Arguments.of("Hello world", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCountEnglishVowelLetters")
    void countEnglishVowelLettersTest(String str, int expected) {
        //GIVEN
        //WHEN
        int actual = stringUtil.countEnglishVowelLetters(str);

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    //task9
    static Stream<Arguments> provideArgumentsForCountPunctuationMarks() {
        return Stream.of(
                Arguments.of("My and only my!!!", 3),
                Arguments.of("Hi, can you help me?", 2),
                Arguments.of("It-academy.by", 1),
                Arguments.of("Hello world", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCountPunctuationMarks")
    void countPunctuationMarksTest(String str, int expected) {
        //GIVEN
        //WHEN
        int actual = stringUtil.countPunctuationMarks(str);

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    //task10
    static Stream<Arguments> provideArgumentsForPalindromeSearch() {
        return Stream.of(
                Arguments.of("My and only my!", false),
                Arguments.of("Do geese see God?", true),
                Arguments.of("1991", true),
                Arguments.of("deed", true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPalindromeSearch")
    void palindromeSearchTest(String str, boolean expected) {
        //GIVEN
        //WHEN
        boolean actual = stringUtil.palindromeSearch(str);

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    //task11
    static Stream<Arguments> provideArgumentsForArrayOfSubstrings() {
        return Stream.of(
                Arguments.of("My and only my", 2, new String[]{"My", " a", "nd", " o", "nl", "y ", "my"}),
                Arguments.of("Do geese see God", 4, new String[]{"Do g", "eese", " see", " God"}),
                Arguments.of("1991", 1, new String[]{"1", "9", "9", "1"}),
                Arguments.of("deed", 0, new String[]{"deed"})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForArrayOfSubstrings")
    void arrayOfSubstringsTest(String str, int n, String[] expected) {
        //GIVEN
        //WHEN
        String[] actual = stringUtil.arrayOfSubstrings(str, n);

        //THEN
        Assertions.assertArrayEquals(expected, actual);
    }

    //task12
    static Stream<Arguments> provideArgumentsForCountWords() {
        return Stream.of(
                Arguments.of("My and only my", 4),
                Arguments.of("Do geese   see God", 4),
                Arguments.of("1991  ", 1),
                Arguments.of("deed", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCountWords")
    void countWordsTest(String str, int expected) {
        //GIVEN
        //WHEN
        int actual = stringUtil.countWords(str);

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    //task13
    static Stream<Arguments> provideArgumentsForInitials() {
        return Stream.of(
                Arguments.of("TatSiANA PUchkouskaYa", "TP"),
                Arguments.of("DmitRY RakOVets", "DR"),
                Arguments.of("irina moroz", "IM"),
                Arguments.of("PiOTr belY", "PB")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForInitials")
    void initialsTest(String str, String expected) {
        //GIVEN
        //WHEN
        String actual = stringUtil.initials(str);

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    //task14
    static Stream<Arguments> provideArgumentsForDigitsInString() {
        return Stream.of(
                Arguments.of("TatSiANA123 PUchkouskaYa568", "123568"),
                Arguments.of("08 juli 1987", "081987"),
                Arguments.of("irina moroz", ""),
                Arguments.of("12.02,2021", "12022021")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForDigitsInString")
    void digitsInStringTest(String str, String expected) {
        //GIVEN
        //WHEN
        String actual = stringUtil.digitsInString(str);

        //THEN
        Assertions.assertEquals(expected, actual);
    }
}
