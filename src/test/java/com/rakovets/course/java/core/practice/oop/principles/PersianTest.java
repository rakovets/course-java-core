package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersianTest {

    static Stream<Arguments> provideArgumentsPersian() {
        return Stream.of(
                Arguments.of("Jan", "Jan can say maaw-maaw", "Jan can do murr-murr-murr"),
                Arguments.of("Danko", "Danko can say maaw-maaw", "Danko can do murr-murr-murr"),
                Arguments.of("Zefs", "Zefs can say maaw-maaw", "Zefs can do murr-murr-murr"),
                Arguments.of("Daniel", "Daniel can say maaw-maaw", "Daniel can do murr-murr-murr")
        );
    }

    @ParameterizedTest(name = "Name - {0}, Expected1: {1}, Expected2: {2}")
    @MethodSource("provideArgumentsPersian")
    void persianTest(String str1, String expected1, String expected2) {
        Cat cat = new Persian(str1);
        String actual1 = cat.getName() + " can say " + cat.mew();
        String actual2 = cat.getName() + " can do " + cat.purr();
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }
}
