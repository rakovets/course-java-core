package com.rakovets.course.java.core.practice.oop_principles.cats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    Person boy = new Person(100);

    @Test
    void testChangeHappiness() {
        double expected = 70;

        double actual = boy.changeHappiness(-30);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testGetHappiness() {
        double expected = 100;

        double actual = boy.getHappiness();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testSetHappiness() {
        double expected = 70;

        double actual = boy.setHappiness(70);

        Assertions.assertEquals(actual, expected);
    }


}
