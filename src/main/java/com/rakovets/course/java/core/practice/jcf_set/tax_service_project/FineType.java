package com.rakovets.course.java.core.practice.jcf_set.tax_service_project;

public enum FineType {
    SMOKING ("Smoking fine"),
    DRINKING ("Fine for drinking alcohol in public places"),
    NOISY ("Fine for violators of silence"),
    LIAR ("Fine for spreading fake information");

    private final String fineType;

    FineType(String fineType) {
        this.fineType = fineType;
    }

    public String getFineType() {
        return fineType;
    }
}
