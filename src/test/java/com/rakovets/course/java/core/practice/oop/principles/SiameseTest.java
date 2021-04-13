package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.cats.Persian;
import com.rakovets.course.java.core.practice.oop.principles.cats.Person;
import com.rakovets.course.java.core.practice.oop.principles.cats.Siamese;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SiameseTest {

    @Test
    void mew() {
        assertEquals  ("meeuw", new Siamese("Kuzya").mew());
    }

    static Stream<Arguments> mewProviderArguments() {
        return Stream.of(
                Arguments.of(35, new Person(70))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProviderArguments")
    void mew(double expectedDouble, Person person) {
        Siamese siamese = new Siamese("Kuzya");
        siamese.mew(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("urrrr", new Siamese("Vasya").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(95, new Person(25))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(double expectedDouble, Person person) {
        Siamese siamese = new Siamese("Vasya");
        siamese.purr(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void getName() {
        assertEquals("Murka", new Siamese("Murka").getName());
    }

    @Test
    void setName() {
        Siamese name = new Siamese("Murka");
        name.setName("Murzik");
        assertEquals("Murzik", name.getName());
    }
}
