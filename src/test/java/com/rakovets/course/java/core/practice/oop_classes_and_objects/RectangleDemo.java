package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(-1, 5),new Point(0, 2));

        System.out.printf("Perimeter = %.2f, Area = %.2f, %c", rectangle.getPerimeter(), rectangle.getArea(), '\n');

        rectangle.setTopLeftPoint(new Point(-7, 8));
        rectangle.setBottomRightPoint(new Point(4, 1));

        System.out.printf("Perimeter = %.2f, Area = %.2f, %c", rectangle.getPerimeter(), rectangle.getArea(), '\n');

        rectangle.setTopLeftPoint(new Point(-5, 0));
        rectangle.setBottomRightPoint(new Point(0, 1));

        System.out.printf("Perimeter = %.2f, Area = %.2f, %c", rectangle.getPerimeter(), rectangle.getArea(), '\n');
    }
}
