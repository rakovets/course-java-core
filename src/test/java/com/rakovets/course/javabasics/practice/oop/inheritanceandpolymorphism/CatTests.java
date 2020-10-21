package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CatTests {
    Cat murka = new Cat("Murka");
    Person human = new Person(70);

    @Test
    void catMewTest() {
        Assertions.assertEquals("Mau-Mau-Mau", murka.mew());
    }

    @Test
    void catPurrTest() {
        Assertions.assertEquals("Trrrrrrr-Trrrrrrr", murka.purr());
    }

    @Test
    void catMurkaMewTest() {
        murka.mew(human);
        Assertions.assertEquals(58, human.getHappiness());

    }

    @Test
    void catMurkaPurrTest() {
        murka.purr(human);
        Assertions.assertEquals(80, human.getHappiness());

    }

}
