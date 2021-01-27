package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.cat.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void changeHappiness() {
        Person Andr = new Person(100);
        int expectedInt = Andr.changeHappiness(10);
        int actualInt = 110;
        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void getHappiness() {
        Person Andr = new Person(100);
        int actualInt = Andr.getHappiness();
        int expectedInt = 100;
        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void setHappiness() {
        Person Andr = new Person(100);
        Andr.setHappiness(110);
        int expectedInt = Andr.getHappiness();
        int actualInt = 110;
        Assertions.assertEquals(expectedInt, actualInt);
    }
}
