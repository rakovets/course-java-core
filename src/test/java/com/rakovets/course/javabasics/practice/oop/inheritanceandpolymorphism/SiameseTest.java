package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    Person human = new Person(70);
    Siamese siamese = new Siamese("Po");

    @Test
    void CatTest() {
        Assertions.assertEquals("Miu-Miu_miu", siamese.mew());
        Assertions.assertEquals("Srrrr_Srrrr", siamese.purr());
    }

    @Test
    void SiameseTest(){
        siamese.mew(human);
        siamese.purr(human);
        Assertions.assertEquals("70", human.getHappiness());
    }
}
