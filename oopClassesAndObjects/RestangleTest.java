package com.rakovets.course.challenge.oopClassesAndObjects;

public class RestangleTest {
    public static void main(String[] args) {
        Point a = new Point(0.0, 0.0);
        Point b = new Point(1.0, 1.0);
        Restangle restangle = new Restangle(a, b);
        restangle.display();

        restangle.area();
        System.out.println("Area: "+restangle.area());

        restangle.perimeter();
        System.out.println("Perimeter: "+restangle.perimeter());
    }
}
