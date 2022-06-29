package com.rakovets.course.java.core.practice.oop_principles.CatHomeTests;

import com.rakovets.course.java.core.practice.oop_principles.CatHome.Person;
import com.rakovets.course.java.core.practice.oop_principles.CatHome.Siamese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    Siamese siamese = new Siamese("Siamese");
    private Person user = new Person(100);

    @Test
    void testConstructor() {
        Siamese white = new Siamese("Siamese");
        Assertions.assertEquals("Siamese", white.getName());
    }

    @Test
    void testMew() {
        Assertions.assertEquals("Mew-shhh-Mew", siamese.mew());
    }

    @Test
    void testMewWithPerson() {
        Assertions.assertEquals("Mew-shhh-Mew", siamese.mew(user));
        Assertions.assertEquals(50, user.getHappiness());
    }

    void testPurr() {
        Assertions.assertEquals("Purr-Purrrrrrr", siamese.purr());
    }

    @Test
    void testPurrWithPerson() {
        Assertions.assertEquals("Purr-Purrrrrrr", siamese.purr(user));
        Assertions.assertEquals(150, user.getHappiness());
    }

    @Test
    void getNameCat() {
        Assertions.assertEquals("Siamese", siamese.getName());
    }

    @Test
    void setNameCat() {
        siamese.setName("Siamese");
        Assertions.assertEquals("Siamese", siamese.getName());
    }
}
