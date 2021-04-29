package com.rakovets.course.java.core.practice.jcf_set.web_service;

import java.util.Scanner;

public class Apk {
    Web web = new Web();
    Scanner scanner = new Scanner(System.in);
    int item;

    public void menu() {
        printMenu();
        while (scanner.hasNextInt()) {
            item = scanner.nextInt();
            switch (item) {
                case 1:
                    web.createNewUser();
                    break;
                case 2:
                    web.deleteUser();
                    break;
                case 3:
                    web.checkUser();
                    break;
                case 4:
                    web.changeLogin();
                    break;
                case 5:
                    web.changePassword();
                    break;
                default:
                    System.out.println("Chose something");
            }
            printMenu();
        }
    }

    public void printMenu() {
        System.out.println("\nMenu" + "\n1. Create new User" + "\n2. Delete existing User" + "\n3. Check if the User exist"
                + "\n4. Change the login of an existing User" + "\n5. Change password of an existing User\n");
    }
}
