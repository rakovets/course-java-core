package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CatTest {
    private Cat cat;
    private Person user;

    @BeforeEach
    public void initEach() {
        user = new Person(70);
        cat = new Cat("Cat");
    }

    @Test
    public void testConstructor() {
        Assertions.assertEquals("Cat", cat.getName());
    }

    @Test
    public void testMew() {
        Assertions.assertEquals("mew", cat.mew());
    }

    @Test
    public void testPurr() {
        Assertions.assertEquals("purr", cat.purr());
    }

    @Test
    public void testMewUser() {
        Assertions.assertEquals("mew", cat.mew(user));
        Assertions.assertEquals(65, user.getHappiness());
    }

    @Test
    public void testPurrUser() {
        Assertions.assertEquals("purr", cat.purr(user));
        Assertions.assertEquals(75, user.getHappiness());
    }
}
