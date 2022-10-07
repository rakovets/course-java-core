package com.rakovets.course.java.core.practice.enum_types;

public enum Season {
    WINTER("Winter is very cold"),
    SPRING("Spring is always wet and dirty"),
    SUMMER("Summer is hot and sunny"),
    AUTUMN("Autumn is rainy and windy");
    private final String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
