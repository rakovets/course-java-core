package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SiameseTest {

    @Test
    void mew() {
        Siamese jack = new Siamese("Jack");
        String expected = "mew-sim";
        String actual = jack.mew();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void purr() {
        Siamese jack = new Siamese("Jack");
        String expected = "mrrr-sim";
        String actual = jack.purr();
        Assertions.assertEquals(expected, actual);
    }
}
