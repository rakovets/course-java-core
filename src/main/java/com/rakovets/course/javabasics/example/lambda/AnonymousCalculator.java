package com.rakovets.course.javabasics.example.lambda;

public class AnonymousCalculator {
    public static void main(String[] args) {
        boolean runnabel = true;


        while (runnabel) {
            Operation additional = (x, y) -> x + y;
            Operation division = (n1, n2) -> n1 / n2;
            Operation multi = (n1, n2) -> n1 * n2;
            Operation subtract = (n1, n2) -> n1 - n2;


            int x = 50;
            int y = 10;
            System.out.println(additional.operate(50, 10));
            System.out.println(division.operate(50, 10));
            System.out.println(multi.operate(50, 10));
            System.out.println(subtract.operate(50, 10));
            runnabel = false;
        }
    }
}
