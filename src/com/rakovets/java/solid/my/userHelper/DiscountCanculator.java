package com.rakovets.java.solid.my.userHelper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DiscountCanculator {
    double discount;
    String day;

    double calculate(double numberPizza, double price) {
        if (numberPizza >= 3) {
            discount = numberPizza * price * 0.1;
        } else discount = calculate(numberPizza, price);
        return discount;
    }


    double discountDayPizza(double numberPizza, double price) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE");
        day = localDateTime.format(formatter);
        if (day.equals("sunday") || day.equals("Suturday")) {
            discount = 0;
        } else {
            discount = numberPizza * price * 0.1;
        }
        return discount;
    }
}
