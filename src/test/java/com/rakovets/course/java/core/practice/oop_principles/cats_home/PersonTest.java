package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersonTest {
    Person user = new Person(0);

    static Stream<Arguments> provideArgumentsForGetAndSetChangeHappinessMethods() {
        return Stream.of(
                Arguments.of(30, 50, "30 80"),
                Arguments.of(40, 20, "40 60"),
                Arguments.of(50, 15, "50 65")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAndSetChangeHappinessMethods")
    void testGetAndSetChangeHappinessMethods(int happiness, int percentHappiness, String expected) {
        user.setHappiness(happiness);
        String actual = String.valueOf(user.getHappiness()) + " " + String.valueOf(user.changeHappiness(percentHappiness));
        Assertions.assertEquals(expected, actual);
    }
}
