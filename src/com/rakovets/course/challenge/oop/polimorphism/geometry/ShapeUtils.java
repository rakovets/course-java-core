package com.rakovets.course.challenge.oop.polimorphism.geometry;

interface ShapeUtils {
    default void checkOnShape(Figure a) {
        double sumOfSide1 = a.firstSide + a.secondSide + a.thirdSide;
        double sumOfSide2 = a.firstSide + a.secondSide + a.thirdSide + a.furthSide;
        if (sumOfSide1 < sumOfSide2) {
            System.out.println("This is rectangle.");
        } else {
            System.out.println("This is triangle.");
        }
    }
}
