package com.rakovets.course.util.lambda;

import java.util.Scanner;

public class LambdaDemo {
    public static void main(String[] args) {
        printMenu();
        workingMenu();
    }

    public static void workingMenu() {
        Scanner scanner = new Scanner(System.in);
        int choosingActionInMenu = scanner.nextInt();
        if (choosingActionInMenu == 5) {
            System.out.println("Good bye:)");
        } else {
            if (choosingActionInMenu == 1) {
                System.out.println("Enter first number:");
                int firstNumber = scanner.nextInt();
                System.out.println("Enter second number:");
                int secondNumber = scanner.nextInt();
                Operationable operationable = (firstNumber1, secondNumber1) -> firstNumber1 + secondNumber1;
                System.out.println("Result is: " + operationable.operation(firstNumber, secondNumber));
            } else if (choosingActionInMenu == 2) {
                System.out.println("Enter first number:");
                int firstNumber = scanner.nextInt();
                System.out.println("Enter second number:");
                int secondNumber = scanner.nextInt();
                Operationable operationable = (firstNumber12, secondNumber12) -> firstNumber12 - secondNumber12;
                System.out.println("Result is: " + operationable.operation(firstNumber, secondNumber));
            } else if (choosingActionInMenu == 3) {
                System.out.println("Enter first number:");
                int firstNumber = scanner.nextInt();
                System.out.println("Enter second number:");
                int secondNumber = scanner.nextInt();
                Operationable operationable = (firstNumber13, secondNumber13) -> firstNumber13 * secondNumber13;
                System.out.println("Result is: " + operationable.operation(firstNumber, secondNumber));
            } else if (choosingActionInMenu == 4) {
                System.out.println("Enter first number:");
                int firstNumber = scanner.nextInt();
                System.out.println("Enter second number:");
                int secondNumber = scanner.nextInt();
                Operationable operationable = (firstNumber14, secondNumber14) -> firstNumber14 / secondNumber14;
                System.out.println("Result is: " + operationable.operation(firstNumber, secondNumber));
            } else {
                System.out.println("Choose action that exist!");
            }
            printMenu();
            workingMenu();
        }
    }

    public static void printMenu() {
        System.out.println("Menu of calculator:\n1. + \n2. - \n3. * \n4. / \n5. Exit. ");
    }
}

