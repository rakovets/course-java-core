package com.rakovets.course.challenge.classes;

public class Rectangle {
    double x1;
    double y1;
    double x2;
    double y2;
    Point firstPoint = new Point(x1, y1);
    Point secondPoint = new Point(x2, y2);
    Rectangle(Point firstPoint, Point secondPoint){
        firstPoint = this.firstPoint;
        secondPoint = this.secondPoint;
    }
}
