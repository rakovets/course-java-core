package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

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
    void getIndexOfChar(boolean expectedValue, String str1, String str2) {
        boolean actualValue = StringUtil.isEqualsTwoStrings(str1, str2);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    static Stream<Arguments> trimProviderArguments() {
        return Stream.of(
                Arguments.of("how do you do?", "How Do you do?"),
                Arguments.of("how do you do?", "  How do yoU do?   "),
                Arguments.of("how   do you do?", "How   do yoU do? "),
                Arguments.of("how   do you do?", "   How   do yoU do?")
        );
    }

    @ParameterizedTest
    @MethodSource("trimProviderArguments")
    void getTrimAndLowerCase(String expectedString, String str) {
        String actualString = StringUtil.getTrimAndLowerCase(str);
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> getCharsProviderArguments() {
        return Stream.of(
                Arguments.of(" you do?", "how do you do?", 5),
                Arguments.of("would be nice to get 10", "It would be nice to get 10 points for homework", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("getCharsProviderArguments")
    void getCharsOfString(String expectedString, String str, int start) {
        String actualString = StringUtil.getCharsOfString(str, start);
        Assertions.assertEquals(expectedString, actualString);
    }
}
