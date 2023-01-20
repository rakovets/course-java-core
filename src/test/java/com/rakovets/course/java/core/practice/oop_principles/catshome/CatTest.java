package com.rakovets.course.java.core.practice.oop_principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CatTest {
    static Cat cat;

    @BeforeEach
    void init() {
        cat = new Cat("Tom");
    }

    @Test
    void catTest() {
        String actual = cat.getName();

        Assertions.assertEquals("Tom", actual);
    }

    @Test
    void mewTest1() {
        String actual = cat.mew();

        Assertions.assertEquals("Mew, mew, mew!", actual);
    }

    @Test
    void mewTest2() {
        Person user = new Person(70);

        String actualString = cat.mew(user);
        int actual = user.getHappiness();

        Assertions.assertEquals("Mew, mew, mew!", actualString);
        Assertions.assertEquals(65, actual);
    }

    @Test
    void purrTest1() {
        String actual = cat.purr();

        Assertions.assertEquals("Purr...", actual);
    }

    @Test
    void purrTest2() {
        Person user = new Person(70);

        String actualString = cat.purr(user);
        int actual = user.getHappiness();

        Assertions.assertEquals("Purr...", actualString);
        Assertions.assertEquals(75, actual);
    }

    @Test
    void getNameTest() {
        String actual = cat.getName();

        Assertions.assertEquals("Tom", actual);
    }

    @Test
    void setNameTest() {
        cat.setName("Barsik");
        String actual = cat.getName();

        Assertions.assertEquals("Barsik", actual);
    }
}
