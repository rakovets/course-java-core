package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.cat.*;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Persian;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Siamese;
import com.rakovets.course.java.core.practice.oop_principles.cat.cats.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTests {
    static Stream<Arguments> provideArgumentsForMew() {
        return Stream.of(
                Arguments.of(new Cat("Bob"), "mew-mew"),
                Arguments.of(new Siamese("Sim"), "Miaau-miaau"),
                Arguments.of(new Persian("Pers"), "Mya-mya-mya"),
                Arguments.of(new Sphynx("Nix"), "Meww-meww-mewww")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMew")
    void testMew(Cat cat, String expected) {
        String actual = cat.mew();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPurr() {
        return Stream.of(
                Arguments.of(new Cat("Bob"), "purrr-purrr-purrr"),
                Arguments.of(new Siamese("Sim"), "prr-prr-prr"),
                Arguments.of(new Persian("Pers"), "murr-murr-murr"),
                Arguments.of(new Sphynx("Nix"), "prr-mrr-prr-mrr")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurr")
    void testPurr(Cat cat, String expected) {
        String actual = cat.purr();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMewByPerson() {
        return Stream.of(
                Arguments.of(new Person(50.0), new Cat("Bob"), 46.0),
                Arguments.of(new Person(50.0), new Siamese("Sim"), 39.5),
                Arguments.of(new Person(6.0), new Persian("Pers"), -1.0),
                Arguments.of(new Person(50.0), new Sphynx("Nix"), 25.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewByPerson")
    void testMewByPerson(Person person, Cat cat, double expected) {
        cat.mew(person);
        double actual = person.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPurrByPerson() {
        return Stream.of(
                Arguments.of(new Person(50.0), new Cat("Bob"), 55.0),
                Arguments.of(new Person(50.0), new Siamese("Sim"), 65.0),
                Arguments.of(new Person(6.0), new Persian("Pers"), 26.0),
                Arguments.of(new Person(50.0), new Sphynx("Nix"), 58.5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrByPerson")
    void testPurrByPerson(Person person, Cat cat, double expected) {
        cat.purr(person);
        double actual = person.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
