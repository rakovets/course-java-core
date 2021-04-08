package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
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

    static Stream<Arguments> SubstrString() {
        return Stream.of(
                Arguments.of("hell", "hello",0,4),
                Arguments.of("hello", "hello",0,5),
                Arguments.of("", "hello",5,5),
                Arguments.of("ello", "hello",1,5),
                Arguments.of("llo", "hello",2,5)
        );
    }

    @ParameterizedTest
    @MethodSource("SubstrString")
    void found4(String expectedString, String str1, int n, int m) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.SubstrString(str1,n,m);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> replaceSmile() {
        return Stream.of(
                Arguments.of("hello :)", "hello :("),
                Arguments.of("hel:)lo", "hel:(lo"),
                Arguments.of(":)hello", ":(hello"),
                Arguments.of(":) hello", ":( hello"),
                Arguments.of("hello:)", "hello:(")
        );
    }

    @ParameterizedTest
    @MethodSource("replaceSmile")
    void found5(String expectedString, String str1) {
        // GIVEN

        // WHEN
        String actualString = StringUtil.replaceSmile(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> containsTwoWords() {
        return Stream.of(
                Arguments.of("true", "hello my hello", "hello"),
                Arguments.of("true", "my opinion. opinion my","my"),
                Arguments.of("false", " hello my hello", "hello"),
                Arguments.of("false", "hello my hello ", "hello")
        );
    }

    @ParameterizedTest
    @MethodSource("containsTwoWords")
    void found6(boolean expectedString, String str1, String word) {
        // GIVEN

        // WHEN
        boolean actualString = StringUtil.containsTwoWords(str1,word);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> existsVowels() {
        return Stream.of(
                Arguments.of(4, "Meet my family"),
                Arguments.of(10, "my opinion. opinion my"),
                Arguments.of(5, " hello my hello"),
                Arguments.of(5, "hello my hello ")
        );
    }

    @ParameterizedTest
    @MethodSource("containsTwoWords")
    void found7(int expectedString, String str1) {
        // GIVEN

        // WHEN
        int actualString = StringUtil.existsVowels(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
}
