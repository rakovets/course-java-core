package com.rakovets.course.java.core.practice.oop.principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CatTest {

    @Test
    void Cat() {
        Assertions.assertEquals("Garfield", new Cat("Garfield").getName());
    }

    @Test
    void mew() {
        Assertions.assertEquals("meeeow", new Cat("Garfield").mew());
    }

    @Test
    void purr() {
        Assertions.assertEquals("prrr-prrr", new Cat("Garfield").purr());
    }

    @Test
    void getName() {
        Cat tom = new Cat("Tom");
        Assertions.assertEquals("Tom", tom.getName());
    }

    @Test
    void setName() {
        Cat tom = new Cat("Tom");
        tom.setName("Sunny");
        Assertions.assertEquals("Sunny", tom.getName());
    }

    static Stream<Arguments> provideArgumentsForMew() {
        return Stream.of(
                Arguments.of(10.0, new Person(35.0)),
                Arguments.of(-25.0, new Person(0.0)),
                Arguments.of(75.0, new Person(100.0))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMew")
    void mew(double expectedDouble, Person random) {
        Cat murzik = new Cat("Murzik");
        murzik.mew(random);
        double actualDouble = random.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
        Assertions.assertEquals("meeeow", murzik.mew(random));
    }

    static Stream<Arguments> provideArgumentsForPurr() {
        return Stream.of(
                Arguments.of(60.0, new Person(35.0)),
                Arguments.of(25.0, new Person(0.0)),
                Arguments.of(125.0, new Person(100.0))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurr")
    void purr(double expectedDouble, Person random) {
        Cat murzik = new Cat("Murzik");
        murzik.purr(random);
        double actualDouble = random.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
        Assertions.assertEquals("prrr-prrr", murzik.purr(random));
    }
}
