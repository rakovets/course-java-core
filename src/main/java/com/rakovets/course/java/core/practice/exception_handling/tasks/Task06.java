package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.BusIsFullException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.BusNoMapException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.BusOutOfFuelException;

public class Task06 {
    private final String CAN_GO = "Bus can go.";
    private final int BUS_CAPACITY = 40;

    public String getPossibilityBusToGo(boolean fuelQuantity, boolean roadMap, int numberOfPassengers) throws
            BusOutOfFuelException, BusNoMapException, BusIsFullException {
        if (fuelQuantity != true) {
            throw new BusOutOfFuelException("Not enough fuel!");
        }
        if (roadMap != true) {
            throw new BusNoMapException("No road map!");
        }
        if (numberOfPassengers > BUS_CAPACITY) {
            throw new BusIsFullException("Bus is full!");
        }
        return CAN_GO;
    }
}
