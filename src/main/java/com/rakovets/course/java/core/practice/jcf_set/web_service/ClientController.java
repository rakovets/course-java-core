package com.rakovets.course.java.core.practice.jcf_set.web_service;

import java.util.Scanner;

public class ClientController {
    static Scanner cin = new Scanner(System.in);

    public static int inputChoice() {
        int choice = cin.nextInt();
        cin.nextLine();
        return choice;
    }

    public static String inputLogin() {
        System.out.println("Enter login: ");
        return cin.nextLine();
    }

    public static int inputPassword() {
        System.out.println("Enter password: ");
        int password = cin.nextInt();
        cin.nextLine();
        return password;
    }

    public static String inputUserForDeleting() {
        System.out.println("Enter username for removing");
        return cin.nextLine();
    }

    public static String inputUserForCheck() {
        System.out.println("Enter username for check");
        return cin.nextLine();
    }

    public static String inputForChangeLogin() {
        System.out.println("Enter username for change login");
        return cin.nextLine();
    }

    public static String inputForChangePassword() {
        System.out.println("Enter username for change password");
        return cin.nextLine();
    }

    public static void printUserExists() {
        System.out.println("This user exists");
    }

    public static void printUserNotExists() {
        System.out.println("This user not exists");
    }
}
