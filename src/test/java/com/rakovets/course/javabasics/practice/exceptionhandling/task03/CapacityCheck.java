package com.rakovets.course.javabasics.practice.exceptionhandling.task03;

import org.junit.jupiter.api.Test;

public class CapacityCheck {
    public static String addFuelToTank(int addLiters) throws TankCapacityExeption {
        int capacity = 68;
        if (addLiters > capacity) {
            throw new TankCapacityExeption("Capacity of Tank less than capacity", addLiters);
        }
        return "Thanks for using our service";
    }
}
