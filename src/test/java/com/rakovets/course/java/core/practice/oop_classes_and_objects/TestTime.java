package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTime {
    @Test
    public void testHoursPositive() {
        int hour = 1;
        Time time = new Time(hour, 0, 0);
        Assertions.assertEquals(hour, time.getHours());
    }

    @Test
    public void testHoursNegative() {
        int hour = 1;
        Time time = new Time(15, 0, 0);
        Assertions.assertNotEquals(hour, time.getHours());
    }

    @Test
    public void testMinutesPositive() {
        int minutes = 42;
        Time time = new Time(0, minutes, 0);
        Assertions.assertEquals(minutes, time.getMinutes());
    }

    @Test
    public void testMinutesNegative() {
        int minutes = 42;
        Time time = new Time(0, 50, 0);
        Assertions.assertNotEquals(minutes, time.getMinutes());
    }

    @Test
    public void testSecondsPositive() {
        int seconds = 18;
        Time time = new Time(0, 0, seconds);
        Assertions.assertEquals(seconds, time.getSeconds());
    }

    @Test
    public void testSecondsNegative() {
        int seconds = 18;
        Time time = new Time(0, 0, 30);
        Assertions.assertNotEquals(seconds, time.getSeconds());
    }

    @Test
    public void testTotalSeconds() {
        int hour = 1;
        Time time = new Time(hour, 0, 0);
        Assertions.assertEquals(3600, time.getTotalSeconds());
    }

    @Test
    public void testTotalSeconds2() {
        int hour = 2;
        Time time = new Time(hour, 0, 0);
        Assertions.assertEquals(7200, time.getTotalSeconds());
    }

    @Test
    public void testTotalSeconds3() {
        int hour = 2;
        int minutes = 10;
        Time time = new Time(hour, minutes, 0);
        Assertions.assertEquals(7800, time.getTotalSeconds());
    }

    @Test
    public void testTotalSeconds4() {
        int hour = 2;
        int minutes = 10;
        int seconds = 40;
        Time time = new Time(hour, minutes, seconds);
        Assertions.assertEquals(7840, time.getTotalSeconds());
    }

    @Test
    public void testTotalSecondsConstructor() {
        int totalSeconds = 7200;
        Time time = new Time(totalSeconds);
        Assertions.assertEquals(totalSeconds, time.getTotalSeconds());
    }

    @Test
    public void testTotalSecondsConstructor2() {
        int totalSeconds = 7800;
        Time time = new Time(totalSeconds);
        Assertions.assertEquals(totalSeconds, time.getTotalSeconds());
    }

    @Test
    public void testTotalSecondsConstructor3() {
        int totalSeconds = 7840;
        Time time = new Time(totalSeconds);
        Assertions.assertEquals(totalSeconds, time.getTotalSeconds());
    }
}
