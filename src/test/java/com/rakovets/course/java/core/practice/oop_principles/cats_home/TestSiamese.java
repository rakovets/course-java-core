package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSiamese {
    Siamese siamese = new Siamese("Siamese");
    Person person1 = new Person(100.0);
    Person person2 = new Person(100.0);

    @Test
    public void testSiameseMew() {
        Assertions.assertEquals("Siamese mews", siamese.mew());
    }

    static Stream<Arguments> provideArgumentsSiameseMewChangeHappiness() {
        return Stream.of(
                Arguments.of("95", "Siamese mews")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsSiameseMewChangeHappiness")
    public void testSiameseMewChangeHappiness(double expectedHappiness, String expectedMew) {
        String actualMew = siamese.mew(person1);
        double actualHappiness = person1.getHappiness();

        Assertions.assertEquals(expectedMew, actualMew);
        Assertions.assertEquals(expectedHappiness, actualHappiness);
    }

    @Test
    public void testSiamesePurr() {
        Assertions.assertEquals("Siamese purr", siamese.purr());
    }

    static Stream<Arguments> provideArgumentsSiamesePurrChangeHappiness() {
        return Stream.of(
                Arguments.of("110", "Siamese purr")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsSiamesePurrChangeHappiness")
    public void testSiamesePurrChangeHappiness(double expectedHappiness, String expectedPurr) {
        String actualPurr = siamese.purr(person2);
        double actualHappiness = person2.getHappiness();

        Assertions.assertEquals(expectedPurr, actualPurr);
        Assertions.assertEquals(expectedHappiness, actualHappiness);
    }
}
