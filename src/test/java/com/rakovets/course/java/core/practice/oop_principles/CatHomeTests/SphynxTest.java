package com.rakovets.course.java.core.practice.oop_principles.CatHomeTests;

import com.rakovets.course.java.core.practice.oop_principles.CatHome.Cat;
import com.rakovets.course.java.core.practice.oop_principles.CatHome.Person;
import com.rakovets.course.java.core.practice.oop_principles.CatHome.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    private final Cat sphynx = new Sphynx("Sphynx");
    private Person user;

    @BeforeEach
    void setup() {
        user = new Person(50);
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
    void testMewWithPersonHappinessZero() {
        user = new Person(0);
        Assertions.assertEquals("Mew-Mew-Mew", sphynx.mew(user));
        Assertions.assertEquals(0, user.getHappiness());
    }

    void testPurr() {
        Assertions.assertEquals("Purr-Purr-Purr", sphynx.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Purr-Purr-Purr", sphynx.purr(user));
        Assertions.assertEquals(80, user.getHappiness());
    }

    @Test
    void testPurrWithPersonHappiness100() {
        user = new Person(100);
        Assertions.assertEquals("Purr-Purr-Purr", sphynx.purr(user));
        Assertions.assertEquals(100, user.getHappiness());
    }

    @Test
    void testGetName() {
        Assertions.assertEquals("Sphynx", sphynx.getName());
    }

    @Test
    void setGetName() {
        sphynx.setName("Baldy");
        Assertions.assertEquals("Baldy", sphynx.getName());
    }
}
