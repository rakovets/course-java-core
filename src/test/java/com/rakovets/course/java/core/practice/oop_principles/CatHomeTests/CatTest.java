package com.rakovets.course.java.core.practice.oop_principles.CatHomeTests;

import com.rakovets.course.java.core.practice.oop_principles.CatHome.Cat;
import com.rakovets.course.java.core.practice.oop_principles.CatHome.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CatTest {
    private Cat pushok = new Cat("Pushok");
    private Person user;

    @BeforeEach
    void setup() {
        user = new Person(100);

    }

    @Test
    void testConstructor() {
        Cat barsik = new Cat("Barsik");
        Assertions.assertEquals("Barsik", barsik.getName());

    }

    @Test
    void testMew() {
        Assertions.assertEquals("Mew", pushok.mew());
    }

    @Test
    void testMewWithPerson() {
        Assertions.assertEquals("Mew", pushok.mew(user));
        Assertions.assertEquals(90, user.getHappiness());
    }

    @Test
    void testPurr() {
        Assertions.assertEquals("Purr", pushok.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Purr", pushok.purr(user));
        Assertions.assertEquals(110, user.getHappiness());
    }

    @Test
    void getNameCat() {
        Assertions.assertEquals("Pushok", pushok.getName());
    }

    @Test
    void setNameCat() {
        pushok.setName("White");
        Assertions.assertEquals("White", pushok.getName());
    }


}
