package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.exception.CarsDriveException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Task04;

public class Task04Demo {
    public static void main(String[] args){
        String carCapacity;

        try {
            carCapacity = Task04.getCarCapacity(2600);
        } catch (CarsDriveException e) {
            carCapacity = e.getMessage();
            e.printStackTrace();
        }
        System.out.println(carCapacity);
    }
}
