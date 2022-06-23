package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointApplication {
    public static void main(String[] args) {
        Point firstPoint = new Point(2,2);
        Point secondPoint = new Point(13 , 14);

        System.out.println("First X,Y: " + firstPoint.getX() + "," + firstPoint.getY());
        System.out.println("Second X,Y: " + secondPoint.getX() + "," + secondPoint.getY());
        System.out.println("Distance: " + firstPoint.getDistance(secondPoint));

        firstPoint.setX(11);
        firstPoint.setY(12);

        System.out.println("X changed: " + firstPoint.getX());
        System.out.println("Y changed: " + firstPoint.getY());
    }
}
