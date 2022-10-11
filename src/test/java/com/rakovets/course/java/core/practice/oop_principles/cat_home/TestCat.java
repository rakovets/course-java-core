package com.rakovets.course.java.core.practice.oop_principles.cat_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCat {
    Person person = new Person(100);
    Cat cat = new Cat();
    Cat cat1 = new Cat("ВАСЕК");
    Person person1 = new Person(80);
    Persian persian = new Persian();
    Siamese siamese = new Siamese();
    Sphynx sphynx = new Sphynx();

    @Test
    void testCat() {
        //WHEN
        String actual = cat.mew();

        //THEN
        Assertions.assertEquals("Mew - Mew!", actual);
    }

    @Test
    void testCatSetName() {
        //WHEN
        cat.setName("Lexus");
        String actual = cat.getName();

        //THEN
        Assertions.assertEquals("Lexus", actual);
    }

    @Test
    void testCatConstructor() {
        //WHEN
        String actual = cat1.getName();

        //THEN
        Assertions.assertEquals("ВАСЕК", actual);
    }

    @Test
    void testCatMew() {
        //WHEN
        cat.mew(person);
        int actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(90, actual);
    }

    @Test
    void testCatPurr() {
        //WHEN
        cat.purr(person);
        int actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(110, actual);
    }

    @Test
    void testCatPurr1() {
        //WHEN
        cat.purr();
        String actual = cat.purr();

        //THEN
        Assertions.assertEquals("MrrMrrM!", actual);
    }

    @Test
    void testPersianMew() {
        //WHEN
        String actual1 = persian.mew(person);
        int actual = person.getHappiness();
        //THEN
        Assertions.assertEquals(85, actual, actual1);
        Assertions.assertEquals("Mew - Mew!", actual1);
    }

    @Test
    void testPersianMew1() {
        //WHEN
        String actual = persian.mew();
        //THEN
        Assertions.assertEquals("I want eat!", actual);
    }

    @Test
    void testPersianPurr1() {
        //WHEN
        String actual = persian.purr();

        //THEN
        Assertions.assertEquals("GavGav!", actual);
    }

    @Test
    void testPersianPurr() {
        //WHEN
        String actual1 = persian.purr(person);
        int actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(110, actual, actual1);
        Assertions.assertEquals("MrrMrrM!", actual1);
    }

    @Test
    void testSiameseMew() {
        //WHEN
        String actual1 = siamese.mew(person1);
        int actual = person1.getHappiness();

        //THEN
        Assertions.assertEquals(75, actual, actual1);
        Assertions.assertEquals("Mew - Mew!", actual1);
    }

    @Test
    void testSiameseMew1() {
        //WHEN
        String actual = siamese.mew();

        //THEN
        Assertions.assertEquals("Mewmew - Mewmew!", actual);
    }

    @Test
    void testSiamesePurr1() {
        //WHEN
        String actual = siamese.purr();

        //THEN
        Assertions.assertEquals("MrrMrrMmrrrmmrrrr!", actual);
    }

    @Test
    void testSiamesePurr() {
        //WHEN
        String actual1 = siamese.purr(person1);
        int actual = person1.getHappiness();

        //THEN
        Assertions.assertEquals(85, actual, actual1);
        Assertions.assertEquals("MrrMrrM!", actual1);
    }

    @Test
    void testSphynxMew() {
        //WHEN
        String actual1 = sphynx.mew(person);
        int actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(80, actual, actual1);
        Assertions.assertEquals("Mew - Mew!", actual1);
    }

    @Test
    void testSphynxMew1() {
        //WHEN
        String actual = sphynx.mew();

        //THEN
        Assertions.assertEquals("My name is Sphynx!", actual);
    }

    @Test
    void testSphynxPurr1() {
        //WHEN
        String actual = sphynx.purr();

        //THEN
        Assertions.assertEquals("RRRRRRRRR!", actual);
    }

    @Test
    void testSphynxPurr() {
        //WHEN
        String actual1 = sphynx.purr(person);
        int actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(120, actual, actual1);
        Assertions.assertEquals("MrrMrrM!", actual1);
    }
}
