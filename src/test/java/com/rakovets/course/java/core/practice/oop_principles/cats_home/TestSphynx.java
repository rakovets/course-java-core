package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSphynx {
    Sphynx sphynx = new Sphynx("Ози");

    @Test
    void testMey() {
        String actual = sphynx.mew();

        Assertions.assertEquals("Мяу-мяу", actual);
    }

    @Test
    void testPurr() {
        String actual = sphynx.purr();

        Assertions.assertEquals("Мурр-мур", actual);
    }

    static Stream<Arguments> provideArgumentsForMew() {
        return Stream.of(
                Arguments.of(new Person(25.0), 18.75),
                Arguments.of(new Person(5.0), 3.75),
                Arguments.of(new Person(1.0), 0.75)
        );
    }

    @ParameterizedTest(name ="Mew")
    @MethodSource("provideArgumentsForMew")
    void testMew(Person person, double expected) {
        sphynx.mew(person);
        double actual = person.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPurr() {
        return Stream.of(
                Arguments.of(new Person(25.0), 27.5),
                Arguments.of(new Person(5.0), 5.5),
                Arguments.of(new Person(1.0), 1.1)
        );
    }

    @ParameterizedTest(name ="Purr")
    @MethodSource("provideArgumentsForPurr")
    void testPurr(Person person, double expected) {
        sphynx.purr(person);
        double actual = person.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
