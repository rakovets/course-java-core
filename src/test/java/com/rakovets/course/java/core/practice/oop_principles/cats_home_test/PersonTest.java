package com.rakovets.course.java.core.practice.oop_principles.cats_home_test;

import com.rakovets.course.java.core.practice.oop_principles.cats_home.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    Person person = new Person(100);

    @Test
    public void changeHappinessTest1() {
        int percentHappiness = -8;
        person.changeHappiness(percentHappiness);
        int actual = person.getHappiness();

        Assertions.assertEquals(92, actual);
    }

    @Test
    public void changeHappinessTest2() {
        int percentHappiness = 5;
        person.changeHappiness(percentHappiness);
        int actual = person.getHappiness();

        Assertions.assertEquals(105, actual);
    }

    @Test
    public void changeHappinessTest3() {
        int percentHappiness = -3;
        person.changeHappiness(percentHappiness);
        int actual = person.getHappiness();

        Assertions.assertEquals(97, actual);
    }

    @Test
    public void PersonTest1() {
        Person person = new Person(80);
        int actual = person.getHappiness();

        Assertions.assertEquals(80, actual);
    }

    @Test
    public void PersonTest2() {
        Person person = new Person(64);
        int actual = person.getHappiness();

        Assertions.assertEquals(64, actual);
    }

    @Test
    public void PersonTest3() {
        Person person = new Person(78);
        int actual = person.getHappiness();

        Assertions.assertEquals(78, actual);
    }
}
