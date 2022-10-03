package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTime {
    @Test
    public void testGetHoursFromTotalSeconds() {
        Time time = new Time(65656);
        Assertions.assertEquals(18, time.getHours());
    }

    @Test
    public void testGetMinutesFromTotalSeconds() {
        Time time = new Time(126);
        Assertions.assertEquals(2, time.getMinutes());
    }

    @Test
    public void testGetSecondsFromTotalSeconds() {
        Time time = new Time(2313);
        Assertions.assertEquals(2313, time.getSeconds());
    }

    @Test
    public void testGetHoursFromHoursMinutesSeconds() {
        Time time = new Time(4, 5, 6);
        Assertions.assertEquals(4, time.getHours());
    }

    @Test
    public void testGetMinutesFromHoursMinutesSeconds() {
        Time time = new Time(5, 40, 20);
        Assertions.assertEquals(340, time.getMinutes());
    }

    @Test
    public void testGetSecondsFromHoursMinutesSeconds() {
        Time time = new Time(2, 15, 45);
        Assertions.assertEquals(8145, time.getSeconds());
    }
    @Test
    public void testSetHours() {
        Time time = new Time(1, 5, 69);
        time.setHours(6);
        time.setMinutes(30);
        time.setSeconds(10);
        Assertions.assertEquals(6, time.getHours());
        Assertions.assertEquals(30, time.getMinutes());
        Assertions.assertEquals(10, time.getSeconds());
    }
}





