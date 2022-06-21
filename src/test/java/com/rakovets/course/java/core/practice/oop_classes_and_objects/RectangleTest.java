package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleTest {
    public static void main(String[] args) {

        int x = 4;
        int y = 5;

        int x2 = 15;
        int y2 = 20;

        Rectangle rectangle = new Rectangle(new Point(x, y), new Point(x2, y2));

        System.out.printf("\nx:% .2f y:% .2f\n", rectangle.getTopLeftPoint().getX(), rectangle.getTopLeftPoint().getY());
        System.out.printf("x:% .2f y:% .2f\n", rectangle.getBottomRightPoint().getX(), rectangle.getBottomRightPoint().getY());

        System.out.printf("\nPerimeter: %.2f", rectangle.getPerimeter());
        System.out.printf("\nArea: %.2f\n", rectangle.getArea());

        x = 10;
        y = 18;
        rectangle.setTopLeftPoint(new Point(x, y));

        x2 = 4;
        y2 = 8;
        rectangle.setBottomRightPoint(new Point(x2, y2));

        System.out.printf("\nx:% .2f y:% .2f\n", rectangle.getTopLeftPoint().getX(), rectangle.getTopLeftPoint().getY());
        System.out.printf("x:% .2f y:% .2f\n", rectangle.getBottomRightPoint().getX(), rectangle.getBottomRightPoint().getY());

        System.out.printf("\nPerimeter: %.2f", rectangle.getPerimeter());
        System.out.printf("\nArea: %.2f\n", rectangle.getArea());
    }
}
