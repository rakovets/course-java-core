package com.rakovets.course.java.core.practice.jcf_list;

import java.util.Set;

public enum FineType {
    FINE181("Intentional blocking of transport communication", 160),
    FINE1811("Violation of the rules for operating a vehicle", 36),
    FINE1812("Exceeding the speed limit", 50),
    FINE1814("Driving a vehicle by an unauthorized person", 20),
    FINE1815("Alcohol intoxication", 30);

    private final String type;
    private final int fineCost;

    FineType(String type, int fineCost) {
        this.type = type;
        this.fineCost = fineCost;
    }

    public String getType() {
        return type;
    }

    public int getFineCost() {
        return fineCost;
    }


    @Override
    public String toString() {
        return "Fine type: " + type + ", fine cost: " + fineCost + " BYN";
    }
}
