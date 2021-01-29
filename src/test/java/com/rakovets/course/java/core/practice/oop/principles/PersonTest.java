package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void changeHappiness() {
        Person bill = new Person(90);
        double expected = 85.0;

        double actual = bill.changeHappiness(-5.0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setHappiness() {
        Person bill = new Person(90);
        bill.setHappiness(100);

        double expected = 100;
        double actual = bill.getHappiness();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getHappiness() {
        Person bill = new Person(100);
        double expected = 100;

        double actual = bill.getHappiness();

        Assertions.assertEquals(expected, actual);
    }
}
