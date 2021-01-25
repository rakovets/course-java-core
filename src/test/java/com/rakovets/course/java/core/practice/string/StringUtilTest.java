package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class StringUtilTest {
    //task1-test
    static Stream<Arguments> concatStringProviderArguments() {
        return Stream.of(
                Arguments.of("HelloJava", "Hello", "Java"),
                Arguments.of("Java", "", "Java"),
                Arguments.of("Hello", "Hello", "")
        );
    }

    @ParameterizedTest
    @MethodSource("concatStringProviderArguments")
    void concatString(String expectedString, String str1, String str2) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.concatString(str1, str2);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //task2-test
    static Stream<Arguments> findCharIndexProviderArguments() {
        return Stream.of(
                Arguments.of(4, "Basic", 'c'),
                Arguments.of(-1, "Basic", 'v'),
                Arguments.of(-1, "", 'c')
        );
    }

    @ParameterizedTest
    @MethodSource("findCharIndexProviderArguments")
    void findCharIndex(int expectedString, String str1, char ch1) {
        // GIVEN

        // WHEN
        int actualString = StringUtil.findSymbol(str1, ch1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //task3-test
    static Stream<Arguments> isStringsEqualProviderArguments() {
        return Stream.of(
                Arguments.of(true, "Basic", "Basic"),
                Arguments.of(false, "Basic", "basic"),
                Arguments.of(true, "", ""),
                Arguments.of(false, " ", "")
        );
    }

    @ParameterizedTest
    @MethodSource("isStringsEqualProviderArguments")
    void isStringEqual(boolean expectedString, String str1, String str2) {
        // GIVEN

        // WHEN
        boolean actualString = StringUtil.isStringsEqual(str1, str2);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //task4-test
    static Stream<Arguments> trimToUpperCaseProviderArguments() {
        return Stream.of(
                Arguments.of("BASIC", "  Basic  "),
                Arguments.of("BASIC", "Basic  "),
                Arguments.of("", ""),
                Arguments.of("", " ")
        );
    }

    @ParameterizedTest
    @MethodSource("trimToUpperCaseProviderArguments")
    void trimToUpperCase(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.trimToUpperCase(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //task5-test
    static Stream<Arguments> getSubstringFromSymbol10ProviderArguments() {
        return Stream.of(
                Arguments.of(" class-based, object-or", "Java is a class-based, object-oriented programming language"),
                Arguments.of(" class-based", "Java is a class-based"),
                Arguments.of("String is not long enough", ""),
                Arguments.of("String is not long enough", " "),
                Arguments.of("String is not long enough", "Java is a"),
                Arguments.of(" class-ba", "Java is a class-ba"),
                Arguments.of(" class-based, object-or", "Java is a class-based, object-or")
        );
    }

    @ParameterizedTest
    @MethodSource("getSubstringFromSymbol10ProviderArguments")
    void getSubstringFromSymbol10(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.getSubstringFromSymbol10(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //task6-test
    static Stream<Arguments> letSmileProviderArguments() {
        return Stream.of(
                Arguments.of("Hello:) How are you? :)", "Hello:( How are you? :("),
                Arguments.of("Hello:) my number(29)222-22-22", "Hello:( my number(29)222-22-22"),
                Arguments.of("(", "("),
                Arguments.of(":)", ":("),
                Arguments.of("", ""),
                Arguments.of(" ", " ")
        );
    }

    @ParameterizedTest
    @MethodSource("letSmileProviderArguments")
    void letSmile(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.letSmile(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //task7-test
    static Stream<Arguments> isSorroundedWordProviderArguments() {
        return Stream.of(
                Arguments.of(true, "Audi bmw Audi", "Audi"),
                Arguments.of(false, "Audi bmw Mercedes", "Audi"),
                Arguments.of(true, "Audi", "Audi", "Audi"),
                Arguments.of(false, "Mercedes Audi", "Audi"),
                Arguments.of(true, "", ""),
                Arguments.of(false, " ", ""),
                Arguments.of(false, "Audi", "")
        );
    }

    @ParameterizedTest
    @MethodSource("isSorroundedWordProviderArguments")
    void isSorroundedWord(Boolean expectedString, String str, String word) {
        // GIVEN

        // WHEN
        boolean actualString = StringUtil.isSurroundedWord(str, word);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //task8-test
    static Stream<Arguments> getVowelsQuantityProviderArguments() {
        return Stream.of(
                Arguments.of(3, "Audi"),
                Arguments.of(3, "Mercedes"),
                Arguments.of(0, ""),
                Arguments.of(0, "H"),
                Arguments.of(1, "A")
        );
    }

    @ParameterizedTest
    @MethodSource("getVowelsQuantityProviderArguments")
    void getVowelsQuantity(int expectedString, String str) {
        // GIVEN

        // WHEN
        int actualString = StringUtil.getVowelsQuantity(str);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //task9-test
    static Stream<Arguments> getMarksQuantityProviderArguments() {
        return Stream.of(
                Arguments.of(1, "Hello!"),
                Arguments.of(2, "Hello, my dear friend!"),
                Arguments.of(2, "Oh, here we go again."),
                Arguments.of(1, "."),
                Arguments.of(3, ",.!")
        );
    }

    @ParameterizedTest
    @MethodSource("getMarksQuantityProviderArguments")
    void getMarksQuantity(int expectedString, String str) {
        // GIVEN

        // WHEN
        int actualString = StringUtil.getMarksQuantity(str);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //task10-test
    static Stream<Arguments> isPalindromProviderArguments() {
        return Stream.of(
                Arguments.of(true, "\"Not New York\", - Roy went on"),
                Arguments.of(true, "Nurse, I spy gypsies run!"),
                Arguments.of(false, "Oh, here we go again."),
                Arguments.of(true, "Level"),
                Arguments.of(true, "")
        );
    }

    @ParameterizedTest
    @MethodSource("isPalindromProviderArguments")
    void isPalindrom(boolean expectedString, String str) {
        // GIVEN

        // WHEN
        boolean actualString = StringUtil.isPalindrom(str);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //task11-test
    static Stream<Arguments> getCharArrayProviderArguments() {
        return Stream.of(
                Arguments.of("[He, ll, o , my,  d, ea, r , fr, ie, nd]", "Hello my dear friend", 2),
                Arguments.of("[Me, rc, ed, es]", "Mercedes", 2),
                Arguments.of("[M, e, r, c, e, d, e, s]", "Mercedes", 1),
                Arguments.of("[]", "", 2),
                Arguments.of("[ ]", " ", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getCharArrayProviderArguments")
    void getCharArray(String expectedString, String str, int n) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.getCharArray(str, n);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //task12-test
    static Stream<Arguments> getWordsQuantityProviderArguments() {
        return Stream.of(
                Arguments.of(4, "Hello my dear friend"),
                Arguments.of(1, "   Java.   "),
                Arguments.of(3,"Audi,   Bmw,    Mercedes"),
                Arguments.of(0,"")
        );
    }

    @ParameterizedTest
    @MethodSource("getWordsQuantityProviderArguments")
    void getCharArray(int expectedString, String str) {
        // GIVEN

        // WHEN
        int actualString = StringUtil.getWordsQuantity(str);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //task13-test
    static Stream<Arguments> getfullNameProviderArguments() {
        return Stream.of(
                Arguments.of("D.E.V", "dunin", "eugene", "valery's"),
                Arguments.of("S.V.S", "satsukevich", "valery", "Sergey's"),
                Arguments.of("String is empty","","",""),
                Arguments.of(" . . "," ", " ", " ")
        );
    }

    @ParameterizedTest
    @MethodSource("getfullNameProviderArguments")
    void getfullName(String expectedString, String lastName, String firstName, String patronymic) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.getFullName(lastName, firstName, patronymic);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //task14-test
    static Stream<Arguments> getAllDigitsProviderArguments() {
        return Stream.of(
                Arguments.of("463745", "Audi A4, Mercedes S63, BMW 745Li"),
                Arguments.of("25051987", "25.05.1987"),
                Arguments.of("","")
        );
    }

    @ParameterizedTest
    @MethodSource("getAllDigitsProviderArguments")
    void getAllDigits(String expectedString, String str) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.getAllDigits(str);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
}
