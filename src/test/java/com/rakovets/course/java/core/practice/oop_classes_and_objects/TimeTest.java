package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {

    @Test
    public void testGetTime() {
        Time time = new Time(3661);

        Assertions.assertEquals(1, time.getHours());
        Assertions.assertEquals(1, time.getMinutes());
        Assertions.assertEquals(1, time.getSeconds());
    }

    @Test
    public void testSetName() {
        Time time = new Time(0, 0, 0);
        time.setHours(3);
        time.setMinutes(2);
        time.setSeconds(1);

        Assertions.assertEquals(3, time.getHours());
        Assertions.assertEquals(2, time.getMinutes());
        Assertions.assertEquals(1, time.getSeconds());
    }

    @Test
    public void testGetTotalSeconds() {
        Time time1 = new Time(0, 0, 0);
        Time time2 = new Time(0, 0, 59);
        Time time3 = new Time(0, 59, 59);
        Time time4 = new Time(1, 1, 1);

        Time time5 = new Time(0);
        Time time6 = new Time(59);
        Time time7 = new Time(119);
        Time time8 = new Time(3601);

        Assertions.assertEquals(0, time1.getTotalSeconds());
        Assertions.assertEquals(59, time2.getTotalSeconds());
        Assertions.assertEquals(3599, time3.getTotalSeconds());
        Assertions.assertEquals(3661, time4.getTotalSeconds());

        Assertions.assertEquals(0, time5.getTotalSeconds());
        Assertions.assertEquals(59, time6.getTotalSeconds());
        Assertions.assertEquals(119, time7.getTotalSeconds());
        Assertions.assertEquals(3601, time8.getTotalSeconds());
    }
}
