package com.rakovets.course.java.core.util.constants;

public enum LimitValues {
    UNITS("10"),
    TENS ("100"),
    HUNDREDS ("1000"),
    THOUSANDS ("10000");

    private String limitValue;

    LimitValues(String limitValue) {
        this.limitValue = limitValue;
    }

    public String getLimitValue() {
        return limitValue;
    }
}
