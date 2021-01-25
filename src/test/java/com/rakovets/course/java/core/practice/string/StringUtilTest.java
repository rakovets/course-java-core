package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

//task01
class StringUtilTest {
    static Stream<Arguments> concatProviderArguments() {
        return Stream.of(
                Arguments.of("HelloJava", "Hello", "Java"),
                Arguments.of("Java", "", "Java"),
                Arguments.of("Hello", "Hello", "")
        );
    }

    @ParameterizedTest
    @MethodSource("concatProviderArguments")
    void getOneStringOfTwo(String expectedString, String str1, String str2) {
        String actualString = StringUtil.getOneStringOfTwo(str1, str2);
        Assertions.assertEquals(expectedString, actualString);
    }

    //Task02
    static Stream<Arguments> findIndexProviderArguments() {
        return Stream.of(
                Arguments.of(7, "v", "Hello everybody!"),
                Arguments.of(-1, "z", "Good job!"),
                Arguments.of(5, "a", " You are velcom  ")
        );
    }

    @ParameterizedTest
    @MethodSource("findIndexProviderArguments")
    void getIndexOfChar(int expectedIndex, char c, String str) {
        int actualIndex = StringUtil.getIndexOfChar(c, str);
        Assertions.assertEquals(expectedIndex, actualIndex);
    }

    //task03
    static Stream<Arguments> equalsProviderArguments() {
        return Stream.of(
                Arguments.of(true, "How do you do?", "How do you do?"),
                Arguments.of(false, " How do you do?", "How do you do?"),
                Arguments.of(false, "How Do you do?", "How do you do?"),
                Arguments.of(false, " ", "How do you do?")
        );
    }

