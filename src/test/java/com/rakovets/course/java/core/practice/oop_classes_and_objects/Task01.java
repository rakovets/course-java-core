package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.practice.oop_classes_and_objects.task_1.Time;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task01 {
    private static Time time;
    private static Time timeInSeconds;
    private static Time timeForTestSetters;

    @BeforeAll
    static void setUp() {
        time = new Time(10,20,30);
        timeInSeconds = new Time(5000);
        timeForTestSetters = new Time(3,40,60);
        timeForTestSetters.setHours(40);
        timeForTestSetters.setMinutes(50);
        timeForTestSetters.setSeconds(70);

    }
    @Test
    @DisplayName("testGetHours")
    void testGetHours() {
        int actual = time.getHours();

        Assertions.assertEquals(10,actual);
    }
    @Test
    @DisplayName("testGetMinutes")
    void testGetMinutes() {
        int actual = time.getMinutes();

        Assertions.assertEquals(20,actual);
    }
    @Test
    @DisplayName("testGetSeconds")
    void testGetSeconds() {
        int actual = time.getSeconds();

        Assertions.assertEquals(30,actual);
    }
    @Test
    @DisplayName("testGetTotalSeconds")
    void testGetTotalSeconds() {
        int actual = time.getTotalSeconds();

        Assertions.assertEquals(37230,actual);
    }
    @Test
    @DisplayName("testGetSecondsFromTotalSeconds")
    void testGetSecondsFromTotalSeconds() {
        int actual = timeInSeconds.getSeconds();

        Assertions.assertEquals(5000,actual);
    }
    @Test
    @DisplayName("testGetMinutesFromTotalSeconds")
    void testGetMinutesFromTotalSeconds() {
        int actual = timeInSeconds.getMinutes();

        Assertions.assertEquals(83,actual);
    }
    @Test
    @DisplayName("testGetHoursFromTotalSeconds")
    void testGetHoursFromTotalSeconds() {
        int actual = timeInSeconds.getHours();

        Assertions.assertEquals(1,actual);
    }
    @Test
    @DisplayName("testSetHours")
    void testSetHours() {
        int actual = timeForTestSetters.getHours();

        Assertions.assertEquals(40,actual);
    }
    @Test
    @DisplayName("testSetMinutes")
    void testSetMinutes() {
        int actual = timeForTestSetters.getMinutes();

        Assertions.assertEquals(50,actual);
    }
    @Test
    @DisplayName("testSetSeconds")
    void testSetSeconds() {
        int actual = timeForTestSetters.getSeconds();

        Assertions.assertEquals(70,actual);
    }
}
