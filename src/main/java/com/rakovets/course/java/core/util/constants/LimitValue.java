package com.rakovets.course.java.core.util.constants;

public enum LimitValue {
    UNITS("10"),
    TENS("100"),
    HUNDREDS("1000"),
    THOUSANDS("10000");

    private final String limitValue;

    LimitValue(String limitValue) {
        this.limitValue = limitValue;
    }

    public String getLimitValue() {
        return limitValue;
    }
}
