package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Point topleftPoint = new Point(4, 5);
        Point bottomRightPoint = new Point(1, 8);
        Rectangle rectangle1 = new Rectangle(topleftPoint, bottomRightPoint);

        System.out.println("perimetr = " + rectangle1.getPerimeter(topleftPoint, bottomRightPoint));

        System.out.println("area = " + rectangle1.getArea(topleftPoint, bottomRightPoint));
    }
}
