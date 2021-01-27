package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SiameseTest {

    @Test
    void mew() {
        assertEquals("mew Siamese", new Siamese("Siamese").mew());
    }

    static Stream<Arguments> mewProviderArguments() {
        return Stream.of(
                Arguments.of(35.0, new Person(50.0))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProviderArguments")
    void mew(double expectedDouble, Person person) {
        Siamese siamese = new Siamese("Siamese");
        siamese.mew(person);
        Assertions.assertEquals(expectedDouble, Person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("purr Siamese", new Siamese("Siamese").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(65.0, new Person(50.0))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(double expectedDouble, Person person) {
        Siamese siamese = new Siamese("Siamese");
        siamese.purr(person);
        Assertions.assertEquals(expectedDouble, Person.getHappiness());
    }
}
