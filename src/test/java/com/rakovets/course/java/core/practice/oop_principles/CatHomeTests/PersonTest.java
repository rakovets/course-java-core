package com.rakovets.course.java.core.practice.oop_principles.CatHomeTests;

import com.rakovets.course.java.core.practice.oop_principles.CatHome.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    Person user = new Person(50);

    @Test
    void testPersonConsructor() {
        Person man = new Person(100);
        Assertions.assertEquals(100, man.getHappiness());
    }

    @Test
    void testChangeHappiness() {
        user.changeHappiness(10);
        Assertions.assertEquals(55, user.getHappiness());
    }

    @Test
    void testSetHappiness() {
        user.setHappiness(15);
        Assertions.assertEquals(15, user.getHappiness());
    }

    @Test
    void testGetHappiness() {
        Assertions.assertEquals(50, user.getHappiness());
    }
}
