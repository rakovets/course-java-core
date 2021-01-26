package com.rakovets.course.java.core.practice.oop.principles.cats_home;

import com.rakovets.course.java.core.practice.oop.principles.сats_home.Cat;
import com.rakovets.course.java.core.practice.oop.principles.сats_home.Person;
import com.rakovets.course.java.core.practice.oop.principles.сats_home.Siamese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SiameseTest {
    @Test
    void Siamese() {
        Assertions.assertEquals("Kleo", new Siamese("Kleo").getName());
    }

    @Test
    void mew() {
        Assertions.assertEquals("mew-mew", new Siamese("Kleo").mew());
    }

    @Test
    void purr() {
        Assertions.assertEquals("purr-purr", new Siamese("Kleo").purr());
    }

    static Stream<Arguments> provideArgumentsForMew() {
        return Stream.of(
                Arguments.of(5.0, new Person(35.0)),
                Arguments.of(-30.0, new Person(0.0)),
                Arguments.of(70.0, new Person(100.0))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMew")
    void mew(double expectedDouble, Person random) {
        Cat kleo = new Siamese("Kleo");
        kleo.mew(random);
        double actualDouble = random.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
        Assertions.assertEquals("mew-mew", kleo.mew(random));
    }

    static Stream<Arguments> provideArgumentsForPurr() {
        return Stream.of(
                Arguments.of(65.0, new Person(35.0)),
                Arguments.of(30.0, new Person(0.0)),
                Arguments.of(130.0, new Person(100.0))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurr")
    void purr(double expectedDouble, Person random) {
        Cat kleo = new Siamese("Kleo");
        kleo.purr(random);
        double actualDouble = random.getHappiness();

        Assertions.assertEquals(expectedDouble, actualDouble);
        Assertions.assertEquals("purr-purr", kleo.purr(random));
    }
}
