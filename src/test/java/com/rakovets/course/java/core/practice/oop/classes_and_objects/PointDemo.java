package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point pointOne = new Point(12, 13);
        Point pointTwo = new Point(22, 46);
        System.out.printf("X1 = %f, Y1 = %f\n", pointOne.getX(), pointOne.getY());
        System.out.printf("Distance: %f\n", pointOne.getDistance(pointTwo));
        pointTwo.setX(44);
        pointTwo.setY(88);
        System.out.printf("X2 = %f, Y2 = %f\n", pointTwo.getX(), pointTwo.getY());
        System.out.printf("Distance: %f\n", pointOne.getDistance(pointTwo));
    }
}
