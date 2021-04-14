package com.rakovets.course.java.core.practice.oop.principles.task01test;

import com.rakovets.course.java.core.practice.oop.principles.task01.Persian;
import com.rakovets.course.java.core.practice.oop.principles.task01.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersianTest {
    static Persian pers;
    static String name;
    static Person person;
    static double happiness;

    @BeforeEach
    void beforeAll() {
        name = "Vasya";
        pers = new Persian(name);
        happiness = 50.00;
        person = new Person(happiness);
    }

    @Test
    void mewTest() {
        String actual = pers.mew();
        Assertions.assertEquals("mew-mew-mew-mew",actual);
    }

    @Test
    void purrTest() {
        String actual = pers.purr();
        Assertions.assertEquals("prr-prr-prr",actual);
    }

    @Test
    void mewPersonTest() {
        pers.mew(person);
        double actual = person.getHappiness();
        Assertions.assertEquals(45.5,actual);
    }

    @Test
    void purrPersonTest() {
        pers.purr(person);
        double actual = person.getHappiness();
        Assertions.assertEquals(65.5,actual);
    }

    @Test
    void setAndGetNameTest() {
        String newName = "Petia";
        pers.setName(newName);
        String actual = pers.getName();
        Assertions.assertEquals("Petia",actual);
    }

}
