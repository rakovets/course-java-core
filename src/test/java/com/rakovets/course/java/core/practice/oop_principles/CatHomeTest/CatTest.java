package com.rakovets.course.java.core.practice.oop_principles.CatHomeTest;

import com.rakovets.course.java.core.practice.oop_principles.CatHome.Cat;
import com.rakovets.course.java.core.practice.oop_principles.CatHome.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CatTest {
    private final Cat cat = new Cat("Cat");
    private Person user;

    @BeforeEach
    void setup() {
        user = new Person(50);
    }

    @Test
    void testConstructor() {
        Assertions.assertEquals("Cat", cat.getName());
    }

    @Test
    void testMew() {
        Assertions.assertEquals("Mew", cat.mew());
    }

    @Test
    void testMewWithPerson() {
        Assertions.assertEquals("Mew", cat.mew(user));
        Assertions.assertEquals(40, user.getHappiness());
    }

    @Test
    void testMewWithPersonHappinessBelowZero() {
        user = new Person(0);
        Assertions.assertEquals("Mew", cat.mew(user));
        Assertions.assertEquals(0, user.getHappiness());
    }

    @Test
    void testPurr() {
        Assertions.assertEquals("Purr", cat.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Purr", cat.purr(user));
        Assertions.assertEquals(60, user.getHappiness());
    }

    @Test
    void testPurrWithPersonHappinessOver100() {
        user = new Person(100);
        Assertions.assertEquals("Purr", cat.purr(user));
        Assertions.assertEquals(100, user.getHappiness());
    }

    @Test
    void testSetName() {
        cat.setName("Kitten");
        Assertions.assertEquals("Kitten", cat.getName());
    }
}
