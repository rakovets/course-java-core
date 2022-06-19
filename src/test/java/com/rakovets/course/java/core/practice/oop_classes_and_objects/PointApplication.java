package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointApplication {
    public static void main(String[] args) {
        Point a = new Point(5, 10);
        Point b = new Point ( 4, 5 );
        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(a.getDistande(b));
        a.setX(1);
        a.setY(-4);
        System.out.println(a.getDistande(b));
    }
}
