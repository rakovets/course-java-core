package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void mew() {
        Cat jack = new Cat("Jack");
        String expected = "mew-mew";
        String actual = jack.mew();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void purr() {
        Cat jack = new Cat("Jack");
        String expected = "mrrr";
        String actual = jack.purr();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getName() {
        Cat jack = new Cat("Jack");
        String expected = "Jack";
        String actual = jack.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setName() {
        Cat jack = new Cat("Bill");
        jack.setName("Jack");
        String expected = "Jack";
        String actual = jack.getName();
        Assertions.assertEquals(expected, actual);
    }
}
