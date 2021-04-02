package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class JavaAtm {
    public static void main(String[] args) {
        Atm atm = new Atm(100, 50, 20);
        for (int i = 20; i < 1000; i++) {
            if (atm.isPossibleIssue(i)) {
                System.out.print("i = " + i + " ");
            } else System.out.print(" ");
        }
    }
}
