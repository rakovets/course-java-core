package com.rakovets.java.solid.my.userHelper;

import com.rakovets.java.solid.my.Pizza;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Order {
    Scanner scanner = new Scanner(System.in);
    double cost = 0;
    boolean run = true;
    double discount;


    void oderPizza(String pizza, int numberPizza, double price, ProfitResours profitResours) {
        discount = new DiscountCanculator().calculate(numberPizza, price);
        new PrintInfoPizza().printInfoStandartPizza(pizza, numberPizza, price, cost, discount);
        new SaveToFile().saveFilePizza(pizza, numberPizza, price, cost, discount);
        while (run) {
            System.out.println("\n1.Pay oder \t.2 Cancaled oder");
            int scan = scanner.nextInt();
            if (scan == 1) {
                //todo profitResour.setNumberPizza(numberPizza)
                //todo profitResours.setProfit (cost);
                new PaymentMethod().selectionPaymentMethod(cost, numberPizza);
                run = false;
            } else if (scan == 2) {
                System.out.println("The oder is cancalded!!");
            }
        }
    }
}
