package com.rakovets.java.solid;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MenuWithChoosingIngredients {
    private double cost = 0;
    PuttingInformationAboutPizzaInFile putToFile= new PuttingInformationAboutPizzaInFile();
    Scanner scanner = new Scanner(System.in);
    Set<Ingredients> ingredientsSet= new HashSet<>();

    public Set<Ingredients> menuWithChoosingIngredients() {
        System.out.printf("Please choose meet:\n1. Chicken.\n2. Sausage.");
        int chooseMeat = scanner.nextInt();
        if (chooseMeat == 1) {
            ingredientsSet.add(Ingredients.Chicken);
        } else if(chooseMeat == 2) {
            ingredientsSet.add(Ingredients.Sausage);
        } else {
            System.out.println("This variant is exist.");
        }
        System.out.printf("Please choose cheese:\n1. Mozzarella.\n2. Gorgonzola.");
        int chooseCheese = scanner.nextInt();
        if (chooseCheese == 1) {
            ingredientsSet.add(Ingredients.Mozzarella);
        } else if(chooseCheese == 2) {
            ingredientsSet.add(Ingredients.Gorgonzola);
        } else {
            System.out.println("This variant is exist.");
        }
        System.out.printf("Please choose vegetables:\n1. Tomatoes.\n2. Cucumbers.");
        int chooseVegetables = scanner.nextInt();
        if (chooseVegetables == 1) {
            ingredientsSet.add(Ingredients.Tomatoes);
        } else if(chooseVegetables == 2) {
            ingredientsSet.add(Ingredients.Cucumbers);
        } else {
            System.out.println("This variant is exist.");
        }
        System.out.printf("Please choose type of dough:\n1. Thick.\n2. Thin.");
        int chooseTypeOfDough = scanner.nextInt();
        if (chooseTypeOfDough == 1) {
            ingredientsSet.add(Ingredients.Thick);
        } else if(chooseTypeOfDough == 2) {
            ingredientsSet.add(Ingredients.Thin);
        } else {
            System.out.println("This variant is exist.");
        }
        System.out.printf("Please choose type of board:\n1. With meat.\n2. With cheese.");
        int chooseTypeOfBoard = scanner.nextInt();
        if (chooseTypeOfBoard == 1) {
            ingredientsSet.add(Ingredients.With_meat);
        } else if(chooseTypeOfBoard == 2) {
            ingredientsSet.add(Ingredients.With_cheese);
        } else {
            System.out.println("This variant is exist.");
        }

        ChooseSizePizzaForYourself chooseSizePizzaForYourself = new ChooseSizePizzaForYourself();
        chooseSizePizzaForYourself.chooseSize();

        putToFile.putOrderInFile(ingredientsSet, cost, chooseSizePizzaForYourself.getSize());

        System.out.printf("Wait, pizza is making.\nIngredients that you choose:\n");
        for (Ingredients ingredient: ingredientsSet) {
            System.out.println(ingredient);
        }

        return ingredientsSet;
    }
}
