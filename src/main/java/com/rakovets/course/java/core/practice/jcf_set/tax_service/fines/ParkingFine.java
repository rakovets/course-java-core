package com.rakovets.course.java.core.practice.jcf_set.tax_service.fines;

import java.util.UUID;

public class ParkingFine {
    private final UUID id;

    public ParkingFine() {
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return "Fine for wrong parking";
    }

    public String getFine() {
        return "35 BYN";
    }

    public UUID getId() {
        return id;
    }
}
