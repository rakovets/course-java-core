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
    void found(int expectedString, String str1) {
        // GIVEN

        // WHEN
        int actualString = StringUtil.foundX(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
}
