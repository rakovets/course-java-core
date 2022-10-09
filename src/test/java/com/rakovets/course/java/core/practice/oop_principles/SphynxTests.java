package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTests {
    Sphynx catSphynx = new Sphynx("Finx");

    @Test
    public void testSphynx() {
        Assertions.assertEquals("Finx", catSphynx.getName());
    }

    @Test
    public void testMew() {
        catSphynx.mew();
        System.out.println("mjauSphynx");
    }

    @Test
    public void testPurr() {
        catSphynx.purr();
        System.out.println("murrSphynx");
    }

    @Test
    public void testSetName() {
        catSphynx.setName("Finnix");
        Assertions.assertEquals("Finnix", catSphynx.getName());
    }
}
