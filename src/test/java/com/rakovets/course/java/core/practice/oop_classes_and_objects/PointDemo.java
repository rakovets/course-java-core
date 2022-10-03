package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point point = new Point(4, 1);
        System.out.println("X =" + point.getX() + "; Y =" + point.getY());
        point.setX(10);
        point.setY(30);
        System.out.println("X =" + point.getX() + "; Y =" + point.getY());

        Point distance = new Point(1, 30);
        System.out.println(point.getDistance(distance));
    }
}
