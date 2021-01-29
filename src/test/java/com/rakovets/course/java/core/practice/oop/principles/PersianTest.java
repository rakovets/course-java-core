package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersianTest {

    @Test
    void mew() {
        Persian jack = new Persian("Jack");
        String expected = "mew-pers";

        String actual = jack.mew();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void purr() {
        Persian jack = new Persian("Jack");
        String expected = "mrrr-pers";

        String actual = jack.purr();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForPersianMewForPersonMethod() {
        return Stream.of(
                Arguments.of(116, new Person(100)),
                Arguments.of(86, new Person(70))
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForPersianMewForPersonMethod")
    void testMewForPerson(double expected, Person bill) {
        Persian cat = new Persian("Tushkan");

        cat.mew(bill);
        double actual = bill.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPersianPurrForPersonMethod() {
        return Stream.of(
                Arguments.of(84, new Person(100)),
                Arguments.of(54, new Person(70))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPersianPurrForPersonMethod")
    void testPurrForPerson(double expected, Person bill) {
        Persian cat = new Persian("Tushkan");

        cat.purr(bill);
        double actual = bill.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

}
