package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.BusIsFullException;

public class Task04 {
    private String message;
    private final String CAN_GO = "Bus can go.";
    private final int BUS_CAPACITY = 40;

    public Task04(String message) {
        this.message = message;
    }

    public String getBusCapacity(int numberOfPassengers) throws BusIsFullException {
        if (numberOfPassengers < BUS_CAPACITY) {
            return CAN_GO;
        } else {
            throw new BusIsFullException("Bus is full.");
        }
    }
}
