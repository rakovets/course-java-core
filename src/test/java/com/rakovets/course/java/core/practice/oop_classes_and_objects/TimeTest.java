package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    void convertTime1() {
        Time time = new Time(3661);
        Assertions.assertEquals(1, time.getHours());
        Assertions.assertEquals(1, time.getMinutes());
        Assertions.assertEquals(1,time.getSeconds());
    }
    @Test
    void convertTime2() {
        Time time = new Time(20715);
        Assertions.assertEquals(5, time.getHours());
        Assertions.assertEquals(45, time.getMinutes());
        Assertions.assertEquals(15,time.getSeconds());
    }
    @Test
    void convertTime3() {
        Time time = new Time(11601);
        Assertions.assertEquals(3, time.getHours());
        Assertions.assertEquals(13, time.getMinutes());
        Assertions.assertEquals(21,time.getSeconds());
    }

}
