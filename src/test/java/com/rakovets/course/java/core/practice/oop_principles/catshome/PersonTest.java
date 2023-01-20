package com.rakovets.course.java.core.practice.oop_principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
    static Person person;

    @BeforeEach
    void init() {
        person = new Person(70);
    }

    @Test
    void personTest() {

        int actual = person.getHappiness();

        Assertions.assertEquals(70, actual);
    }

    @Test
    void changeHappinessTest1() {
        person.changeHappiness(10);

        Assertions.assertEquals(80, person.getHappiness());
    }

    @Test
    void changeHappinessTest2() {
        Person person = new Person(99);

        person.changeHappiness(10);

        Assertions.assertEquals(100, person.getHappiness());
    }

    @Test
    void changeHappinessTest3() {
        Person person = new Person(3);

        person.changeHappiness(-10);

        Assertions.assertEquals(0, person.getHappiness());
    }

    @Test
    void getHappinessTest() {
        Person person = new Person(70);

        int actual = person.getHappiness();

        Assertions.assertEquals(70, actual);
    }

    @Test
    void setHappiness() {
        Person person = new Person(60);

        person.setHappiness(70);

        Assertions.assertEquals(70, person.getHappiness());
    }
}
