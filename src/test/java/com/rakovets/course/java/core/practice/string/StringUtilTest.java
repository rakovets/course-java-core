package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class StringUtilTest {
    static Stream<Arguments> concatProviderArguments() {
        return Stream.of(
                Arguments.of("HelloJava", "Hello", "Java"),
                Arguments.of("Java", "", "Java"),
                Arguments.of("Hello", "Hello", "")
        );
    }

    @ParameterizedTest
    @MethodSource("concatProviderArguments")
    void concat(String expectedString, String str1, String str2) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.glue(str1,str2);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }


    static Stream<Arguments> foundXTest() {
        return Stream.of(
                Arguments.of("0", "hello"),
                Arguments.of("-1", ""),
                Arguments.of("3", "Lelho")
        );
    }

    @ParameterizedTest
    @MethodSource("foundXTest")
    void found1(int expectedString, String str1) {
        // GIVEN

        // WHEN
        int actualString = StringUtil.foundX(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> equalsValueTest() {
        return Stream.of(
                Arguments.of("true", "hello","hello"),
                Arguments.of("false", "hello","Hello"),
                Arguments.of("false", "HELLO", "hello"),
                Arguments.of("false", "HELLO", ""),
                Arguments.of("false", "", "hello")
        );
    }

    @ParameterizedTest
    @MethodSource("equalsValueTest")
    void found2(boolean expectedString, String str1,String str2) {
        // GIVEN

        // WHEN
        boolean actualString = StringUtil.equalsValue(str1, str2);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> trimUpperCaseString() {
        return Stream.of(
                Arguments.of("HELLO", "hello     "),
                Arguments.of("HELLO", "     hello"),
                Arguments.of("HELLO", "HEllO       "),
                Arguments.of("HELLO", " HELLO "),
                Arguments.of("", "  ")
        );
    }

    @ParameterizedTest
    @MethodSource("trimUpperCaseString")
    void found3(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.trimUpperCaseString(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> SubstrStringTest() {
        return Stream.of(
                Arguments.of("hell", "hello",0,4),
                Arguments.of("hello", "hello",0,5),
                Arguments.of("", "hello",5,5),
                Arguments.of("ello", "hello",1,5),
                Arguments.of("llo", "hello",2,5)
        );
    }

    @ParameterizedTest
    @MethodSource("SubstrStringTest")
    void found4(String expectedString, String str1, int n, int m) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.SubstrString(str1,n,m);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> replaceSmileTest() {
        return Stream.of(
                Arguments.of("hello :)", "hello :("),
                Arguments.of("hel:)lo", "hel:(lo"),
                Arguments.of(":)hello", ":(hello"),
                Arguments.of(":) hello", ":( hello"),
                Arguments.of("hello:)", "hello:(")
        );
    }

    @ParameterizedTest
    @MethodSource("replaceSmileTest")
    void found5(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.replaceSmile(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> containsTwoWordsTest() {
        return Stream.of(
                Arguments.of("true", "hello my hello", "hello"),
                Arguments.of("true", "my opinion. opinion my","my"),
                Arguments.of("false", " hello my hello", "hello"),
                Arguments.of("false", "hello my hello ", "hello")
        );
    }

    @ParameterizedTest
    @MethodSource("containsTwoWordsTest")
    void found6(boolean expectedString, String str1, String word) {
        // GIVEN

        // WHEN
        boolean actualString = StringUtil.containsTwoWords(str1,word);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> existsVowelsTest() {
        return Stream.of(
                Arguments.of(6, "Meet my family"),
                Arguments.of(10, "my opinion. opinion my"),
                Arguments.of(5, " hello my hello"),
                Arguments.of(5, "hello my hello ")
        );
    }

    @ParameterizedTest
    @MethodSource("existsVowelsTest")
    void found7(int expectedString, String str1) {
        // GIVEN

        // WHEN
        int actualString = StringUtil.existsVowels(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> quantityPunctuationTest() {
        return Stream.of(
                Arguments.of(4, "Meet. my ??family."),
                Arguments.of(1, "my opinion. opinion my"),
                Arguments.of(3, ".hello. my, hello"),
                Arguments.of(1, "hello my hello. ")
        );
    }

    @ParameterizedTest
    @MethodSource("quantityPunctuationTest")
    void found8(int expectedString, String str1) {
        // GIVEN

        // WHEN
        int actualString = StringUtil.quantityPunctuation(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> textPoliandromTest() {
        return Stream.of(
                Arguments.of("true", "deed"),
                Arguments.of("false", "my opinion. opinion my"),
                Arguments.of("true", "Do geese see God"),
                Arguments.of("true", "1991. ")
        );
    }

    @ParameterizedTest
    @MethodSource("textPoliandromTest")
    void found9(boolean expectedString, String str1) {
        // GIVEN

        // WHEN
        boolean actualString = StringUtil.textPoliandrom(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> splitString() {
        return Stream.of(
                Arguments.of(new String[]{"a", "b", "c", "d"},"abcd",1),
                Arguments.of(new String[]{"ab", "cd", "ef"},"abcdef",2),
                Arguments.of(new String[]{"ab", "cd", "ef","g"},"abcdefg",2)
        );
    }

    @ParameterizedTest
    @MethodSource("splitString")
    void found10(String[] expectedString, String str1,int split) {
        // GIVEN

        // WHEN
        String[] actualString = StringUtil.splitString(str1,split);

        // THAT
        Assertions.assertEquals(Arrays.toString(expectedString), Arrays.toString(actualString));
    }

    static Stream<Arguments> countWorldTest() {
        return Stream.of(
                Arguments.of(9, "First, meet my mum and dad, Jane and Michael."),
                Arguments.of(9, "She has long red hair and big brown eyes."),
                Arguments.of(7, "My mother is very kind and understanding")
        );
    }

    @ParameterizedTest
    @MethodSource("countWorldTest")
    void found11(int expectedString, String str1) {
        // GIVEN

        // WHEN
        int actualString = StringUtil.countWorld(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> abbreviatedNameTest() {
        return Stream.of(
                Arguments.of("BO", "Busheyko Oleg"),
                Arguments.of("SH", "She has"),
                Arguments.of("MM", "my mother")
        );
    }

    @ParameterizedTest
    @MethodSource("abbreviatedNameTest")
    void found12(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString =StringUtil.abbreviatedName(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
}
