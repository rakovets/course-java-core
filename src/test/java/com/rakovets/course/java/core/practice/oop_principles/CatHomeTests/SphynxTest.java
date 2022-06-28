package com.rakovets.course.java.core.practice.oop_principles.CatHomeTests;

import com.rakovets.course.java.core.practice.oop_principles.CatHome.Person;
import com.rakovets.course.java.core.practice.oop_principles.CatHome.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    Sphynx baldy = new Sphynx("Baldy");
    private Person user = new Person(100);

    @Test
    void testConstructor() {
        Sphynx white = new Sphynx("White");
        Assertions.assertEquals("White", white.getName());
    }

    @Test
    void testMew() {
        Assertions.assertEquals("Mew-Mew-Mew", baldy.mew());
    }

    @Test
    void testMewWithPerson() {
        Assertions.assertEquals("Mew-Mew-Mew", baldy.mew(user));
        Assertions.assertEquals(70, user.getHappiness());
    }

    void testPurr() {
        Assertions.assertEquals("Purr-Purr-Purr", baldy.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Purr-Purr-Purr", baldy.purr(user));
        Assertions.assertEquals(130, user.getHappiness());
    }

    @Test
    void getNameCat() {
        Assertions.assertEquals("Baldy", baldy.getName());
    }

    @Test
    void setNameCat() {
        baldy.setName("White");
        Assertions.assertEquals("White", baldy.getName());
    }
}
