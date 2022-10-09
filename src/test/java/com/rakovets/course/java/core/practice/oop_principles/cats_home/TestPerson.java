package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestPerson {
    Person person = new Person(45.0);

    static Stream<Arguments> provideArgumentsForChangeHappiness() {
        return Stream.of(
                Arguments.of(25.0, 56.25),
                Arguments.of(-10, 40.5),
                Arguments.of(-0.3, 44.865)
        );
    }

    @ParameterizedTest(name ="ChangeHappiness")
    @MethodSource("provideArgumentsForChangeHappiness")
    void testChangeHappiness(double percentHappiness, double expected) {
        person.changeHappiness(percentHappiness);
        double actual = person.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
