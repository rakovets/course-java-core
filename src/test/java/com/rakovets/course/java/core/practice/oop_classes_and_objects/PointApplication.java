package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointApplication {

    public static void main (String[] args) {
        Point newPoint = new Point(10, 5);
        Point currentPoint = new Point();

        System.out.println("X = " + newPoint.getX());
        System.out.println("Y = " + newPoint.getY());

        System.out.println("X = " + newPoint.setX(2));
        System.out.println("Y = " + newPoint.setY(3));
        System.out.println("Distance: " + newPoint.getDistance(currentPoint));


    }
}
