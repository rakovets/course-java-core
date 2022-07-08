package com.rakovets.course.java.core.practice.oop_principles.cat_home_test;

import com.rakovets.course.java.core.practice.oop_principles.cat_home.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cat_home.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CatTest {
    private Cat cat;
    private Person user;

    @BeforeEach
    void setup() {
        user = new Person(50);
        cat = new Cat("Cat");
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
    void testPurr() {
        Assertions.assertEquals("Purr", cat.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Purr", cat.purr(user));
        Assertions.assertEquals(60, user.getHappiness());
    }
}
