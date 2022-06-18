package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointApplication {
    public static void main(String[] args) {
        Point point1 = new Point(-90, 53);
        Point point2= new Point (21, 53);

        System.out.println("This x: " + point1.getX());
        System.out.println("This y: " + point1.getY());
        System.out.println("Distance between two points: " + point1.getDistance(point2));

        point1.setX(5);
        point1.setY(10);
        System.out.println("This x after changing: " + point1.getX());
        System.out.println("This y after changing: " + point1.getY());
    }
}
