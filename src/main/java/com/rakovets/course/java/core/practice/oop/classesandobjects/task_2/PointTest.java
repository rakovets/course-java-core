package com.rakovets.course.java.core.practice.oop.classesandobjects.task_2;

import com.rakovets.course.java.core.practice.oop.classesandobjects.task_2.model.Point;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(5,6);
        point.setX(2);
        point.setY(3);
        System.out.println(point.getX());
        System.out.println(point.getY());
        point.distance(new Point(0,6));

    }
}
