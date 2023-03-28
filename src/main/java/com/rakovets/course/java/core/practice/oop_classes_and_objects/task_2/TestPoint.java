package com.rakovets.course.java.core.practice.oop_classes_and_objects.task_2;

public class TestPoint {
    public static void main(String[] args) {
        Point pointOne = new Point(10, 20);
        pointOne.getX();
        pointOne.getY();
        pointOne.getDistance(pointOne);
        pointOne.setX(50);
        pointOne.setY(70);
        pointOne.getDistance(pointOne);

    }
}
