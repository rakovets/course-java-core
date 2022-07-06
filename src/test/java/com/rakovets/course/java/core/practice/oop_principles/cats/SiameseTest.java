package com.rakovets.course.java.core.practice.oop_principles.cats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    Siamese cat = new Siamese("Timur");
    Person boy = new Person(60);

    @Test
    void testCatMeows() {
        String expected = "meow";

        String actual = cat.catMeows();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCatMeowsForPerson() {
        double expected = 55;

        double actual = cat.catMeows(boy);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCatPurrs() {
        String expected = "purr";

        String actual = cat.catPurrs();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCatPurrsForPerson() {
        double expected = 75;

        double actual = cat.catPurrs(boy);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testGetName() {
        String expected = "Timur";

        String actual = cat.getName();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testSetName() {
        String expected = "Tom";

        String actual = cat.setName("Tom");

        Assertions.assertEquals(expected, actual);
    }
}
