package com.rakovets.course.java.core.practice.jcf.set.WebService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class LoginPasswordDemo {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, RegisteredClient> webService = new HashMap<>();

        System.out.println("\nChoose operation:");
        char ch;

        do {
            System.out.println("1. Add new User");
            System.out.println("2. Delete existing User");
            System.out.println("3. Check if User exists");
            System.out.println("4. Change login");
            System.out.println("5. Change password");
            System.out.println("6. Enter if you want to see the whole database of Users logins and passwords");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter login and password (separated by space or enter)");
                    webService.put(scan.next(), new RegisteredClient(scan.next()));
                    break;
                case 2:
                    System.out.println("Enter login of User you want to delete");
                    webService.remove(scan.next());
                    break;
                case 3:
                    System.out.println("Enter login of User you want to check");
                    System.out.println("User status = " + webService.containsKey(scan.next()));
                    break;
                case 4:
                    System.out.println("Enter login you want to change");
                    webService.remove(scan.next());
                    System.out.println("Enter new login and password");
                    webService.put(scan.next(), new RegisteredClient(scan.next()));
                    break;
                case 5:
                    System.out.println("Enter your login and new password (separated by space or enter)");
                    webService.replace(scan.next(), new RegisteredClient(scan.next()));
                    break;
                default:
                System.out.println("Here they are:");
                for (Map.Entry<String, RegisteredClient> entry : webService.entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
            }
            System.out.println("\nDo you want to continue (Type y or n)");
            ch = scan.next().charAt(0);
        }
        while (ch == 'Y'|| ch == 'y');
    }
}
