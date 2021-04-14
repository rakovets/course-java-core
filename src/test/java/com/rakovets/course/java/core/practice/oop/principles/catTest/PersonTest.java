package com.rakovets.course.java.core.practice.oop.principles.catTest;

import com.rakovets.course.java.core.practice.oop.principles.cat.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    @Test
    static Stream<Arguments> changeHappiness() {
        return Stream.of(
                Arguments.of(90, 80)
        );
    }

    @ParameterizedTest
    @MethodSource("changeHappiness")
    void changeHappinessTest(int expected, int percentHappiness) {
        Person person = new Person(10);
        person.changeHappiness(percentHappiness);
        assertEquals(expected, person.getHappiness());
    }

    @Test
    void getHappinessTest() {
        Person person = new Person(100);
        assertEquals(100, person.getHappiness());
    }

    @Test
    void setHappinessTest() {
        Person person = new Person(100);
        person.setHappiness(99);
        assertEquals(99, person.getHappiness());
    }
}
