package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.cat_types.Sphynx;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SphynxTests {
    static Stream<Arguments> provideArgumentsSphynxMew() {
        return Stream.of(
                Arguments.of("Meeeew Meeeew Meeeew")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSphynxMew")
    void testSphynxMew(String expected) {
        Sphynx sphynx = new Sphynx("Bald devil");

        String actual = sphynx.mew();

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsSphynxMewForUser() {
        return Stream.of(
                Arguments.of(10.0, -20.0),
                Arguments.of(0, -30.0),
                Arguments.of(45.0, 15.0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSphynxMewForUser")
    void testSphynxMewForUser(double happiness, double expected) {
        Person user = new Person(happiness);
        Sphynx sphynx = new Sphynx("Bald devil");

        double actual = sphynx.mew(user);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsSphynxPurr() {
        return Stream.of(
                Arguments.of("Purrrr Purrrr Purrrr")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSphynxPurr")
    void testSphynxPurr(String expected) {
        Sphynx sphynx = new Sphynx("Bald devil");

        String actual = sphynx.purr();

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsSphynxPurrForUser() {
        return Stream.of(
                Arguments.of(10.0, 40.0),
                Arguments.of(0, 30.0),
                Arguments.of(15.0, 45.0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSphynxPurrForUser")
    void testSphynxPurrForUser(double happiness, double expected) {
        Person user = new Person(happiness);
        Sphynx sphynx = new Sphynx("Bald devil");

        double actual = sphynx.purr(user);

        assertEquals(expected, actual);
    }
}
