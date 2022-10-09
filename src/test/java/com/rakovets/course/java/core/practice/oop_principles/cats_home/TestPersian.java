package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestPersian {
    Persian persian = new Persian("Мурзик");

    @Test
    void testMey() {
        String actual = persian.mew();

        Assertions.assertEquals("Миу", actual);
    }

    @Test
    void testPurr() {
        String actual = persian.purr();

        Assertions.assertEquals("Мрр", actual);
    }

    static Stream<Arguments> provideArgumentsForMew() {
        return Stream.of(
                Arguments.of(new Person(25.0), 23.75),
                Arguments.of(new Person(5.0), 4.75),
                Arguments.of(new Person(1.0), 0.95)
        );
    }

    @ParameterizedTest(name ="Mew")
    @MethodSource("provideArgumentsForMew")
    void testMewToPerson(Person person, double expected) {
        persian.mew(person);
        double actual = person.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPurr() {
        return Stream.of(
                Arguments.of(new Person(25.0), 30),
                Arguments.of(new Person(5.0), 6.0),
                Arguments.of(new Person(1.0), 1.2)
        );
    }

    @ParameterizedTest(name ="Purr")
    @MethodSource("provideArgumentsForPurr")
    void testPurrToPerson(Person person, double expected) {
        persian.purr(person);
        double actual = person.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
