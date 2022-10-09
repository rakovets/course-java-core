package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTests {
    static Stream<Arguments> provideArgumentsCatMew() {
        return Stream.of(
                Arguments.of("Mew")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsCatMew")
    void testCatMew(String expected) {
        Cat cat = new Cat("Murzik");

        String actual = cat.mew();

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsCatMewForUser() {
        return Stream.of(
                Arguments.of(10.0, 5.0),
                Arguments.of(0, -5.0),
                Arguments.of(5.0, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsCatMewForUser")
    void testCatMewForUser(double happiness, double expected) {
        Person user = new Person(happiness);
        Cat cat = new Cat("Murzsik");

        double actual = cat.mew(user);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsCatPurr() {
        return Stream.of(
                Arguments.of("Purr")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsCatPurr")
    void testCatPurr(String expected) {
        Cat cat = new Cat("Murzik");

        String actual = cat.purr();

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsCatPurrForUser() {
        return Stream.of(
                Arguments.of(10.0, 15.0),
                Arguments.of(0, 5.0),
                Arguments.of(5.0, 10.0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsCatPurrForUser")
    void testCatPurrForUser(double happiness, double expected) {
        Person user = new Person(happiness);
        Cat cat = new Cat("Murzsik");

        double actual = cat.purr(user);

        assertEquals(expected, actual);
    }
}
