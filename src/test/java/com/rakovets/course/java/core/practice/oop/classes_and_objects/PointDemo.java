package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point point1 = new Point(5,5);
        Point point2 = new Point(3,3);

        System.out.printf("%f, %f \n",point1.getX(), point1.getY());
        System.out.printf("%f, %f \n",point2.getX(), point2.getY());
        System.out.printf("%f \n", point1.getDistance(point2));
    }
}
