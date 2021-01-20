package com.rakovets.course.java.core.practice.oop.classesandobjects.task_3.model;

import com.rakovets.course.java.core.practice.oop.classesandobjects.task_2.model.Point;

public class Rectangle {
    private Point FirstPoint;
    private Point SecondPoint;

    public Rectangle(Point FirstPoint, Point SecondPoint) {
            this.FirstPoint = FirstPoint;
            this.SecondPoint = SecondPoint;
    }
    public void getFirstPoint()  {
        System.out.println(FirstPoint.getX() + " " + FirstPoint.getY());
    }
    public void setFirstPoint(Point FirstPoint)  {
        this.FirstPoint = FirstPoint;
    }
    public void getSecondPoint()  {
        System.out.println(SecondPoint.getX() + " " + SecondPoint.getY());
    }
    public void setSecondPoint(Point SecondPoint)  {
        this.SecondPoint = SecondPoint;
    }
    public double getArea ()  {
        double horizonSide = Math.abs(SecondPoint.getX() - FirstPoint.getX());
        double verticalSide = Math.abs(SecondPoint.getY() - FirstPoint.getY());
        return horizonSide * verticalSide;
    }
    public double getPerimetr ()  {
        double horizonSide = Math.abs(SecondPoint.getX() - FirstPoint.getX());
        double verticalSide = Math.abs(SecondPoint.getY() - FirstPoint.getY());
        return 2 * (horizonSide + verticalSide);
    }

}
