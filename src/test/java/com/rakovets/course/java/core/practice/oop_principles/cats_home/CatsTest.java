package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CatsTest {
    Cat cat = new Cat("Unidentified cat!");
    Person user = new Person(0);

    static Stream<Arguments> provideArgumentsForSetAndGetNameMewAndPurrMethods() {
        return Stream.of(
                Arguments.of("Mr. Paw", "Mr. Paw meow-meow purr"),
                Arguments.of("Big Cat", "Big Cat meow-meow purr"),
                Arguments.of("Buddy", "Buddy meow-meow purr")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSetAndGetNameMewAndPurrMethods")
    void testSetAndGetNameMewAndPurrMethods(String name, String expected) {
        cat.setName(name);
        String actual = cat.getName() + " " + cat.mew() + " " + cat.purr();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMewOverloadMethod() {
        return Stream.of(
                Arguments.of(100, "meow-meow 50"),
                Arguments.of(90, "meow-meow 40"),
                Arguments.of(80, "meow-meow 30")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewOverloadMethod")
    void testMewOverloadMethod(int happiness, String expected) {
        user.setHappiness(happiness);
        String actual = String.valueOf(cat.mew(user)) + " " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForPurrOverloadMethod() {
        return Stream.of(
                Arguments.of(20, "purr 70"),
                Arguments.of(30, "purr 80"),
                Arguments.of(40, "purr 90")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrOverloadMethod")
    void testPurrOverloadMethod(int happiness, String expected) {
        user.setHappiness(happiness);
        String actual = String.valueOf(cat.purr(user)) + " " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }
}