    @ParameterizedTest
    @MethodSource("equalsProviderArguments")
    void isEqualsTwoStrings(boolean expectedValue, String str1, String str2) {
        boolean actualValue = StringUtil.isEqualsTwoStrings(str1, str2);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    //task04
    static Stream<Arguments> trimProviderArguments() {
        return Stream.of(
                Arguments.of("HOW DO YOU DO?", "How Do you do?"),
                Arguments.of("HOW DO YOU DO?", "  How do yoU do?   "),
                Arguments.of("HOW   DO YOU DO?", "How   do yoU do? "),
                Arguments.of("HOW   DO YOU DO?", "   How   do yoU do?")
        );
    }

    @ParameterizedTest
    @MethodSource("trimProviderArguments")
    void getTrimAndLowerCase(String expectedString, String str) {
        String actualString = StringUtil.getTrimAndLowerCase(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    //task05
    static Stream<Arguments> getSubProviderArguments() {
        return Stream.of(
                Arguments.of("o you do?", "how do you do?", 5),
                Arguments.of("would be nice to get 10", "It would be nice to get 10 points for homework", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("getSubProviderArguments")
    void getPartOfString(String expectedString, String str, int start) {
        String actualString = StringUtil.getPartOfString(str, start);
        Assertions.assertEquals(expectedString, actualString);
    }

    //task06
    static Stream<Arguments> ReplaceProviderArguments() {
        return Stream.of(
                Arguments.of("Hop hei :) halalej :)", "Hop hei :( halalej :)"),
                Arguments.of(":):):)", ":):(:("),
                Arguments.of(" ", " ")
        );
    }

    @ParameterizedTest
    @MethodSource("ReplaceProviderArguments")
    void replaceSmiles(String expectedString, String str) {
        String actualString = StringUtil.replaceSmiles(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    //task07
    static Stream<Arguments> ProvideArgumentsForStartAndEndWordMethod() {
        return Stream.of(
                Arguments.of(true, "hello It would be nice to get 10 points for homework hello", "hello"),
                Arguments.of(false, "hello It would be nice to get 10 points for homework", "hello"),
                Arguments.of(false, " It would be nice to get 10 points for homework hello", "hello"),
                Arguments.of(false, "It would be nice to get 10 points for homework", "hello"),
                Arguments.of(false, "Hello It would be nice to get 10 points for homework hello", "hello")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForStartAndEndWordMethod")
    void startAndEndWord(boolean expected, String str1, String word) {
        boolean actual = StringUtil.startAndEndWord(str1, word);
        Assertions.assertEquals(expected, actual);
    }

    //task08
    static Stream<Arguments> ProvideArgumentsForGetVowelsMethod() {
        return Stream.of(
                Arguments.of(14, "it would be nice to get 10 points for homework"),
                Arguments.of(0, "ddd 55 fff"),
                Arguments.of(0, " "),
                Arguments.of(14, "It woUld be nice to get 10 points for homEwork")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForGetVowelsMethod")
    void getVowels(int expected, String str) {
        int actual = StringUtil.getVowels(str);
        Assertions.assertEquals(expected, actual);
    }

    //task09
    static Stream<Arguments> ProvideArgumentsForgetSumOfSymbolsMethod() {
        return Stream.of(
                Arguments.of(9, "A man!, .a p!l,an.. a c,anal-Pa!nama"),
                Arguments.of(1, "A man, a plan a canal-Panama"),
                Arguments.of(0, "A man a plan a canal-Panama")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForgetSumOfSymbolsMethod")
    void isPalindrome(int expected, String str) {
        int actual = StringUtil.getSumOfSymbols(str);
        Assertions.assertEquals(expected, actual);
    }

    //task10
    static Stream<Arguments> ProvideArgumentsForPalindromeMethod() {
        return Stream.of(
                Arguments.of(true, "A man, a plan a canal-Panama"),
                Arguments.of(true, "A man, a plan a canal-Panama  "),
                Arguments.of(false, "A man, aa plan a canal-Panama")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForPalindromeMethod")
    void isPalindrome(boolean expected, String str) {
        boolean actual = StringUtil.isPalindrome(str);
        Assertions.assertEquals(expected, actual);
    }

    //task11
    static Stream<Arguments> ProvideArgumentsForGetPartsOfStringMethod() {
        return Stream.of(
                Arguments.of(new String[] {"How", " ar", "e y", "ou?"}, "How are you?", 3),
                Arguments.of(new String[] {"12", "34", "5"}, "12345", 2),
                Arguments.of(new String[] {"t", "o", "d", "a", "y"}, "today", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForGetPartsOfStringMethod")
    void getPartsOfString(String[] expected, String str, int parts) {
        String[] actual = StringUtil.getPartsOfString(str, parts);
        Assertions.assertArrayEquals(expected, actual);
    }

    //task12
    static Stream<Arguments> ProvideArgumentsForGetNumberOfWordsMethod() {
        return Stream.of(
                Arguments.of(3, "How are you?"),
                Arguments.of(4, "How are you, bro?"),
                Arguments.of(3, "How  are   you?"),
                Arguments.of(5, "How are you, 234 bro?"),
                Arguments.of(1, "How"),
                Arguments.of(0, " ")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForGetNumberOfWordsMethod")
    void getNumberOfWords(int expected, String str) {
        int actual = StringUtil.getNumberOfWords(str);
        Assertions.assertEquals(expected, actual);
    }

    //task13
    static Stream<Arguments> ProvideArgumentsForGetFlMethod() {
        return Stream.of(
                Arguments.of("DR", "DmitRY RakOVets"),
                Arguments.of("YF", "Yauhen filiau")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForGetFlMethod")
    void getFl(String expected, String str) {
        String actual = StringUtil.getFl(str);
        Assertions.assertEquals(expected, actual);
    }

    //task14
    static Stream<Arguments> ProvideArgumentsForGetNumeralMethod() {
        return Stream.of(
                Arguments.of("54", "aaa bbb 5 ccc 4"),
                Arguments.of("6", "aaa  bbbb 6 ccccc"),
                Arguments.of("543278", "aaa54aa bbb32 78ccc")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForGetNumeralMethod")
    void getNumeral(String expected, String str) {
        String actual = StringUtil.getNumeral(str);
        Assertions.assertEquals(expected, actual);
    }

    //task15
    static Stream<Arguments> ProvideArgumentsForGetNoRepeatingCharsMethod() {
        return Stream.of(
                Arguments.of("frnvt", "information", "motivation"),
                Arguments.of("hellgod", "hello", "good"),
                Arguments.of("dogcat", "dog", "cat"),
                Arguments.of("cat", "", "cat")

        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForGetNoRepeatingCharsMethod")
    void getNoRepeatingChars(String expected, String str1, String str2) {
        String actual = StringUtil.getNoRepeatingChars(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    //task16
    static Stream<Arguments> ProvideArgumentsForIsIdenticallyMethod() {
        return Stream.of(
                Arguments.of(true, new String[] {"3", "7", "5", "8"}, new String[] {"8", "3", "5", "7"}),
                Arguments.of(true, new String[] {"Hello", "Good", "Bue"}, new String[] {"Good", "Hello", "Bue"}),
                Arguments.of(false, new String[] {"Hello", "Good", "Bue"}, new String[] {"HelloO", "Good", "Bue"})
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForIsIdenticallyMethod")
    void isIdentically(boolean expected, String[] str1, String[] str2) {
        boolean actual = StringUtil.isIdentically(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    //task17
    public static void main(String[] args) {
        System.out.println("Test01. Concat speed - Append speed: " + StringUtil.getSpeedOfString(10));
        System.out.println("Test02. Concat speed - Append speed: " + StringUtil.getSpeedOfString(100));
        System.out.println("Test03. Concat speed - Append speed: " + StringUtil.getSpeedOfString(1000));
        System.out.println("Test04. Concat speed - Append speed: " + StringUtil.getSpeedOfString(10000));
        System.out.println("Test05. Concat speed - Append speed: " + StringUtil.getSpeedOfString(100000));
    }

    //task18
    static Stream<Arguments> ProvideArgumentsForRemoveRepeatsMethod() {
        return Stream.of(
                Arguments.of("abcdef", "aaabbcdeef"),
                Arguments.of("a", "aaa"),
                Arguments.of(" ", "  "),
                Arguments.of("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForRemoveRepeatsMethod")
    void removeRepeats(String expected, String str) {
        String actual = StringUtil.removeRepeats(str);
        Assertions.assertEquals(expected, actual);
    }

    //task 19
    static Stream<Arguments> ProvideArgumentsForRomanToArabicMethod() {
        return Stream.of(
                Arguments.of("1512", "DDDXII"),
                Arguments.of("410", "CDX"),
                Arguments.of("9", "IX"),
                Arguments.of("900", "CM")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForRomanToArabicMethod")
    void romanToArabic(int expected, String str) {
        int actual = StringUtil.romanToArabic(str);
        Assertions.assertEquals(expected, actual);
    }
}
