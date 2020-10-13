package com.rakovets.course.javabasics.practice.oop.classesandobjects;

import java.util.Scanner;

public class PointTest {

    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        Scanner input = new Scanner(System.in);
        System.out.println(ANSI_RED + "Please inter X and Y:" + ANSI_RESET);
        int xIn = input.nextInt();
        int yIn = input.nextInt();
        Point pointsObject = new Point(xIn, yIn);
        System.out.println(ANSI_YELLOW + "Coordinates from Input: \n" + ANSI_RESET + pointsObject.x + " :and: " + pointsObject.y);
        pointsObject.setX(2);
        pointsObject.setY(15);
        System.out.println(ANSI_GREEN + "Coordinates X and Y after setting: \n" + ANSI_RESET + pointsObject.getX() + " :and: " + pointsObject.getY());
        System.out.println(ANSI_YELLOW + "Distance is: \n" + ANSI_RESET + pointsObject.distance(pointsObject));


    }
}
