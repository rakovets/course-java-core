package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void getName() {
        Hero hero = new Hero("Jack");
        String expected = "Jack";
        String actual = hero.getName();
        Assertions.assertEquals(expected, actual);
    }
}
