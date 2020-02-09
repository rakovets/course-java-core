package com.rakovets.course.challenge.pizza;

import java.util.Scanner;

public class PizzeriaView {
    public static void printMainMenu() {
        System.out.println("Menu:");
        System.out.println("1. Cheese Pizza");
        System.out.println("2. Vegetarian Pizza");
        System.out.println("3. Pepperoni");
        System.out.println("4. Mushroom Pizza");
        System.out.println("5. Hawaiian Pizza");
        System.out.println("6. Barbecue Pizza");
        System.out.println("7. Seafood Pizza");
    }

    public static int readUserInput(String message) {
        System.out.println(message);
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }
}
