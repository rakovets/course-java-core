package com.rakovets.course.challenge;

public class RectangleTests {
    public static void main(String[] args) {
        Point a =new Point(0.0, 0.0);
        Point b =new Point(5.0, -5.0);
        Rectangle rectangle = new Rectangle(a,b);
        rectangle.display();
        rectangle.getPointLT().display();
        rectangle.getPointRU().display();
        rectangle.setPointLT(new Point(5.0, 1.0));
        rectangle.setPointRU(new Point(3.0, -5.0));
        rectangle.display();
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}
