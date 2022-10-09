package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTests {
    Person person = new Person(200);

    @Test
    public void testPerson() {
        Assertions.assertEquals(200, person.getHappiness());
    }

    @Test
    public void testChangeHappiness() {
        person.changeHappiness(-10);
        Assertions.assertEquals(180, person.getHappiness());
    }
}
