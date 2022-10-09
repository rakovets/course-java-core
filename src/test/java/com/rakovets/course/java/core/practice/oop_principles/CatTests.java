package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTests {
    Cat cat = new Cat("Tosha");
    Person person = new Person(200);

    @Test
    public void testCat() {
        Assertions.assertEquals("Tosha", cat.getName());
    }

    @Test
    public void testMew() {
        cat.mew();
        System.out.println("mjau");
    }

    @Test
    public void testMewPerson() {
        cat.mew(person);
        Assertions.assertEquals(198, person.getHappiness());
    }

    @Test
    public void testPurr() {
        cat.purr();
        System.out.println("murr");
    }

    @Test
    public void testPurrPerson() {
        cat.purr(person);
        Assertions.assertEquals(202, person.getHappiness());
    }

    @Test
    public void testSetName() {
        cat.setName("Kosha");
        Assertions.assertEquals("Kosha", cat.getName());
    }
}
