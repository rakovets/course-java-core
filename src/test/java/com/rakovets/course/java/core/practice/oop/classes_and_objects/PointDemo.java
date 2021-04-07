package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point pointOne = new Point(10, 50);
        Point pointTwo = new Point(20, 100);
        System.out.printf("Point One: %f,%f\n", pointOne.getX(), pointOne.getY());
        System.out.printf("Point Two: %f,%f\n", pointTwo.getX(), pointTwo.getY());
        System.out.printf("Distance: %f\n\n", pointOne.getDistance(pointTwo));

        pointOne.setX(33);
        pointOne.setY(55);
        pointTwo.setX(10);
        pointTwo.setY(500);
        System.out.printf("Point One: %f,%f\n", pointOne.getX(), pointOne.getY());
        System.out.printf("Point Two: %f,%f\n", pointTwo.getX(), pointTwo.getY());
        System.out.printf("Distance: %f\n", pointOne.getDistance(pointTwo));
    }
}
