package com.rakovets.java.task.collections.set.diary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListWithMenu {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers of elements");
        List<Integer> listWithValues = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter new value:");
            listWithValues.add(scanner.nextInt());
        }
        System.out.println("\nList was created:");
        for (Integer value : listWithValues) {
            System.out.printf("%s ", value.toString());
        }
        workWithMenu(listWithValues, scanner);
    }

    static void printMenu() {
        System.out.println("\n\n1.Enter value in list.\n" +
                "2.Delete value from list.\n" +
                "3.Show what list contains.\n" +
                "4.Check value on exist.\n" +
                "5.Change value in list.\n" +
                "6.Exit from program.");
    }
    static void enterNewValue(List<Integer> list, int value) {
        list.add(value);
        System.out.println("New value was added.");
    }
    static void printList(List<Integer> list) {
        for (Integer value : list) {
            System.out.println(value.toString());
        }
    }
    static void deleteValue(List<Integer> list, int value) {
        if (list.indexOf(value) == -1) {
            System.out.println("Element not found.");
        } else {
            list.remove(list.indexOf(value));
            System.out.println("Element was deleted.");
        }
    }

    static void checkingValueOnExist(List<Integer> list, int value) {
        if (list.indexOf(value) == -1) {
            System.out.println("Value not found.");
        } else {
            System.out.printf("Value %d was founded.\n", value);
        }
    }

    static void changingValueInList(List<Integer> list, int value, int newValue) {
        if (list.indexOf(value) == -1) {
            System.out.println("Element not found.");
        } else {
            list.set(list.indexOf(value), newValue);
            System.out.printf("Value %d changed on %d.\n", value, newValue);
        }
    }
    static void workWithMenu(List<Integer> listWithValues, Scanner scanner) {
        printMenu();
        int choosingActionInMenu = scanner.nextInt();
        if (choosingActionInMenu == 6) {
            System.out.println("Good bye.)");
        } else {
            if (choosingActionInMenu == 1) {
                System.out.println("Enter value that was added in list:");
                enterNewValue(listWithValues, scanner.nextInt());
            } else if (choosingActionInMenu == 3) {
                System.out.println("Current list:");
                printList(listWithValues);
            } else if (choosingActionInMenu == 2) {
                System.out.println("Enter value that you want to delete:");
                deleteValue(listWithValues, scanner.nextInt());
            } else if (choosingActionInMenu == 4) {
                System.out.println("Enter value that you want to find.");
                checkingValueOnExist(listWithValues, scanner.nextInt());
            } else if (choosingActionInMenu == 5) {
                System.out.println("Enter old value and new: ");
                changingValueInList(listWithValues, scanner.nextInt(), scanner.nextInt());
            } else {
                System.out.println("Choose action that exist!");
            }
            workWithMenu(listWithValues, scanner);
        }

    }
}

