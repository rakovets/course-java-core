package com.rakovets.course.java.core.practice.oop_principles.cat_home_test;

import com.rakovets.course.java.core.practice.oop_principles.cat_home.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cat_home.Person;
import com.rakovets.course.java.core.practice.oop_principles.cat_home.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    private Cat sphynx;
    private Person user;

    @BeforeEach
    void setup() {
        user = new Person(50);
        sphynx = new Sphynx("Sphynx");
    }

    @Test
    void testConstructor() {
        Assertions.assertEquals("Sphynx", sphynx.getName());
    }

    @Test
    void testMew() {
        Assertions.assertEquals("Mew-Mew-Mew", sphynx.mew());
    }

    @Test
    void testMewWithPerson() {
        Assertions.assertEquals("Mew-Mew-Mew", sphynx.mew(user));
        Assertions.assertEquals(20, user.getHappiness());
    }

    @Test
    void testPurr() {
        Assertions.assertEquals("Purr-Purr-Purr", sphynx.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Purr-Purr-Purr", sphynx.purr(user));
        Assertions.assertEquals(80, user.getHappiness());
    }

    @Test
    void testGetName() {
        Assertions.assertEquals("Sphynx", sphynx.getName());
    }
}
