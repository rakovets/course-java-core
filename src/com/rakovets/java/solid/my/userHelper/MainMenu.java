package com.rakovets.java.solid.my.userHelper;

import com.rakovets.java.solid.my.StandartPizza;
import com.rakovets.java.solid.my.standarts.*;

import java.util.Scanner;

public class MainMenu {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MainMenu menuHelper = new MainMenu();
        menuHelper.mainMenu();
    }

    public void mainMenu() {
        boolean operation = true;
        while (operation) {
            System.out.println("\n what you want to do : " +
                    "\n1 - choose pizza from the menu, " +
                    "\n2 - prepare pizza according to your ingredients, " +
                    "\n3 - exit");
            int operation2 = scanner.nextInt();
            switch (operation2) {
                case 1:
                    StandartPizza pizza = createStandartPizza();
                    //todo pizza must be returned to "main logic class"
                    // create Pizza(--opetation--)
                    break;
                case 2:
                    //todo rename testCope -> createCustomPizza
                    new PizzaCreater().createCustomPizza();
                    break;
                case 3:
                    operation = false;
            }
        }
    }

    private StandartPizza createStandartPizza() {
        System.out.println("\n Chosee your favorit pizza or make or do it yourself :" +
                "\n1 Margaritta:" +
                "\n2 Peperonni:" +
                "\n3 Gawaiskaa:" +
                "\n4 Barbecu:" +
                "\n5 Four sesons:" +
                "\n6 Chili:" +
                "\n7 CountrySide:" +
                "\n0 Exit !!"
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
