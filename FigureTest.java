package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class FigureTest {
    public static void main(String[] args) {
        Figure figure = new Figure("rectangle");
        figure.display();

        Figure figure1 = new Figure("triangle");
        figure1.display();

        Figure figure2 = new Figure("circle");
        figure2.display();

        figure.square(2,3);
        figure.square1(3, 4);
        figure.square2(1);

    }
}
