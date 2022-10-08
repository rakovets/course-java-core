package com.rakovets.course.java.core.practice.oop_principles.cat_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSphynx {
    Person person = new Person(80);
    Sphynx sphynx = new Sphynx();

    @Test
    void testSiameseMew() {
        //WHEN
        String actual1 = sphynx.mew(person);
        int actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(60, actual, actual1);
        Assertions.assertEquals("Mew - Mew!", actual1);
    }

    @Test
    void testSiameseMew1() {
        //WHEN
        String actual = sphynx.mew();

        //THEN
        Assertions.assertEquals("My name is Sphynx!", actual);
    }

    @Test
    void testSiamesePurr1() {
        //WHEN
        String actual = sphynx.purr();

        //THEN
        Assertions.assertEquals("RRRRRRRRR!", actual);
    }

    @Test
    void testSiamesePurr() {
        //WHEN
        String actual1 = sphynx.purr(person);
        int actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(100, actual, actual1);
        Assertions.assertEquals("MrrMrrM!", actual1);
    }
}
