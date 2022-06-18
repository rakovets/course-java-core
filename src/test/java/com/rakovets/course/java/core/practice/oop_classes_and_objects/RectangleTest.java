package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import java.util.Scanner;

public class RectangleTest {
    /**
     * @author Anastasia Melnikova
     * @since 18.06.2022
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        System.out.print("\nEnter x: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y: ");
        int y2 = scanner.nextInt();

        Rectangle rectangle = new Rectangle(new Point(x, y), new Point(x2, y2));

        System.out.printf("\nx:%d y:%d\n", rectangle.getTopLeftPoint().getX(), rectangle.getTopLeftPoint().getY());
        System.out.printf("x:%d y:%d\n", rectangle.getBottomRightPoint().getX(), rectangle.getBottomRightPoint().getY());

        System.out.printf("\nPerimeter: %d", rectangle.getPerimeter());
        System.out.printf("\nArea: %d\n", rectangle.getArea());

        System.out.print("\nEnter x: ");
        x = scanner.nextInt();
        System.out.print("Enter y: ");
        y = scanner.nextInt();
        rectangle.setTopLeftPoint(new Point(x, y));

        System.out.print("\nEnter x: ");
        x2 = scanner.nextInt();
        System.out.print("Enter y: ");
        y2 = scanner.nextInt();
        rectangle.setBottomRightPoint(new Point(x2, y2));

        System.out.printf("\nx:%d y:%d\n", rectangle.getTopLeftPoint().getX(), rectangle.getTopLeftPoint().getY());
        System.out.printf("x:%d y:%d\n", rectangle.getBottomRightPoint().getX(), rectangle.getBottomRightPoint().getY());

        System.out.printf("\nPerimeter: %d", rectangle.getPerimeter());
        System.out.printf("\nArea: %d", rectangle.getArea());
    }
}
