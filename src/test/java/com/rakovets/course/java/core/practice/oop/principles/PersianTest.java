package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.cat.Persian;
import com.rakovets.course.java.core.practice.oop.principles.cat.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersianTest {
    @Test
    void mew() {
        Persian tom = new Persian("Tom");
        String expectedMew = "Mew-mew-mew";
        String actualMew = tom.mew();
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void purr() {
        Persian tom = new Persian("Tom");
        String expectedPurr = "Purr-purr-purr";
        String actualPurr = tom.purr();
        Assertions.assertEquals(expectedPurr, actualPurr);
    }

    static Stream<Arguments> purrTest() {
        return Stream.of(
                Arguments.of(115, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("purrTest")
    void purr(int expectedInt, Person tom) {
        Persian pushok = new Persian("Pushok");
        pushok.purr(tom);
        int actualInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> mewTest() {
        return Stream.of(
                Arguments.of(85, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("mewTest")
    void mew(int expectedInt, Person tom) {
        Persian pushok = new Persian("Pushok");
        pushok.mew(tom);
        int actualInt = tom.getHappiness();
        Assertions.assertEquals(expectedInt, actualInt);
    }
}
