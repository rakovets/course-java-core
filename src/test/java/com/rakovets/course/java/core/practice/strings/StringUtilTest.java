package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();
    static Stream<Arguments> provideArgumentsForGlueStrings() {
        return Stream.of(
                Arguments.of("012345", "678910", "012345678910"),
                Arguments.of("", "678", "678"),
                Arguments.of(" ", "678 ", " 678 "),
                Arguments.of("0123", " ", "0123 "),
                Arguments.of("", "", ""),
                Arguments.of(" ", " ", "  "),
                Arguments.of(null, " ", "null "),
                Arguments.of(null, null, "nullnull")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGlueStrings")
    public void testGlueStrings(String string1, String string2, String expected) {
        String actual = stringUtil.glueStrings(string1, string2);

        Assertions.assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsForGetIndexOfSymbolOfSymbolInString() {
        return Stream.of(
                Arguments.of("abcdef", 'e', 4),
                Arguments.of("abcdef", 'E', -1),
                Arguments.of("abcdff", 'e', -1),
                Arguments.of("", 'e', -1),
                Arguments.of(" ", 'e', -1),
                Arguments.of("14", (char) 15, -1),
                Arguments.of("141", '1', 0),
                Arguments.of("aecdef", 'e', 1),
                Arguments.of("ab ef", 'e', 3),
                Arguments.of(null, 'e', -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetIndexOfSymbolOfSymbolInString")
    public void testGetIndexOfSymbolInString(String string, char symbol, int expected) {
        int actual = stringUtil.getIndexOfSymbolInString(string, symbol);

        Assertions.assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsForIsStringsTheSame() {
        return Stream.of(
                Arguments.of("abcde", "abcde", true),
                Arguments.of("abcde", "ABCDE", false),
                Arguments.of("ABCDE", "abcde", false),
                Arguments.of("abcde", "abcd", false),
                Arguments.of("abcd", "abcde", false),
                Arguments.of("abcde", "", false),
                Arguments.of("", "abcde", false),
                Arguments.of("", "", true),
                Arguments.of(null, "abcde", false),
                Arguments.of("", null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsStringsTheSame")
    public void testIsStringsTheSame(String string1, String string2, boolean expected) {
        boolean actual = stringUtil.isStringsTheSame(string1, string2);

        Assertions.assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsForTrimStringAndUpperCase() {
        return Stream.of(
                Arguments.of(" abcd ", "ABCD"),
                Arguments.of("abcd ", "ABCD"),
                Arguments.of(" abcd", "ABCD"),
                Arguments.of("abcd", "ABCD"),
                Arguments.of("  ", ""),
                Arguments.of(" ", ""),
                Arguments.of("", ""),
                Arguments.of(" ABCD ", "ABCD"),
                Arguments.of(" 00 ", "00"),
                Arguments.of(" abCD ", "ABCD"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTrimStringAndUpperCase")
    public void testTrimStringAndUpperCase(String string, String expected) {
        String actual = stringUtil.trimStringAndUpperCase(string);

        Assertions.assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsForExtractSubstringFromSymbolToSymbol() {
        return Stream.of(
                Arguments.of("abcdef", 'a', 'b', "a"),
                Arguments.of("abcdef", 'a', 'f', "abcde"),
                Arguments.of("abcdef", 'e', 'f', "e"),
                Arguments.of("abcdef", 'a', 'a', ""),
                Arguments.of("abcdef", 'f', 'f', ""),
                Arguments.of("abcdef", 'c', 'd', "c"),
                Arguments.of(null, 'c', 'd', null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForExtractSubstringFromSymbolToSymbol")
    public void testExtractSubstringFromSymbolToSymbol(String string, char symbolStart, char symbolEnd, String expected) {
        String actual = stringUtil.extractSubstringFromSymbolToSymbol(string, symbolStart, symbolEnd);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForReplaceEmojiInString() {
        return Stream.of(
                Arguments.of("abc:(def", "abc:)def"),
                Arguments.of("abc:(:(def", "abc:):)def"),
                Arguments.of("abc:((def", "abc:)(def"),
                Arguments.of("abc:((:def", "abc:)(:def"),
                Arguments.of("abc:(def:(", "abc:)def:)"),
                Arguments.of("abcdef", "abcdef"),
                Arguments.of(":(abcdef", ":)abcdef"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForReplaceEmojiInString")
    public void testReplaceEmojiInString(String beforeReplacement, String expected) {

        String actual = stringUtil.replaceEmojiInString(beforeReplacement);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsStringStartsWithThisWord() {
        return Stream.of(
                Arguments.of("abc def", "abc", true),
                Arguments.of(" abc def", "abc", false),
                Arguments.of("yyy abc", "abc", false),
                Arguments.of("abcdef", "abc", true),
                Arguments.of("abc_def", "abc", true),
                Arguments.of("ttt abc def", "abc", false),
                Arguments.of(null, "abc", false),
                Arguments.of("abc_def", null, false),
                Arguments.of(null, null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsStringStartsWithThisWord")
    public void testIsStringStartsWithThisWord(String string, String word, boolean expected) {

        boolean actual = stringUtil.isStringStartsWithThisWord(string, word);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetNumberOfEnglishVowels() {
        return Stream.of(
                Arguments.of("abcdef", 2),
                Arguments.of("bcdf", 0),
                Arguments.of("", 0),
                Arguments.of("Abcdef", 2),
                Arguments.of("bcdEf", 1),
                Arguments.of("abc def", 2),
                Arguments.of("aAbcdef", 3),
                Arguments.of("a bcd tt Eef e", 4),
                Arguments.of(null, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetNumberOfEnglishVowels")
    public void testGetNumberOfEnglishVowels(String string, int expected) {

        int actual = stringUtil.getNumberOfEnglishVowels(string);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetNumberOfPunctuationMarks() {
        return Stream.of(
                Arguments.of("", 0),
                Arguments.of("abcd", 0),
                Arguments.of(".abcd.", 2),
                Arguments.of("! abcd ?", 2),
                Arguments.of(",abcd ,?!adcd", 4),
                Arguments.of(".,?!", 4),
                Arguments.of("aAb.,?!ef", 4),
                Arguments.of("!! ab ,, cd ?? ef !!", 8),
                Arguments.of(null, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetNumberOfPunctuationMarks")
    public void testGetNumberOfPunctuationMarks(String string, int expected) {

        int actual = stringUtil.getNumberOfPunctuationMarks(string);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsStringPalindrome() {
        return Stream.of(
                Arguments.of(" ", true),
                Arguments.of("abcd", false),
                Arguments.of(".abba .", true),
                Arguments.of("!  a bba ?", false),
                Arguments.of(" a Bcd.tt  .  dcba", true),
                Arguments.of(" abcd. !t .dCba ", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsStringPalindrome")
    public void testIsStringPalindrome(String string, boolean expected) {
        boolean actual = stringUtil.isStringPalindrome(string);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSplitStringForEqualParts() {
        return Stream.of(
                Arguments.of("abaaaaaaaaataa", 3, 0, "aba"),
                Arguments.of("abaaaaaaaaataa", 3, 1, "aaa"),
                Arguments.of("abaaaaacaaataa", 3, 2, "aca"),
                Arguments.of("abaaaaaaaaataa", 3, 3, "aat"),
                Arguments.of("_aba_aaaaaaaataa", 4, 0, "_aba"),
                Arguments.of("_aba_aaaaaaaataa", 4, 1, "_aaa"),
                Arguments.of("_aba_aaaaaaaataa", 4, 2, "aaaa"),
                Arguments.of("_aba_aaaaaaaataa", 4, 3, "ataa"),
                Arguments.of("     aaaaaaaataa", 5, 0, "     ")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSplitStringForEqualParts")
    public void testSplitStringForEqualParts(String string, int numberOfSymbols, int numberOfWord, String expected) {
        String[] stringArray = stringUtil.splitStringForEqualParts(string, numberOfSymbols);
        String actual = new String(stringArray[numberOfWord]);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetNumbersOfWordsInString() {
        return Stream.of(
                Arguments.of(" aba,    aaaaaaa  ataa.", 3),
                Arguments.of(" aba A   h;", 3),
                Arguments.of(" ataa!", 1),
                Arguments.of("", 0),
                Arguments.of(" Xaba   aaaaaAa  atDa?", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetNumbersOfWordsInString")
    public void testGetNumbersOfWordsInString(String string, int expected) {
        int actual = stringUtil.getNumbersOfWordsInString(string);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetFirstLettersOfNameAndSurname() {
        return Stream.of(
                Arguments.of("Виктор Полонников", "ВП"),
                Arguments.of("Victor Polonnikov", "VP"),
                Arguments.of(" Victor Polonnikov 2022", "VP"),
                Arguments.of("victor Polonnikov", "VP"),
                Arguments.of("Victor polonnikov", "VP"),
                Arguments.of("victor polonnikov", "VP")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetFirstLettersOfNameAndSurname")
    public void testGetFirstLettersOfNameAndSurname(String string, String expected) {
        String actual = stringUtil.getFirstLettersOfNameAndSurname(string);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetOnlyNumberFromString() {
        return Stream.of(
                Arguments.of(" a1a   aaaaaaa  ata1 ", "11"),
                Arguments.of(" aa   aaaaaaa  ata ", ""),
                Arguments.of(" 1e2 3 4 5 y6789 t10", "12345678910"),
                Arguments.of(" 9d 8 7 6 5 e4 3_ 2mm 1", "987654321"),
                Arguments.of("00000 f00000 1", "00000000001")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetOnlyNumberFromString")
    public void testGetOnlyNumberFromString(String string, String expected) {
        String actual = stringUtil.getOnlyNumberFromString(string);

        Assertions.assertEquals(expected, actual);
    }
}
