package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.practice.oop_classes_and_objects.task_2.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task02 {
    private static Point pointOne;
    private static Point pointTwo;

    @BeforeAll
    static void setUp() {
        pointOne = new Point(50,40);
        pointTwo = new Point(90,20);
        pointTwo.setX(1000);
        pointTwo.setY(300);
    }
    @Test
    @DisplayName("testGetX")
    void testGetX() {
        int actual = pointOne.getX();

        Assertions.assertEquals(50,actual);
    }
    @Test
    @DisplayName("testGetY")
    void testGetY() {
        int actual = pointOne.getY();

        Assertions.assertEquals(40,actual);
    }
    @Test
    @DisplayName("testSettedX")
    void testSettedX() {
        int actual = pointTwo.getX();

        Assertions.assertEquals(1000,actual);
    }
    @Test
    @DisplayName("testSettedY")
    void testSettedY() {
        int actual = pointTwo.getY();

        Assertions.assertEquals(300,actual);
    }
    @Test
    @DisplayName("testGetDistance")
    void testGetDistance() {
        int actual = pointOne.getDistance(pointTwo);

        Assertions.assertEquals(984,actual);
    }

}

