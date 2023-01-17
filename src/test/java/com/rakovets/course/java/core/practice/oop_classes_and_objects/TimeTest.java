package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    void timeTest() {
        Time time = new Time(1, 11, 11);

        Assertions.assertEquals(1, time.getHours());
        Assertions.assertEquals(11, time.getMinutes());
        Assertions.assertEquals(11, time.getSeconds());
        Assertions.assertEquals(4271, time.getTotalSecond());
    }

    @Test
    void timeSetTest() {
        Time time = new Time(3, 33, 33);

        time.setHours(2);
        time.setMinutes(22);
        time.setSeconds(22);

        Assertions.assertEquals(2, time.getHours());
        Assertions.assertEquals(22, time.getMinutes());
        Assertions.assertEquals(22, time.getSeconds());
    }

    @Test
    void timeSecondTest() {
        Time time = new Time(33333);

        Assertions.assertEquals(9, time.getHours());
        Assertions.assertEquals(15, time.getMinutes());
        Assertions.assertEquals(33, time.getSeconds());
        Assertions.assertEquals(33333, time.getTotalSecond());

    }
}
