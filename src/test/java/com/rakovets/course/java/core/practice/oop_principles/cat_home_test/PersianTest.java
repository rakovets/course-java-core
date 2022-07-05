package com.rakovets.course.java.core.practice.oop_principles.cat_home_test;

import com.rakovets.course.java.core.practice.oop_principles.cat_home.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cat_home.Persian;
import com.rakovets.course.java.core.practice.oop_principles.cat_home.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersianTest {
    private Cat persian;
    private Person user;

    @BeforeEach
    void setup() {
        user = new Person(50);
        persian = new Persian("Persian");
    }

    @Test
    void testConstructor() {
        Assertions.assertEquals("Persian", persian.getName());
    }

    @Test
    void testMew() {
        Assertions.assertEquals("Meeeeeeeeeew", persian.mew());
    }

    @Test
    void testMewWithPerson() {
        Assertions.assertEquals("Meeeeeeeeeew", persian.mew(user));
        Assertions.assertEquals(10, user.getHappiness());
    }

    @Test
    void testMewWithPersonHappinessBelowZero() {
        user = new Person(0);
        Assertions.assertEquals("Meeeeeeeeeew", persian.mew(user));
        Assertions.assertEquals(0, user.getHappiness());
    }

    void testPurr() {
        Assertions.assertEquals("Puuuuuuuuuurr", persian.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Puuuuuuuuuurr", persian.purr(user));
        Assertions.assertEquals(90, user.getHappiness());
    }

    @Test
    void testPurrWithPersonHappinessOver100() {
        user = new Person(100);
        Assertions.assertEquals("Puuuuuuuuuurr", persian.purr(user));
        Assertions.assertEquals(100, user.getHappiness());
    }

    @Test
    void testSetName() {
        persian.setName("Persik");
        Assertions.assertEquals("Persik", persian.getName());
    }
}
