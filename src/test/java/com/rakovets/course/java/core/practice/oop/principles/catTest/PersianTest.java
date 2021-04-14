package com.rakovets.course.java.core.practice.oop.principles.catTest;
import com.rakovets.course.java.core.practice.oop.principles.cat.Persian;
import com.rakovets.course.java.core.practice.oop.principles.cat.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersianTest {

    @Test
    void persianMewTest() {
        assertEquals("Persian Mew!", new Persian("Persian").mew());
    }

    static Stream<Arguments> mewPersianTest() {
        return Stream.of(
                Arguments.of(75, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("mewPersianTest")
    void persianCatTest(int expected, Person person) {
        Persian persian = new Persian("Persian");
        persian.mew(person);
        assertEquals(expected, person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("Persian Purr!", new Persian("Persian").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(125, new Person(100))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(int expected, Person person) {
        Persian persian = new Persian("Persian");
        persian.purr(person);
        assertEquals(expected, person.getHappiness());
    }
}
