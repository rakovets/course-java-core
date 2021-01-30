package com.rakovets.course.java.core.practice.oop.principles.cats.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersianTest {

    @Test
    void Persian() {
        Assertions.assertEquals("Kote", new Persian("Kote").getName());
    }

    @Test
    void mew() {
        Assertions.assertEquals("Mewawaw", new Persian("Kote").mew());
    }

    @Test
    void purr() {
        Assertions.assertEquals("Prrrrrrr", new Persian("Kote").purr());
    }

    static Stream<Arguments> mewProvidedArguments() {
        return Stream.of(
                Arguments.of(35, new Person(50)),
                Arguments.of(27, new Person(42)),
                Arguments.of(-57, new Person(-42))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProvidedArguments")
    void mew(double expectedDouble, Person value) {
        Cat shprot = new Persian("Shprot");
        shprot.mew(value);
        double actualDouble = value.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
        Assertions.assertEquals("Mewawaw", shprot.mew(value));
    }

    static Stream<Arguments> purrProvidedArguments() {
        return Stream.of(
                Arguments.of(78, new Person(45)),
                Arguments.of(23, new Person(-10)),
                Arguments.of(33, new Person(0))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProvidedArguments")
    void purr(double expectedDouble, Person value) {
        Cat shkipper = new Persian("Shkipper");
        shkipper.purr(value);
        double actualDouble = value.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
        Assertions.assertEquals("Prrrrrrr", shkipper.purr(value));
    }
}
