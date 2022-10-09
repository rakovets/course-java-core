package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTests {
    Siamese catSiamese = new Siamese("Simasic");

    @Test
    public void testSiamese() {
        Assertions.assertEquals("Simasic", catSiamese.getName());
    }

    @Test
    public void testMew() {
        catSiamese.mew();
        System.out.println("mjauSiamese");
    }

    @Test
    public void testPurr() {
        catSiamese.purr();
        System.out.println("murrSiamese");
    }

    @Test
    public void testSetName() {
        catSiamese.setName("Siamic");
        Assertions.assertEquals("Siamic", catSiamese.getName());
    }
}
