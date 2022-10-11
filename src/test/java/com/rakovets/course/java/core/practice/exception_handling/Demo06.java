package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.BusIsFullException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.BusNoMapException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.BusOutOfFuelException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Task06;
import java.util.logging.Logger;

public class Demo06 {
    public static final Logger logger = Logger.getLogger(Demo06.class.getName());

    public static void main(String[] args) {
        Task06 task06 = new Task06();
        boolean fuelQuantity = false;
        boolean roadMap = false;
        int numberOfPassengers = 50;
        try {
            logger.info(task06.getPossibilityBusToGo(fuelQuantity, roadMap, numberOfPassengers));
        } catch (BusOutOfFuelException | BusNoMapException e) {
            logger.info("You need fuel and road map.");
        } catch (BusIsFullException e) {
            logger.info("Bus is full.");
        }
    }
}
