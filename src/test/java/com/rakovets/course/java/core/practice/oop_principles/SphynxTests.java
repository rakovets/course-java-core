package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTests {
    Sphynx catSphynx = new Sphynx("Finx");
    Person person = new Person(100);

    @Test
    public void testSphynx() {
        Assertions.assertEquals("Finx", catSphynx.getName());
    }

    @Test
    public void testMew() {
        Assertions.assertEquals("mjauSphynx", catSphynx.mew());
    }

    @Test
    public void testMewPerson() {
        catSphynx.mew(person);
        Assertions.assertEquals(96, person.getHappiness());
    }

    @Test
    public void testPurr() {
        Assertions.assertEquals("murrSphynx", catSphynx.purr());
    }

    @Test
    public void testPurrPerson() {
        catSphynx.purr(person);
        Assertions.assertEquals(104, person.getHappiness());
    }

    @Test
    public void testSetName() {
        catSphynx.setName("Finnix");
        Assertions.assertEquals("Finnix", catSphynx.getName());
    }
}
