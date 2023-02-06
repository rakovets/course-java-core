package com.rakovets.course.java.core.practice.jcf_set.tax_service.fines;

import java.util.UUID;

public class DrinkDrivingFine {
    private final UUID id;

    public DrinkDrivingFine() {
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return "Fine for driving drunk";
    }

    public String getFine() {
        return "5000 BYN";
    }

    public UUID getId() {
        return id;
    }
}
