package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTests {
    Siamese catSiamese = new Siamese("Simasic");
    Person person = new Person(300);

    @Test
    public void testSiamese() {
        Assertions.assertEquals("Simasic", catSiamese.getName());
    }

    @Test
    public void testMew() {
        catSiamese.mew();
        System.out.println("mjauSiamese");
    }

    @Test
    public void testMewPerson() {
        catSiamese.mew(person);
        Assertions.assertEquals(291, person.getHappiness());
    }

    @Test
    public void testPurr() {
        catSiamese.purr();
        System.out.println("murrSiamese");
    }

    @Test
    public void testPurrPerson() {
        catSiamese.purr(person);
        Assertions.assertEquals(309, person.getHappiness());
    }

    @Test
    public void testSetName() {
        catSiamese.setName("Siamic");
        Assertions.assertEquals("Siamic", catSiamese.getName());
    }
}
