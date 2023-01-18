package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    Cat standardCat = new Cat("Barsik");
    Person simplePerson = new Person(50);

    @Test
    void catMewTest() {
        String actual = standardCat.mew();
        Assertions.assertEquals("Meow-meow", actual);
    }

    @Test
    void catMewForPersonTest() {
        standardCat.mew(simplePerson);
        Assertions.assertEquals(49,simplePerson.getHappiness());
    }

    @Test
    void catPurrTest() {
        String actual = standardCat.purr();
        Assertions.assertEquals("Purr-purr", actual);
    }

    @Test
    void catPurrForPersonTest() {
        standardCat.purr(simplePerson);
        Assertions.assertEquals(51,simplePerson.getHappiness());
    }
}
