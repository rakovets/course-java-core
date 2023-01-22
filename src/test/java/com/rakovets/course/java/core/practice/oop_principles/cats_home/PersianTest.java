package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersianTest {
    static Persian persian;

    @BeforeEach
    void init() {
        persian = new Persian("Fluffy");
    }

    @Test
    void siameseTest() {
        String actual = persian.getName();

        Assertions.assertEquals("Fluffy", actual);
    }

    @Test
    void mewTest1() {
        String actual = persian.mew();

        Assertions.assertEquals("Meoooow, meoooow!", actual);
    }

    @Test
    void mewTest2() {
        Person user = new Person(70);

        String actualString = persian.mew(user);
        int actual = user.getHappiness();

        Assertions.assertEquals("Meoooow, meoooow!", actualString);
        Assertions.assertEquals(59, actual);
    }

    @Test
    void purrTest1() {
        String actual = persian.purr();

        Assertions.assertEquals("Murrr...murrr...", actual);
    }

    @Test
    void purrTest2() {
        Person user = new Person(70);

        String actualString = persian.purr(user);
        int actual = user.getHappiness();

        Assertions.assertEquals("Murrr...murrr...", actualString);
        Assertions.assertEquals(82, actual);
    }

    @Test
    void getNameTest() {
        String actual = persian.getName();

        Assertions.assertEquals("Fluffy", actual);
    }

    @Test
    void setNameTest() {
        persian.setName("Barsik");
        String actual = persian.getName();

        Assertions.assertEquals("Barsik", actual);
    }
}
