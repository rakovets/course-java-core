package com.rakovets.course.challenge.classes;

public class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX(){
        return this.x;
    }

    void setX(double x){
        this.x = x;
    }

    double getY(){
        return this.y;
    }

    void setY(double y){
        this.y = y;
    }

    double distance(Point point) {
    return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }
}
