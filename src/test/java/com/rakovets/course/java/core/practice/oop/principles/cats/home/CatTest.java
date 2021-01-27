package com.rakovets.course.java.core.practice.oop.principles.cats.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CatTest {

    @Test
    void Cat() {
        Assertions.assertEquals("Tom", new Cat("Tom").getName());
    }

    @Test
    void mew() {
        Assertions.assertEquals("Meeeewww", new Cat("Tom").mew());
    }

    @Test
    void purr() {
        Assertions.assertEquals("purrrrr", new Cat("Bob").purr());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Shkipper", new Cat("Shkipper").getName());
    }

    @Test
    void setName() {
        Cat cat1 = new Cat("Fox");
        cat1.setName("Shprot");
        Assertions.assertEquals("Shprot", cat1.getName());
    }

    static Stream<Arguments> mewProvidedArguments() {
        return Stream.of(
                Arguments.of(8, new Person(50)),
                Arguments.of(0, new Person(42)),
                Arguments.of(-84, new Person(-42))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProvidedArguments")
    void mew(double expectedDouble, Person value) {
        Cat shprot = new Cat("Shprot");
        shprot.mew(value);
        double actualDouble = value.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
        Assertions.assertEquals("Meeeewww", shprot.mew(value));
    }

    static Stream<Arguments> purrProvidedArguments() {
        return Stream.of(
                Arguments.of(100, new Person(45)),
                Arguments.of(45, new Person(-10)),
                Arguments.of(55, new Person(0))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProvidedArguments")
    void purr(double expectedDouble, Person value) {
        Cat shkipper = new Cat("Shkipper");
        shkipper.purr(value);
        double actualDouble = value.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
        Assertions.assertEquals("purrrrr", shkipper.purr(value));
    }
}
