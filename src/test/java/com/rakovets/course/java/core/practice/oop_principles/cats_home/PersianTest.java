package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersianTest {
    Persian persian = new Persian("Unidentified cat!");
    Person user = new Person(0);

    static Stream<Arguments> provideArgumentsForSetAndGetNameMewAndPurrMethods() {
        return Stream.of(
                Arguments.of("Jasper", "Jasper Meeeeow-meeeeeow Purr-purr-purr"),
                Arguments.of("Bitcoin", "Bitcoin Meeeeow-meeeeeow Purr-purr-purr"),
                Arguments.of("Pizza", "Pizza Meeeeow-meeeeeow Purr-purr-purr")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSetAndGetNameMewAndPurrMethods")
    void testSetAndGetNameMewAndPurrMethods(String name, String expected) {
        persian.setName(name);
        String actual = persian.getName() + " " + persian.mew() + " " + persian.purr();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMewOverloadMethod() {
        return Stream.of(
                Arguments.of(100, "Meeeeow-meeeeeow 150"),
                Arguments.of(90, "Meeeeow-meeeeeow 140"),
                Arguments.of(80, "Meeeeow-meeeeeow 130")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewOverloadMethod")
    void testMewOverloadMethod(int happiness, String expected) {
        user.setHappiness(happiness);
        String actual = String.valueOf(persian.mew(user)) + " " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForPurrOverloadMethod() {
        return Stream.of(
                Arguments.of(20, "Purr-purr-purr 90"),
                Arguments.of(30, "Purr-purr-purr 100"),
                Arguments.of(40, "Purr-purr-purr 110")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrOverloadMethod")
    void testPurrOverloadMethod(int happiness, String expected) {
        user.setHappiness(happiness);
        String actual = String.valueOf(persian.purr(user)) + " " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }
}
