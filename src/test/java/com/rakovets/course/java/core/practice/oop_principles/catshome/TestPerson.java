package com.rakovets.course.java.core.practice.oop_principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPerson {
    @Test
    void testGetHappiness() {
        Person person = new Person(100);

        int actual = person.getHappiness();

        Assertions.assertEquals(100, actual);
    }

    @Test
    void testSetHappiness() {
        Person person = new Person(100);

        person.setHappiness(150);
        int actual = person.getHappiness();

        Assertions.assertEquals(150, actual);
    }
}
