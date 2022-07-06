package com.rakovets.course.java.core.practice.oop_principles.cats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    Sphynx cat = new Sphynx("Pushok");
    Person boy = new Person(60);

    @Test
    void testCatMeows() {
        String expected = "MeoW";

        String actual = cat.catMeows();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCatMeowsForPerson() {
        double expected = 45;

        double actual = cat.catMeows(boy);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCatPurrs() {
        String expected = "PurR";

        String actual = cat.catPurrs();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCatPurrsForPerson() {
        double expected = 80;

        double actual = cat.catPurrs(boy);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testGetName() {
        String expected = "Pushok";

        String actual = cat.getName();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testSetName() {
        String expected = "Murzic";

        String actual = cat.setName("Murzic");

        Assertions.assertEquals(expected, actual);
    }
}
