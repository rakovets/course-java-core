package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTest {
    Persian persianCat = new Persian("Persik");
    Person loverOfPersianCats = new Person(70);

    @Test
    void persianCatMewTest() {
        String actual = persianCat.mew();
        Assertions.assertEquals("Mew in persian", actual);
    }

    @Test
    void persianCatMewForPersonTest() {
        int actual = persianCat.mew(loverOfPersianCats);
        Assertions.assertEquals(68, actual);
    }

    @Test
    void persianCatPurrTest() {
        String actual = persianCat.purr();
        Assertions.assertEquals("Mrr in persian", actual);
    }

    @Test
    void persianCatPurrForPersonTest() {
        int actual = persianCat.purr(loverOfPersianCats);
        Assertions.assertEquals(72, actual);
    }
}
