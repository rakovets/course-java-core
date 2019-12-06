package com.rakovets.course.util.stringlist.practik2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers of elements");
        List<Integer> listWithValues = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter new value:");
            listWithValues.add(scanner.nextInt());
        }
        for (Integer value : listWithValues) {
            System.out.println(value.toString());
        }
        System.out.println("");
        enterNewValue(listWithValues, 24);
    }

    static void printMenu() {
        System.out.println("1.Enter value in list.\n2.Delete value from list.\n3.Show what list contains.\n4.Check value on exist.\n5.Change value in list.");
    }
    static void enterNewValue(List<Integer> list, int value) {
        list.add(value);
        System.out.println("Added new value:");
        printList(list);
    }
    static void printList(List<Integer> list) {
        for (Integer value : list) {
            System.out.println(value.toString());
        }
    }
    static void deleteValue(List<Integer> list, int value) {
        for (Integer valueOfList : list) {
            src\com\rakovets\course\util\hollywood\*
        }
    }
}
