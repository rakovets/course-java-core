package com.rakovets.course.java.core.practice.oop_principles.cat_home_test;

import com.rakovets.course.java.core.practice.oop_principles.cat_home.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
    private Person user;

    @BeforeEach
    void setup() {
        user = new Person(50);
    }

    @Test
    void testConstructor() {
        Assertions.assertEquals(50, user.getHappiness());
    }

    @Test
    void testConstructorHappinessBelowZero() {
        user = new Person(-10);
        Assertions.assertEquals(0, user.getHappiness());
    }

    @Test
    void testConstructorHappinessOver100() {
        user = new Person(110);
        Assertions.assertEquals(100, user.getHappiness());
    }

    @Test
    void testChangeHappiness() {
        user.changeHappiness(10);
        Assertions.assertEquals(60, user.getHappiness());
    }

    @Test
    void testChangeHappinessOver100() {
        user = new Person(100);
        user.changeHappiness(10);
        Assertions.assertEquals(100, user.getHappiness());
    }

    @Test
    void testChangeHappinessBelowZero() {
        user = new Person(0);
        user.changeHappiness(-10);
        Assertions.assertEquals(0, user.getHappiness());
    }

    @Test
    void testSetHappiness() {
        user.setHappiness(15);
        Assertions.assertEquals(15, user.getHappiness());
    }

    @Test
    void testSetHappinessBelowZero() {
        user.setHappiness(-15);
        Assertions.assertEquals(0, user.getHappiness());
    }

    @Test
    void testSetHappinessoOver100() {
        user.setHappiness(110);
        Assertions.assertEquals(100, user.getHappiness());
    }
}
