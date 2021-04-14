package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.Stream;

public class PersonTest {
    static Stream<Arguments> provideArgumentsPerson() {
        return Stream.of(
                Arguments.of("Tom", 80.0, 20.0, 100.0),
                Arguments.of("Liza", 100.0, -15.5, 84.5),
                Arguments.of("Mark", 20.0 , -20.0, 0.0),
                Arguments.of("Jula", 100.0, 0.0, 100.0)
        );
    }

    @ParameterizedTest(name = "Name - {0}, happiness = {1}, percent = {2}, Expected: {3}")
    @MethodSource("provideArgumentsPerson")
    void personTest(String str1, double happiness, double percent, double expected) {
        Person person = new Person(str1, happiness);
        person.setPercentHappiness(percent);
        double actual = BigDecimal.valueOf(person.changeHappiness()).setScale(1, RoundingMode.HALF_UP).doubleValue();
        Assertions.assertEquals(expected, actual);
    }
}
