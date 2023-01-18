package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    Sphynx sphynxCat = new Sphynx("Flexik");
    Person loverOfSphynxCats = new Person(30);

    @Test
    void sphynxCatMewTest() {
        String actual = sphynxCat.mew();
        Assertions.assertEquals("Miaw", actual);
    }

    @Test
    void sphynxCatMewForPersonTest() {
        int actual = sphynxCat.mew(loverOfSphynxCats);
        Assertions.assertEquals(26, actual);
    }

    @Test
    void sphynxCatPurrForTest() {
        String actual = sphynxCat.purr();
        Assertions.assertEquals("Purr", actual);
    }

    @Test
    void sphynxCatPurrForPersonTest() {
        int actual = sphynxCat.purr(loverOfSphynxCats);
        Assertions.assertEquals(34, actual);
    }
}
