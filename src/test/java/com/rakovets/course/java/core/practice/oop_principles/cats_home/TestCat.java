package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestCat {
    Cat cat = new Cat("Persik");
    Person person1 = new Person(100.0);
    Person person2 = new Person(100.0);

    @Test
    public void testCatMew() {
        Assertions.assertEquals("Mew", cat.mew());
    }

    static Stream<Arguments> provideArgumentsCatMewChangeHappiness() {
        return Stream.of(
                Arguments.of("90", "Mew")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsCatMewChangeHappiness")
    public void testCatMewChangeHappiness(double expectedHappiness, String expectedMew) {
        String actualMew = cat.mew(person1);
        double actualHappiness = person1.getHappiness();

        Assertions.assertEquals(expectedMew, actualMew);
        Assertions.assertEquals(expectedHappiness, actualHappiness);
    }

    @Test
    public void testCatPurr() {
        Assertions.assertEquals("Purr", cat.purr());
    }

    static Stream<Arguments> provideArgumentsCatPurrChangeHappiness() {
        return Stream.of(
                Arguments.of("120", "Purr")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsCatPurrChangeHappiness")
    public void testCatPurrChangeHappiness(double expectedHappiness, String expectedPurr) {
        String actualPurr = cat.purr(person2);
        double actualHappiness = person2.getHappiness();

        Assertions.assertEquals(expectedPurr, actualPurr);
        Assertions.assertEquals(expectedHappiness, actualHappiness);
    }
}
