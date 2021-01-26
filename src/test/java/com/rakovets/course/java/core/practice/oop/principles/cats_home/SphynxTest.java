package com.rakovets.course.java.core.practice.oop.principles.cats_home;

import com.rakovets.course.java.core.practice.oop.principles.сats_home.Cat;
import com.rakovets.course.java.core.practice.oop.principles.сats_home.Person;
import com.rakovets.course.java.core.practice.oop.principles.сats_home.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SphynxTest {
    @Test
    void Persian() {
        Assertions.assertEquals("Bastet", new Sphynx("Bastet").getName());
    }

    @Test
    void mew() {
        Assertions.assertEquals("mr-meoooow", new Sphynx("Bastet").mew());
    }

    @Test
    void purr() {
        Assertions.assertEquals("purr-prrrr", new Sphynx("Bastet").purr());
    }

    static Stream<Arguments> provideArgumentsForMew() {
        return Stream.of(
                Arguments.of(25.0, new Person(35.0)),
                Arguments.of(-10.0, new Person(0.0)),
                Arguments.of(90.0, new Person(100.0))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMew")
    void mew(double expectedDouble, Person random) {
        Cat bastet = new Sphynx("Bastet");
        bastet.mew(random);
        double actualDouble = random.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    static Stream<Arguments> provideArgumentsForPurr() {
        return Stream.of(
                Arguments.of(45.0, new Person(35.0)),
                Arguments.of(10.0, new Person(0.0)),
                Arguments.of(110.0, new Person(100.0))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurr")
    void purr(double expectedDouble, Person random) {
        Cat bastet = new Sphynx("Bastet");
        bastet.purr(random);
        double actualDouble = random.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
    }
}
