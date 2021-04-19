package com.rakovets.course.java.core.example.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class AutoAssuranceWithJUnitExample {
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
        String actualString = Example.concat(str1, str2);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
}
