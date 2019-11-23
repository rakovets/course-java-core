package com.rakovets.course.challenge.OOP.classesAndObject;

public class Rectangle {

    Point firstPoint;
    Point secondPoint;

    Rectangle(Point firstPoint, Point secondPoint)
    {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    Rectangle()
    {
    }


    public Point getFirstPoint()
    {
        return firstPoint;
    }

    public void setFirstPoint()
    {
        firstPoint = new Point(0, 0);
    }

    public Point getSecondPoint()
    {
        return secondPoint;
    }

    public void setSecondPoint()
    {
        secondPoint = new Point(10, 10);
    }

    public int getPerimeter()
    {
        return ((secondPoint.x - firstPoint.x) + (secondPoint.y - firstPoint.y)) * 2;
    }

    public int getArea()
    {
        return (secondPoint.x - firstPoint.x) * (secondPoint.y - firstPoint.y);
    }
}
