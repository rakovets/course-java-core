package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.Arrays;
import java.util.stream.Stream;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();

    static Stream<Arguments> provideArgumentsForConnectTwoStrings() {
        return Stream.of(
                Arguments.of("con", "cat", "concat"),
                Arguments.of("", "hello", "hello"),
                Arguments.of("ginard", "", "ginard"),
                Arguments.of(null, "text", "nulltext"),
                Arguments.of("The", null, "Thenull")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForConnectTwoStrings")
    void testConnectTwoStrings(String str1, String str2, String expected) {
        String actual = stringUtil.connectTwoStrings(str1, str2);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsFindIndex() {
        return Stream.of(
                Arguments.of("Coffee", "C", 0),
                Arguments.of("moon", "o", 1),
                Arguments.of("sun", "m", -1),
                Arguments.of("fire", "F", -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsFindIndex")
    void testFindIndex(String str, char ch, int expected) {
        int actual = stringUtil.findIndex(str, ch);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsEqual() {
        return Stream.of(
                Arguments.of("Ekaterina", "Ekaterina", true),
                Arguments.of("Ekaterina", "ekaterina", false),
                Arguments.of("Ekaterina", "", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsEqual")
    void testIsEqual(String str1, String str2, boolean expected) {
        boolean actual = stringUtil.isEqual(str1, str2);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForDeleteSpaseAroundTurnInUpperCase() {
        return Stream.of(
                Arguments.of(" Ekaterina  ", "EKATERINA"),
                Arguments.of("EKATERINA", "EKATERINA"),
                Arguments.of("  ", ""),
                Arguments.of(" katerina", "KATERINA")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForDeleteSpaseAroundTurnInUpperCase")
    void testDeleteSpaseAroundTurnInUpperCase(String str1, String expected) {
        String actual = stringUtil.deleteSpaseAroundTurnInUpperCase(str1);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetSubstring() {
        return Stream.of(
                Arguments.of("Hello my name is Kate ", 3, 7, "lo m"),
                Arguments.of("EKATERINA", 0, 5, "EKATE")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetSubstring")
    void testGetSubstring(String str, int n, int m, String expected) {
        String actual = stringUtil.getSubstring(str, n, m);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForReplaceEmoji() {
        return Stream.of(
                Arguments.of(":(Ekaterina", ":)Ekaterina"),
                Arguments.of("EKATERINA:(", "EKATERINA:)"),
                Arguments.of(":(", ":)"),
                Arguments.of(":(katerina:(", ":)katerina:)")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForReplaceEmoji")
    void testReplaceEmoji(String str, String expected) {
        String actual = stringUtil.replaceEmoji(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCorrectBegin() {
        return Stream.of(
                Arguments.of("I am Ekaterina I", "I", true),
                Arguments.of("Point has next issue Point", "Point", true),
                Arguments.of("Hello world text", "text", false),
                Arguments.of("javais cool Java", "Java", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCorrectBegin")
    void testCorrectBegin(String text, String word, boolean expected) {
        boolean actual = stringUtil.correctBegin(text, word);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForFindNumberOfVowels() {
        return Stream.of(
                Arguments.of("I am Ekaterina I", 8),
                Arguments.of("Point has next issue Point", 9),
                Arguments.of("Hello world text", 4),
                Arguments.of("dfrt", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFindNumberOfVowels")
    void testFindNumberOfVowels(String str, int expected) {
        int actual = stringUtil.findNumberOfVowels(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetPunctuation() {
        return Stream.of(
                Arguments.of("I - am Ekaterina. I", 2),
                Arguments.of("Point! has next? issue (Point)", 4),
                Arguments.of("Hello world!! text", 2),
                Arguments.of("dfrt", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetPunctuation")
    void testGetPunctuation(String str, int expected) {
        int actual = stringUtil.getPunctuation(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsPalindrome() {
        return Stream.of(
                Arguments.of("deed", true),
                Arguments.of("Do geese see God?", true),
                Arguments.of("Tt t4 tt t", true),
                Arguments.of("Mntcrl", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsPalindrome")
    void testIsPalindrome(String str, boolean expected) {
        boolean actual = stringUtil.isPalindrome(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSplitString() {
        return Stream.of(
                Arguments.of("OneTwoSix", 3, new String[]{"One", "Two", "Six"}),
                Arguments.of("123456", 1, new String[]{"1", "2", "3", "4", "5", "6"}),
                Arguments.of("12345", 2, new String[]{"12", "34", "5"})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSplitString")
    void testForSplitString(String str, int n, String[] expected) {
        String[] actual = stringUtil.splitString(str, n);

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    static Stream<Arguments> provideArgumentsForCountWords() {
        return Stream.of(
                Arguments.of("One  Two Six", 3),
                Arguments.of("my name is Kate", 4),
                Arguments.of(" ", 0),
                Arguments.of("hfi-kjk", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCountWords")
    void testForCountWords(String str, int expected) {
        int actual = stringUtil.countWords(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetInitials() {
        return Stream.of(
                Arguments.of("DmitRY RakOVets", "DR"),
                Arguments.of("ekaterina komleva", "EK"),
                Arguments.of(" Jigurda", "J"),
                Arguments.of("hif-karab Giaveli", "HKG")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetInitials")
    void testForGetInitials(String str, String expected) {
        String actual = stringUtil.getInitials(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAllDigits() {
        return Stream.of(
                Arguments.of("I have 2 brothers 5 sisters 3 cats 8 gods", "2 5 3 8"),
                Arguments.of("123", "1 2 3"),
                Arguments.of(" Jigurda", "")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAllDigits")
    void testForAllDigits(String str, String expected) {
        String actual = stringUtil.allDigits(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForNonMatchingChars() {
        return Stream.of(
                Arguments.of("information", "motivation", "frv"),
                Arguments.of("graduation", "transition", "gdus"),
                Arguments.of("hello", "bye", "hlloby"),
                Arguments.of("hello", "olleh", ""),
                Arguments.of("max", "ejr", "maxejr")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForNonMatchingChars")
    void testForNonMatchingChars(String str1, String str2, String expected) {
        String actual = stringUtil.nonMatchingChars(str1, str2);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsIdentical() {
        return Stream.of(
                Arguments.of(new String[]{"1", "2", "3", "4"}, new String[]{"1", "2", "3", "4"}, true),
                Arguments.of(new String[]{"1", "3", "2", "4"}, new String[]{"1", "2", "3", "4"}, true),
                Arguments.of(new String[]{"1", "2", "4", "4"}, new String[]{"1", "4", "2", "4"}, true),
                Arguments.of(new String[]{"1", "2", "3", "4"}, new String[]{"1", "2", "3", "5"}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsIdentical")
    void testForIsIdentical(String[] arr1, String[] arr2, boolean expected) {
        boolean actual = stringUtil.isIdentical(arr1, arr2);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForReplaceSameSymbols() {
        return Stream.of(
                Arguments.of("aaabbcdeef", "abcdef"),
                Arguments.of("Jaaaavvaaaaaaa", "Java"),
                Arguments.of("HelloWorld", "HeloWorld"),
                Arguments.of("qwer", "qwer")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForReplaceSameSymbols")
    void testForReplaceSameSymbols(String str, String expected) {
        String actual = stringUtil.replaceSameSymbols(str);

        Assertions.assertEquals(expected, actual);
    }
}
