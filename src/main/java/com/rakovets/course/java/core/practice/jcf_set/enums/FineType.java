package com.rakovets.course.java.core.practice.jcf_set.enums;

public enum FineType {
    FINE_1(10), FINE_2(15), FINE_3(20), FINE_4(25), FINE_5(30), FINE_6(35), FINE_7(40);
    private int amount;
    FineType(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
