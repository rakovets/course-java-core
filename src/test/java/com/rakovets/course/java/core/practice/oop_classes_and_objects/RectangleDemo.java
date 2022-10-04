package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(new Point(2, 3), new Point(10, 5));
        System.out.printf("Perimeter: %f\nArea: %f\n", rectangle.getPerimeter(), rectangle.getArea());

        rectangle.setTopLeftPoint(new Point(4, 6));
        rectangle.setBottomRightPoint(new Point(6, 8));
        System.out.printf("And now\nPerimeter: %f\nArea: %f\n", rectangle.getPerimeter(), rectangle.getArea());
    }
}
