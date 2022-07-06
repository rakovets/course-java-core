package com.rakovets.course.java.core.practice.oop_principles.cats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatsTests {
    Cat cat = new Cat("Boris");
    Person boy = new Person(60);

    @Test
    void testCatMeows() {
        String expected = "MEW";

        String actual = cat.catMeows();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCatMeowsForPerson() {
        double expected = 40;

        double actual = cat.catMeows(boy);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCatPurrs() {
        String expected = "PURR";

        String actual = cat.catPurrs();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCatPurrsForPerson() {
        double expected = 70;

        double actual = cat.catPurrs(boy);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testGetName() {
        String expected = "Boris";

        String actual = cat.getName();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testSetName() {
        String expected = "Kitty";

        String actual = cat.setName("Kitty");

        Assertions.assertEquals(expected, actual);
    }


}
