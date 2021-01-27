package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void mew() {
        assertEquals("mew", new Cat("Cat").mew());
    }

    static Stream<Arguments> mewProviderArguments() {
        return Stream.of(
                Arguments.of(40.0, new Person(50.0))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProviderArguments")
    void mew(double expectedDouble, Person person) {
        Cat cat = new Cat("Cat");
        cat.mew(person);
        Assertions.assertEquals(expectedDouble, Person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("purr", new Cat("Cat").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(60.0, new Person(50.0))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(double expectedDouble, Person person) {
        Cat cat = new Cat("Cat");
        cat.purr(person);
        Assertions.assertEquals(expectedDouble, Person.getHappiness());
    }

    @Test
    void getName() {
        assertEquals("Cat", new Cat("Cat").getName());
    }

    @Test
    void setName() {
        Cat name = new Cat("Cat");
        name.setName("Better Cat");
        Assertions.assertEquals("Better Cat", name.getName());
    }
}
