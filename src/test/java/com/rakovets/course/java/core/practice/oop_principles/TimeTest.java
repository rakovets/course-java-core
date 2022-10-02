package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_classes_and_objects.Time;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TimeTest {
        @Test
         void testValues() {
            Time time = new Time(1, 40, 2);

            Assertions.assertEquals(1, time.getHours());
            Assertions.assertEquals(40, time.getMinutes());
            Assertions.assertEquals(2, time.getSeconds());
            Assertions.assertEquals(6002, time.getTotalSeconds());
        }

        @Test
        void testValueTotal() {
            Time time = new Time(6002);

            Assertions.assertEquals(1, time.getHours());
            Assertions.assertEquals(40, time.getMinutes());
            Assertions.assertEquals(2, time.getSeconds());
            Assertions.assertEquals(6002, time.getTotalSeconds());
        }

    @Test
    void testValueSet() {
        Time time = new Time(0);

        time.setHours(1);
        Assertions.assertEquals(1, time.getHours());
        time.setMinutes(40);
        Assertions.assertEquals(40, time.getMinutes());
        time.setSeconds(2);
        Assertions.assertEquals(2, time.getSeconds());
    }
}

