package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point pointA = new Point(4.0, 5.0);
        Point pointB = new Point(2.0, 3.0);

        System.out.print("Distance from ");
        System.out.print("point A(" + pointA.getX() + ", " + pointA.getY() + ")");
        System.out.print(" to point B(" + pointB.getX() + ", " + pointB.getY() + ")");
        System.out.println(" = " + pointA.getDistance(pointB));

        pointA.setX(0.0);
        pointA.setY(2.0);

        System.out.print("Distance from ");
        System.out.print("point A(" + pointA.getX() + ", " + pointA.getY() + ")");
        System.out.print(" to point B(" + pointB.getX() + ", " + pointB.getY() + ")");
        System.out.println(" = " + pointA.getDistance(pointB));

        pointB.setX(1.0);
        pointB.setY(-2.0);

        System.out.print("Distance from ");
        System.out.print("point A(" + pointA.getX() + ", " + pointA.getY() + ")");
        System.out.print(" to point B(" + pointB.getX() + ", " + pointB.getY() + ")");
        System.out.println(" = " + pointA.getDistance(pointB));
    }
}
