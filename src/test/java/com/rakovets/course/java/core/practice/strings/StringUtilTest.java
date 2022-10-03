package com.rakovets.course.java.core.practice.strings;

import com.rakovets.course.java.core.example.generics.model.restrict.B;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();

    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("123", "456", "123456"),
                Arguments.of("", "456", "456"),
                Arguments.of("123", "", "123"),
                Arguments.of("null", "456", "null456"),
                Arguments.of("123", "null", "123null")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testGlue(String str1, String str2, String expected) {

        String actual = stringUtil.glue(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIndexOfChar() {

        int actual = stringUtil.getIndexOfChar("qwerty", '0');

        Assertions.assertEquals(-1, actual);
    }

    @Test
    void testIndexOfChar2() {

        int actual = stringUtil.getIndexOfChar("qwerty", 'q');

        Assertions.assertEquals(0, actual);
    }

    @Test
    void testIndexOfChar3() {

        int actual = stringUtil.getIndexOfChar("01234", '4');

        Assertions.assertEquals(4, actual);
    }

    static Stream<Arguments> provideArgumentsEquals() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("Mama", "Mama"),
                Arguments.of("TTT HHH", "TTT HHH"),
                Arguments.of("null", "null")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsEquals")
    void testCaseSensitiveCompare2(String str1, String str2) {

        Boolean actual = stringUtil.caseSensitiveCompare(str1, str2);

        Assertions.assertEquals(true, actual);

    }

    static Stream<Arguments> provideArgumentsTrim() {
        return Stream.of(
                Arguments.of("    gg    ", "gg"),
                Arguments.of("         T", "t"),
                Arguments.of("error     error", "error     error"),
                Arguments.of("   BBBRRR", "bbbrrr")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTrim")
    void testTrimToLowerCase(String str, String expected) {

        String actual = stringUtil.trimToLowerCase(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsSubstring() {
        return Stream.of(
                Arguments.of(1, 5, "hello world!!!", "hello"),
                Arguments.of(3, 4, "my name is Sveta", " n"),
                Arguments.of(6, 6, "I am I who am I", "I"),
                Arguments.of(4, 7, "music is my life", "ic i")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsSubstring")
    void testGetExtractSubstring_N_M(int n, int m, String str, String expected) {

        String actual = stringUtil.getExtractSubstring_N_M(n, m, str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsReplaceSmile() {
        return Stream.of(
                Arguments.of(":(c:)c:(", ":)c:)c:)"),
                Arguments.of(":(ab:(", ":)ab:)"),
                Arguments.of(":)(:):))):(((", ":)(:):))):)(("),
                Arguments.of(" : ) :( : )", " : ) :) : )")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsReplaceSmile")
    void testReplaceSmile(String str, String expected) {

        String actual = stringUtil.getReplaceSmile(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetStartEndTextWorld() {
        return Stream.of(
                Arguments.of("1111adhfasifklhnsail1111", "1111", true),
                Arguments.of("FUCKtextTEXTwordFUCK", "FUCK", true),
                Arguments.of("123TEXXTtexxtTEXXTwordD321", "123", false),
                Arguments.of("abcrextggEXTWORlDABC", "ABC", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetStartEndTextWorld")
    void testGetStartEndTextWorld(String text, String word, Boolean expected) {

        Boolean actual = stringUtil.getStartEndTextWorld(text, word);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetNumberOfEnglishVowels() {
        return Stream.of(
                Arguments.of("qwertyuiop", 5),
                Arguments.of("asdfghjkl", 1),
                Arguments.of("QWERTYUIP", 4),
                Arguments.of("zxcvbn", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetNumberOfEnglishVowels")
    void testGetNumberOfEnglishVowels(String str, Integer expected) {

        int actual = stringUtil.getNumberOfEnglishVowels(str);

        Assertions.assertEquals(expected, actual);
    }


    static Stream<Arguments> provideArgumentsGetTotalNumberOfPunctuationMarks() {
        return Stream.of(
                Arguments.of("q!wert.ym?uio,p", 4),
                Arguments.of("...,,,", 6),
                Arguments.of("QWE!R!TY?U!I!P", 5),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetTotalNumberOfPunctuationMarks")
    void testGetTotalNumberOfPunctuationMarks(String str, Integer expected) {

        int actual = stringUtil.getTotalNumberOfPunctuationMarks(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetCheckStringPalindrome() {
        return Stream.of(
                Arguments.of("MAMAM", true),
                Arguments.of("Do geese see God?", false),
                Arguments.of("1881", true),
                Arguments.of("Нажал кабан на баклажан", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetCheckStringPalindrome")
    void testGetCheckStringPalindrome(String str, Boolean expected) {

        Boolean actual = stringUtil.getCheckStringPalindrome(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetSplitStringEqualParts() {
        return Stream.of(
                Arguments.of("MAMAM", 2, new String[]{"MA", "MA", "M"}),
                Arguments.of("abcabcabc", 3, new String[]{"abc", "abc", "abc"}),
                Arguments.of("1881", 2, new String[]{"18", "81"}),
                Arguments.of("11111", 2, new String[]{"11", "11", "1"})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetSplitStringEqualParts")
    void testGetSplitStringEqualParts(String text, int n, String[] expected) {

        String[] actual = stringUtil.getSplitStringEqualParts(text, n);

        Assertions.assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetWordCount() {
        return Stream.of(
                Arguments.of("abcd", 1L),
                Arguments.of("Sveta   ", 1L),
                Arguments.of("Hello  world ! Hello cat !!!", 6L),
                Arguments.of("All loves cats", 3L)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetWordCount")
    void testGetWordCount(String text, Long expected) {

        long actual = stringUtil.getWordCount(text);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetNameSurname() {
        return Stream.of(
                Arguments.of("Sveta Piven", "SP"),
                Arguments.of("aleksand pushkin", "AP"),
                Arguments.of("JONNY DEPP", "JD"),
                Arguments.of("Cat Dog ", "CD")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetNameSurname")
    void testGetNameSurname(String str, String expected) {

        String actual = stringUtil.getNameSurname(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetAllDigitsText() {
        return Stream.of(
                Arguments.of("r5yc6dj484jc83j", "5648483"),
                Arguments.of("1234512345", "1234512345"),
                Arguments.of("sveta0sveta", "0"),
                Arguments.of("dddd", "")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetAllDigitsText")
    void testGetAllDigitsText(String text, String expected) {

        String actual = stringUtil.getAllDigitsText(text);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetUncrossedSymbols() {
        return Stream.of(
                Arguments.of("abcd", "abce", "de"),
                Arguments.of("qwer", "tyui", "qwertyui"),
                Arguments.of("qazxsw", "qazxs", "w"),
                Arguments.of("false", "false", "")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetUncrossedSymbols")
    void testGetUncrossedSymbols(String word1, String word2, String expected) {

        String actual = stringUtil.getUncrossedSymbols(word1, word2);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetTwoArraysIdentical() {
        return Stream.of(
                Arguments.of(new String[]{"MA", "MA", "Ma"}, new String[]{"MA", "MA", "Ma"}, true),
                Arguments.of(new String[]{"abc", "abcd", "abc"}, new String[]{"abc", "abc", "abc"}, false),
                Arguments.of(new String[]{"abc", "abc"}, new String[]{"18", "81"}, false),
                Arguments.of(new String[]{"abc", "ab", "abc"}, new String[]{"abc", "abc", "ab"}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetTwoArraysIdentical")
    void testGetTwoArraysIdentical(String[] word1, String[] word2, boolean expected) {

        Boolean actual = stringUtil.getTwoArraysIdentical(word1, word2);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetReplaceIdenticalCharacters() {
        return Stream.of(
                Arguments.of("qqqwwweee", "qwe"),
                Arguments.of("q11q22q33", "q11q22q33"),
                Arguments.of("a", "a"),
                Arguments.of("dddd", "d")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetReplaceIdenticalCharacters")
    void testGetReplaceIdenticalCharacters(String text, String expected) {

        String actual = stringUtil.getReplaceIdenticalCharacters(text);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetMultipleAdditionOfStrings() {
        return Stream.of(
                Arguments.of("123", "321", true),
                Arguments.of("abc", "abc", false),
                Arguments.of("18", "81", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetMultipleAdditionOfStrings")
    void testGetMultipleAdditionOfStrings(String string1, String string2, boolean expected) {

        Boolean actual = stringUtil.getMultipleAdditionOfStrings(string1, string2);

        Assertions.assertEquals(expected, actual);
    }
}
