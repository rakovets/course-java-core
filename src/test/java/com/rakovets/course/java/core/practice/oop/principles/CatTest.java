package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class CatTest {
    @Test
    void mew() {
        // GIVEN
        Cat cat = new Cat("Boriska");
        String expectedMew = "meow";
        // WHEN
        String actualMew = cat.mew();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void purr() {
        // GIVEN
        Cat cat = new Cat("Boriska");
        String expectedMew = "mr";
        // WHEN
        String actualMew = cat.purr();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }
    @Test
    void getName() {
        // GIVEN
        Cat cat = new Cat("Boriska");
        String expectedMew = "Boriska";
        // WHEN
        String actualMew = cat.getName();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void setName() {
        // GIVEN
        Cat cat = new Cat("Boriska");
        String expectedMew = "Jerry";
        // WHEN
        cat.setName("Jerry");
        String actualMew = cat.getName();
        // THAN
        Assertions.assertEquals(expectedMew, actualMew);
    }

}
