package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats_and_person.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTests {
    static Stream<Arguments> provideArgumentsChangeHappiness() {
        return Stream.of(
                Arguments.of(10.0, 5.0, 15.0),
                Arguments.of(0, -5.0, -5.0),
                Arguments.of(5, 0, 5)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsChangeHappiness")
    void testChangeHappiness(double happiness, double percentHappiness, double expected) {
        Person user = new Person(happiness);

        double actual = user.changeHappiness(percentHappiness);

        assertEquals(expected, actual);
    }
}
