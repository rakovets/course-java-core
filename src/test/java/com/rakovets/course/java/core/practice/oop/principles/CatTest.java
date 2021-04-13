package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.cats.Cat;
import com.rakovets.course.java.core.practice.oop.principles.cats.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {

    @Test
    void mew() {
        assertEquals  ("mew", new Cat("Kuzya").mew());
    }

    static Stream<Arguments> mewProviderArguments() {
        return Stream.of(
                Arguments.of(33, new Person(75))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProviderArguments")
    void mew(double expectedDouble, Person person) {
        Cat cat = new Cat("Kuzya");
        cat.mew(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("purr", new Cat("Vasya").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(50, new Person(25))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(double expectedDouble, Person person) {
        Cat cat = new Cat("Vasya");
        cat.purr(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void getName() {
        assertEquals("Murka", new Cat("Murka").getName());
    }

    @Test
    void setName() {
        Cat name = new Cat("Murka");
        name.setName("Murzik");
        assertEquals("Murzik", name.getName());
    }
}
