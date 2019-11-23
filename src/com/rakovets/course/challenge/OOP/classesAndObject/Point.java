package com.rakovets.course.challenge.OOP.classesAndObject;

public class Point {

    int x;
    int y;

    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    Point()
    {
    }

    public int getX()
    {
        return x;
    }

    public void setX()
    {
        x = 0;
    }

    public int getY()
    {
        return y;
    }

    public void setY()
    {
        y = 0;
    }

    public double distance(Point point)
    {
     double distance =  Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
     return distance;
    }
}
