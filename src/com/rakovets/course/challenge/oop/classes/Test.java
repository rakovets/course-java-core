package com.rakovets.course.challenge.oop.classes;

public class Test {
    public static void main(String[] args) {
        Timeinterval timeinterval1 = new Timeinterval(30);
        Timeinterval timeinterval = new Timeinterval(35, 2, 9);
        timeinterval1.printSeconds();
        System.out.println(timeinterval.toString());
        System.out.println(" ");
        Atm atm = new Atm(59, 30, 22);
        atm.printCurrentMoney();
        atm.canGetMoney(270);
        Point point = new Point(6, 5);
        Point point1 = new Point(3, 4);
        double distance = point.distance(point1);
        System.out.println("");
        System.out.printf("The distance between points is:  %.2f \n", distance);
        Point point2 = new Point(13, 8);
        Point point3 = new Point(5, 4);
        Rectangle rectangle = new Rectangle(point2, point3);
        double findArea = rectangle.FindArea();
        double findPerim = rectangle.FindPerim();
        System.out.printf("The Area is : %.2f \n", findArea);
        System.out.printf("The Perim is : %.2f \n", findPerim);
    }
}
