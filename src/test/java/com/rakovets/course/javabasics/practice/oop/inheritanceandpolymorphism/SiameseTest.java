package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.Person;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.Siamese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    Person human = new Person(70);
    Siamese siamese = new Siamese("Po");

    @Test
    void catMewTest() {
        Assertions.assertEquals("Miu-Miu_miu", siamese.mew());
    }

    @Test
    void catPurrTest() {
        Assertions.assertEquals("Srrrr_Srrrr", siamese.purr());
    }

    @Test
    void siameseMewTest() {
        siamese.mew(human);
        Assertions.assertEquals(50, human.getHappiness());
    }

    @Test
    void siamesePurrTest() {
        siamese.purr(human);
        Assertions.assertEquals(115, human.getHappiness());
    }
}
