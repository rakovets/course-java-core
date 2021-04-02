package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Rectangle {
   private int firstPoint;
   private int secondPoint;

    Rectangle(int firstPoint, int secondPoint){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public int getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(int firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void setSecondPoint(int secondPoint) {
        this.secondPoint = secondPoint;
    }

    public int getSecondPoint() {
        return secondPoint;
    }


  public int  getPerimeter(){
        return 0;
    }
}
