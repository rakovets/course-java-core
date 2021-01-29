package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void mew() {
        Cat jack = new Cat("Jack");
        String expected = "mew-mew";

        String actual = jack.mew();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void purr() {
        Cat jack = new Cat("Jack");
        String expected = "mrrr";

        String actual = jack.purr();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getName() {
        Cat jack = new Cat("Jack");
        String expected = "Jack";

        String actual = jack.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setName() {
        Cat jack = new Cat("Bill");
        jack.setName("Jack");
        String expected = "Jack";

        String actual = jack.getName();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMewForPersonMethod() {
        return Stream.of(
                Arguments.of(90, new Person(100)),
                Arguments.of(60, new Person(70))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewForPersonMethod")
    void testMew(double expected, Person bill) {
        Cat cat = new Cat("Tushkan");

        cat.mew(bill);
        double actual = bill.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPurrForPersonMethod() {
        return Stream.of(
                Arguments.of(115, new Person(100)),
                Arguments.of(85, new Person(70))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrForPersonMethod")
    void testPurr(double expected, Person bill) {
        Cat cat = new Cat("Tushkan");

        cat.purr(bill);
        double actual = bill.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
