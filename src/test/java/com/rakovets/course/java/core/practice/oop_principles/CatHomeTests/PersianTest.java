package com.rakovets.course.java.core.practice.oop_principles.CatHomeTests;

import com.rakovets.course.java.core.practice.oop_principles.CatHome.Persian;
import com.rakovets.course.java.core.practice.oop_principles.CatHome.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTest {
    Persian snowball = new Persian("Snowball");
    private Person user = new Person(100);

    @Test
    void testConstructor() {
        Persian white = new Persian("White");
        Assertions.assertEquals("White", white.getName());
    }

    @Test
    void testMew() {
        Assertions.assertEquals("Meeeeeeeeeew", snowball.mew());
    }

    @Test
    void testMewWithPerson() {
        Assertions.assertEquals("Meeeeeeeeeew", snowball.mew(user));
        Assertions.assertEquals(60, user.getHappiness());
    }

    void testPurr() {
        Assertions.assertEquals("Puuuuuuuuuurr", snowball.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Puuuuuuuuuurr", snowball.purr(user));
        Assertions.assertEquals(140, user.getHappiness());
    }

    @Test
    void getNameCat() {
        Assertions.assertEquals("Snowball", snowball.getName());
    }

    @Test
    void setNameCat() {
        snowball.setName("White");
        Assertions.assertEquals("White", snowball.getName());
    }
}
