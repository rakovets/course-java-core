package com.rakovets.course.java.core.practice.oop.principles.cats_home;

import com.rakovets.course.java.core.practice.oop.principles.сats_home.Cat;
import com.rakovets.course.java.core.practice.oop.principles.сats_home.Persian;
import com.rakovets.course.java.core.practice.oop.principles.сats_home.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersianTest {
    @Test
    void Persian() {
        Assertions.assertEquals("Fluffy", new Persian("Fluffy").getName());
    }

    @Test
    void mew() {
        Assertions.assertEquals("mew-mew-mew", new Persian("Fluffy").mew());
    }

    @Test
    void purr() {
        Assertions.assertEquals("purr-purr-purr", new Persian("Fluffy").purr());
    }

    static Stream<Arguments> provideArgumentsForMew() {
        return Stream.of(
                Arguments.of(20.0, new Person(35.0)),
                Arguments.of(-15.0, new Person(0.0)),
                Arguments.of(85.0, new Person(100.0))

        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMew")
    void mew(double expectedDouble, Person random) {
        Cat fluffy = new Persian("Fluffy");
        fluffy.mew(random);
        double actualDouble = random.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    static Stream<Arguments> provideArgumentsForPurr() {
        return Stream.of(
                Arguments.of(50.0, new Person(35.0)),
                Arguments.of(15.0, new Person(0.0)),
                Arguments.of(115.0, new Person(100.0))

        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurr")
    void purr(double expectedDouble, Person random) {
        Cat fluffy = new Persian("Fluffy");
        fluffy.purr(random);
        double actualDouble = random.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
    }
}
