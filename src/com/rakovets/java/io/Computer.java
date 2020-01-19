package com.rakovets.java.io;

import java.io.Serializable;

public class Computer implements Serializable {
    private int cost;
    private String model;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public String getModel() {
        return model;
    }
}
