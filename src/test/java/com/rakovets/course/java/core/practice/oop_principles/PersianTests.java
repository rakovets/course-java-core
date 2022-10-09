package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTests {
    Persian catPersian = new Persian("Persi");

    @Test
    public void testPersian() {
        Assertions.assertEquals("Persi", catPersian.getName());
    }

    @Test
    public void testMew() {
        catPersian.mew();
        System.out.println("mjauPersian");
    }

    @Test
    public void testPurr() {
        catPersian.purr();
        System.out.println("murrPersian");
    }

    @Test
    public void testSetName() {
        catPersian.setName("Mercy");
        Assertions.assertEquals("Mercy", catPersian.getName());
    }
}
