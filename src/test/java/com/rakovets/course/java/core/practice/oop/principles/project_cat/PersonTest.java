package com.rakovets.course.java.core.practice.oop.principles.project_cat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void changeHappiness() {
        // Given
        Person person = new Person(50);
        Double changeHappiness = 47.5;

        // When
        person.changeHappiness(-5);

        // Than
        Assertions.assertEquals(changeHappiness, person.getHappiness());
    }

    @Test
    void getHappiness() {
        // Given
        Person person = new Person(50);
        Double expectedGetHapiness = 50.0;

        // When
        Double actualGetHapiness = person.getHappiness();

        // Than
        Assertions.assertEquals(expectedGetHapiness, actualGetHapiness);
    }

    @Test
    void setHappines() {
        Person person = new Person(50);
        Double expectedGetHapiness = 100.0;

        // When
        person.setHappiness(100);

        // Than
        Assertions.assertEquals(expectedGetHapiness, person.getHappiness());
    }
}
