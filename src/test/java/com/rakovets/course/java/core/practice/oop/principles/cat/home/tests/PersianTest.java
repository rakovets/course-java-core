package com.rakovets.course.java.core.practice.oop.principles.cat.home.tests;

import com.rakovets.course.java.core.practice.oop.principles.cat.home.Persian;
import com.rakovets.course.java.core.practice.oop.principles.cat.home.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersianTest {

    @Test
    void mew() {
        assertEquals("Persian mew", new Persian("Persian").mew());
    }

    static Stream<Arguments> mewProviderArguments() {
        return Stream.of(
                Arguments.of(25.0, new Person(50.0))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProviderArguments")
    void mew(double expectedDouble, Person person) {
        Persian persian = new Persian("Persian");
        persian.mew(person);
        Assertions.assertEquals(expectedDouble, Person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("Persian purr", new Persian("Persian").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(75.0, new Person(50.0))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(double expectedDouble, Person person) {
        Persian persian = new Persian("Persian");
        persian.purr(person);
        Assertions.assertEquals(expectedDouble, Person.getHappiness());
    }
}
