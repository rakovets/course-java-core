package com.rakovets.course.java.core.practice.oop.principles.cats.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SphynxTest {

    @Test
    void Cat() {
        Assertions.assertEquals("Fill", new Sphynx("Fill").getName());
    }

    @Test
    void mew() {
        Assertions.assertEquals("Meweeee", new Sphynx("Tom").mew());
    }

    @Test
    void purr() {
        Assertions.assertEquals("Purrsssss", new Sphynx("Bob").purr());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Shkipper", new Sphynx("Shkipper").getName());
    }

    @Test
    void setName() {
        Cat cat1 = new Sphynx("Reen");
        cat1.setName("Shprot");
        Assertions.assertEquals("Shprot", cat1.getName());
    }

    static Stream<Arguments> mewProvidedArguments() {
        return Stream.of(
                Arguments.of(27, new Person(50)),
                Arguments.of(0, new Person(23)),
                Arguments.of(-65, new Person(-42))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProvidedArguments")
    void mew(double expectedDouble, Person value) {
        Cat shprot = new Sphynx("Shprot");
        shprot.mew(value);
        double actualDouble = value.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
        Assertions.assertEquals("Meweeee", shprot.mew(value));
    }

    static Stream<Arguments> purrProvidedArguments() {
        return Stream.of(
                Arguments.of(89, new Person(45)),
                Arguments.of(34, new Person(-10)),
                Arguments.of(0, new Person(-44))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProvidedArguments")
    void purr(double expectedDouble, Person value) {
        Cat shkipper = new Sphynx("Shkipper");
        shkipper.purr(value);
        double actualDouble = value.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
        Assertions.assertEquals("Purrsssss", shkipper.purr(value));
    }
}

