package com.rakovets.course.java.core.practice.oop.principles.cats.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SiameseTest {

    @Test
    void Cat() {
        Assertions.assertEquals("Tom", new Siamese("Tom").getName());
    }

    @Test
    void mew() {
        Assertions.assertEquals("Mewooo", new Siamese("Tom").mew());
    }

    @Test
    void purr() {
        Assertions.assertEquals("Purrhrhrhr", new Siamese("Bob").purr());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Shkipper", new Siamese("Shkipper").getName());
    }

    @Test
    void setName() {
        Cat cat1 = new Siamese("Lesli");
        cat1.setName("Shprotec");
        Assertions.assertEquals("Shprotec", cat1.getName());
    }

    static Stream<Arguments> mewProvidedArguments() {
        return Stream.of(
                Arguments.of(24, new Person(50)),
                Arguments.of(0, new Person(26)),
                Arguments.of(-68, new Person(-42))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProvidedArguments")
    void mew(double expectedDouble, Person value) {
        Cat shprot = new Siamese("Shprot");
        shprot.mew(value);
        double actualDouble = value.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
        Assertions.assertEquals("Mewooo", shprot.mew(value));
    }

    static Stream<Arguments> purrProvidedArguments() {
        return Stream.of(
                Arguments.of(77, new Person(45)),
                Arguments.of(22, new Person(-10)),
                Arguments.of(32, new Person(0)),
                Arguments.of(0, new Person(-32))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProvidedArguments")
    void purr(double expectedDouble, Person value) {
        Cat shkipper = new Siamese("Timmy");
        shkipper.purr(value);
        double actualDouble = value.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
        Assertions.assertEquals("Purrhrhrhr", shkipper.purr(value));
    }
}
