package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    @Test
    void mew() {
        assertEquals  ("mew", new Cat("Tom").mew());
    }

    static Stream<Arguments> mewProviderArguments() {
        return Stream.of(
                Arguments.of(63, new Person(85))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProviderArguments")
    void mew(double expectedDouble, Person person) {
        Cat cat = new Cat("Tom");
        cat.mew(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("purr", new Cat("Jerry").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(50, new Person(30))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(double expectedDouble, Person person) {
        Cat cat = new Cat("Jerry");
        cat.purr(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void getName() {
        assertEquals("Cat", new Cat("Cat").getName());
    }

    @Test
    void setName() {
        Cat name = new Cat("Cat");
        name.setName("Kisya");
        assertEquals("Kisya", name.getName());
    }
}
