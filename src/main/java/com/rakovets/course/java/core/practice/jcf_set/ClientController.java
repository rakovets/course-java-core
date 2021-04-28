package com.rakovets.course.java.core.practice.jcf_set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientController {
    public static void control() throws IOException {
        boolean status = true;
        while (status) {
            System.out.println("Select an action\n" + "1 - Add a new user.\n" + "2 - Delete an existing user.\n" +
                    "3 - Check if the user exists.\n" + "4 - Change the username of an existing user.\n" +
                    "5 - Change the password of an existing user.\n" + "6 - Finish the program.");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int inputValue = Integer.parseInt(reader.readLine());

            switch (inputValue) {
                case 1:
                    WebServiceApplication.addNewClient();
                    break;
                case 2:
                    WebServiceApplication.removeClient();
                    break;
                case 3:
                    WebServiceApplication.checkClient();
                    break;
                case 4:
                    WebServiceApplication.changeLogin();
                    break;
                case 5:
                    WebServiceApplication.changePassword();
                    break;
                case 6:
                    status = false;
                    System.out.println("Finish.");
                    break;
            }
        }
    }

    public static void message(int value) {
        switch (value) {
            case 1:
                System.out.println("Enter the login.");
                break;
            case 2:
                System.out.println("Enter the password.");
                break;
            case 3:
                System.out.println("The client already exists.");
                break;
            case 4:
                System.out.println("Invalid password.");
                break;
            case 5:
                System.out.println("The client does not exist.");
                break;
            case 6:
                System.out.println("Enter your new login.");
                break;
            case 7:
                System.out.println("Enter your new password.");
                break;
            case 8:
                System.out.println("The client was deleted.");
                break;
            case 9:
                System.out.println("The password was deleted.");
                break;
            default:
                break;
        }
    }
}
