package com.rakovets.course.java.core.practice.oop_principles.cats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTest {
    Persian cat = new Persian("Phelix");
    Person boy = new Person(60);

    @Test
    void testCatMeows() {
        String expected = "Meow";

        String actual = cat.catMeows();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCatMeowsForPerson() {
        double expected = 50;

        double actual = cat.catMeows(boy);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCatPurrs() {
        String expected = "Purr";

        String actual = cat.catPurrs();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCatPurrsForPerson() {
        double expected = 65;

        double actual = cat.catPurrs(boy);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testGetName() {
        String expected = "Phelix";

        String actual = cat.getName();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testSetName() {

        String expected = "Batty";

        String actual = cat.setName("Batty");

        Assertions.assertEquals(expected, actual);
    }
}
