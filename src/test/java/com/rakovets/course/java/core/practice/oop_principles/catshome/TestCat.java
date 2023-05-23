package com.rakovets.course.java.core.practice.oop_principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCat {
    @Test
    void testGetCatName() {
        Cat cat = new Cat("Peach");

        String actual = cat.getName();

        Assertions.assertEquals("Peach",actual);
    }

    @Test
    void testSetCatName() {
        Cat cat = new Cat("Peach");

        cat.setName("Pepi");
        String actual = cat.getName();

        Assertions.assertEquals("Pepi", actual);
    }

    @Test
    void testPurrForPerson() {
        Cat cat = new Cat("Popup");
        Person person = new Person(100);

        cat.purr(person);
        int actual = person.getHappiness();

        Assertions.assertEquals(110, actual);
    }

    @Test
    void testMewForPerson() {
        Cat cat = new Cat("Popup");
        Person person = new Person(100);

        cat.mew(person);
        int actual = person.getHappiness();

        Assertions.assertEquals(90, actual);
    }

}
