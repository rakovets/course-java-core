package com.rakovets.course.java.core.practice.oop_principles.CatHomeTests;

import com.rakovets.course.java.core.practice.oop_principles.CatHome.Persian;
import com.rakovets.course.java.core.practice.oop_principles.CatHome.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTest {
    Persian persian = new Persian("Persian");
    private Person user = new Person(100);

    @Test
    void testConstructor() {
        Persian persian = new Persian("Persian");
        Assertions.assertEquals("Persian", persian.getName());
    }

    @Test
    void testMew() {
        Assertions.assertEquals("Meeeeeeeeeew", persian.mew());
    }

    @Test
    void testMewWithPerson() {
        Assertions.assertEquals("Meeeeeeeeeew", persian.mew(user));
        Assertions.assertEquals(60, user.getHappiness());
    }

    void testPurr() {
        Assertions.assertEquals("Puuuuuuuuuurr", persian.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Puuuuuuuuuurr", persian.purr(user));
        Assertions.assertEquals(140, user.getHappiness());
    }

    @Test
    void getNameCat() {
        Assertions.assertEquals("Persian", persian.getName());
    }

    @Test
    void setNameCat() {
        persian.setName("Persian");
        Assertions.assertEquals("Persian", persian.getName());
    }
}
