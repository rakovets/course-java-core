package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersianTest {

    @Test
    void mew() {
        Persian jack = new Persian("Jack");
        String expected = "mew-pers";
        String actual = jack.mew();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void purr() {
        Persian jack = new Persian("Jack");
        String expected = "mrrr-pers";
        String actual = jack.purr();
        Assertions.assertEquals(expected, actual);
    }
}
