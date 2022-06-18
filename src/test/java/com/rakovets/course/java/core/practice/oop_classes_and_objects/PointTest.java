package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import java.util.Scanner;


public class PointTest {
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
        Point point = new Point(x, y);

        System.out.printf("x:%d y:%d", point.getX(), point.getY());

        System.out.print("\n\nEnter x: ");
        x = scanner.nextInt();
        System.out.print("Enter y: ");
        y = scanner.nextInt();

        point.setX(x);
        point.setY(y);

        System.out.printf("x:%d y:%d\n", point.getX(), point.getY());

        System.out.print("\nEnter x: ");
        x = scanner.nextInt();
        System.out.print("Enter y: ");
        y = scanner.nextInt();
        Point instancePoint = new Point(x, y);

        System.out.printf("%d", point.getDistance(instancePoint));
    }
}
