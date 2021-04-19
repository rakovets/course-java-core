package com.rakovets.course.java.core.practice.exception_handling;

public class Task3 {
    private double side;

    public double setSide(double side) throws SideException {
        if (side <= 0) {
            throw new SideException();
        }
        this.side = side;
        return side;
    }

    public double getPerimetrSquare() {
        return 4 * side;
    }
}
