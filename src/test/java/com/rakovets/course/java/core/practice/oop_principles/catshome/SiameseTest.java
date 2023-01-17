package com.rakovets.course.java.core.practice.oop_principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    @Test
    void siameseTest() {
        Siamese siamese = new Siamese("Marple");

        String actual = siamese.getName();

        Assertions.assertEquals("Marple", actual);
    }

    @Test
    void mewTest1() {
        Cat cat = new Cat("Tom");

        String actual = cat.mew();

        Assertions.assertEquals("Mew, mew, mew!", actual);
    }

    @Test
    void mewTest2() {
        Cat cat = new Cat("Tom");
        Person user = new Person(70);

        String actualString = cat.mew(user);
        int actual = user.getHappiness();

        Assertions.assertEquals("Mew, mew, mew!", actualString);
        Assertions.assertEquals(65, actual);
    }

    @Test
    void purrTest1() {
        Cat cat = new Cat("Tom");

        String actual = cat.purr();

        Assertions.assertEquals("Purr...", actual);
    }

    @Test
    void purrTest2() {
        Cat cat = new Cat("Tom");
        Person user = new Person(70);

        String actualString = cat.purr(user);
        int actual = user.getHappiness();

        Assertions.assertEquals("Purr...", actualString);
        Assertions.assertEquals(75, actual);
    }

    @Test
    void getNameTest() {
        Cat cat = new Cat("Tom");

        String actual = cat.getName();

        Assertions.assertEquals("Tom", actual);
    }

    @Test
    void setNameTest() {
        Cat cat = new Cat("Tom");

        cat.setName("Barsik");
        String actual = cat.getName();

        Assertions.assertEquals("Barsik", actual);
    }
}
