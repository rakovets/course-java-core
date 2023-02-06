package com.rakovets.course.java.core.practice.jcf_set.tax_service.fines;

import java.util.UUID;

public class SpeedingFine {
    private final UUID id;

    public SpeedingFine() {
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return "Fine for exceeding the speed limit";
    }

    public String getFine() {
        return "120 BYN";
    }

    public UUID getId() {
        return id;
    }
}
