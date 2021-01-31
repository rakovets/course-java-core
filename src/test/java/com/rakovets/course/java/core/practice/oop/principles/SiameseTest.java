package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SiameseTest {
    void mew() {
        // GIVEN
        Siamese siamese = new Siamese("Boris");
        String expectedMew = "meow";
        // WHEN
        String actualMew = siamese.mew();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    void purr() {
        // GIVEN
        Siamese siamese = new Siamese("Boris");
        String expectedMew = "mr";
        // WHEN
        String actualMew = siamese.mew();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void getName() {
        // GIVEN
        Siamese siamese = new Siamese("Boriska");
        String expectedMew = "Boriska";
        // WHEN
        String actualMew = siamese.getName();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void setName() {
        // GIVEN
        Siamese siamese = new Siamese("Boriska");
        String expectedMew = "Jerry";
        // WHEN
        siamese.setName("Jerry");
        String actualMew = siamese.getName();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    static Stream<Arguments> ProviderArgumentsForMew() {
        return Stream.of(
                Arguments.of(80, new Person(100))
        );
    }
    @ParameterizedTest
    @MethodSource("ProviderArgumentsForMew")
    void mew(double expectedDouble, Person user) {
        Siamese siamese = new Siamese("Boriska");
        siamese.mew(user);
        Assertions.assertEquals(expectedDouble, user.getHappiness());
    }

    @Test
    static Stream<Arguments> ProviderArgumentsForPurr() {
        return Stream.of(
                Arguments.of(120, new Person(100))
        );
    }
    @ParameterizedTest
    @MethodSource("ProviderArgumentsForPurr")
    void purr(double expectedDouble, Person user) {
        Siamese siamese = new Siamese("Boriska");
        siamese.purr(user);
        Assertions.assertEquals(expectedDouble, user.getHappiness());
    }
}
