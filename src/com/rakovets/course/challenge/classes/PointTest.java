package com.rakovets.course.challenge.classes;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(12, 21);
        System.out.println("getting x: " + point1.x);
        System.out.println("getting y: " + point1.y);
        point1.setX(3);
        point1.setY(4);
        System.out.println("now i am going to set another values for x and y");
        System.out.println("getting x: " + point1.x);
        System.out.println("getting y: " + point1.y);
        Point point2 = new Point(0, 0);
        System.out.println("now i am going to create another point (0. 0) and find distance");
        System.out.println("getting distance: "  + point1.distance(point2));
    }
}
