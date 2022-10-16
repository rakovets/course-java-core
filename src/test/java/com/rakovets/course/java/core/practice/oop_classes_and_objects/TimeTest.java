package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    public void testGetHoursFromTotalSeconds() {
        // GIVEN
        Time time = new Time(65656);

        //THEN
        Assertions.assertEquals(18, time.getHours());
    }

    @Test
    public void testGetMinutesFromTotalSeconds() {
        // GIVEN
        Time time = new Time(126);

        //THEN
        Assertions.assertEquals(2, time.getMinutes());
    }

    @Test
    public void testGetSecondsFromTotalSeconds() {
        // GIVEN
        Time time = new Time(2313);

        //THEN
        Assertions.assertEquals(2313, time.getSeconds());
    }

    @Test
    public void testGetHoursFromHoursMinutesSeconds() {
        // GIVEN
        Time time = new Time(4, 5, 6);

        //THEN
        Assertions.assertEquals(4, time.getHours());
    }

    @Test
    public void testGetMinutesFromHoursMinutesSeconds() {
        // GIVEN
        Time time = new Time(5, 40, 20);

        //THEN
        Assertions.assertEquals(340, time.getMinutes());
    }

    @Test
    public void testGetSecondsFromHoursMinutesSeconds() {
        // GIVEN
        Time time = new Time(2, 15, 45);

        //THEN
        Assertions.assertEquals(8145, time.getSeconds());
    }
    @Test
    public void testSetHours() {
        // GIVEN
        Time time = new Time(1, 5, 69);
        // WHEN
        time.setHours(6);
        time.setMinutes(30);
        time.setSeconds(10);

        //THEN
        Assertions.assertEquals(6, time.getHours());
        Assertions.assertEquals(30, time.getMinutes());
        Assertions.assertEquals(10, time.getSeconds());
    }
}
