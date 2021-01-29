package com.rakovets.course.java.core.practice.oop.classesandobjects;

import com.rakovets.course.java.core.example.oop.classesandobjects.Point;
import com.rakovets.course.java.core.example.oop.classesandobjects.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Point point1 = new Point(5, 9);
        Point point2 = new Point(6, 2);

        Rectangle rec = new Rectangle(point1, point2);

        System.out.println(point1.getX() + " " + point1.getY());
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());

    }
}

