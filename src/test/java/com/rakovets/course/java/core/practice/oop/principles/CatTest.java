package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CatTest {

    @Test
    void mew() {
        Cat tom = new Cat("Tom");
        String expectedMew = "Mew";
        String actualMew = tom.mew();
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void purr() {
        Cat tom = new Cat("Tom");
        String expectedPurr = "Purr";
        String actualPurr = tom.purr();
        Assertions.assertEquals(expectedPurr, actualPurr);
    }

    static Stream<Arguments> mewTest() {
        return Stream.of(
                Arguments.of(90, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("mewTest")
    void mew(int expectedInt, Person tom) {
        Cat pushok = new Cat("Tom");
        pushok.mew(tom);
        int actualInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> purrTest() {
        return Stream.of(
                Arguments.of(110, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("purrTest")
    void purr(int expectedInt, Person tom) {
        Cat pushok = new Cat("Tom");
        pushok.purr(tom);
        int actualInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void getName() {
        Cat tom = new Cat("Tom");
        String expectedGetName = "Tom";
        String actualGetName = tom.getName();
        Assertions.assertEquals(expectedGetName, actualGetName);
    }

    @Test
    void setName() {
        Cat tom = new Cat("Tom");
        String expectedString = "Tom1";
        tom.setName("Tom1");
        String actualString = tom.getName();
        Assertions.assertEquals(expectedString, actualString);
    }
}
