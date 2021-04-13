package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.cats.Persian;
import com.rakovets.course.java.core.practice.oop.principles.cats.Person;
import com.rakovets.course.java.core.practice.oop.principles.cats.Siamese;
import com.rakovets.course.java.core.practice.oop.principles.cats.Sphynx;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SphynxTest {

    @Test
    void mew() {
        assertEquals  ("meww-meww-meww", new Sphynx("Kuzya").mew());
    }

    static Stream<Arguments> mewProviderArguments() {
        return Stream.of(
                Arguments.of(60, new Person(80))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProviderArguments")
    void mew(double expectedDouble, Person person) {
        Sphynx sphynx = new Sphynx("Kuzya");
        sphynx.mew(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("rrrrrrrrrrrrr", new Sphynx("Vasya").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(72, new Person(50))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(double expectedDouble, Person person) {
        Sphynx sphynx = new Sphynx("Vasya");
        sphynx.purr(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void getName() {
        assertEquals("Murka", new Sphynx("Murka").getName());
    }

    @Test
    void setName() {
        Sphynx name = new Sphynx("Murka");
        name.setName("Murzik");
        assertEquals("Murzik", name.getName());
    }
}
