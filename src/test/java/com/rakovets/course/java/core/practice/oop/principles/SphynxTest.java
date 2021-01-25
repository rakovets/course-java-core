package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphynxTest {

    @Test
    void mew() {
        Sphynx jack = new Sphynx("Jack");
        String expected = "mew-sfi";
        String actual = jack.mew();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void purr() {
        Sphynx jack = new Sphynx("Jack");
        String expected = "mrrr-sfi";
        String actual = jack.purr();
        Assertions.assertEquals(expected, actual);
    }
}
