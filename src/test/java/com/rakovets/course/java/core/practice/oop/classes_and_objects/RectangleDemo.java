package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Point firstPoint = new Point(3,5);
        Point secondPoint = new Point (6,8);
        Rectangle rectangle = new Rectangle (firstPoint,secondPoint);
        System.out.printf("perimeter = %f\n", rectangle.getPerimeter());
        System.out.printf("area = %f\n", rectangle.getArea());
        secondPoint.setX(2);
        secondPoint.setY(6);
        System.out.printf("New perimeter if (x2-x1)<0  = %f\n", rectangle.getPerimeter());
        System.out.printf("New area if  (x2-x1)<0  = %f\n", rectangle.getArea());




    }

}
