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
    void glueTest(String firstText, String secondText, String expected) {
        String actual = stringUtil.glue(firstText, secondText);
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
    void characterIndexTest(String text, String letter, int expected) {
        int actual = stringUtil.characterIndex(text, letter);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForStringСomparison() {
        return Stream.of(
                Arguments.of("a", "a", true),
                Arguments.of("a", "aaaa", false),
                Arguments.of("a", "A", false));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForStringСomparison")
    void stringСomparisonTest(String firstText, String secondText, boolean expected) {
        boolean actual = stringUtil.stringСomparison(firstText, secondText);
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
    void removeSpaceTest(String text, String expected) {
        String actual = stringUtil.removeSpace(text);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCut() {
        return Stream.of(
                Arguments.of("JavaOrNothing", 0, 4, "Java"),
                Arguments.of("JavaOrNothing", 4, 6, "Or"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForCut")
    void cutTest(String text, int indexOne, int indexTwo, String expected) {
        String actual = stringUtil.cut(text, indexOne, indexTwo);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForReplaceSmile() {
        return Stream.of(
                Arguments.of(":(", ":(", ":)", ":)"),
                Arguments.of("JavaOrNothing :(", ":(", ":)", "JavaOrNothing :)"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForReplaceSmile")
    void replaceSmileTest(String text, String firstLetter, String secondLetter, String expected) {
        String actual = stringUtil.replaceSmile(text, firstLetter, secondLetter);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForStartsEndsWith() {
        return Stream.of(
                Arguments.of("JavaOrNothing", "Java", false),
                Arguments.of("JavaOrNothingJava", "Java", true));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForStartsEndsWith")
    void startsEndsWithTest(String text, String word, boolean expected) {
        boolean actual = stringUtil.startsEndsWith(text, word);
        Assertions.assertEquals(expected, actual);
    }


    static Stream<Arguments> provideArgumentsForVowelsCounter() {
        return Stream.of(
                Arguments.of("JavaOrNothing", 5),
                Arguments.of("aeyuio", 6),
                Arguments.of("AEYUIO", 6),
                Arguments.of("qwAEYUIOaeqw", 8));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForVowelsCounter")
    void vowelsCounterTest(String text, int expected) {
        int actual = stringUtil.vowelsCounter(text);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPunctuationCounter() {
        return Stream.of(
                Arguments.of("Java!OrNothing?", 2),
                Arguments.of(",!?", 3),
                Arguments.of("In PVP I'm second to NONE", 0));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForPunctuationCounter")
    void PunctuationCounterTest(String text, int expected) {
        int actual = stringUtil.PunctuationCounter(text);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPalindrome() {
        return Stream.of(
                Arguments.of("Do geese see God?", true),
                Arguments.of("DD geese see God?", false),
                Arguments.of(" 1991 ", true));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForPalindrome")
    void palindromeTest(String text, boolean expected) {
        boolean actual = stringUtil.palindrome(text);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForLineSeparator() {
        return Stream.of(
                Arguments.of("123456789", 3, new String[]{"123", "456", "789"}),
                Arguments.of("12345", 1, new String[]{"1", "2", "3", "4", "5"}),
                Arguments.of("123456789", 10, new String[]{"123456789"}));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForLineSeparator")
    void lineSeparatorTest(String text, int length, String[] expected) {
        String[] actual = stringUtil.lineSeparator(text, length);
        Assertions.assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForWordCounter() {
        return Stream.of(
                Arguments.of("123 456 789", 3),
                Arguments.of("123  456  789", 3),
                Arguments.of("123 456 ", 2),
                Arguments.of("123", 1));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForWordCounter")
    void wordCounterTest(String text, int expected) {
        int actual = stringUtil.wordCounter(text);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForInitialsOfTheName() {
        return Stream.of(
                Arguments.of("DmitRY RakOVets", "DR"),
                Arguments.of("evgeni ermakov", "EE"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForInitialsOfTheName")
    void initialsOfTheNameTest(String text, String expected) {
        String actual = stringUtil.initialsOfTheName(text);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetAllDigits() {
        return Stream.of(
                Arguments.of("900Java8orJava11", "900811"),
                Arguments.of("900$ or 4$", "9004"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForGetAllDigits")
    void getAllDigitsTest(String text, String expected) {
        String actual = stringUtil.getAllDigits(text);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetIndividualSymbolTest() {
        return Stream.of(
                Arguments.of("12345678vet", "1234567889privet", "89pri"),
                Arguments.of("Java", "JavaOrNothing", "OrNothing"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForGetIndividualSymbolTest")
    void getIndividualSymbolTest(String firstText, String secondText, String expected) {
        String actual = stringUtil.getIndividualSymbol(firstText, secondText);
        Assertions.assertEquals(expected, actual);
    }


    static Stream<Arguments> provideArgumentsForArrayComparator() {
        return Stream.of(
                Arguments.of(new String[]{"Java", "Or", "Nothing"}, new String[]{"Or", "Java", "Nothing"}, true),
                Arguments.of(new String[]{"Java", "Or", "Nothing"}, new String[]{"Or", "Java", "Nothing", "Java"}, false),
                Arguments.of(new String[]{"Java", "Or", "Nothing", "?"}, new String[]{"Or", "Java", "Nothing"}, false));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForArrayComparator")
    void arrayComparatorTest(String[] firstArray, String[] secondArray, boolean expected) {
        boolean actual = stringUtil.arrayComparator(firstArray, secondArray);
        Assertions.assertEquals(expected, actual);
    }


    static Stream<Arguments> provideArgumentsForSpeedComparator() {
        return Stream.of(
                Arguments.of(new String[]{"Java"}, true));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForSpeedComparator")
    void speedComparatorTest(String[] array, boolean expected) {
        boolean actual = stringUtil.speedComparator(array);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForRepeatRemover() {
        return Stream.of(
                Arguments.of("11", "1"),
                Arguments.of("HHi222", "Hi2"));
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForRepeatRemover")
    void repeatRemoverTest(String text, String expected) {
        String actual = stringUtil.repeatRemover(text);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForFromRomeNumberInArabic() {
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
    @MethodSource("provideArgumentsForFromRomeNumberInArabic")
    void fromRomeNumberInArabicTest(String text, int expected) {
        int actual = stringUtil.fromRomeNumberInArabic(text);
        Assertions.assertEquals(expected, actual);
    }
}
