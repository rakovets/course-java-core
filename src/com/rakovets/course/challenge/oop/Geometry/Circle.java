package com.rakovets.course.challenge.oop.Geometry;

public class Circle implements Area, Perimeter {
    private String name;
    private double radiuse;


    Circle(String name, double radiuse) {
        this.name = name;
        this.radiuse = radiuse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadiuse() {
        return radiuse;
    }


    @Override
    public double CalculeteArea() {
        double resultOfArea = Math.PI * Math.pow(getRadiuse(), 2);
        System.out.printf("The Area of Circle is : %.2f \n ", resultOfArea);
        return resultOfArea;
    }

    @Override
    public double CalculetePerimeter() {
        double resultOfPerimeter = Math.PI * radiuse * 2;
        System.out.printf("The Perimeter of Circle is : %.2f \n", resultOfPerimeter);
        return resultOfPerimeter;
    }

    public boolean isAreaIsSame(Figure figure) {
        double figureArea = figure.CalculeteArea();
        double area = CalculeteArea();
        if (figureArea == area) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radiuse=" + radiuse +
                '}';
    }
}
