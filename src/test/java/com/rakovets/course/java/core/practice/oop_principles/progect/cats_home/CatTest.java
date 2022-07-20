package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CatTest {
    Cat cat = new Cat("Unknown");
    Person user = new Person(0.0);

    static Stream<Arguments> catGetNameAndSayMeowAndDoPrrProvideArguments() {
        return Stream.of(
                Arguments.of("Murka", "Murka say: mew", "Murka start to prr"),
                Arguments.of("cat", "cat say: mew", "cat start to prr")
        );
    }

    @ParameterizedTest
    @MethodSource("catGetNameAndSayMeowAndDoPrrProvideArguments")
    void catGetNameAndSayMeowAndDoPrr(String name, String firstExpected, String secondExpected) {
        cat.setName(name);

        String firstActual = cat.getName() + " say: " + cat.mew();
        String secondActual = cat.getName() + " start to " + cat.prr();

        Assertions.assertEquals(firstExpected, firstActual);
        Assertions.assertEquals(secondExpected, secondActual);
    }

    static Stream<Arguments> catGetNameAndSayMeowAndDoPrrForPersonProvideArguments() {
        return Stream.of(
                Arguments.of("Murka", "Murka say: mew. Percentage of happiness: 45.0",
                        "Murka start to prr. Percentage of happiness: 50.0"),
                Arguments.of("cat", "cat say: mew. Percentage of happiness: 45.0",
                        "cat start to prr. Percentage of happiness: 50.0")
        );
    }

    @ParameterizedTest
    @MethodSource("catGetNameAndSayMeowAndDoPrrForPersonProvideArguments")
    void catGetNameAndSayMeowAndDoPrrForPerson(String name, String firstExpected, String secondExpected) {
        double testHappiness = 50.0;
        cat.setName(name);
        user.setHappiness(testHappiness);


        String firstActual = cat.getName() + " say: " + cat.mew(user)
                + ". Percentage of happiness: " + user.getHappiness();
        String secondActual = cat.getName() + " start to " + cat.prr(user)
                + ". Percentage of happiness: " + user.getHappiness();

        Assertions.assertEquals(firstExpected, firstActual);
        Assertions.assertEquals(secondExpected, secondActual);

    }

    static Stream<Arguments> catSayMeowForPersonProvideArguments() {
        return Stream.of(
                Arguments.of(100.0, 95.0),
                Arguments.of(0.0, 0.0),
                Arguments.of(5.0, 0.0),
                Arguments.of(4.9, 0.0),
                Arguments.of(50.0, 45.0)
        );
    }

    @ParameterizedTest
    @MethodSource("catSayMeowForPersonProvideArguments")
    void catSayMeowForPerson(double happiness, double expected) {
        user.setHappiness(happiness);

        cat.mew(user);
        double actual = user.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> catDoPrrForPersonProvideArguments() {
        return Stream.of(
                Arguments.of(100.0, 100.0),
                Arguments.of(95.0, 100),
                Arguments.of(0.0, 5.0),
                Arguments.of(50.0, 55.0)
        );
    }

    @ParameterizedTest
    @MethodSource("catDoPrrForPersonProvideArguments")
    void catDoPrrForPerson(double happiness, double expected) {
        user.setHappiness(happiness);

        cat.prr(user);
        double actual = user.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
