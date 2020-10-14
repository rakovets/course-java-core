package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int distance(Point pointD) {
        int xOld = pointD.x;
        pointD.setX(10);
        int xNew = pointD.getX();
     int dist = xOld - xNew;
        if (dist < 0){
            dist *= -1;
        } return dist;

    }


}
