package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersianTest {
    Cat persian = new Persian("Unknown");
    Person user = new Person(0.0);

    static Stream<Arguments> persianGetNameAndSayMeowAndDoPrrProvideArguments() {
        return Stream.of(
                Arguments.of("Murzik", "Murzik say: meau", "Murzik start to purrr"),
                Arguments.of("cat", "cat say: meau", "cat start to purrr")
        );
    }

    @ParameterizedTest
    @MethodSource("persianGetNameAndSayMeowAndDoPrrProvideArguments")
    void persianGetNameAndSayMeow(String name, String firstExpected, String secondExpected) {
        persian.setName(name);

        String firstActual = persian.getName() + " say: " + persian.mew();
        String secondActual = persian.getName() + " start to " + persian.prr();

        Assertions.assertEquals(firstExpected, firstActual);
        Assertions.assertEquals(secondExpected, secondActual);
    }

    static Stream<Arguments> persianSayMeowForPersonProvideArguments() {
        return Stream.of(
                Arguments.of(100.0, 80.0),
                Arguments.of(50.0, 30.0),
                Arguments.of(0.0, 0.0),
                Arguments.of(20.0, 0.0),
                Arguments.of(19.9, 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("persianSayMeowForPersonProvideArguments")
    void persianSayMeowForPerson(double happiness, double expected) {
        user.setHappiness(happiness);

        persian.mew(user);

        double actual = user.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> persianDoPrrForPersonProvideArguments() {
        return Stream.of(
                Arguments.of(100.0, 100.0),
                Arguments.of(80.0, 100),
                Arguments.of(0.0, 20.0),
                Arguments.of(50.0, 70.0)
        );
    }

    @ParameterizedTest
    @MethodSource("persianDoPrrForPersonProvideArguments")
    void persianDoPrrForPerson(double happiness, double expected) {
        user.setHappiness(happiness);

        persian.prr(user);

        double actual = user.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
