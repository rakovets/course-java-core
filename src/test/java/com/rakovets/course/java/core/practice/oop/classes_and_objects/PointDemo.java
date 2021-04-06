package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Points points = new Points(10,10);
        System.out.printf("Current point X: %d Y: %d\n", points.getX(), points.getY());
        Points points1 = new Points(20,30);
        System.out.printf("Distance: %f\n", points.getDistance(points1));
        points1.setX(25);
        points1.setY(50);
        System.out.printf("Distance: %f", points.getDistance(points1));
    }
}
