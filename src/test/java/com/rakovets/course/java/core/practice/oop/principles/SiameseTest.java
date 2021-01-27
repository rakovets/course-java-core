package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SiameseTest {

    @Test
    void purr() {
        Siamese tom = new Siamese("Tom");
        String expectedPurr = "Purrrrr";
        String actualPurr = tom.purr();
        Assertions.assertEquals(expectedPurr, actualPurr);
    }

    @Test
    void mew() {
        Siamese tom = new Siamese("Tom");
        String expectedMew = "Meeeeew";
        String actualMew = tom.mew();
        Assertions.assertEquals(expectedMew, actualMew);
    }

    static Stream<Arguments> purrTest() {
        return Stream.of(
                Arguments.of(135, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource ("purrTest")
    void purr(int expectedInt, Person tom) {
        Siamese bob = new Siamese("Bob");
        bob.purr(tom);
        int actualInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> mewTest() {
        return Stream.of(
                Arguments.of(65, new Person(100))
        );
    }
    @ParameterizedTest
    @MethodSource("mewTest")
    void mew(int expectedInt, Person tom) {
        Siamese bob = new Siamese("Bob");
        bob.mew(tom);
        int actualInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actualInt);
    }
}
