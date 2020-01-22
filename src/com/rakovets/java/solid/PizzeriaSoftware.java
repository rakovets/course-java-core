package com.rakovets.java.solid;

import java.util.Scanner;

public class PizzeriaSoftware {
    PuttingInformationAboutPizzaInFile putToFile = new PuttingInformationAboutPizzaInFile();

    public void menu() {
        System.out.printf("1. Choose pizza for yourself.\n2. Choose ingredients for pizza.\n3. Exit from menu.\n");
    }

    public void menuWithPizza() {
        System.out.printf("1. 4 season.\n2. With tomatoes.\n3. With meat board.\n4. With Cheese.\n5. DoDo.\n6. Italian.\n" +
                "7. Chicken.\n8. Exit to main menu.\n");
    }

    public void choosePizzaFourSeason() {
        System.out.println("Please wait, pizza 4 season is making.");
        System.out.printf("Pizza cost = %.2f, size = %.2f\n", PizzaFourSeason.getCost(), PizzaFourSeason.getSize());
        System.out.println("With ingredients:");
        for (Ingredients ingredient: PizzaFourSeason.getIngredientsForFourSeason()) {
            System.out.println(ingredient);
        }
        putToFile.putOrderInFile(PizzaFourSeason.getIngredientsForFourSeason(),
                PizzaFourSeason.getCost(), PizzaFourSeason.getSize());
    }

    public void choosePizzaWithTomatoes() {
        System.out.println("Please wait, pizza with tomatoes is making.");
        System.out.printf("Pizza cost = %.2f, size = %.2f\n", PizzaWithTomatoes.getCost(), PizzaWithTomatoes.getSize());
        System.out.println("With ingredients:");
        for (Ingredients ingredient: PizzaWithTomatoes.getIngredientsPizzaWithTomatoes()) {
            System.out.println(ingredient);
        }
        putToFile.putOrderInFile(PizzaWithTomatoes.getIngredientsPizzaWithTomatoes(),
                PizzaWithTomatoes.getCost(), PizzaWithTomatoes.getSize());
    }

    public void choosePizzaWithMeatBoard() {
        System.out.println("Please wait, pizza with meat board is making.");
        System.out.printf("Pizza cost = %.2f, size = %.2f\n", PizzaWithMeatBoard.getCost(), PizzaWithMeatBoard.getSize());
        System.out.println("With ingredients:");
        for (Ingredients ingredient: PizzaWithMeatBoard.getIngredientsPizzaWithMeatBoard()) {
            System.out.println(ingredient);
        }
        putToFile.putOrderInFile(PizzaWithMeatBoard.getIngredientsPizzaWithMeatBoard(),
                PizzaWithMeatBoard.getCost(), PizzaWithMeatBoard.getSize());
    }

    public void choosePizzaWithCheese() {
        System.out.println("Please wait, pizza with meat board is making.");
        System.out.printf("Pizza cost = %.2f, size = %.2f\n", PizzaWithCheese.getCost(), PizzaWithCheese.getSize());
        System.out.println("With ingredients:");
        for (Ingredients ingredient: PizzaWithCheese.getIngredientsPizzaWithCheese()) {
            System.out.println(ingredient);
        }
        putToFile.putOrderInFile(PizzaWithCheese.getIngredientsPizzaWithCheese(),
                PizzaWithCheese.getCost(), PizzaWithCheese.getSize());
    }

    public void choosePizzaDoDo() {
        System.out.println("Please wait, pizza DoDo is making.");
        System.out.printf("Pizza cost = %.2f, size = %.2f\n", PizzaDoDo.getCost(), PizzaDoDo.getSize());
        System.out.println("With ingredients:");
        for (Ingredients ingredient: PizzaDoDo.getIngredientsForPizzaDoDo()) {
            System.out.println(ingredient);
        }
        putToFile.putOrderInFile(PizzaDoDo.getIngredientsForPizzaDoDo(),
                PizzaDoDo.getCost(), PizzaDoDo.getSize());
    }

    public void choosePizzaItalian() {
        System.out.println("Please wait, pizza DoDo is making.");
        System.out.printf("Pizza cost = %.2f, size = %.2f\n", PizzaItalian.getCost(), PizzaItalian.getSize());
        System.out.println("With ingredients:");
        for (Ingredients ingredient: PizzaItalian.getIngredientsForPizzaItalian()) {
            System.out.println(ingredient);
        }
        putToFile.putOrderInFile(PizzaDoDo.getIngredientsForPizzaDoDo(),
                PizzaDoDo.getCost(), PizzaDoDo.getSize());
    }

    public void choosePizzaChicken()  {
        System.out.println("Please wait, pizza DoDo is making.");
        System.out.printf("Pizza cost = %.2f, size = %.2f\n", PizzaChicken.getCost(), PizzaChicken.getSize());
        System.out.println("With ingredients:");
        for (Ingredients ingredient: PizzaChicken.getIngredientsForPizzaChicken()) {
            System.out.println(ingredient);
        }
        putToFile.putOrderInFile(PizzaChicken.getIngredientsForPizzaChicken(),
                PizzaChicken.getCost(), PizzaChicken.getSize());
    }

    public void workingMainMenu () {
        menu();
        Scanner scanner = new Scanner(System.in);
        int chooseActionInMenu = scanner.nextInt();
        if (chooseActionInMenu == 1) {
            menuWithPizza();
            int choosePizza = scanner.nextInt();
            if (choosePizza == 1) {
                choosePizzaFourSeason();
            } else if (choosePizza == 2) {
                choosePizzaWithTomatoes();
            } else if (choosePizza == 3) {
                choosePizzaWithMeatBoard();
            } else if (choosePizza == 4) {
                choosePizzaWithCheese();
            } else if (choosePizza == 5) {
                choosePizzaDoDo();
            } else if (choosePizza == 6) {
                choosePizzaItalian();
            } else if (choosePizza == 7) {
                choosePizzaChicken();
            }else if (choosePizza == 8) {
                workingMainMenu();
            } else {
                System.out.println("Choose variant that exist.");
            }
        } else if (chooseActionInMenu == 2) {
            System.out.println("Choose ingredient that you want.)");
            MenuWithChoosingIngredients menu = new MenuWithChoosingIngredients();
            menu.menuWithChoosingIngredients();
        } else if (chooseActionInMenu == 3) {
            System.out.println("Good bye)");
        }
    }
}
