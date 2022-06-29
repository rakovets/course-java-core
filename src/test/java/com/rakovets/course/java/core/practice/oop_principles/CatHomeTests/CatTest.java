package com.rakovets.course.java.core.practice.oop_principles.CatHomeTests;

import com.rakovets.course.java.core.practice.oop_principles.CatHome.Cat;
import com.rakovets.course.java.core.practice.oop_principles.CatHome.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CatTest {
    private Cat cat = new Cat("Cat");
    private Person user;

    @BeforeEach
    void setup() {
        user = new Person(100);

    }

    @Test
    void testConstructor() {
        Cat cat = new Cat("Cate");
        Assertions.assertEquals("Cate", cat.getName());

    }

    @Test
    void testMew() {
        Assertions.assertEquals("Mew", cat.mew());
    }

    @Test
    void testMewWithPerson() {
        Assertions.assertEquals("Mew", cat.mew(user));
        Assertions.assertEquals(90, user.getHappiness());
    }

    @Test
    void testPurr() {
        Assertions.assertEquals("Purr", cat.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Purr", cat.purr(user));
        Assertions.assertEquals(110, user.getHappiness());
    }

    @Test
    void getNameCat() {
        Assertions.assertEquals("Cat", cat.getName());
    }

    @Test
    void setNameCat() {
        cat.setName("Cat");
        Assertions.assertEquals("Cat", cat.getName());
    }


}
