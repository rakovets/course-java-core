package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

import com.rakovets.course.java.core.util.NumberUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PersonTest {
    Person person = new Person(0);

    static Stream<Arguments> personChangeHappinessProvideArguments() {
        return Stream.of(
                Arguments.of(100.0, 0.0, 100.0),
                Arguments.of(85.5, -18.9, 66.6),
                Arguments.of(20.0, -20.0, 0.0),
                Arguments.of(33.4, 66.6, 100.0),
                Arguments.of(50.0, 20.0, 70.0),
                Arguments.of(10.0, 0.1, 10.1),
                Arguments.of(0.0, 0.0, 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("personChangeHappinessProvideArguments")
    void personChangeHappiness(double happiness, double percent, double expected) {
        person.setHappiness(happiness);

        double actual = NumberUtil.roundValueToTwoDigitsForMantissa(person.changeHappiness(percent));

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> personGetHappinessProvideArguments() {
        return Stream.of(
                Arguments.of(100.0, 100.0),
                Arguments.of(85.5, 85.5),
                Arguments.of(0.0, 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("personGetHappinessProvideArguments")
    void personGetHappiness(double happiness, double expected) {
        person.setHappiness(happiness);

        double actual = NumberUtil.roundValueToTwoDigitsForMantissa(person.getHappiness());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> personSetHappinessProvideArguments() {
        return Stream.of(
                Arguments.of(100.0, 0.0, 0.0),
                Arguments.of(85.5, -18.9, 0.0),
                Arguments.of(20.0, -20.0, 0.0),
                Arguments.of(33.4, 66.6, 66.6),
                Arguments.of(50.0, 20.0, 20.0),
                Arguments.of(0.0, 0.0, 0.0),
                Arguments.of(10.0, 0.1, 0.1),
                Arguments.of(100.0, 100.0, 100.0)
        );
    }

    @ParameterizedTest
    @MethodSource("personSetHappinessProvideArguments")
    void catSetName(double happiness, double setHappiness, double expected) {
        person.setHappiness(happiness);

        person.setHappiness(setHappiness);
        double actual = NumberUtil.roundValueToTwoDigitsForMantissa(person.getHappiness());

        Assertions.assertEquals(expected, actual);
    }
}
