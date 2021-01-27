package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CatTest {
    @Test
    void mewTest() {
        Cat barsik= new Cat("Barsik");
        String expectedMew="Mew";
        String actualMew= barsik.mew();
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void purrTest() {
        Cat barsik= new Cat("Barsik");
        String expectedPurr="Purr";
        String actualPurr= barsik.purr();
        Assertions.assertEquals(expectedPurr, actualPurr);
    }

}
