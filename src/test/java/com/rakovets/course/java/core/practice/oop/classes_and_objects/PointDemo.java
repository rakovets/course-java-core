package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        Point point2 = new Point(30, 40);
        System.out.printf("\nPoints : x1 = %s y1 = %s ", point1.getX(), point1.getY());
        System.out.printf("x2 = %s y2 = %s\n", point2.getX(), point2.getY());
        System.out.printf("distance = %f\n", point1.getDistance(point2));
        point1.setX(344);
        point1.setY(578);
        point2.setX(444);
        point2.setY(123);
        System.out.printf("\nPoints : x1 = %s y1 = %s ", point1.getX(), point1.getY());
        System.out.printf("x2 = %s y2 = %s\n", point2.getX(), point2.getY());
        System.out.printf("distance = %f\n", point1.getDistance(point2));
    }
}
