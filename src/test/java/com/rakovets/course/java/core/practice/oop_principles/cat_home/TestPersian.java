package com.rakovets.course.java.core.practice.oop_principles.cat_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPersian {
    Person person = new Person(80);
    Persian persian = new Persian();

    @Test
    void testSiameseMew() {
        //WHEN
        String actual1 = persian.mew(person);
        int actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(65, actual, actual1);
        Assertions.assertEquals("Mew - Mew!", actual1);
    }

    @Test
    void testSiameseMew1() {
        //WHEN
        String actual = persian.mew();

        //THEN
        Assertions.assertEquals("I want eat!", actual);
    }

    @Test
    void testSiamesePurr1() {
        //WHEN
        String actual = persian.purr();

        //THEN
        Assertions.assertEquals("GavGav!", actual);
    }

    @Test
    void testSiamesePurr() {
        //WHEN
        String actual1 = persian.purr(person);
        int actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(90, actual, actual1);
        Assertions.assertEquals("MrrMrrM!", actual1);
    }
}
