package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SphynxTest {

    static Stream<Arguments> provideArgumentsSphynx() {
        return Stream.of(
                Arguments.of("Lastik", "Lastik can say mjay-mjay", "Lastik can do mrr-mrr-mrr"),
                Arguments.of("Tomas", "Tomas can say mjay-mjay", "Tomas can do mrr-mrr-mrr"),
                Arguments.of("Morgan", "Morgan can say mjay-mjay", "Morgan can do mrr-mrr-mrr"),
                Arguments.of("Murzik", "Murzik can say mjay-mjay", "Murzik can do mrr-mrr-mrr")
        );
    }

    @ParameterizedTest(name = "Name - {0}, Expected1: {1}, Expected2: {2}")
    @MethodSource("provideArgumentsSphynx")
    void sphynxTest(String str1, String expected1, String expected2) {
        Cat cat = new Sphynx(str1);
        String actual1 = cat.getName() + " can say " + cat.mew();
        String actual2 = cat.getName() + " can do " + cat.purr();
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }
}
