package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    Person person = new Person(100);

    @Test
    void changeHappinessTest() {
        int actual = person.changeHappiness(-20);
        Assertions.assertEquals(80, actual);
    }

    @Test
    void getHappinessTest() {
        int actual = person.getHappiness();
        Assertions.assertEquals(100, actual);
    }

    @Test
    void setHappinessTest() {
        int actual = person.setHappiness(70);
        Assertions.assertEquals(70, actual);
    }
}
