package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CatTests {
    Cat murka = new Cat("Murka");
    Person human = new Person(70);
    @Test
    void CatTest() {
        Cat murka = new Cat("Murka");
        Assertions.assertEquals("Mau-Mau-Mau", murka.mew());
        Assertions.assertEquals("Trrrrrrr-Trrrrrrr", murka.purr());

    }

    @Test
    void CatMurkaMewTest() {
        murka.mew(human);
        Assertions.assertEquals(58, human.getHappiness());

    }    @Test
    void CatMurkaPurrTest() {
        murka.purr(human);
        Assertions.assertEquals(80, human.getHappiness());

    }

}
