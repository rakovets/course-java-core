package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTest {
    Person human = new Person(70);
    Persian persian = new Persian("Jafar");


    @Test
    void CatTest() {
        Assertions.assertEquals("Moa-Moa-Moa", persian.mew());
        Assertions.assertEquals("Prrrr_Prrrr-Prrrsss", persian.purr());
    }

    @Test
    void SiameseTest(){

        persian.mew(human);
        persian.purr(human);
        Assertions.assertEquals("69", human.getHappiness());
    }
}

