package com.rakovets.course.java.core.example.generics.truck.model;

public class Potato {
    private String variety;

    public Potato(String variety) {
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Potato{" +
                "variety='" + variety + '\'' +
                '}';
    }
}
