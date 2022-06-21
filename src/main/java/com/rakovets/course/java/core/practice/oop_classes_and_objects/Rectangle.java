package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Rectangle {
    private Point topLeftPoint;
    private Point bottomRightPoint;

    /**
     * Constructor. Accepts two objects of type `Point`.
     *
     * @param topLeftPoint     first point.
     * @param bottomRightPoint second point.
     */
    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public Point getBottomRightPoint() {
        return bottomRightPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }

    /**
     * Returns the perimeter of the rectangle.
     */
    public double getPerimeter() {
        return 2 * (Math.abs(bottomRightPoint.getX() - topLeftPoint.getX())
                + Math.abs(bottomRightPoint.getY() - topLeftPoint.getY()));
    }

    /**
     * Returns the area of a rectangle.
     */
    public double getArea() {
        return Math.abs(bottomRightPoint.getX() - topLeftPoint.getX())
                * Math.abs(bottomRightPoint.getY() - topLeftPoint.getY());
    }
}
