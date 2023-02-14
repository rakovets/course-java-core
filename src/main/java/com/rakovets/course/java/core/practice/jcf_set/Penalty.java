package com.rakovets.course.java.core.practice.jcf_set;

public enum Penalty {
    APARTMENT(50), CAR(10), INCOME(5), PRIVATE_HOUSE(15);
    private double sum;

    Penalty(double sum) {
        this.sum = sum;
    }
}
