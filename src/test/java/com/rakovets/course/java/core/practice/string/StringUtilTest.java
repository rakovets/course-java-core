package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {
    static Stream<Arguments> provideArgumentsForConcatenate() {
        return Stream.of(
                Arguments.of("", "", ""),
                Arguments.of("25", "6", "256"),
                Arguments.of("", "hello", "hello"),
                Arguments.of("JavaScript", "", "JavaScript"),
                Arguments.of(null, "2", null),
                Arguments.of("3", null, null)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForConcatenate")
    void glueStringTest(String str1, String str2, String expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.glueString(str1, str2));
    }

    static Stream<Arguments> provideArgumentsForFindIndexSymbol() {
        return Stream.of(
                Arguments.of('x', "hello spacex", 11),
                Arguments.of('x', "hello spaceX", -1),
                Arguments.of('x', null, -1),
                Arguments.of('x', "maxim", 2),
                Arguments.of('x', "xor", 0),
                Arguments.of('x', "ixix", 1)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForFindIndexSymbol")
    void findIndexSymbolTest(char symbol, String workString, int expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.findIndexSymbol(symbol, workString));
    }

    static Stream<Arguments> provideArgumentsForEqualsString() {
        return Stream.of(
                Arguments.of(null, "hello", false),
                Arguments.of("hello", null, false),
                Arguments.of("hello", "hello", true),
                Arguments.of("hello", "Hello", false),
                Arguments.of("Hello", "Hello", true),
                Arguments.of("Hello", "HELLO", false),
                Arguments.of("Hello ", "HELLO", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForEqualsString")
    void equalsStringTest(String str1, String str2, boolean expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.equalsString(str1, str2));
    }

    static Stream<Arguments> provideArgumentsForTrim() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of("  my ", "my"),
                Arguments.of("Hello world ", "Hello world"),
                Arguments.of("  Perfect world   ", "Perfect world"),
                Arguments.of("dead walking", "dead walking")
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTrim")
    void trimTest(String str1, String expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.trim(str1));
    }

    static Stream<Arguments> provideArgumentsForToLowerCase() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of("Hello", "hello"),
                Arguments.of("HELLO", "hello"),
                Arguments.of("my name ", "my name "),
                Arguments.of("Big BoY", "big boy"),
                Arguments.of("This IS FIlm", "this is film")
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForToLowerCase")
    void toLowerCaseTest(String str1, String expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.toLowerCase(str1));
    }

    static Stream<Arguments> provideArgumentsForExtractSubString() {
        return Stream.of(
                Arguments.of(0, 0, "My string", null),
                Arguments.of(3, 1, "My string", "My"),
                Arguments.of(1, 3, "My string", "My"),
                Arguments.of(1, 6, "hello", "hello"),
                Arguments.of(1, 7, "hello", null),
                Arguments.of(1, 1, "String", ""),
                Arguments.of(-1, 5, "My string", null),
                Arguments.of(-7, -3, "My string", null)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForExtractSubString")
    void extractTest(int startSymbol, int finishSymbol, String workString, String expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.extract(startSymbol, finishSymbol, workString));
    }

    static Stream<Arguments> provideArgumentsForReplaceSmile() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of("how are you :(", "how are you :)"),
                Arguments.of("how are you : (", "how are you : ("),
                Arguments.of("smile :) smile", "smile :) smile"),
                Arguments.of("(hello: world)", "(hello: world)")
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForReplaceSmile")
    void replaceSmileTest(String workString, String expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.replaceSmile(workString));
    }

    static Stream<Arguments> provideArgumentsForStartAndEnd() {
        return Stream.of(
                Arguments.of(null, null, false),
                Arguments.of("hellih", "h", true),
                Arguments.of("word word", "word", true),
                Arguments.of("word word ", "word", false),
                Arguments.of(null, "word", false),
                Arguments.of("null", null, false),
                Arguments.of("world in world", "world", true)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForStartAndEnd")
    void startAndEndTest(String text, String word, boolean expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.startAndEnd(text, word));
    }

    static Stream<Arguments> provideArgumentsForFindCountEnglishLetters() {
        return Stream.of(
                Arguments.of("eyuio", 5),
                Arguments.of("EYUIOA", 6),
                Arguments.of("EyOa", 4),
                Arguments.of("fghOisvaAf", 4),
                Arguments.of(null, -1),
                Arguments.of("fghOisvaAf asid", 6),
                Arguments.of("qwrt", 0),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForFindCountEnglishLetters")
    void findCountEnglishLettersTest(String text, int expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.findCountEnglishLetters(text));
    }

    static Stream<Arguments> provideArgumentsForFindCountPunctuationSymbol() {
        return Stream.of(
                Arguments.of("heey, john", 1),
                Arguments.of(null, -1),
                Arguments.of(", , , ! . ?", 6),
                Arguments.of("Usual text", 0),
                Arguments.of("", 0),
                Arguments.of("How are you?", 1)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForFindCountPunctuationSymbol")
    void findCountPunctuationSymbolTest(String text, int expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.findCountPunctuationSymbol(text));
    }

    static Stream<Arguments> provideArgumentsForIsPalindrome() {
        return Stream.of(
                Arguments.of("Do geese see God?", true),
                Arguments.of("de,ed", true),
                Arguments.of("", true),
                Arguments.of(null, false),
                Arguments.of("1991", true),
                Arguments.of("reek", false)

        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForIsPalindrome")
    void isPalindromeTest(String text, boolean expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.isPalindrome(text));
    }

    static Stream<Arguments> provideArgumentsForSplitString() {
        return Stream.of(
                Arguments.of("asdpfd", 3, new ArrayList<>(Arrays.asList("asd", "pfd"))),
                Arguments.of(null, 3, null),
                Arguments.of("ki ppit", 3, new ArrayList<>(Arrays.asList("ki ", "ppi", "t"))),
                Arguments.of(" roll ", 3, new ArrayList<>(Arrays.asList(" ro", "ll "))),
                Arguments.of("jdfs", 0, null),
                Arguments.of("jdfs", 7, new ArrayList<>(Arrays.asList("jdfs")))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForSplitString")
    void splitStringTest(String text, int n, ArrayList<String> expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.splitString(text, n));
    }

    static Stream<Arguments> provideArgumentsForFindCountSpace() {
        return Stream.of(
                Arguments.of("?   123 43", 3),
                Arguments.of(" ", 0),
                Arguments.of(null, -1),
                Arguments.of(" word one", 2)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForFindCountSpace")
    void findCountSpaceTest(String text, int expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.findCountSpace(text));
    }

    static Stream<Arguments> provideArgumentsForGetInitial() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of("Alexei Dyubenkov", "AD"),
                Arguments.of("alexei dyubenkov", "AD"),
                Arguments.of("Alexei   Dyubenkov", "AD"),
                Arguments.of(" Alexei  Dyubenkov ", "AD"),
                Arguments.of("Alexei", null)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForGetInitial")
    void getInitialTest(String text, String expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.getInitial(text));
    }

    static Stream<Arguments> provideArgumentsForGetAllDigits() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of("Empty number", ""),
                Arguments.of("This digit 1 but this number 194", "1194"),
                Arguments.of("1294", "1294")
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForGetAllDigits")
    void getAllDigitsTest(String text, String expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.getAllDigits(text));
    }

    static Stream<Arguments> provideArgumentsForGetIndividualSymbol() {
        return Stream.of(
                Arguments.of("information", "motivation", "nfrtv"),
                Arguments.of(null, "", null),
                Arguments.of("", null, null),
                Arguments.of("info", "info", ""),
                Arguments.of("Hello", "Java", "HeloJav")
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForGetIndividualSymbol")
    void getIndividualSymbolTest(String str1, String str2,String expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.getIndividualSymbol(str1, str2));
    }

    static Stream<Arguments> provideArgumentsForEqualsArrayString() {
        return Stream.of(
                Arguments.of(new String[] {"Winter", "Spring", "Summer", "Autumn"},
                        new String[] {"Spring", "Winter", "Summer", "Autumn"}, true),
                Arguments.of(new String[] {"hello", "people", "word"}, new String[] {"hello", "people"}, false),
                Arguments.of(null, new String[] {"Perfect", "world"}, false),
                Arguments.of(new String[] {"Perfect", "world"}, null, false),
                Arguments.of(new String[] {"Perfect", "world"}, new String[] {"Perfect", "word"}, false)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForEqualsArrayString")
    void equalsArrayStringTest(String[] str1, String[] str2, boolean expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.equalsArrayString(str1, str2));
    }

    static Stream<Arguments> provideArgumentsForReplaceSerialSymbol() {
        return Stream.of(
                Arguments.of("aabccc", "abc"),
                Arguments.of(null, null),
                Arguments.of("aaaf77f2433ggg", "af7f243g"),
                Arguments.of("", ""),
                Arguments.of("abc aabbcdd", "abc abcd")
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForReplaceSerialSymbol")
    void replaceSerialSymbolTest(String text, String expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.replaceSerialSymbol(text));
    }

    static Stream<Arguments> provideArgumentsForTransformRomeNumberInArabic() {
        return Stream.of(
                Arguments.of("CM", 900),
                Arguments.of("XIV", 14),
                Arguments.of("XII", 12),
                Arguments.of("LXXXVIII", 88),
                Arguments.of(null, -1),
                Arguments.of("cM", -1),
                Arguments.of("CXXXIV", 134),
                Arguments.of("CMXCVIII", 998)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForTransformRomeNumberInArabic")
    void transformRomeNumberInArabicTest(String text, int expected) {
        StringUtil stringUtil = new StringUtil();
        assertEquals(expected, stringUtil.transformRomeNumberInArabic(text));
    }
}
