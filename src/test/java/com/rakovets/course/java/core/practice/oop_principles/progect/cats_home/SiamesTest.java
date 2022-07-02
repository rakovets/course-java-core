package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SiamesTest {
    Cat siames = new Siames("Unknown");
    Person user = new Person(0.0);

    static Stream<Arguments> siamesGetNameAndSayMeowAndDoPrrProvideArguments() {
        return Stream.of(
                Arguments.of("Manya", "Manya say: me-oo-w", "Manya start to pr"),
                Arguments.of("cat", "cat say: me-oo-w", "cat start to pr")
        );
    }

    @ParameterizedTest
    @MethodSource("siamesGetNameAndSayMeowAndDoPrrProvideArguments")
    void siamesGetNameAndSayMeowAndDoPrr(String name, String firstExpected, String secondExpected) {
        siames.setName(name);

        String firstActual = siames.getName() + " say: " + siames.mew();
        String secondActual = siames.getName() + " start to " + siames.prr();

        Assertions.assertEquals(firstExpected, firstActual);
        Assertions.assertEquals(secondExpected, secondActual);
    }

    static Stream<Arguments> siamesSayMeowForPersonProvideArguments() {
        return Stream.of(
                Arguments.of(100.0, 85.0),
                Arguments.of(50.0, 35.0),
                Arguments.of(0.0, 0.0),
                Arguments.of(15.0, 0.0),
                Arguments.of(14.9, 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("siamesSayMeowForPersonProvideArguments")
    void siamesSayMeowForPerson(double happiness, double expected) {
        user.setHappiness(happiness);

        siames.mew(user);
        double actual = user.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> siamesDoPrrForPersonProvideArguments() {
        return Stream.of(
                Arguments.of(100.0, 100.0),
                Arguments.of(85.0, 100),
                Arguments.of(0.0, 15.0),
                Arguments.of(50.0, 65.0)
        );
    }

    @ParameterizedTest
    @MethodSource("siamesDoPrrForPersonProvideArguments")
    void siamesDoPrrForPerson(double happiness, double expected) {
        user.setHappiness(happiness);

        siames.prr(user);
        double actual = user.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
