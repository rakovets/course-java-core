package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    static Sphynx sphynx;

    @BeforeEach
    void init() {
        sphynx = new Sphynx("Cleo");
    }

    @Test
    void siameseTest() {
        String actual = sphynx.getName();

        Assertions.assertEquals("Cleo", actual);
    }

    @Test
    void mewTest1() {
        String actual = sphynx.mew();

        Assertions.assertEquals("Mau, mau, mau!", actual);
    }

    @Test
    void mewTest2() {
        Person user = new Person(70);

        String actualString = sphynx.mew(user);
        int actual = user.getHappiness();

        Assertions.assertEquals("Mau, mau, mau!", actualString);
        Assertions.assertEquals(58, actual);
    }

    @Test
    void purrTest1() {
        String actual = sphynx.purr();

        Assertions.assertEquals("Purrr...purrr...", actual);
    }

    @Test
    void purrTest2() {
        Person user = new Person(70);

        String actualString = sphynx.purr(user);
        int actual = user.getHappiness();

        Assertions.assertEquals("Purrr...purrr...", actualString);
        Assertions.assertEquals(79, actual);
    }

    @Test
    void getNameTest() {
        String actual = sphynx.getName();

        Assertions.assertEquals("Cleo", actual);
    }

    @Test
    void setNameTest() {
        sphynx.setName("Barsik");
        String actual = sphynx.getName();

        Assertions.assertEquals("Barsik", actual);
    }
}
