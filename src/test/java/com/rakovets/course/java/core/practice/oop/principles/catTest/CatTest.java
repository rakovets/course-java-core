package com.rakovets.course.java.core.practice.oop.principles.catTest;
import com.rakovets.course.java.core.practice.oop.principles.cat.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {

    @Test
    void mewTest() {
        assertEquals("Mew", new Cat("MyCat").mew());
    }

    static Stream<Arguments> mewPersonTest() {
        return Stream.of(
                Arguments.of(35, new Person(50))
        );
    }

    @ParameterizedTest
    @MethodSource("mewPersonTest")
    void mewPersonTest(int expected, Person person) {
        Cat cat = new Cat("MewCat");
        cat.mew(person);
        assertEquals(expected, person.getHappiness());
    }

    @Test
    void purrTest() {
        assertEquals("Purr", new Cat("Cat").purr());
    }

    static Stream<Arguments> purrCatTest() {
        return Stream.of(
                Arguments.of(65, new Person(50))
        );
    }

    @ParameterizedTest
    @MethodSource("purrCatTest")
    void purrPersonTest(int expectedInt, Person person) {
        Cat cat = new Cat("Cat");
        cat.purr(person);
        assertEquals(expectedInt, person.getHappiness());
    }

    @Test
    void getNameTest() {
        assertEquals("Cat", new Cat("Cat").getName());
    }

    @Test
    void setNameTest() {
        Cat name = new Cat("Cat");
        name.setName("MyCat");
        assertEquals("MyCat", name.getName());
    }
}
