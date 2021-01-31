package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PersianTest {

    void mew() {
        // GIVEN
        Persian persian = new Persian("Boris");
        String expectedMew = "meow-meow";
        // WHEN
        String actualMew = persian.mew();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    void purr() {
        // GIVEN
        Persian persian = new Persian("Boris");
        String expectedMew = "mr-mr";
        // WHEN
        String actualMew = persian.mew();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void getName() {
        // GIVEN
        Persian persian = new Persian("Boriska");
        String expectedMew = "Boriska";
        // WHEN
        String actualMew = persian.getName();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void setName() {
        // GIVEN
        Persian persian = new Persian("Boris");
        String expectedMew = "Jerry";
        // WHEN
        persian.setName("Jerry");
        String actualMew = persian.getName();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    static Stream<Arguments> ProviderArgumentsForMew() {
        return Stream.of(
                Arguments.of(85, new Person(100))
        );
    }
    @ParameterizedTest
    @MethodSource("ProviderArgumentsForMew")
    void mew(double expectedDouble, Person user) {
        Persian persian = new Persian("Boris");
        persian.mew(user);
        Assertions.assertEquals(expectedDouble, user.getHappiness());
    }

    @Test
    static Stream<Arguments> ProviderArgumentsForPurr() {
        return Stream.of(
                Arguments.of(115, new Person(100))
        );
    }
    @ParameterizedTest
    @MethodSource("ProviderArgumentsForPurr")
    void purr(double expectedDouble, Person user) {
        Persian persian = new Persian("Boris");
        persian.purr(user);
        Assertions.assertEquals(expectedDouble, user.getHappiness());
    }
}
