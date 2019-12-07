package com.rakovets.java.task.collections.set;

import java.util.ArrayList;
import java.util.Scanner;

public class Daiary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter five numbers : ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.nextInt());
        }
        System.out.println(arrayList);
        boolean run = true;
        while (run) {
            System.out.println("Enter you chuise : \n<<1>>  Add value to list " +
                    "\n\t<<2>> Delete value from list \n\t<<3>> Show list \n\t<<4>> Check value in list" +
                    "\n\t<<5>> Change value in list \n\t<<0>> Program fineshed\n");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("\n Enter your num :");
                    int num = scanner.nextInt();
                    add(arrayList, num);
                    break;
                case 2:
                    System.out.println("\n Remove you num :");
                    int num1 = scanner.nextInt();
                    delete(arrayList, num1);
                    break;
                case 3:
                    System.out.printf("\n Show %s\n", arrayList);
                    int num2 = scanner.nextInt();
                    showInfo(arrayList, num2);
                    break;
                case 4:
                    System.out.println("\n Check value in list :");
                    int num3 = scanner.nextInt();
                    check(arrayList, num3);
                    break;
                case 5:
                    System.out.println("\n Enter old value :");
                    int num4 = scanner.nextInt();
                    System.out.println("Enter new value :");
                    int num5 = scanner.nextInt();
                    set(arrayList, num4, num5);
                    break;

            }
            if (operation == 0) {
                run = false;
            }
        }
    }


    public static void add(ArrayList<Integer> arrayList, int num) {
        arrayList.add(num);
        System.out.printf("\n Add you value \"%d\" from list: %s\n", num, arrayList);
    }

    public static void delete(ArrayList<Integer> arrayList, int num) {
        arrayList.remove(arrayList.lastIndexOf(num));
        System.out.printf("\n Delete value  from list\"%d\" from list: %s\n", num, arrayList);
    }

    public static void showInfo(ArrayList<Integer> arrayList, int num) {
        print(arrayList, num);
    }


    public static void print(ArrayList<Integer> arrayList, int num) {
        System.out.println("Array list and num  " + arrayList + num);

    }

    public static void set(ArrayList<Integer> arrayList, int old, int new1) {
        arrayList.set(arrayList.lastIndexOf(old), new1);
        System.out.printf("You change %d value for %d value , and now you can see new %s", old, new1, arrayList);
    }


    public static void check(ArrayList<Integer> arrayList, int num) {
        System.out.println(" You value is available " + num + arrayList.contains(num));

    }

    @Override
    public String toString() {
        return "TestDemo{}";
    }
}
