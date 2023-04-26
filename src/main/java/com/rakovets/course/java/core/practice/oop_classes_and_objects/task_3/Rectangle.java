package com.rakovets.course.java.core.practice.oop_classes_and_objects.task_3;
import com.rakovets.course.java.core.practice.oop_classes_and_objects.task_2.*;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }
    public Point getTopLeftPoint() {
        return topLeftPoint;
    }
    public Point getBottomRightPoint() {
        return bottomRightPoint;
    }
    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }
    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }
    public int getPerimeter() {
        int width = bottomRightPoint.getX() - topLeftPoint.getX();
        int length = bottomRightPoint.getY() - topLeftPoint.getY();
        return 2 * (width + length);
    }
    public int getArea() {
        int width = bottomRightPoint.getX() - topLeftPoint.getX();
        int length = bottomRightPoint.getY() - getTopLeftPoint().getY();
        return width * length;
    }
}
