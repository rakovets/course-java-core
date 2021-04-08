package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point point = new Point(5,5);
        Point secondPoint = new Point(15,15);
        System.out.printf("%d \n%d", point.getxPoint(), point.getyPoint());
        point.setxPoint(12);
        point.setyPoint(11);
        System.out.printf("\n%d \n%d", point.getxPoint(), point.getyPoint());
        System.out.printf("\n%d", point.getDistance(secondPoint));
    }
}
