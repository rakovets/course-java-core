package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SphynxTest {
    Cat sphynx = new Sphynx("Unknown");
    Person user = new Person(0);

    static Stream<Arguments> sphynxGetNameAndSayMeowAndDoPrrProvideArguments() {
        return Stream.of(
                Arguments.of("Barsik", "Barsik say: meow", "Barsik start to prr-rr-rr"),
                Arguments.of("cat", "cat say: meow", "cat start to prr-rr-rr")
        );
    }

    @ParameterizedTest
    @MethodSource("sphynxGetNameAndSayMeowAndDoPrrProvideArguments")
    void sphynxGetNameAndSayMeowAndDoPrr(String name, String firstExpected, String secondExpected) {
        sphynx.setName(name);

        String firstActual = sphynx.getName() + " say: " + sphynx.mew();
        String secondActual = sphynx.getName() + " start to " + sphynx.prr();

        Assertions.assertEquals(firstExpected, firstActual);
        Assertions.assertEquals(secondExpected, secondActual);
    }

    static Stream<Arguments> sphynxSayMeowForPersonProvideArguments() {
        return Stream.of(
                Arguments.of(100.0, 90.0),
                Arguments.of(0.0, 0.0),
                Arguments.of(10.0, 0.0),
                Arguments.of(9.9, 0.0),
                Arguments.of(50.0, 40.0)
        );
    }

    @ParameterizedTest
    @MethodSource("sphynxSayMeowForPersonProvideArguments")
    void sphynxSayMeowForPerson(double happiness, double expected) {
        user.setHappiness(happiness);

        sphynx.mew(user);
        double actual = user.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> sphynxDoPrrForPersonProvideArguments() {
        return Stream.of(
                Arguments.of(100.0, 100.0),
                Arguments.of(90.0, 100),
                Arguments.of(0.0, 10.0),
                Arguments.of(50.0, 60.0),
                Arguments.of(10.9, 20.9)
        );
    }

    @ParameterizedTest
    @MethodSource("sphynxDoPrrForPersonProvideArguments")
    void sphynxDoPrrForPerson(double happiness, double expected) {
        user.setHappiness(happiness);

        sphynx.prr(user);
        double actual = user.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
