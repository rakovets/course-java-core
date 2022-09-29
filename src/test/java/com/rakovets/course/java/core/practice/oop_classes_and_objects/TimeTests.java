package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTests {

    @Test
    public void testGetTime() {
        Time time = new Time();
        Assertions.assertEquals(0, time.getHours());
        Assertions.assertEquals(0, time.getMinutes());
        Assertions.assertEquals(0, time.getSeconds());
        Assertions.assertEquals(0, time.getTotalSeconds());
    }

    @Test
    public void testGetTime2() {
        Time time = new Time(1, 45, 34);
        Assertions.assertEquals(1, time.getHours());
        Assertions.assertEquals(45, time.getMinutes());
        Assertions.assertEquals(34, time.getSeconds());
        Assertions.assertEquals(6334, time.getTotalSeconds());
    }

    @Test
    public void testGetTime3() {
        Time time = new Time(4567);
        Assertions.assertEquals(1, time.getHours());
        Assertions.assertEquals(16, time.getMinutes());
        Assertions.assertEquals(7, time.getSeconds());
        Assertions.assertEquals(4567, time.getTotalSeconds());
    }

    @Test
    public void testSetTime() {
        Time time = new Time();
        time.setHours(2);
        time.setMinutes(15);
        time.setSeconds(45);
        Assertions.assertEquals(2, time.getHours());
        Assertions.assertEquals(15, time.getMinutes());
        Assertions.assertEquals(45, time.getSeconds());
        Assertions.assertEquals(8145, time.getTotalSeconds());
    }
}
