package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SphynxTest {

    @Test
    void purr() {
        Sphynx tom = new Sphynx("Tom");
        String expectedPurr = "Purr-purr-purr";
        String actualPurr = tom.purr();
        Assertions.assertEquals(expectedPurr, actualPurr);
    }

    @Test
    void mew() {
        Sphynx tom = new Sphynx("Tom");
        String expectedMew = "Mew-mew-mew";
        String actualMew = tom.mew();
        Assertions.assertEquals(expectedMew, actualMew);
    }

    static Stream<Arguments> purrTest() {
        return Stream.of(
                Arguments.of(130, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("purrTest")
    void purr(int expectedInt, Person tom) {
        Sphynx bob = new Sphynx("Bob");
        bob.purr(tom);
        int actualInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> mewTest() {
        return Stream.of(
                Arguments.of(70, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("mewTest")
    void mew(int expectedInt, Person tom) {
        Sphynx bob = new Sphynx("Bob");
        bob.mew(tom);
        int actualInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actualInt);
    }
}
