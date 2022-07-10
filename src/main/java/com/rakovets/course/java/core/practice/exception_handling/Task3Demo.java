package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.MoneyException;

public class Task3Demo {
    public static void main(String[] args) {
        String payment;
        double cost = 4.0;

        try {
            payment = Task3.checkMoney(3.0, 4.0);
        } catch (MoneyException e) {
            payment = e.getMessage();
            e.printStackTrace();
        }
        System.out.println(payment);
    }
}
