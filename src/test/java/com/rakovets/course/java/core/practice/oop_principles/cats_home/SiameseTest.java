package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SiameseTest {
    Siamese siamese = new Siamese("Unidentified cat!");
    Person user = new Person(0);

    static Stream<Arguments> provideArgumentsForSetAndGetNameMewAndPurrMethods() {
        return Stream.of(
                Arguments.of("Simba", "Simba Mrr-meooow Purrr-purrr"),
                Arguments.of("Jupiter", "Jupiter Mrr-meooow Purrr-purrr"),
                Arguments.of("Schnitzel", "Schnitzel Mrr-meooow Purrr-purrr")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSetAndGetNameMewAndPurrMethods")
    void testSetAndGetNameMewAndPurrMethods(String name, String expected) {
        siamese.setName(name);
        String actual = siamese.getName() + " " + siamese.mew() + " " + siamese.purr();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMewOverloadMethod() {
        return Stream.of(
                Arguments.of(100, "Mrr-meooow 140"),
                Arguments.of(90, "Mrr-meooow 130"),
                Arguments.of(80, "Mrr-meooow 120")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewOverloadMethod")
    void testMewOverloadMethod(int happiness, String expected) {
        user.setHappiness(happiness);
        String actual = String.valueOf(siamese.mew(user)) + " " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForPurrOverloadMethod() {
        return Stream.of(
                Arguments.of(20, "Purrr-purrr 60"),
                Arguments.of(30, "Purrr-purrr 70"),
                Arguments.of(40, "Purrr-purrr 80")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrOverloadMethod")
    void testPurrOverloadMethod(int happiness, String expected) {
        user.setHappiness(happiness);
        String actual = String.valueOf(siamese.purr(user)) + " " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }
}
