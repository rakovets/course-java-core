package com.rakovets.course.challenge.oop.Geometry;

class Triangle extends Figure {
    private long base;
    private long height;
    private long a;
    private long b;
    private long c;

    Triangle(String name, float x, float y, long base, long height, long a, long b, long c) {
        super(name, x, y);
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.height = height;
    }

    public double CalculeteArea() {
        float resultOfArea = (base * height) / 2;
        System.out.printf("The Area of Triangle is : %.2f \n", resultOfArea);
        return resultOfArea;
    }

    public double CalculetePerimeter() {
        float resultOfPerimeter = a + b + c;
        System.out.printf("The  Perimeter of Triangle is : %.2f \n", resultOfPerimeter);
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
        return "Triangle{" +
                "median=" + base +
                ", height=" + height +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
