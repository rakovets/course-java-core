package com.rakovets.course.javabasics.practice.oop.classesandobjects;

import com.rakovets.course.javabasics.practice.oop.classesandobjects.constants.ColorConsants;

import java.util.Scanner;

public class PointTest {

    public static void main(String[] args) {

       //  Scanner input = new Scanner(System.in);
        System.out.println(ColorConsants.ANSI_RED + "Start program \n" + ColorConsants.ANSI_RESET);
       //  int xIn = input.nextInt();
       // int yIn = input.nextInt();
        Point firstPoint = new Point(5, 6);
        Point secondPoint = new Point(10, 7);


        double distance = firstPoint.distance(secondPoint);


        System.out.println(ColorConsants.ANSI_GREEN + "Coordinates X and Y for first point: \n" + ColorConsants.ANSI_RESET + firstPoint.getX() + " :and: " + firstPoint.getY());
        System.out.println(ColorConsants.ANSI_YELLOW + "Coordinates X and Y for second point: \n" + ColorConsants.ANSI_RESET + secondPoint.getX() + " :and: " + secondPoint.getY());
        System.out.println(ColorConsants.ANSI_GREEN + "Distance is: \n" + ColorConsants.ANSI_RESET + distance);


    }
}
