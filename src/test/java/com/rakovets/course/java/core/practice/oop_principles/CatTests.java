package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.cat.*;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Persian;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Siamese;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTests {

    @Test
    void mew() {
        assertEquals("mew-mew", new Cat("Bob").mew());
        assertEquals("Miaau-miaau", new Siamese("Sim").mew());
        assertEquals("Mya-mya-mya", new Persian("Pers").mew());
        assertEquals("Meww-meww-mewww", new Sphynx("Nix").mew());
    }

    @Test
    void pur() {
        assertEquals("purrr-purrr-purrr", new Cat("Bob").purr());
        assertEquals("prr-prr-prr", new Siamese("Sim").purr());
        assertEquals("murr-murr-murr", new Persian("Pers").purr());
        assertEquals("prr-mrr-prr-mrr", new Sphynx("Nix").purr());
    }

    static Stream<Arguments> provideArgumentsForMewArgument() {
        return Stream.of(
                Arguments.of(new Person(50.0), new Cat("Bob"), 45.0),
                Arguments.of(new Person(50.0), new Siamese("Sim"), 39.5),
                Arguments.of(new Person(6.0), new Persian("Pers"), -1.0),
                Arguments.of(new Person(50.0), new Sphynx("Nix"), 25.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewArgument")
    void testMewArgument(Person person, Cat cat, double expected) {
        cat.mew(person);
        double actual = person.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPurrArgument() {
        return Stream.of(
                Arguments.of(new Person(50.0), new Cat("Bob"), 55.0),
                Arguments.of(new Person(50.0), new Siamese("Sim"), 65.0),
                Arguments.of(new Person(6.0), new Persian("Pers"), 26.0),
                Arguments.of(new Person(50.0), new Sphynx("Nix"), 58.5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrArgument")
    void testPurrArgument(Person person, Cat cat, double expected) {
        cat.purr(person);
        double actual = person.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
