package com.rakovets.course.java.core.practice.oop_principles.cat_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSiamese {
    Person person1 = new Person(80);
    Siamese siamese = new Siamese();

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
}
