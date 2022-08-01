package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    private Cat siamese;
    private Person user;

    @BeforeEach
    public void initEach() {
        user = new Person(70);
        siamese = new Siamese("Siamese");
    }

    @Test
    public void testConstructor() {
        Assertions.assertEquals("Siamese", siamese.getName());
    }

    @Test
    public void testMew() {
        Assertions.assertEquals("mewww", siamese.mew());
    }

    @Test
    public void testPurr() {
        Assertions.assertEquals("pur-r-r", siamese.purr());
    }

    @Test
    public void testMewUser() {
        Assertions.assertEquals("mewww. Master, Siamese wants to eat!", siamese.mew(user));
        Assertions.assertEquals(55, user.getHappiness());
    }

    @Test
    public void testPurrUser() {
        Assertions.assertEquals("pur-r-r. Siamese is happy!", siamese.purr(user));
        Assertions.assertEquals(85, user.getHappiness());
    }
}
