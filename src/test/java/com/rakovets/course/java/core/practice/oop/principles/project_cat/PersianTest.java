package com.rakovets.course.java.core.practice.oop.principles.project_cat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersianTest {

    @Test
    void mew() {

        // Given
        Cat cat = new Persian("Kit");
        String expectedMew = "Meeew - meeew";

        // When
        String actualMew = cat.mew();

        // Than
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void personMew() {
        // Given
        Cat cat = new Persian("Kit");
        Person person = new Person(50);
        double expectedPersonHappiness = 55.0;

        // When
        cat.mew(person);

        // Than
        Assertions.assertEquals(expectedPersonHappiness, person.getHappiness());
    }

    @Test
    void purr() {

        // Given
        Cat cat = new Persian("Kit");
        String expectedMew = "Purrr - purrr";

        // When
        String actualMew = cat.purr();

        // Than
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void personPurr() {
        // Given
        Cat cat = new Persian("Kit");
        Person person = new Person(50);
        double expectedPersonHappiness = 45.0;

        // When
        cat.purr(person);

        // Than
        Assertions.assertEquals(expectedPersonHappiness, person.getHappiness());
    }
}
