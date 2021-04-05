package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point first = new Point(3,4);
        Point second = new Point(5,7);

        second.setX(6);
        second.setY(9);
        first.setX(2);
        first.setY(3);

        System.out.print(second.getX() + " ");
        System.out.println(second.getY());
        System.out.println(first.getX() + " ");
        System.out.println(first.getY());

        System.out.println(first.getDistance(second));
    }
}
