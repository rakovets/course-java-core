package com.rakovets.course.java.core.practice.oop.principles.cats.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void Person() {
        Assertions.assertEquals(30.0, new Person(30).getHappiness());
    }

    @Test
    void changeHappiness() {
        Assertions.assertEquals(50.0, new Person(0.0).changeHappiness(50.0));
    }

    @Test
    void getHappiness() {
        Assertions.assertEquals(30.0, new Person(30.0).getHappiness());
    }

    @Test
    void setHappiness() {
        Person human = new Person(30.0);
        human.setHappiness(20);
        Assertions.assertEquals(20.0, human.getHappiness());
    }

}
