package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestCat {
    Cat cat = new Cat("Васька");

    @Test
    void testMey() {
        String actual = cat.mew();

        Assertions.assertEquals("Мяу", actual);
    }

    @Test
    void testPurr() {
        String actual = cat.purr();

        Assertions.assertEquals("Мурр", actual);
    }

    static Stream<Arguments> provideArgumentsForMew() {
        return Stream.of(
                Arguments.of(new Person(25.0), 22.5),
                Arguments.of(new Person(5.0), 4.5),
                Arguments.of(new Person(1.0), 0.9)
        );
    }

    @ParameterizedTest(name ="Mew")
    @MethodSource("provideArgumentsForMew")
    void testMew(Person person, double expected) {
        cat.mew(person);
        double actual = person.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPurr() {
        return Stream.of(
                Arguments.of(new Person(25.0), 32.5),
                Arguments.of(new Person(5.0), 6.5),
                Arguments.of(new Person(1.0), 1.3)
        );
    }

    @ParameterizedTest(name ="Purr")
    @MethodSource("provideArgumentsForPurr")
    void testPurr(Person person, double expected) {
        cat.purr(person);
        double actual = person.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
