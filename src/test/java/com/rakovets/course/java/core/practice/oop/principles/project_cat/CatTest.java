package com.rakovets.course.java.core.practice.oop.principles.project_cat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CatTest {

    @Test
    void mew() {
        // Given
        Cat cat = new Cat();
        String expectedMew = "mew-mew";

        // When
        String actualMew = cat.mew();

        // Than
        Assertions.assertEquals(expectedMew, actualMew);
    }

    @Test
    void personMew() {
        // Given
        Cat cat = new Cat();
        Person person = new Person(50);
        double expectedPersonHappiness = 47.5;

        // When
        cat.mew(person);

        // Than
        Assertions.assertEquals(expectedPersonHappiness, person.getHappiness());
    }

    @Test
    void purr() {
        // Given
        Cat cat = new Cat();
        String expectedPurr = "purr";

        // When
        String actualPurr = cat.purr();

        // Than
        Assertions.assertEquals(expectedPurr, actualPurr);
    }

    @Test
    void personPurr() {
        // Given
        Cat cat = new Cat();
        Person person = new Person(50);
        double expectedPersonHappiness = 52.5;

        // When
        cat.purr(person);

        // Than
        Assertions.assertEquals(expectedPersonHappiness, person.getHappiness());
    }

    @Test
    void getName() {
        // Given
        Cat cat = new Cat("Martin");
        String expectedGetName = "Martin";

        // When
        String actualGetName = cat.getName();

        // Than
        Assertions.assertEquals(expectedGetName, actualGetName);
    }

    @Test
    void setName() {
        // Given
        Cat cat = new Cat();
        String expectedSetName = "Aria";

        // When
        cat.setName("Aria");

        // Than
        Assertions.assertEquals(expectedSetName, cat.getName());
    }
}

