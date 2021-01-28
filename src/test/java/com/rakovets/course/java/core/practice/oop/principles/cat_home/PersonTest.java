package com.rakovets.course.java.core.practice.oop.principles.cat_home;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    static Stream<Arguments> changeHappinessProviderArguments() {
        return Stream.of(
                Arguments.of(20.0, 10.0)
        );
    }

    @ParameterizedTest
    @MethodSource("changeHappinessProviderArguments")
    void changeHappiness(double expectedDouble, double percentHappiness) {
        Person person = new Person(10.0);
        person.changeHappiness(percentHappiness);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void getHappiness() {
        Person person = new Person(10.0);
        assertEquals(10.0, person.getHappiness());
    }

    @Test
    void setHappiness() {
        Person person = new Person(10.0);
        person.setHappiness(20.0);
        assertEquals(20.0, person.getHappiness());
    }
}
