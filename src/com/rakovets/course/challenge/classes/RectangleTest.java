package com.rakovets.course.challenge.classes;

public class RectangleTest {
    public static void main(String[] args) {
        Point point1 = new Point(25.36, 36.25);
        System.out.println("x= " + point1.getX() + " y= " + point1.getY());
        Point point2 = new Point(37.98, 22.57);
        System.out.println("x= " + point2.getX() + " y= " + point2.getY());
        Rectangle points = new Rectangle(point1, point2);
        //System.out.println("point1 = " + points.getPointLT() + " point2 = " + points.getPointRU());
        System.out.println(points.area());
        System.out.println(points.perimeter());

    }
}
