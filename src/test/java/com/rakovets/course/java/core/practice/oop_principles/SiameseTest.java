package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    Siamese siameseCat = new Siamese("Murzik");
    Person loverOfSiameseCats = new Person(45);

    @Test
    void siameseCatMewTest() {
        String actual = siameseCat.mew();
        Assertions.assertEquals("Mnew-mnew", actual);
    }

    @Test
    void siameseCatMewForPersonTest() {
        siameseCat.mew(loverOfSiameseCats);
        Assertions.assertEquals(42, loverOfSiameseCats.getHappiness());
    }

    @Test
    void siameseCatPurrTest() {
        String actual = siameseCat.purr();
        Assertions.assertEquals("Prr-prr", actual);
    }

    @Test
    void siameseCatPurrForPersonTest() {
        siameseCat.purr(loverOfSiameseCats);
        Assertions.assertEquals(48, loverOfSiameseCats.getHappiness());
    }
}
