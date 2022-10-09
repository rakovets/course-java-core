package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SphynxTest {
    Sphynx sphynx = new Sphynx("Unidentified cat!");
    Person user = new Person(0);

    static Stream<Arguments> provideArgumentsForSetAndGetNameMewAndPurrMethods() {
        return Stream.of(
                Arguments.of("Skinhead", "Skinhead Meow-arrr Purr-arghh"),
                Arguments.of("Ozzy", "Ozzy Meow-arrr Purr-arghh"),
                Arguments.of("Salvador", "Salvador Meow-arrr Purr-arghh")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSetAndGetNameMewAndPurrMethods")
    void testSetAndGetNameMewAndPurrMethods(String name, String expected) {
        sphynx.setName(name);
        String actual = sphynx.getName() + " " + sphynx.mew() + " " + sphynx.purr();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMewOverloadMethod() {
        return Stream.of(
                Arguments.of(100, "Meow-arrr 70"),
                Arguments.of(90, "Meow-arrr 60"),
                Arguments.of(80, "Meow-arrr 50")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewOverloadMethod")
    void testMewOverloadMethod(int happiness, String expected) {
        user.setHappiness(happiness);
        String actual = String.valueOf(sphynx.mew(user)) + " " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForPurrOverloadMethod() {
        return Stream.of(
                Arguments.of(20, "Purr-arghh -10"),
                Arguments.of(30, "Purr-arghh 0"),
                Arguments.of(40, "Purr-arghh 10")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrOverloadMethod")
    void testPurrOverloadMethod(int happiness, String expected) {
        user.setHappiness(happiness);
        String actual = String.valueOf(sphynx.purr(user)) + " " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }
}
