package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.MoneyException;

import java.math.BigDecimal;

public class Task3 {
    public static String checkMoney(double moneyInAccount, double purchaseCost ) throws MoneyException {
        final String PAYMENT = "Purchase paid!";
        if (moneyInAccount < purchaseCost) {
            throw new MoneyException();
        }
        return PAYMENT;
    }
}
