package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point firstPoint = new Point(2, 6);
        Point secondPoint = new Point(8, 4);

        System.out.printf("First point (%d, %d).\nSecond point (%d, %d).\nDistance between points: %f\n",
                firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY(), firstPoint.getDistance(secondPoint));

        secondPoint.setX(5);
        secondPoint.setY(8);

        System.out.printf("And now first point (%d, %d).\nSecond point (%d, %d).\nDistance between points: %f\n",
                firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY(), firstPoint.getDistance(secondPoint));
    }
}
