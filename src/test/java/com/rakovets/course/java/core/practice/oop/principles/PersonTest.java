package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void changeHappiness() {
        Person Ann = new Person(100);
        int expectedInt = Ann.changeHappiness(20);
        int actualInt = 120;
        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void getHappiness() {
        Person Ann = new Person(100);
        int actualInt = Ann.getHappiness();
        int expectedInt = 100;
        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void setHappiness() {
        Person Ann = new Person(100);
        Ann.setHappiness(120);
        int actualInt = Ann.getHappiness();
        int expectedInt = 120;
        Assertions.assertEquals(expectedInt, actualInt);
    }
}
