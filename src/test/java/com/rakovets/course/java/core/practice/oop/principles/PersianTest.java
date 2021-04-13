package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.cats.Cat;
import com.rakovets.course.java.core.practice.oop.principles.cats.Persian;
import com.rakovets.course.java.core.practice.oop.principles.cats.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersianTest {

    @Test
    void mew() {
        assertEquals  ("maaw", new Persian("Kuzya").mew());
    }

    static Stream<Arguments> mewProviderArguments() {
        return Stream.of(
                Arguments.of(95, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProviderArguments")
    void mew(double expectedDouble, Person person) {
        Persian persian = new Persian("Kuzya");
        persian.mew(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("trrrtrrr", new Persian("Vasya").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(69, new Person(30))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(double expectedDouble, Person person) {
        Persian persian = new Persian("Vasya");
        persian.purr(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void getName() {
        assertEquals("Murka", new Persian("Murka").getName());
    }

    @Test
    void setName() {
        Persian name = new Persian("Murka");
        name.setName("Murzik");
        assertEquals("Murzik", name.getName());
    }
}
