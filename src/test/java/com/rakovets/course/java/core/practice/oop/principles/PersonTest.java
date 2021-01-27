package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void changeHappiness() {
        assertEquals(110.0, new Person(100).changeHappiness(+10.0));
    }

    @Test
    void getHappiness() {
        new Person(10.0);
        Assertions.assertEquals(10.0, Person.getHappiness());
    }

    @Test
    void setHappiness() {
        Person happiness = new Person(10.0);
        happiness.setHappiness(20.0);
        Assertions.assertEquals(20.0, Person.getHappiness());
    }
}
