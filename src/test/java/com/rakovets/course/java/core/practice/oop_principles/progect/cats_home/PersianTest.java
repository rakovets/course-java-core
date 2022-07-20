package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PersianTest {
    Persian persian = new Persian("Unknown");
    Person user = new Person(0.0);

    static Stream<Arguments> persianGetNameAndSayMeowAndDoPrrProvideArguments() {
        return Stream.of(
                Arguments.of("Murzik", "Murzik say: meau", "Murzik start to purrr"),
                Arguments.of("cat", "cat say: meau", "cat start to purrr")
        );
    }

    @ParameterizedTest
    @MethodSource("persianGetNameAndSayMeowAndDoPrrProvideArguments")
    void persianGetNameAndSayMeowFirstVersion(String name, String firstExpected, String secondExpected) {
        persian.setName(name);

        String firstActual = persian.getName() + " say: " + persian.mew();
        String secondActual = persian.getName() + " start to " + persian.prr();

        Assertions.assertEquals(firstExpected, firstActual);
        Assertions.assertEquals(secondExpected, secondActual);
    }

    static Stream<Arguments> persianGetNameAndSayMeowAndDoPrrForPersonProvideArguments() {
        return Stream.of(Arguments.of("Murka", "Murka say: meau. Percentage of happiness: 30.0",
                        "Murka start to purrr. Percentage of happiness: 50.0"),
                Arguments.of("cat", "cat say: meau. Percentage of happiness: 30.0",
                        "cat start to purrr. Percentage of happiness: 50.0")
        );
    }

    @ParameterizedTest
    @MethodSource("persianGetNameAndSayMeowAndDoPrrForPersonProvideArguments")
    void persianGetNameAndSayMeowAndDoPrrForPerson(String name, String firstExpected, String secondExpected) {
        double testHappiness = 50.0;
        persian.setName(name);
        user.setHappiness(testHappiness);


        String firstActual = persian.getName() + " say: " + persian.mew(user)
                + ". Percentage of happiness: " + user.getHappiness();
        String secondActual = persian.getName() + " start to " + persian.prr(user)
                + ". Percentage of happiness: " + user.getHappiness();

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
