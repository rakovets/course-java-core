package com.rakovets.course.java.core.practice.oop_principles.cat_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPerson {
    Person person = new Person(100);
    Person person1 = new Person(190688);

    @Test
    void testPersonConstructor() {
        //GIVEN
        person.setHappiness(5);

        //WHEN
        int actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(5, actual);
    }

    @Test
    void testPersonConstructor1() {
        //WHEN
        int actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(100, actual);
    }

    @Test
    void testPersonConstructor2() {
        //GIVEN
        person.changeHappiness(5);

        //WHEN
        int actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(105, actual);
    }

    @Test
    void testPersonConstructor3() {
        //WHEN
        int actual = person1.getHappiness();

        //THEN
        Assertions.assertEquals(190688, actual);
    }
}
