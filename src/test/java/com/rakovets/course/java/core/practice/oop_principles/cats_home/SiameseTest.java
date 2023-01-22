package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    static Siamese siamese;

    @BeforeEach
    void init() {
        siamese = new Siamese("Marple");
    }

    @Test
    void siameseTest() {
        String actual = siamese.getName();

        Assertions.assertEquals("Marple", actual);
    }

    @Test
    void mewTest1() {
        String actual = siamese.mew();

        Assertions.assertEquals("Meow, meow, meow!", actual);
    }

    @Test
    void mewTest2() {
        Person user = new Person(70);

        String actualString = siamese.mew(user);
        int actual = user.getHappiness();

        Assertions.assertEquals("Meow, meow, meow!", actualString);
        Assertions.assertEquals(63, actual);
    }

    @Test
    void purrTest1() {
        String actual = siamese.purr();

        Assertions.assertEquals("Murrr...", actual);
    }

    @Test
    void purrTest2() {
        Person user = new Person(70);

        String actualString = siamese.purr(user);
        int actual = user.getHappiness();

        Assertions.assertEquals("Murrr...", actualString);
        Assertions.assertEquals(78, actual);
    }

    @Test
    void getNameTest() {
        String actual = siamese.getName();

        Assertions.assertEquals("Marple", actual);
    }

    @Test
    void setNameTest() {
        siamese.setName("Barsik");
        String actual = siamese.getName();

        Assertions.assertEquals("Barsik", actual);
    }
}
