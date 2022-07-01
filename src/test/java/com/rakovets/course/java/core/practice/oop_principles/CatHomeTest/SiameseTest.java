package com.rakovets.course.java.core.practice.oop_principles.CatHomeTest;

import com.rakovets.course.java.core.practice.oop_principles.CatHome.Cat;
import com.rakovets.course.java.core.practice.oop_principles.CatHome.Person;
import com.rakovets.course.java.core.practice.oop_principles.CatHome.Siamese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    private final Cat siamese = new Siamese("Siamese");
    private Person user;

    @BeforeEach
    void setup() {
        user = new Person(50);
    }

    @Test
    void testConstructor() {
        Assertions.assertEquals("Siamese", siamese.getName());
    }

    @Test
    void testMew() {
        Assertions.assertEquals("Mew-shhh-Mew", siamese.mew());
    }

    @Test
    void testMewWithPerson() {
        Assertions.assertEquals("Mew-shhh-Mew", siamese.mew(user));
        Assertions.assertEquals(0, user.getHappiness());
    }

    @Test
    void testMewWithPersonHappinessZero() {
        user = new Person(0);
        Assertions.assertEquals("Mew-shhh-Mew", siamese.mew(user));
        Assertions.assertEquals(0, user.getHappiness());
    }

    void testPurr() {
        Assertions.assertEquals("Purr-Purrrrrrr", siamese.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Purr-Purrrrrrr", siamese.purr(user));
        Assertions.assertEquals(100, user.getHappiness());
    }

    @Test
    void testPurrWithPersonHappiness100() {
        user = new Person(100);
        Assertions.assertEquals("Purr-Purrrrrrr", siamese.purr(user));
        Assertions.assertEquals(100, user.getHappiness());
    }

    @Test
    void testGetName() {
        Assertions.assertEquals("Siamese", siamese.getName());
    }

    @Test
    void setGetName() {
        siamese.setName("Wild");
        Assertions.assertEquals("Wild", siamese.getName());
    }
}
