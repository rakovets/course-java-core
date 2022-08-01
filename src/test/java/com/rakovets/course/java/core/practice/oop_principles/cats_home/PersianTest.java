package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersianTest {
    private Cat persian;
    private Person user;

    @BeforeEach
    public void initEach() {
        user = new Person(70);
        persian = new Persian("Persian");
    }

    @Test
    public void testConstructor() {
        Assertions.assertEquals("Persian", persian.getName());
    }

    @Test
    public void testMew() {
        Assertions.assertEquals("mia-w-w", persian.mew());
    }

    @Test
    public void testPurr() {
        Assertions.assertEquals("puu-rrrr", persian.purr());
    }

    @Test
    public void testMewUser() {
        Assertions.assertEquals("mia-w-w. Master, Persian wants to eat!", persian.mew(user));
        Assertions.assertEquals(60, user.getHappiness());
    }

    @Test
    public void testPurrUser() {
        Assertions.assertEquals("puu-rrrr. Persian is happy!", persian.purr(user));
        Assertions.assertEquals(80, user.getHappiness());
    }
}
