package com.rakovets.course.challenge.classes;

public class RectangleTest {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(6, 3);
        Rectangle abcd = new Rectangle(point1, point2);
        System.out.println("testing 'getfirstpoint method':");
        abcd.getFirstPoint();
        System.out.println("testing 'getsecondpoint method':");
        abcd.getSecondPoint();
        Point point3 = new Point(2, 3);
        Point point4 = new Point(4, 6);
        System.out.println("testing setter of the first point:");
        abcd.setFirstPoint(point3);
        abcd.getFirstPoint();
        System.out.println("testing setter of the second point:");
        abcd.setSecondPoint(point4);
        abcd.getSecondPoint();
        System.out.println("getting perimeter:" + abcd.getPerimeter());
        System.out.println("getting area:" + abcd.getArea());

    }
}
