package com.rakovets.course.java.core.practice.oop.principles.cat.home.tests;

import com.rakovets.course.java.core.practice.oop.principles.cat.home.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
