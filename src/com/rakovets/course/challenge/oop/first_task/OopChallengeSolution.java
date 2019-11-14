package com.rakovets.course.challenge.oop.first_task;

public class OopChallengeSolution {
    public static void main(String[] args) {
        CountSeconds getSeconds = new CountSeconds(30, 23, 3);
        getSeconds.displayInfo();

        Atm operationWithMoney = new Atm();
        operationWithMoney.setMoney(3, 2, 5);
        operationWithMoney.getMoney(420);

        Rectangle newPoint = new Rectangle(3, 4);
        newPoint.setX(12);
        newPoint.getX();
        newPoint.setY(23);
        newPoint.getY();
        Rectangle newPoint2 = new Rectangle(5, 7);
        newPoint2.setX(17);
        newPoint2.getX();
        newPoint2.setY(38);
        newPoint2.getY();
        newPoint.distance(newPoint, newPoint2);

        Point point = new Point(3, 5);
        Point newPointOfLine = new Point(10, 14);
        point.distance(newPointOfLine);
    }
}
