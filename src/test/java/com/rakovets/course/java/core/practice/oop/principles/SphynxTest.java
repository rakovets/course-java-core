package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SphynxTest {

    @Test
    void mew() {
        Sphynx jack = new Sphynx("Jack");
        String expected = "mew-sfi";
        String actual = jack.mew();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void purr() {
        Sphynx jack = new Sphynx("Jack");
        String expected = "mrrr-sfi";
        String actual = jack.purr();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForSphynxMewForPersonMethod() {
        return Stream.of(
                Arguments.of(113, new Person(100)),
                Arguments.of(83, new Person(70))
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForSphynxMewForPersonMethod")
    void testMewForPerson(double expected, Person bill) {
        Siamese cat = new Siamese("Tushkan");
        cat.mew(bill);
        double actual = bill.getHappiness();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForSphynxPurrForPersonMethod() {
        return Stream.of(
                Arguments.of(87, new Person(100)),
                Arguments.of(57, new Person(70))
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForSphynxPurrForPersonMethod")
    void testPurrForPerson(double expected, Person bill) {
        Siamese cat = new Siamese("Tushkan");
        cat.purr(bill);
        double actual = bill.getHappiness();
        Assertions.assertEquals(expected, actual);
    }
}
