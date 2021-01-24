package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SphynxTest {
    @Test
    void mew() {
        Sphynx tom = new Sphynx("Tom");
        tom.setName("test");
        String expectedMew = "Mew-mew-mew-mew";
        String actualMew = tom.mew();
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void purr() {
        Sphynx tom = new Sphynx("Tom");
        String expectedPurr = "Purr-purr-purr-purr";
        String actualPurr = tom.purr();
        Assertions.assertEquals(expectedPurr, actualPurr);
    }

    static Stream<Arguments> mewTest() {
        return Stream.of(
                Arguments.of(70, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("mewTest")
    void mew(int expectedInt, Person tom) {
        Sphynx pushok = new Sphynx("Tom");
        pushok.mew(tom);
        int actualInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> purrTest() {
        return Stream.of(
                Arguments.of(130, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("purrTest")
    void purr(int expectedInt, Person tom) {
        Sphynx pushok = new Sphynx("Tom");
        pushok.purr(tom);
        int actualInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actualInt);
    }
}
