package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.Persian;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTest {
    Person human = new Person(76);
    Persian persian = new Persian("Jafar");

    @Test
    void catMewTest() {
        Assertions.assertEquals("Moa-Moa-Moa", persian.mew());
    }

    @Test
    void catPurrTest() {
        Assertions.assertEquals("Prrrr_Prrrr-Prrrsss", persian.purr());
    }

    @Test
    void persianMewTest() {
        persian.mew(human);
        Assertions.assertEquals(16, human.getHappiness());
    }

    @Test
    void persianPurrTest() {
        persian.purr(human);
        Assertions.assertEquals(135, human.getHappiness());
    }
}

