package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class RectangleInitialization {
    public static void main(String[] args) {
        Point d = new Point(5, 10);
        Point e = new Point(7,12);
        Rectangle de = new Rectangle(d, e);
        System.out.println(e.getX() + " " + e.getY()+ " " + d.getX() + " " + d.getY());

        de.setSecondPoint(new Point(2,15));
        System.out.println(de.getPerimeter());
        System.out.println(de.getArea());
        System.out.println(e.distance(de.getSecondPoint()));
    }
}
