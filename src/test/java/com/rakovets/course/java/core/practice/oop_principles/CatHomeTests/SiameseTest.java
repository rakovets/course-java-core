package com.rakovets.course.java.core.practice.oop_principles.CatHomeTests;

import com.rakovets.course.java.core.practice.oop_principles.CatHome.Person;
import com.rakovets.course.java.core.practice.oop_principles.CatHome.Siamese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    Siamese wild = new Siamese("Wild");
    private Person user = new Person(100);

    @Test
    void testConstructor() {
        Siamese white = new Siamese("White");
        Assertions.assertEquals("White", white.getName());
    }

    @Test
    void testMew() {
        Assertions.assertEquals("Mew-shhh-Mew", wild.mew());
    }

    @Test
    void testMewWithPerson() {
        Assertions.assertEquals("Mew-shhh-Mew", wild.mew(user));
        Assertions.assertEquals(50, user.getHappiness());
    }

    void testPurr() {
        Assertions.assertEquals("Purr-Purrrrrrr", wild.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Purr-Purrrrrrr", wild.purr(user));
        Assertions.assertEquals(150, user.getHappiness());
    }

    @Test
    void getNameCat() {
        Assertions.assertEquals("Wild", wild.getName());
    }

    @Test
    void setNameCat() {
        wild.setName("White");
        Assertions.assertEquals("White", wild.getName());
    }
}
