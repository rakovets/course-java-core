package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTest {
    Person human = new Person(76);
    Persian persian = new Persian("Jafar");


    @Test
    void CatTest() {
        Assertions.assertEquals("Moa-Moa-Moa", persian.mew());
        Assertions.assertEquals("Prrrr_Prrrr-Prrrsss", persian.purr());
    }

    @Test
    void SiameseMewTest(){
        persian.mew(human);
        Assertions.assertEquals("16", human.getHappiness());
    }

    @Test
    void SiamesePurrTest(){
        persian.purr(human);
        Assertions.assertEquals("135", human.getHappiness());
    }
}

