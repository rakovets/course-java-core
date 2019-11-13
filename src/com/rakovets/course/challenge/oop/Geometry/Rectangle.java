package com.rakovets.course.challenge.oop.Geometry;

class Rectangle extends Figure {
    private float width;
    private float height;

    Rectangle(String name, float x, float y, float width, float height) {
        super(name, x, y);
        this.width = width;
        this.height = height;
    }

    public double CalculetePerimeter() {
        float resultOfPerimeter = width * 2 + height * 2;
        System.out.printf("The Perimeter of Rectangle is : %.2f \n ", resultOfPerimeter);
        return resultOfPerimeter;
    }

    public double CalculeteArea() {
        float resultOfArea = width * height;
        System.out.printf("The Area of Rectangle is : %.2f \n ", resultOfArea);
        return resultOfArea;
    }

    @Override
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
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}


