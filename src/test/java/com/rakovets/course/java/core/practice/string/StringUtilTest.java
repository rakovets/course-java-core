package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;



public class StringUtilTest {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("5", "1", "51"),
                Arguments.of("", "5", "5"),
                Arguments.of("5", "", "5"),
                Arguments.of("", "", "")
        );
    }

    @ParameterizedTest(name = "Top size: {0}. Position player bu damage: {1}")
    @MethodSource("provideArguments")
    void test(String str1, String str2, String concatforstring) {
        StringUtil stringUtil = new StringUtil();
        stringUtil.concatforstring(str1,str2);
    }
}

