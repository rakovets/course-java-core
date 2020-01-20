package com.rakovets.java.solid.my.userHelper;

import com.rakovets.java.solid.my.standarts.*;

public  class PrintInfoPizza {
    String textInfoPizza;

    void printInfoStandartPizza(String pizza, int number, double price, double cost, double discontNumberPizza) {
        textInfoPizza = String.format("\nOder: Pizza %s, count %d ., coast - %d* %.1f -discount %.1f -%.1f rub.",
                pizza, number, price, discontNumberPizza, cost);
        System.out.println(textInfoPizza);
    }

    void printInfoIngridients(String name) {
        switch (name) {
            case "'Barbecu'":
                System.out.printf("Ingridients: %s", new Barbecu().getPrettyPrint());
                break;
            case "'Chili'":
                System.out.printf("Ingridients: %s", new Chili().getPrettyPrint());
                break;
            case "'CountrySide'":
                System.out.printf("Ingridients: %s", new CountrySide().getPrettyPrint());
                break;
            case "'FourSeasons'":
                System.out.printf("Ingridients: %", new FourSesons().getPrettyPrint());
                break;
            case "'Gawaiskaa'":
                System.out.printf("Ingridients: %", new Gawaiskaa().getPrettyPrint());
                break;
            case "'Margarita'":
                System.out.printf("Ingridients: %", new Margarita().getPrettyPrint());
                break;
            case "'Peperonni'":
                System.out.printf("Ingridients: %", new Peperonni().getPrettyPrint());
                break;
        }
    }
}