package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SiameseTest {

    static Stream<Arguments> provideArgumentsSiamese() {
        return Stream.of(
                Arguments.of("Archi", "Archi can say mey-mey", "Archi can do prr-prr-prr"),
                Arguments.of("Vegas", "Vegas can say mey-mey", "Vegas can do prr-prr-prr"),
                Arguments.of("Grey", "Grey can say mey-mey", "Grey can do prr-prr-prr"),
                Arguments.of("Dollar", "Dollar can say mey-mey", "Dollar can do prr-prr-prr")
        );
    }

    @ParameterizedTest(name = "Name - {0}, Expected1: {1}, Expected2: {2}")
    @MethodSource("provideArgumentsSiamese")
    void siameseTest(String str1, String expected1, String expected2) {
        Cat cat = new Siamese(str1);
        String actual1 = cat.getName() + " can say " + cat.mew();
        String actual2 = cat.getName() + " can do " + cat.purr();
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }
}
