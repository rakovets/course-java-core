package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestPersian {
    Persian persian = new Persian("Persian");
    Person person1 = new Person(100.0);
    Person person2 = new Person(100.0);

    @Test
    public void testPersianMew() {
        Assertions.assertEquals("Persian mews", persian.mew());
    }

    static Stream<Arguments> provideArgumentsPersianMewChangeHappiness() {
        return Stream.of(
                Arguments.of("90", "Persian mews")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsPersianMewChangeHappiness")
    public void testPersianMewChangeHappiness(double expectedHappiness, String expectedMew) {
        String actualMew = persian.mew(person1);
        double actualHappiness = person1.getHappiness();

        Assertions.assertEquals(expectedMew, actualMew);
        Assertions.assertEquals(expectedHappiness, actualHappiness);
    }

    @Test
    public void testPersianPurr() {
        Assertions.assertEquals("Persian purrs", persian.purr());
    }

    static Stream<Arguments> provideArgumentsPersianPurrChangeHappiness() {
        return Stream.of(
                Arguments.of("120", "Persian purrs")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsPersianPurrChangeHappiness")
    public void testPersianPurrChangeHappiness(double expectedHappiness, String expectedPurr) {
        String actualPurr = persian.purr(person2);
        double actualHappiness = person2.getHappiness();

        Assertions.assertEquals(expectedPurr, actualPurr);
        Assertions.assertEquals(expectedHappiness, actualHappiness);
    }
}
