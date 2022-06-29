package com.rakovets.course.java.core.practice.oop_principles.CatHomeTests;

import com.rakovets.course.java.core.practice.oop_principles.CatHome.Person;
import com.rakovets.course.java.core.practice.oop_principles.CatHome.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    Sphynx sphynx = new Sphynx("Sphynx");
    private Person user = new Person(100);

    @Test
    void testConstructor() {
        Sphynx white = new Sphynx("Sphynx");
        Assertions.assertEquals("Sphynx", white.getName());
    }

    @Test
    void testMew() {
        Assertions.assertEquals("Mew-Mew-Mew", sphynx.mew());
    }

    @Test
    void testMewWithPerson() {
        Assertions.assertEquals("Mew-Mew-Mew", sphynx.mew(user));
        Assertions.assertEquals(70, user.getHappiness());
    }

    void testPurr() {
        Assertions.assertEquals("Purr-Purr-Purr", sphynx.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Purr-Purr-Purr", sphynx.purr(user));
        Assertions.assertEquals(130, user.getHappiness());
    }

    @Test
    void getNameCat() {
        Assertions.assertEquals("Sphynx", sphynx.getName());
    }

    @Test
    void setNameCat() {
        sphynx.setName("Sphynx");
        Assertions.assertEquals("Sphynx", sphynx.getName());
    }
}
