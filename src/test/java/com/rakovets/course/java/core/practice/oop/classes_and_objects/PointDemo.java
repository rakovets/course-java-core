package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point point1 = new Point(5, 7);
        Point point2 = new Point(10, 13);
        System.out.printf("x1 = %f, y1 = %f\n", point1.getX(), point1.getY());
        System.out.printf("x2 = %f, y2 = %f\n", point2.getX(), point2.getY());
        System.out.printf("Distance: %f\n", point2.getDistance(point1));
        point2.setX(11);
        point2.setY(14);
        System.out.printf("x2 After SetX = %f, y2 After SetY = %f\n", point2.getX(), point2.getY());
        System.out.printf("Distance with new (x2,y2): %f\n", point2.getDistance(point1));
    }
}
