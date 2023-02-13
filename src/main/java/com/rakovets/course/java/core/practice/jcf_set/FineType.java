package com.rakovets.course.java.core.practice.jcf_set;

public enum FineType {
    CORONAVIRUS_PENALTY(100),
    PENALTY_FOR_SMOKING(50),
    PENALTY_FOR_DRINKING(50),
    PENALTY_FOR_SPREADING_FAKE_INFORMATION(750),
    PENALTY_FOR_VIOLATION_OF_SILENCE(25),
    TRAFFIC_POLICE_FINES(125);
    private final int sum;

    FineType(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }
}
