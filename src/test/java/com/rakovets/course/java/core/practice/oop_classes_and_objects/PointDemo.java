package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point point = new Point(6, 9);
        point.getDistance();
        System.out.println(point.getDistance());

        Point point1 = new Point(8,2);
        System.out.println("x = " + point1.getX() +". " + "y = " + point1.getY());

        Point point2 = new Point(76, 18);
        point2.setX(2);
        point2.setY(15);
        System.out.println("x = " + point2.getX() +". " + "y = " + point2.getY());
    }
}
