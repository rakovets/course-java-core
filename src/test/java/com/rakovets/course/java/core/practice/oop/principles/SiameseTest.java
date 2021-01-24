package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SiameseTest {
    @Test
    void mew() {
        Siamese tom = new Siamese("Tom");
        tom.setName("test");
        String expectedMew = "Mew-mew";
        String actualMew = tom.mew();
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void purr() {
        Siamese tom = new Siamese("Tom");
        String expectedPurr = "Purr-purr";
        String actualPurr = tom.purr();
        Assertions.assertEquals(expectedPurr, actualPurr);
    }

    static Stream<Arguments> mewTest() {
        return Stream.of(
                Arguments.of(80, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("mewTest")
    void mew(int expectedInt, Person tom) {
        Siamese pushok = new Siamese("Tom");
        pushok.mew(tom);
        int actualInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> purrTest() {
        return Stream.of(
                Arguments.of(120, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("purrTest")
    void purr(int expectedInt, Person tom) {
        Siamese pushok = new Siamese("Tom");
        pushok.purr(tom);
        int actualInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actualInt);
    }
}
