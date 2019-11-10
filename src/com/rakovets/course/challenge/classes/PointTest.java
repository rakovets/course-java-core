package com.rakovets.course.challenge.classes;

public class PointTest {
    public static void main(String[] args) {
        Point a = new Point(2.5, 3.6);
        System.out.println("x= " + a.getX() + " y= " + a.getY());
        a.setX(3.5);
        a.setY(5.6);
        System.out.println("x= " + a.getX() + " y= " + a.getY());
        Point b = new Point (3.6, 8.9);
        System.out.println("distance a and b: " + a.distance(b));
        Point с = new Point (15.36,25.69);
        System.out.println("distance a and c: " + a.distance(с));
    }
}
