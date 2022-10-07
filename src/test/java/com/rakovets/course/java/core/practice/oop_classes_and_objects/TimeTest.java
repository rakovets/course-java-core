package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    void testGetTotalSeconds() {
        Time time = new Time(5, 56, 18);
        time.getTotalSeconds(5, 56, 18);

        Assertions.assertEquals(21378, time.getTotalSeconds(5, 56, 18));
    }

    @Test
    void testSetHours() {
        Time time = new Time(2, 43, 5);
        time.setHours(8);
        System.out.println(time.getHours());
    }

    @Test
    void testGetSeconds() {
        Time time = new Time(4,56,3);
        System.out.println(time.getSeconds());
    }
}
