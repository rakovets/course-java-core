package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTests {
    @Test
    public void testGetHoursFromTotalSeconds() {
        Time time = new Time(1234567);
        Assertions.assertEquals(342, time.getHours());
    }

    @Test
    public void testGetMinutesFromTotalSeconds() {
        Time time = new Time(67);
        Assertions.assertEquals(1, time.getMinutes());
    }

    @Test
    public void testGetSecondsFromTotalSeconds() {
        Time time = new Time(1234567);
        Assertions.assertEquals(7, time.getSeconds());
    }

    @Test
    public void testGetHoursFromHoursMinutesSeconds() {
        Time time = new Time(4, 5, 6);
        Assertions.assertEquals(4, time.getHours());
    }

    @Test
    public void testGetMinutesFromHoursMinutesSeconds() {
        Time time = new Time(4, 5, 6);
        Assertions.assertEquals(5, time.getMinutes());
    }

    @Test
    public void testGetSecondsFromHoursMinutesSeconds() {
        Time time = new Time(4, 5, 6);
        Assertions.assertEquals(6, time.getSeconds());
    }

    @Test
    public void testGetTotalSeconds() {
        Time time = new Time(4, 5, 6);
        Assertions.assertEquals(14706, time.getTotalSeconds());
    }

    @Test
    public void testSetHours() {
        Time time = new Time(4, 5, 6);
        time.setHours(7);
        Assertions.assertEquals(7, time.getHours());
    }

    @Test
    public void testSetMinutes() {
        Time time = new Time(4, 5, 6);
        time.setMinutes(8);
        Assertions.assertEquals(8, time.getMinutes());
    }

    @Test
    public void testSetSeconds() {
        Time time = new Time(4, 5, 6);
        time.setSeconds(9);
        Assertions.assertEquals(9, time.getSeconds());
    }
}
