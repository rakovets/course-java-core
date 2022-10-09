package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.cat_types.Persian;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersianTests {
    static Stream<Arguments> provideArgumentsPersianMew() {
        return Stream.of(
                Arguments.of("Mew mew mew")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsPersianMew")
    void testPersianMew(String expected) {
        Persian persian = new Persian("Сamelina");

        String actual = persian.mew();

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsPersianMewForUser() {
        return Stream.of(
                Arguments.of(10.0, -10.0),
                Arguments.of(0, -20.0),
                Arguments.of(25.0, 5.0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsPersianMewForUser")
    void testPersianMewForUser(double happiness, double expected) {
        Person user = new Person(happiness);
        Persian persian = new Persian("Сamelina");

        double actual = persian.mew(user);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsPersianPurr() {
        return Stream.of(
                Arguments.of("Purr purr purr")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsPersianPurr")
    void testPersianPurr(String expected) {
        Persian persian = new Persian("Сamelina");

        String actual = persian.purr();

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsPersianPurrForUser() {
        return Stream.of(
                Arguments.of(10.0, 30.0),
                Arguments.of(0, 20.0),
                Arguments.of(5.0, 25.0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsPersianPurrForUser")
    void testPersianPurrForUser(double happiness, double expected) {
        Person user = new Person(happiness);
        Persian persian = new Persian("Сamelina");

        double actual = persian.purr(user);

        assertEquals(expected, actual);
    }
}
