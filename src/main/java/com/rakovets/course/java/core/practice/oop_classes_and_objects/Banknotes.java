package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public enum Banknotes {
    TWENTY(20),
    FIFTY(50),
    ONE_HUNDRED(100);

    private final int banknote;

    Banknotes(int banknote) {
        this.banknote = banknote;
    }

    public int getBanknote() {
        return banknote;
    }
}
