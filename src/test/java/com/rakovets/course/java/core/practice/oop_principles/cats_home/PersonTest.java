package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
    private Person user;

    @BeforeEach
    public void initEach() {
        user = new Person(70);
    }

    @Test
    public void testConstructor() {
        Assertions.assertEquals(70, user.getHappiness());
    }

    @Test
    public void testChangePositiveHappiness() {
        user.changeHappiness(10);
        Assertions.assertEquals(80, user.getHappiness());
    }

    @Test
    public void testChangeNegativeHappiness() {
        user.changeHappiness(-10);
        Assertions.assertEquals(60, user.getHappiness());
    }
}
