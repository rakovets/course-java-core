package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSiamese {
    Siamese siamese = new Siamese("Барсик");

    @Test
    void testMey() {
        String actual = siamese.mew();

        Assertions.assertEquals("Мау", actual);
    }

    @Test
    void testPurr() {
        String actual = siamese.purr();

        Assertions.assertEquals("Мурмяу", actual);
    }

    static Stream<Arguments> provideArgumentsForMew() {
        return Stream.of(
                Arguments.of(new Person(25.0), 21.25),
                Arguments.of(new Person(5.0), 4.25),
                Arguments.of(new Person(1.0), 0.85)
        );
    }

    @ParameterizedTest(name ="Mew")
    @MethodSource("provideArgumentsForMew")
    void testMew(Person person, double expected) {
        siamese.mew(person);
        double actual = person.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPurr() {
        return Stream.of(
                Arguments.of(new Person(25.0), 31.25),
                Arguments.of(new Person(5.0), 6.25),
                Arguments.of(new Person(1.0), 1.25)
        );
    }

    @ParameterizedTest(name ="Purr")
    @MethodSource("provideArgumentsForPurr")
    void testPurr(Person person, double expected) {
        siamese.purr(person);
        double actual = person.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
