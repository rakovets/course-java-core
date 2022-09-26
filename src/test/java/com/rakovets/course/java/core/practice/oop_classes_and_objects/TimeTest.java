package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {
    public static void main(String[] args) {
        Time test1 = new Time(3, 10, 16);

        assertEquals(3, test1.getHours());
        assertEquals(10, test1.getMinutes());
        assertEquals(16, test1.getSeconds());
        assertEquals(11416, test1.getTotalSeconds());

        Time test2 = new Time(3679);

        assertEquals(1, test2.getHours());
        assertEquals(1, test2.getMinutes());
        assertEquals(19, test2.getSeconds());
        assertEquals(3679, test2.getTotalSeconds());

        Time test3 = new Time(1, 1, 1);

        test3.setHours(2);
        test3.setMinutes(2);
        test3.setSeconds(2);

        assertEquals(2, test3.getHours());
        assertEquals(2, test3.getMinutes());
        assertEquals(2, test3.getSeconds());
    }
}
