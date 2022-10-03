package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTests {
    @Test
    void testGetTotalSeconds() {
        Time time = new Time(24978);
        time.getTotalSeconds(6, 56, 18);

        Assertions.assertEquals(24978, time.getTotalSeconds(6, 56, 18));
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

