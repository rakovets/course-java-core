package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    private Cat sphynx;
    private Person user;

    @BeforeEach
    public void initEach() {
        user = new Person(70);
        sphynx = new Sphynx("Sphynx");
    }

    @Test
    public void testConstructor() {
        Assertions.assertEquals("Sphynx", sphynx.getName());
    }

    @Test
    public void testMew() {
        Assertions.assertEquals("meeaaw", sphynx.mew());
    }

    @Test
    public void testPurr() {
        Assertions.assertEquals("pppuurr", sphynx.purr());
    }

    @Test
    public void testMewUser() {
        Assertions.assertEquals("meeaaw. Master, Sphynx wants to eat!", sphynx.mew(user));
        Assertions.assertEquals(50, user.getHappiness());
    }

    @Test
    public void testPurrUser() {
        Assertions.assertEquals("pppuurr. Sphynx is happy!", sphynx.purr(user));
        Assertions.assertEquals(90, user.getHappiness());
    }
}
