package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.Person;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats.Persian;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats.Siamese;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.cats.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCatsHome {

    @Test
    void testCatMew() {
        Cat cat = new Cat("muffin");

        Assertions.assertEquals("mew", cat.catMew());
    }

    @Test
    void testCatPurr() {
        Cat cat = new Cat("muffin");

        Assertions.assertEquals("purr", cat.catPurr());
    }

    @Test
    void testCatMewWithPerson() {
        Person user = new Person(100);

        Cat cat = new Cat("muffin");

        Assertions.assertEquals(100, user.getHappiness());
        Assertions.assertEquals("mewmew", cat.catMew(user));
        Assertions.assertEquals(90, user.getHappiness());
    }

    @Test
    void testCatPurrWithPerson() {
        Person user = new Person(100);

        Cat cat = new Cat("muffin");

        Assertions.assertEquals(100, user.getHappiness());
        Assertions.assertEquals("pupupurrr", cat.catPurr(user));
        Assertions.assertEquals(110, user.getHappiness());
    }

    @Test
    void testCatPersianMew() {
        Cat persian = new Persian("Persik");

        Assertions.assertEquals("MEW", persian.catMew());
    }

    @Test
    void testCatPersianPurr() {
        Cat persian = new Persian("Persik");

        Assertions.assertEquals("ururu", persian.catPurr());
    }

    @Test
    void testCatMewPersianWithPerson() {
        Person user = new Person(100);

        Cat persian = new Persian("Persik");

        Assertions.assertEquals(100, user.getHappiness());
        Assertions.assertEquals("mmmmmeeewwww", persian.catMew(user));
        Assertions.assertEquals(70, user.getHappiness());
    }

    @Test
    void testCatPurrPersianWithPerson() {
        Person user = new Person(100);

        Cat persian = new Persian("Persik");

        Assertions.assertEquals(100, user.getHappiness());
        Assertions.assertEquals("uru-uru-ururu", persian.catPurr(user));
        Assertions.assertEquals(150, user.getHappiness());
    }

    @Test
    void testCatSiameseMew() {
        Cat siamese = new Siamese("Sima");

        Assertions.assertEquals("meeew-meew", siamese.catMew());
    }

    @Test
    void testCatSiamesePurr() {
        Cat siamese = new Siamese("Sima");

        Assertions.assertEquals("puurrruru", siamese.catPurr());
    }

    @Test
    void testCatMewSiameseWithPerson() {
        Person user = new Person(100);

        Cat siamese = new Siamese("Sima");

        Assertions.assertEquals(100, user.getHappiness());
        Assertions.assertEquals("memewww-memewww", siamese.catMew(user));
        Assertions.assertEquals(80, user.getHappiness());
    }

    @Test
    void testCatPurrSiameseWithPerson() {
        Person user = new Person(100);

        Cat siamese = new Siamese("Sima");

        Assertions.assertEquals(100, user.getHappiness());
        Assertions.assertEquals("pururu", siamese.catPurr(user));
        Assertions.assertEquals(120, user.getHappiness());
    }

    @Test
    void testCatSphynxMew() {
        Cat sphynx = new Sphynx("Arnold");

        Assertions.assertEquals("MEW-mew", sphynx.catMew());
    }

    @Test
    void testCatSphynxPurr() {
        Cat sphynx = new Sphynx("Arnold");

        Assertions.assertEquals("ururu-ururu", sphynx.catPurr());
    }

    @Test
    void testCatMewSphynxWithPerson() {
        Person user = new Person(100);

        Cat sphynx = new Sphynx("Arnold");

        Assertions.assertEquals(100, user.getHappiness());
        Assertions.assertEquals("mewmew", sphynx.catMew(user));
        Assertions.assertEquals(60, user.getHappiness());
    }

    @Test
    void testCatPurrSphinxWithPerson() {
        Person user = new Person(100);

        Cat sphynx = new Sphynx("Arnold");

        Assertions.assertEquals(100, user.getHappiness());
        Assertions.assertEquals("uuuurrrrruuuu", sphynx.catPurr(user));
        Assertions.assertEquals(101, user.getHappiness());
    }
}
