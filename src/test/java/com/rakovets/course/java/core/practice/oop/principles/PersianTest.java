package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

public class PersianTest {

    @Test
    void mew() {
        assertEquals  ("miau", new Persian("Tom").mew());
    }

    static Stream<Arguments> mewProviderArguments() {
        return Stream.of(
                Arguments.of(50, new Person(60))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProviderArguments")
    void mew(double expectedDouble, Person person) {
        Persian persian = new Persian("Tom");
        persian.mew(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("rrr", new Persian("Jerry").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(80, new Person(40))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(double expectedDouble, Person person) {
        Persian persian = new Persian("Jerry");
        persian.purr(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void getName() {
        assertEquals("Cat", new Persian("Cat").getName());
    }

    @Test
    void setName() {
        Persian name = new Persian("Cat");
        name.setName("Kisya");
        assertEquals("Kisya", name.getName());
    }
}
