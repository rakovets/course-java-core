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
    void testChangeHappiness() {
        user.changeHappiness(10);
        Assertions.assertEquals(60, user.getHappiness());
    }
}
