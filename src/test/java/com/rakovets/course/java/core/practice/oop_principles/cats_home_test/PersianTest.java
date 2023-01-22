package com.rakovets.course.java.core.practice.oop_principles.cats_home_test;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.Persian;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersianTest {

    static Persian cat = new Persian("Aspen");
    Person testPersonOne = new Person(100);
    Person testPersonTwo = new Person(75);

    @Test
    void mewTest() {
        String actual = cat.mew();

        Assertions.assertEquals("meeeeew", actual);
    }

    @Test
    void purrTest() {
        String actual = cat.purr();

        Assertions.assertEquals("puuuur", actual);
    }

    @Test
    void mewTest2() {
        cat.mew(testPersonOne);
        int actual = testPersonOne.getHappiness();

        Assertions.assertEquals(96, actual);
    }

    @Test
    void mewTest3() {
        cat.mew(testPersonOne);
        cat.mew(testPersonOne);
        int actual = testPersonOne.getHappiness();

        Assertions.assertEquals(92, actual);
    }

    @Test
    void mewTest4() {
        String actualMew = cat.mew(testPersonOne);
        cat.mew(testPersonOne);
        cat.mew(testPersonOne);
        int actual = testPersonOne.getHappiness();

        Assertions.assertEquals("meeeeew", actualMew);
        Assertions.assertEquals(88, actual);
    }

    @Test
    void purrTest1() {
        String actualPurr = cat.purr(testPersonTwo);
        int actualHappiness = testPersonTwo.getHappiness();

        Assertions.assertEquals("puuuur", actualPurr);
        Assertions.assertEquals(80, actualHappiness);
    }

    @Test
    void purrTest2() {
        String actualPurr = cat.purr(testPersonTwo);
        cat.purr(testPersonTwo);
        int actualHappiness = testPersonTwo.getHappiness();

        Assertions.assertEquals("puuuur", actualPurr);
        Assertions.assertEquals(85, actualHappiness);
    }

    @Test
    void purrTest3() {
        String actualPurr = cat.purr(testPersonTwo);
        cat.purr(testPersonTwo);
        cat.purr(testPersonTwo);
        int actualHappiness = testPersonTwo.getHappiness();

        Assertions.assertEquals("puuuur", actualPurr);
        Assertions.assertEquals(90, actualHappiness);
    }
}
