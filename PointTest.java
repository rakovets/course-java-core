package com.rakovets.course.challenge.oopClassesAndObjects;

public class PointTest {
    public static void main(String[] args) {
        Point a = new Point(1.3, 2.4);
        a.display();

        System.out.printf("x: %.2f, y: %.2f\n", a.getX(), a.getY());
        a.setX(1.5);
        a.setY(5.5);
        a.display();

        Point b = new Point(1.3, 3.4);
        b.display();
        System.out.println("Distance: "+ a.distance(b));
    }
}
