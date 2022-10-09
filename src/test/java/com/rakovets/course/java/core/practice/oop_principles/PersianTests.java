package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class PersianTests {
    Persian catPersian = new Persian("Persi");
    Person person = new Person(150);

    @Test
    public void testPersian() {
        Assertions.assertEquals("Persi", catPersian.getName());
    }

    @Test
    public void testMew() {
        catPersian.mew();
        System.out.println("mjauPersian");
    }

    @Test
    public void testMewPerson() {
        catPersian.mew(person);
        Assertions.assertEquals(147, person.getHappiness());
    }

    @Test
    public void testPurr() {
        catPersian.purr();
        System.out.println("murrPersian");
    }

    @Test
    public void testPurrPerson() {
        catPersian.purr(person);
        Assertions.assertEquals(153, person.getHappiness());
    }

    @Test
    public void testSetName() {
        catPersian.setName("Mercy");
        Assertions.assertEquals("Mercy", catPersian.getName());
    }
}
