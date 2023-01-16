package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    void  testValues() {
        Time time = new Time(1, 20, 12);

        Assertions.assertEquals(1, time.getHours());
        Assertions.assertEquals(20, time.getMinutes());
        Assertions.assertEquals(12, time.getSeconds());
        Assertions.assertEquals(4812, time.getTotalSeconds());
    }

    @Test
    void testValueTotal() {
        Time time = new Time(4812);

        Assertions.assertEquals(1, time.getHours());
        Assertions.assertEquals(20, time.getMinutes());
        Assertions.assertEquals(12, time.getSeconds());
        Assertions.assertEquals(4812, time.getTotalSeconds());
    }

    @Test
    void testValueSet() {
        Time time = new Time(0);

        time.setHours(1);
        Assertions.assertEquals(1, time.getHours());
        time.setMinutes(20);
        Assertions.assertEquals(20, time.getMinutes());
        time.setSeconds(12);
        Assertions.assertEquals(12, time.getSeconds());
    }
}
