package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    Person human = new Person(70);
    Siamese siamese = new Siamese("Po");

    @Test
    void CatMewTest() {
        Assertions.assertEquals("Miu-Miu_miu", siamese.mew());
    }

    @Test
    void CatPurrTest() {
        Assertions.assertEquals("Srrrr_Srrrr", siamese.purr());
    }

    @Test
    void SiameseMewTest() {
        siamese.mew(human);
        Assertions.assertEquals(50, human.getHappiness());
    }

    @Test
    void SiamesePurrTest() {
        siamese.purr(human);
        Assertions.assertEquals(115, human.getHappiness());
    }
}
