package com.rakovets.pizza.console;
import com.rakovets.pizza.services.*;
import com.rakovets.pizza.entity.Ingredients;
import com.rakovets.pizza.entity.Pizza;

import java.util.*;

public class PizzaTime {

    private static InterfaceServicePizza servicePizza = new ServicePizzaImpl();

    private static InterfaceCostOfIngredients serviceIngredients = new ServiceCostOfIngredients();

    private static InterfaceDiscount discount = new SystemOfDiscount();

    private static InterfacePuttingInformationInFile putToFile = new PuttingInformationInFile();

    private static InterfaceServiceInformation information = new ServiceInformationAboutPizzaForManager();

    public static void main(String[] args) {

        getMainMenu();

    }

    public static void getMainMenu() {
        menu();
        Scanner scanner = new Scanner(System.in);
        int chooseActionInMenu = scanner.nextInt();
        if (chooseActionInMenu == 1) {
            menuWithPizza();
            int choosePizza = scanner.nextInt();
            if (choosePizza == 1) {
                Pizza pizzaFourSeason = servicePizza.getPizzaByName("Four Season");
                System.out.println("Choose how much pizza do you want:");
                int countOfPizza = scanner.nextInt();
                discount.discountForExistingPizza(pizzaFourSeason, countOfPizza);
                System.out.println("Please wait, pizza Four Season is making.");
                System.out.printf("Pizza cost = %.2f, name = %s\n", pizzaFourSeason.getCost(), pizzaFourSeason.getName());
                System.out.println("With ingredients:");
                for (Ingredients ingredient: pizzaFourSeason.getSetWithIngredientsInPizza()) {
                    information.reduceCountOfIngredient(ingredient);
                    System.out.println(ingredient);
                }
                variantToPay();
                information.addCountOfOrderingPizza(countOfPizza);
                information.addCountOfMoney(pizzaFourSeason.getCost());
                putToFile.putOrderInFile(pizzaFourSeason.getName(), pizzaFourSeason.getSetWithIngredientsInPizza(),
                        pizzaFourSeason.getCost(), countOfPizza);
                getMainMenu();
            } else if (choosePizza == 2) {
                Pizza pizzaPepperoni = servicePizza.getPizzaByName("Pepperoni");
                System.out.println("Choose how much pizza do you want:");
                int countOfPizza = scanner.nextInt();
                discount.discountForExistingPizza(pizzaPepperoni, countOfPizza);
                System.out.println("Please wait, pizza Pepperoni is making.");
                System.out.printf("Pizza cost = %.2f, name = %s\n", pizzaPepperoni.getCost(), pizzaPepperoni.getName());
                System.out.println("With ingredients:");
                for (Ingredients ingredient: pizzaPepperoni.getSetWithIngredientsInPizza()) {
                    information.reduceCountOfIngredient(ingredient);
                    System.out.println(ingredient);
                }
                variantToPay();
                information.addCountOfOrderingPizza(countOfPizza);
                information.addCountOfMoney(pizzaPepperoni.getCost());
                putToFile.putOrderInFile(pizzaPepperoni.getName(), pizzaPepperoni.getSetWithIngredientsInPizza(),
                        pizzaPepperoni.getCost(), countOfPizza);
                getMainMenu();
            } else if (choosePizza == 3) {
                Pizza pizzaFourCheese = servicePizza.getPizzaByName("Four Cheese");
                System.out.println("Choose how much pizza do you want:");
                int countOfPizza = scanner.nextInt();
                discount.discountForExistingPizza(pizzaFourCheese, countOfPizza);
                System.out.println("Please wait, pizza Four Cheese is making.");
                System.out.printf("Pizza cost = %.2f, name = %s\n", pizzaFourCheese.getCost(), pizzaFourCheese.getName());
                System.out.println("With ingredients:");
                for (Ingredients ingredient: pizzaFourCheese.getSetWithIngredientsInPizza()) {
                    information.reduceCountOfIngredient(ingredient);
                    System.out.println(ingredient);
                }
                variantToPay();
                information.addCountOfOrderingPizza(countOfPizza);
                information.addCountOfMoney(pizzaFourCheese.getCost());
                putToFile.putOrderInFile(pizzaFourCheese.getName(), pizzaFourCheese.getSetWithIngredientsInPizza(),
                        pizzaFourCheese.getCost(), countOfPizza);
                getMainMenu();
            } else if (choosePizza == 4) {
                Pizza pizzaSweetChicken = servicePizza.getPizzaByName("Sweet Chicken");
                System.out.println("Choose how much pizza do you want:");
                int countOfPizza = scanner.nextInt();
                discount.discountForExistingPizza(pizzaSweetChicken, countOfPizza);
                System.out.println("Please wait, pizza Sweet Chicken is making.");
                System.out.printf("Pizza cost = %.2f, name = %s\n", pizzaSweetChicken.getCost(), pizzaSweetChicken.getName());
                System.out.println("With ingredients:");
                for (Ingredients ingredient: pizzaSweetChicken.getSetWithIngredientsInPizza()) {
                    information.reduceCountOfIngredient(ingredient);
                    System.out.println(ingredient);
                }
                variantToPay();
                information.addCountOfOrderingPizza(countOfPizza);
                information.addCountOfMoney(pizzaSweetChicken.getCost());
                putToFile.putOrderInFile(pizzaSweetChicken.getName(), pizzaSweetChicken.getSetWithIngredientsInPizza(),
                        pizzaSweetChicken.getCost(), countOfPizza);
                getMainMenu();
            } else if (choosePizza == 5) {
                Pizza pizzaDoDo = servicePizza.getPizzaByName("DoDo");
                System.out.println("Choose how much pizza do you want:");
                int countOfPizza = scanner.nextInt();
                discount.discountForExistingPizza(pizzaDoDo, countOfPizza);
                System.out.println("Please wait, pizza DoDo is making.");
                System.out.printf("Pizza cost = %.2f, name = %s\n", pizzaDoDo.getCost(), pizzaDoDo.getName());
                System.out.println("With ingredients:");
                for (Ingredients ingredient: pizzaDoDo.getSetWithIngredientsInPizza()) {
                    information.reduceCountOfIngredient(ingredient);
                    System.out.println(ingredient);
                }
                variantToPay();
                information.addCountOfOrderingPizza(countOfPizza);
                information.addCountOfMoney(pizzaDoDo.getCost());
                putToFile.putOrderInFile(pizzaDoDo.getName(), pizzaDoDo.getSetWithIngredientsInPizza(),
                        pizzaDoDo.getCost(), countOfPizza);
                getMainMenu();
            } else if (choosePizza == 6) {
                Pizza pizzaItalian = servicePizza.getPizzaByName("Italian");
                System.out.println("Choose how much pizza do you want:");
                int countOfPizza = scanner.nextInt();
                discount.discountForExistingPizza(pizzaItalian, countOfPizza);
                System.out.println("Please wait, pizza Italian is making.");
                System.out.printf("Pizza cost = %.2f, name = %s\n", pizzaItalian.getCost(), pizzaItalian.getName());
                System.out.println("With ingredients:");
                for (Ingredients ingredient: pizzaItalian.getSetWithIngredientsInPizza()) {
                    information.reduceCountOfIngredient(ingredient);
                    System.out.println(ingredient);
                }
                variantToPay();
                information.addCountOfOrderingPizza(countOfPizza);
                information.addCountOfMoney(pizzaItalian.getCost());
                putToFile.putOrderInFile(pizzaItalian.getName(), pizzaItalian.getSetWithIngredientsInPizza(),
                        pizzaItalian.getCost(), countOfPizza);
                getMainMenu();
            } else if (choosePizza == 7) {
                Pizza pizzaIrish = servicePizza.getPizzaByName("Irish");
                System.out.println("Choose how much pizza do you want:");
                int countOfPizza = scanner.nextInt();
                discount.discountForExistingPizza(pizzaIrish, countOfPizza);
                System.out.println("Please wait, pizza Irish is making.");
                System.out.printf("Pizza cost = %.2f, name = %s\n", pizzaIrish.getCost(), pizzaIrish.getName());
                System.out.println("With ingredients:");
                for (Ingredients ingredient: pizzaIrish.getSetWithIngredientsInPizza()) {
                    information.reduceCountOfIngredient(ingredient);
                    System.out.println(ingredient);
                }
                variantToPay();
                information.addCountOfOrderingPizza(countOfPizza);
                information.addCountOfMoney(pizzaIrish.getCost());
                putToFile.putOrderInFile(pizzaIrish.getName(), pizzaIrish.getSetWithIngredientsInPizza(),
                        pizzaIrish.getCost(), countOfPizza);
                getMainMenu();
            }else if (choosePizza == 8) {
                getMainMenu();
            } else {
                System.out.println("Choose variant that exist.");
            }
        } else if (chooseActionInMenu == 2) {
            Set<Ingredients> ingredientsToOrder = new HashSet<>();
            Scanner s1 = new Scanner(System.in);
            boolean isItAll = true;
            while (isItAll) {
                System.out.println("We have these ingredients on the menu. Choose and write title.");
                System.out.println(serviceIngredients.getIngredientsSet());
                String nameOfIngredient = s1.nextLine();
                Ingredients ingredient = Ingredients.valueOf(nameOfIngredient);
                System.out.println("We add ingredient: " + nameOfIngredient + "\n" +
                        "Do you want to continue? \n" +
                        "1 - Yes \n" +
                        "2 - No \n");
                ingredientsToOrder.add(ingredient);
                int answer = scanner.nextInt();
                if(answer == 1) {
                    if(ingredientsToOrder.size() == 5) {
                        System.out.println("You choose max count of ingredients. Let's start ordering!");
                        isItAll = false;
                    }
                } else {
                    isItAll = false;
                }
            }
            System.out.println("We have discount 10% for 2 and more pizza.\nPlease choose how much pizza do you want: ");
            int countOfPizza = scanner.nextInt();
            Pizza pizza = servicePizza.createPizzaByIngredients("Your Pizza", ingredientsToOrder, countOfPizza);
            System.out.println("You bye pizza: " + pizza);
            variantToPay();
            information.addCountOfOrderingPizza(countOfPizza);
            information.addCountOfMoney(pizza.getCost());
            putToFile.putOrderInFile(pizza.getName(), pizza.getSetWithIngredientsInPizza(),
                    pizza.getCost(), countOfPizza);
            getMainMenu();
        } else if (chooseActionInMenu == 3) {
            System.out.println("Good bye)");
        } else if (chooseActionInMenu == 4) {
            System.out.println("Count of pizza that buy: " + information.getCountOfPizza() + ".\n" +
                    "Count of money: " + information.getCountOfMoney());
            getMainMenu();
        } else if (chooseActionInMenu == 5) {
            information.showIngredientsWithCount(information.getMapWithIngredientsAndCount());
            getMainMenu();
        }
    }

    public static void menu() {
        System.out.printf("1. Choose pizza for yourself.\n2. Choose ingredients for pizza.\n3. Exit from menu.\n" +
                "4. View information for manager.\n5. View how much ingredients we have.\n");
    }

    public static void menuWithPizza() {
        System.out.printf("1. Four Season.\n2. Pepperoni.\n3. Four Cheese.\n4. Sweet Chicken.\n5. DoDo.\n6. Italian.\n" +
                "7. Irish.\n8. Exit to main menu.\n");
    }

    public static void variantToPay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose how do you want to pay: \n" +
                "1 - cash;\n" +
                "2 - bank card;\n" +
                "3 - through the site.");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("You choose cash.");
        } else if (choice == 2) {
            System.out.println("You choose bank card.");
        } else if (choice == 3) {
            System.out.println("You choose to pay through the site.");
        } else {
            variantToPay();
        }
    }
}
