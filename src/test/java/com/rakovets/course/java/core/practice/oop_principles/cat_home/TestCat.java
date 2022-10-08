package com.rakovets.course.java.core.practice.oop_principles.cat_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCat {

    Person person = new Person(100);
    Cat cat = new Cat();
    Cat cat1 = new Cat("ВАСЕК");


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
}
