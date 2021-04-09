package com.rakovets.course.java.core.practice.oop.principles.task01test;

import com.rakovets.course.java.core.practice.oop.principles.task01.Person;
import com.rakovets.course.java.core.practice.oop.principles.task01.Siames;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SiamesTest {
    static Siames sia;
    static String name;
    static Person person;
    static double happiness;

    @BeforeEach
    void beforeAll(){
        name = "Vasya";
        sia = new Siames(name);
        happiness = 50.00;
        person = new Person(happiness);
    }

    @Test
    void mewTest() {
        String actual = sia.mew();
        Assertions.assertEquals("MEW-MEW_MEW",actual);
    }

    @Test
    void purrTest() {
        String actual = sia.purr();
        Assertions.assertEquals("PRR-PRR-PRR",actual);
    }

    @Test
    void mewPersonTest() {
        sia.mew(person);
        double actual = person.getHappiness();
        Assertions.assertEquals(39.5,actual);
    }

    @Test
    void purrPersonTest() {
        sia.purr(person);
        double actual = person.getHappiness();
        Assertions.assertEquals(70.5,actual);
    }

    @Test
    void setAndGetNameTest() {
        String newName = "Petia";
        sia.setName(newName);
        String actual = sia.getName();
        Assertions.assertEquals("Petia",actual);
    }
}
