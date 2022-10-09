package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.cat_types.Siamese;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SiameseTests {
    static Stream<Arguments> provideArgumentsSiameseMew() {
        return Stream.of(
                Arguments.of("Meeeeeeew")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSiameseMew")
    void testSiameseMew(String expected) {
        Siamese siamese = new Siamese("Barsik");

        String actual = siamese.mew();

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsSiameseMewForUser() {
        return Stream.of(
                Arguments.of(10.0, 0),
                Arguments.of(0, -10.0),
                Arguments.of(15.0, 5.0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSiameseMewForUser")
    void testSiameseMewForUser(double happiness, double expected) {
        Person user = new Person(happiness);
        Siamese siamese = new Siamese("Barsik");

        double actual = siamese.mew(user);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsSiamesePurr() {
        return Stream.of(
                Arguments.of("Purrrrrrrrr")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSiamesePurr")
    void testSiamesePurr(String expected) {
        Siamese siamese = new Siamese("Barsik");

        String actual = siamese.purr();

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsSiamesePurrForUser() {
        return Stream.of(
                Arguments.of(10.0, 20.0),
                Arguments.of(0, 10.0),
                Arguments.of(5.0, 15.0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSiamesePurrForUser")
    void testSiamesePurrForUser(double happiness, double expected) {
        Person user = new Person(happiness);
        Siamese siamese = new Siamese("Barsik");

        double actual = siamese.purr(user);

        assertEquals(expected, actual);
    }
}
