package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SphynxTest {
    void mew() {
        // GIVEN
        Sphynx sphynx = new Sphynx("Boris");
        String expectedMew = "meow-meow-meow";
        // WHEN
        String actualMew = sphynx.mew();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    void purr() {
        // GIVEN
        Sphynx sphynx = new Sphynx("Boris");
        String expectedMew = "mr-mr-mr";
        // WHEN
        String actualMew = sphynx.mew();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void getName() {
        // GIVEN
        Sphynx sphynx = new Sphynx("Boriska");
        String expectedMew = "Boriska";
        // WHEN
        String actualMew = sphynx.getName();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void setName() {
        // GIVEN
        Sphynx sphynx = new Sphynx("Boriska");
        String expectedMew = "Jerry";
        // WHEN
        sphynx.setName("Jerry");
        String actualMew = sphynx.getName();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    static Stream<Arguments> ProviderArgumentsForMew() {
        return Stream.of(
                Arguments.of(75, new Person(100))
        );
    }
    @ParameterizedTest
    @MethodSource("ProviderArgumentsForMew")
    void mew(double expectedDouble, Person user) {
        Sphynx sphynx = new Sphynx("Boriska");
        sphynx.mew(user);
        Assertions.assertEquals(expectedDouble, user.getHappiness());
    }

    @Test
    static Stream<Arguments> ProviderArgumentsForPurr() {
        return Stream.of(
                Arguments.of(125, new Person(100))
        );
    }
    @ParameterizedTest
    @MethodSource("ProviderArgumentsForPurr")
    void purr(double expectedDouble, Person user) {
        Sphynx sphynx = new Sphynx("Boriska");;
        sphynx.purr(user);
        Assertions.assertEquals(expectedDouble, user.getHappiness());
    }
}
