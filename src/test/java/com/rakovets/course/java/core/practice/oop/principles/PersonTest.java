package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {
    @Test
    void Person() {
        // GIVEN
        Person user = new Person(100);
        double expectedDouble = 100;
        // WHEN
        double actualDouble = user.getHappiness();
        // THAN
        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    @Test
    void changeHappiness() {
        // GIVEN
        Person user = new Person(100);
        double expectedDouble = 50;
        // WHEN
        user.changeHappiness(-50);
        double actualDouble = user.getHappiness();
        // THAN
        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    void setHappiness() {
        // GIVEN
        Person user = new Person(100);
        double expectedDouble = 160;
        // WHEN
        user.setHappiness(60);
        double actualDouble = user.getHappiness();
        // THAN
        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    void getHappiness() {
        // GIVEN
        Person user = new Person(10);
        double expectedDouble = 10;
        // WHEN
        double actualDouble = user.getHappiness();
        // THAN
        Assertions.assertEquals(expectedDouble, actualDouble);
    }
}
