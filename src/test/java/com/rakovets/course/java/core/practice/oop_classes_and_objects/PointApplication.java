package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import java.nio.channels.Pipe;

public class PointApplication {
    public static void main(String[] args) {
        Point point1 = new Point(0,0);
        point1.setX(10);
        point1.setY(18);
        Point point2 = new Point(10,10);
        point2.setX(-14);
        point2.setY(-10);
        System.out.println("Distance between points : " + point1.getDistance(point2));
    }
}
