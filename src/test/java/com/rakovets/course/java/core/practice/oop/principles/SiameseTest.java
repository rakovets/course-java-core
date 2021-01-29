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
        Siamese jack = new Siamese("Jack");
        String expected = "mew-sim";

        String actual = jack.mew();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void purr() {
        Siamese jack = new Siamese("Jack");
        String expected = "mrrr-sim";

        String actual = jack.purr();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSiameseMewForPersonMethod() {
        return Stream.of(
                Arguments.of(118, new Person(100)),
                Arguments.of(88, new Person(70))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSiameseMewForPersonMethod")
    void testMewForPerson(double expected, Person bill) {
        Sphynx cat = new Sphynx("Tushkan");

        cat.mew(bill);
        double actual = bill.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSiamesePurrForPersonMethod() {
        return Stream.of(
                Arguments.of(82, new Person(100)),
                Arguments.of(52, new Person(70))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSiamesePurrForPersonMethod")
    void testPurrForPerson(double expected, Person bill) {
        Sphynx cat = new Sphynx("Tushkan");

        cat.purr(bill);
        double actual = bill.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
