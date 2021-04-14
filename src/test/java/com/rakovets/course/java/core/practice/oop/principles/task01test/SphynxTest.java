package com.rakovets.course.java.core.practice.oop.principles.task01test;

import com.rakovets.course.java.core.practice.oop.principles.task01.Person;
import com.rakovets.course.java.core.practice.oop.principles.task01.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    static Sphynx sph;
    static String name;
    static Person person;
    static double happiness;

    @BeforeEach
    void beforeAll() {
        name = "Vasya";
        sph = new Sphynx(name);
        happiness = 50.00;
        person = new Person(happiness);
    }

    @Test
    void mewTest() {
        String actual = sph.mew();
        Assertions.assertEquals("MEEEEEEEEEEWWWWWWWWW",actual);
    }

    @Test
    void purrTest() {
        String actual = sph.purr();
        Assertions.assertEquals("PPPPPPRRRPRPRPRPPR",actual);
    }

    @Test
    void mewPersonTest() {
        sph.mew(person);
        double actual = person.getHappiness();
        Assertions.assertEquals(-5.5,actual);
    }

    @Test
    void purrPersonTest() {
        sph.purr(person);
        double actual = person.getHappiness();
        Assertions.assertEquals(51.5,actual);
    }

    @Test
    void setAndGetNameTest() {
        String newName = "Petia";
        sph.setName(newName);
        String actual = sph.getName();
        Assertions.assertEquals("Petia",actual);
    }
}
