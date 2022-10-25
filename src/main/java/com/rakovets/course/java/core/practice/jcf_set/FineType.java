package com.rakovets.course.java.core.practice.jcf_set;

public enum FineType {
    FINE181(1, "Intentional blocking of transport communication", 160),
    FINE1811(2, "Violation of the rules for operating a vehicle", 36),
    FINE1812(3, "Exceeding the speed limit", 50),
    FINE1814(4, "Driving a vehicle by an unauthorized person", 20),
    FINE1815(5, "Alcohol intoxication", 30);

    private final String type;
    private final int idFine;
    private final int fineCost;

    FineType(int idFine, String type, int fineCost) {
        this.idFine = idFine;
        this.type = type;
        this.fineCost = fineCost;
    }

    public String getType() {
        return type;
    }

    public int getFineCost() {
        return fineCost;
    }

    public int getIdFine() {
        return idFine;
    }

    @Override
    public String toString() {
        return "Fine type: " + type + ", fine cost: " + fineCost + " BYN";
    }
}
