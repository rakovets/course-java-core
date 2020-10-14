package com.rakovets.course.javabasics.practice.oop.classesandobjects;

import com.rakovets.course.javabasics.practice.oop.classesandobjects.constants.ColorConsants;

import java.util.Scanner;

public class PointTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(ColorConsants.ANSI_RED + "Please inter X and Y:" + ColorConsants.ANSI_RESET);
        int xIn = input.nextInt();
        int yIn = input.nextInt();
        Point pointsObject = new Point(xIn, yIn);
        System.out.println(ColorConsants.ANSI_YELLOW + "Coordinates from Input: \n" + ColorConsants.ANSI_RESET + pointsObject.x + " :and: " + pointsObject.y);
        pointsObject.setX(2);
        pointsObject.setY(15);
        System.out.println(ColorConsants.ANSI_GREEN + "Coordinates X and Y after setting: \n" + ColorConsants.ANSI_RESET + pointsObject.getX() + " :and: " + pointsObject.getY());
        System.out.println(ColorConsants.ANSI_YELLOW + "Distance is: \n" + ColorConsants.ANSI_RESET + pointsObject.distance(pointsObject));


    }
}
