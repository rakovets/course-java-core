package com.rakovets.course.java.core.practice.oop_principles.cats_home_test;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.Person;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    Sphynx cat = new Sphynx("Onyx");
    Person testPersonOne = new Person(100);
    Person testPersonTwo = new Person(80);

    @Test
    void mewTest() {
        String actual = cat.mew();

        Assertions.assertEquals("Mew-mew-mew", actual);
    }

    @Test
    void purrTest() {
        String actual = cat.purr();

        Assertions.assertEquals("Pur-pur-pur", actual);
    }

    @Test
    void mewTest2() {
        cat.mew(testPersonOne);
        int actual = testPersonOne.getHappiness();

        Assertions.assertEquals(97, actual);
    }

    @Test
    void mewTest3() {
        cat.mew(testPersonOne);
        cat.mew(testPersonOne);
        int actual = testPersonOne.getHappiness();

        Assertions.assertEquals(94, actual);
    }

    @Test
    void mewTest4() {
        String actualMew = cat.mew(testPersonOne);
        cat.mew(testPersonOne);
        cat.mew(testPersonOne);
        int actual = testPersonOne.getHappiness();

        Assertions.assertEquals("Mew-mew-mew", actualMew);
        Assertions.assertEquals(91, actual);
    }

    @Test
    void purrTest1() {
        String actualPurr = cat.purr(testPersonTwo);
        int actualHappiness = testPersonTwo.getHappiness();

        Assertions.assertEquals("Pur-pur-pur", actualPurr);
        Assertions.assertEquals(83, actualHappiness);
    }

    @Test
    void purrTest2() {
        String actualPurr = cat.purr(testPersonTwo);
        cat.purr(testPersonTwo);
        int actualHappiness = testPersonTwo.getHappiness();

        Assertions.assertEquals("Pur-pur-pur", actualPurr);
        Assertions.assertEquals(86, actualHappiness);
    }

    @Test
    void purrTest3() {
        String actualPurr = cat.purr(testPersonTwo);
        cat.purr(testPersonTwo);
        cat.purr(testPersonTwo);
        int actualHappiness = testPersonTwo.getHappiness();

        Assertions.assertEquals("Pur-pur-pur", actualPurr);
        Assertions.assertEquals(89, actualHappiness);
    }
}
