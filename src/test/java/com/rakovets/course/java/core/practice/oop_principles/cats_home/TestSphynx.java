package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSphynx {
    Sphynx sphynx = new Sphynx("Sphynx");
    Person person1 = new Person(100.0);
    Person person2 = new Person(100.0);

    @Test
    public void testSphynxMew() {
        Assertions.assertEquals("Sphynx mews", sphynx.mew());
    }

    static Stream<Arguments> provideArgumentsSphynxMewChangeHappiness() {
        return Stream.of(
                Arguments.of("85", "Sphynx mews")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsSphynxMewChangeHappiness")
    public void testSphynxMewChangeHappiness(double expectedHappiness, String expectedMew) {
        String actualMew = sphynx.mew(person1);
        double actualHappiness = person1.getHappiness();

        Assertions.assertEquals(expectedMew, actualMew);
        Assertions.assertEquals(expectedHappiness, actualHappiness);
    }

    @Test
    public void testSphynxPurr() {
        Assertions.assertEquals("Sphynx purrs", sphynx.purr());
    }

    static Stream<Arguments> provideArgumentsSphynxPurrChangeHappiness() {
        return Stream.of(
                Arguments.of("130", "Sphynx purrs")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsSphynxPurrChangeHappiness")
    public void testSphynxPurrChangeHappiness(double expectedHappiness, String expectedPurr) {
        String actualPurr = sphynx.purr(person2);
        double actualHappiness = person2.getHappiness();

        Assertions.assertEquals(expectedPurr, actualPurr);
        Assertions.assertEquals(expectedHappiness, actualHappiness);
    }
}
