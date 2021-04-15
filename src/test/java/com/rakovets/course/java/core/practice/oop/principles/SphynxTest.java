package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

public class SphynxTest {

    @Test
    void mew() {
        assertEquals  ("miau-miau", new Sphynx("Tom").mew());
    }

    static Stream<Arguments> mewProviderArguments() {
        return Stream.of(
                Arguments.of(70, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProviderArguments")
    void mew(double expectedDouble, Person person) {
        Sphynx sphynx = new Sphynx("Tom");
        sphynx.mew(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("muurr-muurr", new Sphynx("Jerry").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(110, new Person(80))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(double expectedDouble, Person person) {
        Sphynx sphynx = new Sphynx("Jerry");
        sphynx.purr(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void getName() {
        assertEquals("Cat", new Sphynx("Cat").getName());
    }

    @Test
    void setName() {
        Sphynx name = new Sphynx("Cat");
        name.setName("Kisya");
        assertEquals("Kisya", name.getName());
    }
}
