package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringUtilTest {

    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("123", "321", "123321"),
                Arguments.of("", "321", "321"),
                Arguments.of("123", "", "123"),
                Arguments.of(null, "321", "null321"),
                Arguments.of("123", null, "123null")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testConcat(String str1, String str2, String expected) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.concat(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsIndexOf() {
        return Stream.of(
                Arguments.of("abcdef", 'b', 1),
                Arguments.of("abcdef", 'g', -1),
                Arguments.of("hanna", 'n', 2),
                Arguments.of("cat!", '!', 3),
                Arguments.of(" 123", ' ', 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsIndexOf")
    void testGetCharAt(String str, char c, int expexted) {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.getIndexOfCharAt(str, c);
        Assertions.assertEquals(expexted, actual);
    }

    static Stream<Arguments> provideArgumentsTwoStringSame() {
        return Stream.of(
                Arguments.of("abc", "abc", true),
                Arguments.of("abc", "aac", false),
                Arguments.of("hanna", "Hanna", false),
                Arguments.of("cat!", "cat!", true),
                Arguments.of(" 123Asn, 123", " 123Asn, 123", true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTwoStringSame")
    void testGetTwoStringSame(String str1, String str2, boolean expexted) {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.getTwoStringSame(str1, str2);
        Assertions.assertEquals(expexted, actual);
    }

    static Stream<Arguments> provideArgumentsTrimStringLowerCase() {
        return Stream.of(
                Arguments.of("   abc   ", "abc"),
                Arguments.of("Abc     ", "abc"),
                Arguments.of("Hanna", "hanna"),
                Arguments.of("    CAT!", "cat!"),
                Arguments.of("  123Asn, 123   ", "123asn, 123")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTrimStringLowerCase")
    void testGetTwoStringSame(String str, String expexted) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.getTrimStringLowerCase(str);
        Assertions.assertEquals(expexted, actual);
    }

    static Stream<Arguments> provideArgumentsSubString() {
        return Stream.of(
                Arguments.of(1, 3, "abcd", "abc"),
                Arguments.of(4, 4, "abcDEF", "D"),
                Arguments.of(3, 6, "abc DEF", "c DE"),
                Arguments.of(1, 2, "abcd", "ab")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsSubString")
    void testGetSubString(int a, int b, String str, String expexted) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.getSubString(a, b, str);
        Assertions.assertEquals(expexted, actual);
    }

    static Stream<Arguments> provideArgumentsReplaceEmoji() {
        return Stream.of(
                Arguments.of(":(", ":)"),
                Arguments.of(":):(", ":):)"),
                Arguments.of(":(abc :)DEF:(", ":)abc :)DEF:)"),
                Arguments.of(":( ? :(", ":) ? :)")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsReplaceEmoji")
    void testGetSubString(String str, String expexted) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.getReplaceEmoji(str);
        Assertions.assertEquals(expexted, actual);
    }

    static Stream<Arguments> provideArgumentsStarAndEndWithWord() {
        return Stream.of(
                Arguments.of("My name My", "My", true),
                Arguments.of("My name My", "my", false),
                Arguments.of("my name My", "my", false),
                Arguments.of("My name my", "my", false),
                Arguments.of(" my name my", "my", false),
                Arguments.of("my name my ", "my", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsStarAndEndWithWord")
    void testGetSubString(String text, String word, boolean expexted) {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.getStarAndEndWithWord(text, word);
        Assertions.assertEquals(expexted, actual);
    }

    static Stream<Arguments> provideArgumentsNumberOfEnglishVowels() {
        return Stream.of(
                Arguments.of("My name My", 4),
                Arguments.of("My nAme MY", 4),
                Arguments.of("IAE iea", 6),
                Arguments.of("M nm m", 0),
                Arguments.of("I", 1),
                Arguments.of("ymy ", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsNumberOfEnglishVowels")
    void testGetSubString(String str, int expexted) {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.getNumberOfEnglishVowels(str);
        Assertions.assertEquals(expexted, actual);
    }

    static Stream<Arguments> provideArgumentsNumberOfPunctuationMarks() {
        return Stream.of(
                Arguments.of("My, name My", 1),
                Arguments.of("My, nAme. MY?", 3),
                Arguments.of("IAE iea", 0),
                Arguments.of("M! !nm! m!", 4),
                Arguments.of("I, i, i.", 3),
                Arguments.of(",.!? ", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsNumberOfPunctuationMarks")
    void testGetNumberOfPunctuationMarks(String str, int expexted) {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.getNumberOfPunctuationMarks(str);
        Assertions.assertEquals(expexted, actual);
    }

    static Stream<Arguments> provideArgumentsStrIsPalindrom() {
        return Stream.of(
                Arguments.of("MyMym", true),
                Arguments.of("MyMY", false),
                Arguments.of("IAE iea", false),
                Arguments.of("M! !M", true),
                Arguments.of("deed", true),
                Arguments.of("1991", true),
                Arguments.of("Do geese see God?", true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsStrIsPalindrom")
    void testGetNumberOfPunctuationMarks(String str, boolean expexted) {
        StringUtil stringUtil = new StringUtil();
        boolean actual = stringUtil.getStrIsPalindrome(str);
        Assertions.assertEquals(expexted, actual);
    }

    static Stream<Arguments> provideArgumentsSplitStr() {
        return Stream.of(
                Arguments.of("MyMymm", 2, new String[]{"My", "My", "mm"}),
                Arguments.of("My name is Hanna", 4, new String[]{"My n", "ame ", "is H", "anna"}),
                Arguments.of("My name is Hanna", 0, new String[]{"My name is Hanna"})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsSplitStr")
    void testGetSplitStr(String str, int n, String[] expexted) {
        StringUtil stringUtil = new StringUtil();
        String[] actual = stringUtil.getSplitStr(str, n);
        Assertions.assertEquals(Arrays.toString(expexted), Arrays.toString(actual));
    }

    static Stream<Arguments> provideArgumentsNumberOfWordInText() {
        return Stream.of(
                Arguments.of("My My mm", 3),
                Arguments.of("My name is  Hanna", 4),
                Arguments.of("  My     name is Hanna       ", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsNumberOfWordInText")
    void testGetSplitStr(String str, int expexted) {
        StringUtil stringUtil = new StringUtil();
        int actual = stringUtil.getNumberOfWordInText(str);
        Assertions.assertEquals(expexted, actual);
    }

    static Stream<Arguments> provideArgumentsNameLastname() {
        return Stream.of(
                Arguments.of("Hanna Kavaliova", "HK"),
                Arguments.of("hanna kavaliova", "HK"),
                Arguments.of("Anna Kavaliova Alexandrovna", "AK")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsNameLastname")
    void testNameLastname(String str, String expexted) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.getNameLastname(str);
        Assertions.assertEquals(expexted, actual);
    }

    static Stream<Arguments> provideArgumentsDigitalInText() {
        return Stream.of(
                Arguments.of("Hanna12 Kavaliova", "12"),
                Arguments.of("123hanna kavaliova345", "123345"),
                Arguments.of("Anna0 Kavaliova4 Alexandrovna5", "045")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsDigitalInText")
    void testDigitalInText(String str, String expexted) {
        StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.getDigitalInText(str);
        Assertions.assertEquals(expexted, actual);
    }
}
