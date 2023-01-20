package com.rakovets.course.java.core.practice.oop_principles.cats_home_test;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.Person;
import com.rakovets.course.java.core.practice.oop_principles.cats_home.Siamese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    Siamese cat = new Siamese("Alba");
    Person testPersonOne = new Person(100);
    Person testPersonTwo = new Person(80);

    @Test
    void mewTest() {
        String actual = cat.mew();

        Assertions.assertEquals("meeew-meeew-meeew", actual);
    }

    @Test
    void purrTest() {
        String actual = cat.purr();

        Assertions.assertEquals("purr-puuuurr-purr", actual);
    }

    @Test
    void mewTest2() {
        cat.mew(testPersonOne);
        int actual = testPersonOne.getHappiness();

        Assertions.assertEquals(95, actual);
    }

    @Test
    void mewTest3() {
        cat.mew(testPersonOne);
        cat.mew(testPersonOne);
        int actual = testPersonOne.getHappiness();

        Assertions.assertEquals(90, actual);
    }

    @Test
    void mewTest4() {
        String actualMew = cat.mew(testPersonOne);
        cat.mew(testPersonOne);
        cat.mew(testPersonOne);
        int actual = testPersonOne.getHappiness();

        Assertions.assertEquals("meeew-meeew-meeew", actualMew);
        Assertions.assertEquals(85, actual);
    }

    @Test
    void purrTest1() {
        String actualPurr = cat.purr(testPersonTwo);
        int actualHappiness = testPersonTwo.getHappiness();

        Assertions.assertEquals("purr-puuuurr-purr", actualPurr);
        Assertions.assertEquals(82, actualHappiness);
    }

    @Test
    void purrTest2() {
        String actualPurr = cat.purr(testPersonTwo);
        cat.purr(testPersonTwo);
        int actualHappiness = testPersonTwo.getHappiness();

        Assertions.assertEquals("purr-puuuurr-purr", actualPurr);
        Assertions.assertEquals(84, actualHappiness);
    }

    @Test
    void purrTest3() {
        String actualPurr = cat.purr(testPersonTwo);
        cat.purr(testPersonTwo);
        cat.purr(testPersonTwo);
        int actualHappiness = testPersonTwo.getHappiness();

        Assertions.assertEquals("purr-puuuurr-purr", actualPurr);
        Assertions.assertEquals(86, actualHappiness);
    }
}
