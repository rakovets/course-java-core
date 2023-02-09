package com.rakovets.course.java.core.practice.jcf_set;

public enum Fines {
    FINE01("Drunk driving", 600),
    FINE02("Speeding", 250),
    FINE03("Wrong parking", 50),
    FINE04("Hijacking",1000),
    FINE05("Crash", 450),
    FINE06("Emergency", 300);

    private final Integer sum;
    private final String type;

    Fines(String type, Integer sum) {
        this.sum = sum;
        this.type = type;
    }

    public Integer getSum() {
        return sum;
    }

    public String getType() {
        return type;
    }
}

