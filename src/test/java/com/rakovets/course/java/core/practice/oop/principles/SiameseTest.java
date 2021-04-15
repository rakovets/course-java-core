package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

public class SiameseTest {

    @Test
    void mew() {
        assertEquals  ("meaww", new Siamese("Tom").mew());
    }

    static Stream<Arguments> mewProviderArguments() {
        return Stream.of(
                Arguments.of(20, new Person(60))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProviderArguments")
    void mew(double expectedDouble, Person person) {
        Siamese siamese = new Siamese("Tom");
        siamese.mew(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("muurr", new Siamese("Jerry").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(124, new Person(44))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(double expectedDouble, Person person) {
        Siamese siamese = new Siamese("Jerry");
        siamese.purr(person);
        assertEquals(expectedDouble, person.getHappiness());
    }

    @Test
    void getName() {
        assertEquals("Cat", new Siamese("Cat").getName());
    }

    @Test
    void setName() {
        Siamese name = new Siamese("Cat");
        name.setName("Kisya");
        assertEquals("Kisya", name.getName());
    }
}
