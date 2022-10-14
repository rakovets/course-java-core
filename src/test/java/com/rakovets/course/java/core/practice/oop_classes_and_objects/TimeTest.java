package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    public void testGetHoursFromSeconds() {
    Time time = new Time (2020);
    Assertions.assertEquals(0, time.getHours());
    }

    @Test
    public void testGetMinutesFromSeconds() {
        Time time = new Time (180);
        Assertions.assertEquals(3,time.getMinutes());
    }

    @Test
    public void testGetSecondsFromSeconds() {
        Time time = new Time(2045);
        Assertions.assertEquals(2045,time.getTotalSeconds());
    }

    @Test
    public void  testGetMinutesFromHoursMinutesSeconds() {
        Time time = new Time(2, 30, 59);
        Assertions.assertEquals(150, time.getMinutes());
    }

    @Test
    public void testGetHoursFromHoursMinutesSeconds() {
        Time time = new Time(5, 40, 20);
        Assertions.assertEquals(5, time.getHours());
    }

    @Test
    public void testGetSecondsFromHoursMinutesSeconds() {
        Time time = new Time(3, 3, 3);
        Assertions.assertEquals(10983, time.getSeconds());
    }

    @Test
    public void testSetters() {
        Time time = new Time(3, 3, 3);
        time.setHours(5);
        time.setMinutes(10);
        time.setSeconds(30);
        Assertions.assertEquals(5, time.getHours());
        Assertions.assertEquals(10, time.getMinutes());
        Assertions.assertEquals(30, time.getSeconds());
    }
}
