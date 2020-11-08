package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.task03.CapacityCheck;
import com.rakovets.course.javabasics.practice.exceptionhandling.task03.TankCapacityExeption;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Inter number of litters");
        Scanner input = new Scanner(System.in);
        try {
            String result = CapacityCheck.addFuelToTank(input.nextInt());
            System.out.println(result);
        } catch (TankCapacityExeption tex) {
            tex.printStackTrace();
        }
    }
}
