package com.rakovets.pizza.services;

import com.rakovets.pizza.entity.Pizza;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemOfDiscount implements InterfaceDiscount {

    public double discountByCountOfPizza(int countOfPizza, double cost) {
        double discount;
        if (countOfPizza >= 2) {
           discount = countOfPizza * cost * 0.1;
        }   else {
            discount = 0;
        }
        return discount;
    }

    public double discountByWeekday(int countOfPizza, double cost) {
        double discount;
        Date currentDate = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("EEEE");
        String weekday = formatDate.format(currentDate);
        System.out.println("Today is " + weekday);
        if (weekday.equals("вторник")) {
            discount = countOfPizza * cost * 0.1;
        } else {
            discount = 0;
        }
        return discount;
    }

    @Override
    public Pizza discountForExistingPizza(Pizza currentPizza, int countOfPizza) {
        double discountByCount;
        if (countOfPizza >= 2) {
            discountByCount = countOfPizza * currentPizza.getCost() * 0.1;
        }   else {
            discountByCount = 0;
        }

        double discountByWeekday;
        Date currentDate = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("EEEE");
        String weekday = formatDate.format(currentDate);
        System.out.println("Today is " + weekday);
        if (weekday.equals("вторник")) {
            discountByWeekday = countOfPizza * currentPizza.getCost() * 0.1;
        } else {
            discountByWeekday = 0;
        }

        double cost = (countOfPizza * currentPizza.getCost()) - (discountByCount + discountByWeekday);
        currentPizza.setCost(cost);
        return currentPizza;
    }
}
