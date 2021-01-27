package com.rakovets.course.java.core.practice.oop.principles.project_cat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SiameseTest {

    @Test
    void mew() {
        // Given
        Cat cat = new Siamese("Sema");
        String expectedMew = "Meeew";

        // When
        String actualMew = cat.mew();

        // Than
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void personMew() {
        // Given
        Cat cat = new Siamese("Sema");
        Person person = new Person(50);
        double expectedPersonHappiness = 60.0;

        // When
        cat.mew(person);

        // Than
        Assertions.assertEquals(expectedPersonHappiness, person.getHappiness());
    }

    @Test
    void purr() {
        // Given
        Cat cat = new Siamese("Sema");
        String expectedMew = "Purrr";

        // When
        String actualMew = cat.purr();

        // Than
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void personPurr() {
        // Given
        Cat cat = new Siamese("Sema");
        Person person = new Person(50);
        double expectedPersonHappiness = 52.5;

        // When
        cat.purr(person);

        // Than
        Assertions.assertEquals(expectedPersonHappiness, person.getHappiness());
    }
}
