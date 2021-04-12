package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CatTest {

    static Stream<Arguments> provideArgumentsCat() {
        return Stream.of(
                Arguments.of("Barsik", "Barsik can say mew-mew", "Barsik can do purr-purr-purr"),
                Arguments.of("Vaska", "Vaska can say mew-mew", "Vaska can do purr-purr-purr"),
                Arguments.of("Pirat", "Pirat can say mew-mew", "Pirat can do purr-purr-purr"),
                Arguments.of("Murzik", "Murzik can say mew-mew", "Murzik can do purr-purr-purr")
        );
    }

    @ParameterizedTest(name = "Name - {0}, Expected1: {1}, Expected2: {2}")
    @MethodSource("provideArgumentsCat")
    void catTest(String str1, String expected1, String expected2) {
        Cat cat = new Cat(str1);
        String actual1 = cat.getName() + " can say " + cat.mew();
        String actual2 = cat.getName() + " can do " + cat.purr();
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }
}
