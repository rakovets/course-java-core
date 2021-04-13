package com.rakovets.course.java.core.practice.oop.principles.task01test;

import com.rakovets.course.java.core.practice.oop.principles.task01.Cat;
import com.rakovets.course.java.core.practice.oop.principles.task01.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CatTest {
    static Cat cat;
    static String name;
    static Person person;
    static double happiness;

    @BeforeEach
    void beforeAll(){
        name = "Vasya";
        cat = new Cat(name);
        happiness = 50.00;
        person = new Person(happiness);
    }

    @Test
    void mewTest() {
        String actual = cat.mew();
        Assertions.assertEquals("MEEEEEEW",actual);
    }

    @Test
    void purrTest() {
        String actual = cat.purr();
        Assertions.assertEquals("prr",actual);
    }

    @Test
    void mewPersonTest() {
        cat.mew(person);
        double actual = person.getHappiness();
        Assertions.assertEquals(34.95,actual);
    }

    @Test
    void purrPersonTest() {
        cat.purr(person);
        double actual = person.getHappiness();
        Assertions.assertEquals(65.05,actual);
    }

    @Test
    void setAndGetNameTest() {
        String newName = "Petia";
        cat.setName(newName);
        String actual = cat.getName();
        Assertions.assertEquals("Petia",actual);
    }

}
