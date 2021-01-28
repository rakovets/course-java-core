package com.rakovets.course.java.core.practice.oop.principles.cat_home;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SphynxTest {

    @Test
    void mew() {
        assertEquals("Sphynx mew", new Sphynx("Sphynx").mew());
    }

    static Stream<Arguments> mewProviderArguments() {
        return Stream.of(
                Arguments.of(0.0, new Person(50.0))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProviderArguments")
    void mew(double expectedDouble, Person person) {
        Sphynx sphynx = new Sphynx("Sphynx");
        sphynx.mew(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("Sphynx purr", new Sphynx("Sphynx").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(100.0, new Person(50.0))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(double expectedDouble, Person person) {
        Sphynx sphynx = new Sphynx("Sphynx");
        sphynx.purr(person);
        assertEquals(expectedDouble, person.getHappiness());
    }
}
