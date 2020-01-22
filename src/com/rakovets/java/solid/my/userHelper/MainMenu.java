package com.rakovets.java.solid.my.userHelper;

import com.rakovets.java.solid.my.Pizza;
import com.rakovets.java.solid.my.standarts.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MainMenu menuHelper = new MainMenu();
        menuHelper.mainMenu();
    }

    public void mainMenu() {
        System.out.println("Pizzeria");
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH : mm :ss");
        System.out.println(dateTime.format(formatter));
        System.out.println("(Discount 10 % in work days of oder 3 or more pizza)");
        boolean operation = true;
        while (operation) {
            System.out.println("\nWhat you want to do : " +
                    "\n1 - Select pizza from menu" +
                    "\n2 - Prepare pizza according to your ingredients" +
                    "\n3 - Exit");
            int operation2 = scanner.nextInt();
            switch (operation2) {
                case 1:
                    Pizza pizza = createStandartPizza();
                    System.out.println(" ");
                    System.out.println(pizza.getPrettyPrint());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Create your pizzaa!!");
                    new PizzaCreater().createCustomPizza();
                    break;
                case 3:
                    operation = false;
            }
        }
    }

    private Pizza createStandartPizza() {
        System.out.println("\nChosee your favorit pizza:" +
                "\n1 Margaritta" +
                "\n2 Peperonni" +
                "\n3 Gawaiskaa" +
                "\n4 Barbecu" +
                "\n5 Four sesons" +
                "\n6 Chili" +
                "\n7 CountrySide" +
                "\n0 Cancaled oder!!"
        );
        int opetation = scanner.nextInt();
        switch (opetation) {
            case 1:
                return new Margarita();
            case 2:
                return new Peperonni();
            case 3:
                return new Gawaiskaa();
            case 4:
                return new Barbecu();
            case 5:
                return new FourSesons();
            case 6:
                return new Chili();
            case 7:
                return new CountrySide();
        }
        return null;
    }
}
