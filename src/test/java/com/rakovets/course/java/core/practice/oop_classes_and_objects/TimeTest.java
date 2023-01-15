package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    void convertSecondToHoursMinutesSecondsTest1() {
        Time time = new Time(3661);
        Assertions.assertEquals(1, time.getHours());
        Assertions.assertEquals(1, time.getMinutes());
        Assertions.assertEquals(1, time.getSeconds());
    }

    @Test
    void convertSecondToHoursMinutesSecondsTest2() {
        Time time = new Time(20715);
        Assertions.assertEquals(5, time.getHours());
        Assertions.assertEquals(45, time.getMinutes());
        Assertions.assertEquals(15, time.getSeconds());
    }

    @Test
    void convertSecondToHoursMinutesSecondsTest3() {
        Time time = new Time(11601);
        Assertions.assertEquals(3, time.getHours());
        Assertions.assertEquals(13, time.getMinutes());
        Assertions.assertEquals(21, time.getSeconds());
    }

    @Test
    void convertSecondToHoursMinutesSecondsTest4() {
        Time time = new Time(3601);
        Assertions.assertEquals(1, time.getHours());
        Assertions.assertEquals(0, time.getMinutes());
        Assertions.assertEquals(1, time.getSeconds());
    }

    @Test
    void convertSecondToHoursMinutesSecondsTest5() {
        Time time = new Time(0);
        Assertions.assertEquals(0, time.getHours());
        Assertions.assertEquals(0, time.getMinutes());
        Assertions.assertEquals(0, time.getSeconds());
    }

    @Test
    void convertSecondToHoursMinutesSecondsTest6() {
        Time time = new Time(621);
        Assertions.assertEquals(0, time.getHours());
        Assertions.assertEquals(10, time.getMinutes());
        Assertions.assertEquals(21, time.getSeconds());
    }
    @Test
    void convertSecondToHoursMinutesSecondsTest7() {
        Time time = new Time(7860);
        Assertions.assertEquals(2, time.getHours());
        Assertions.assertEquals(11, time.getMinutes());
        Assertions.assertEquals(0, time.getSeconds());
    }
}
