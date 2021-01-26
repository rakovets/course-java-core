package com.rakovets.course.java.core.practice.oop.principles.cats_home;

import com.rakovets.course.java.core.practice.oop.principles.сats_home.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersonTest {
    @Test
    void Person() {
        Assertions.assertEquals(40.0, new Person(40.0).getHappiness());
    }

    static Stream<Arguments> provideArgumentsForChangeHappiness() {
        return Stream.of(
                Arguments.of(60.0, 20.0),
                Arguments.of(-20.0, -60.0),
                Arguments.of(0.0, -40.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForChangeHappiness")
    void changeHappiness(double expectedDouble, double updateHappiness) {
        Person hugh = new Person(40.0);
        hugh.changeHappiness(updateHappiness);
        double actualDouble = hugh.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    @Test
    void getHappiness() {
        Person hugh = new Person(40.0);
        Assertions.assertEquals(40.0, hugh.getHappiness());
    }

    @Test
    void setHappiness() {
        Person hugh = new Person(40.0);
        hugh.setHappiness(60.0);
        Assertions.assertEquals(60.0, hugh.getHappiness());
    }
}
