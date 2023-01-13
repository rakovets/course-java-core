package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleTest {
    public static void main(String[] args) {
        Point testA = new Point(2, 8);
        Point testB = new Point(4, 4);
        Point testC = new Point(6, 8);
        Point testD = new Point(12, 2);
        Rectangle testRectangle = new Rectangle(testA, testB);

        System.out.printf("Rectangle top left point coordinates: %s%n",
                testRectangle.getTopLeftPoint());
        System.out.printf("Rectangle bottom right point coordinates: %s%n",
                testRectangle.getBottomRightPoint());
        System.out.printf("Rectangle perimeter is %s%n",
                testRectangle.getPerimeter());
        System.out.printf("Rectangle area is %s%n",
                testRectangle.getArea());

        testRectangle.setTopLeftPoint(testC);
        testRectangle.setBottomRightPoint(testD);

        System.out.println();
        System.out.printf("Rectangle top left point coordinates: %s%n",
                testRectangle.getTopLeftPoint());
        System.out.printf("Rectangle bottom right point coordinates: %s%n",
                testRectangle.getBottomRightPoint());
        System.out.printf("Rectangle perimeter is %s%n",
                testRectangle.getPerimeter());
        System.out.printf("Rectangle area is %s%n",
                testRectangle.getArea());
    }
}
