package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String login;
        String password;
        int i = 0;

        Map<String, String> users = new HashMap<>();
        users.put("sergey2021", "qwer1234");
        users.put("evgenij-mzkt", "1234rewq");
        users.put("tajana2021", "qazwsx");
        users.put("svetlana89", "password");

        WebService webService = new WebService(users);

        do {
            System.out.println("What action do you want to take?");
            System.out.println("Enter the appropriate number for the required action:");
            System.out.print("1 - Add/2 - Delete/3 - Check/4 - change login/5 - change password: ");

            Scanner in = new Scanner(System.in);
            int option = in.nextInt();

            if (option == 1) {
                boolean isLoginExisted;
                do {
                    login = enterLogin();
                    isLoginExisted = checkUniqueLogin(users, login);
                } while (isLoginExisted == true);
                password = enterPassword();
                webService.setNewUser(login, password);
                printList(users);

            } else if (option == 2) {
                boolean isLoginCorrect;
                boolean isPasswordCorrect;
                do {
                    login = enterLogin();
                    isLoginCorrect = webService.checkUserExistence(login);
                } while (isLoginCorrect == false);
                do {
                    password = enterPassword();
                    isPasswordCorrect = checkPassword(users, login, password);
                } while (isPasswordCorrect == false);
                webService.deleteUser(login, password);
                printList(users);

            } else if (option == 3) {
                boolean isLoginCorrect;
                login = enterLogin();
                isLoginCorrect = webService.checkUserExistence(login);
                if (isLoginCorrect == true) {
                    System.out.printf("This password exists in the database.");
                } else {
                    System.out.printf("This password doesn't exist in the database.");
                }
            } else if (option == 4) {
                String newLogin;
                boolean isLoginCorrect;
                boolean isPasswordCorrect;
                do {
                    login = enterLogin();
                    isLoginCorrect = webService.checkUserExistence(login);
                } while (isLoginCorrect == false);
                do {
                    password = enterPassword();
                    isPasswordCorrect = checkPassword(users, login, password);
                } while (isPasswordCorrect == false);
                boolean isLoginExisted;
                do {
                    newLogin = enterNewLogin();
                    isLoginExisted = checkUniqueLogin(users, newLogin);
                } while (isLoginExisted == true);
                webService.changeUserLogin(login, newLogin);
                printList(users);

            } else if (option == 5) {
                String newPassword;
                boolean isLoginCorrect;
                boolean isPasswordCorrect;
                do {
                    login = enterLogin();
                    isLoginCorrect = webService.checkUserExistence(login);
                } while (isLoginCorrect == false);
                do {
                    password = enterPassword();
                    isPasswordCorrect = checkPassword(users, login, password);
                } while (isPasswordCorrect == false);
                newPassword = enterNewPassword();
                webService.changeUserPassword(login, newPassword);
                printList(users);
            }
        } while (i ==0);
    }

    public static String enterLogin() {
        System.out.print("Enter login: ");
        Scanner in1 = new Scanner(System.in);
        String login = in1.next();
        return login;
    }

    public static String enterPassword() {
        System.out.print("Enter password: ");
        Scanner in2 = new Scanner(System.in);
        String login = in2.next();
        return login;
    }

    public static String enterNewLogin() {
        System.out.print("Enter a new login: ");
        Scanner in3 = new Scanner(System.in);
        String newLogin = in3.next();
        return newLogin;
    }

    public static String enterNewPassword() {
        System.out.print("Enter a new password: ");
        Scanner in4 = new Scanner(System.in);
        String newPassword = in4.next();
        return newPassword;
    }

    public static boolean checkUniqueLogin(Map<String, String> users, String login) {
        if (users.containsKey(login)) {
            System.out.println("This login already exists in the database. Enter a new login:");
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkPassword(Map<String, String> users, String login, String password) {
        String str1 = users.get(login);
        if (password.equals(str1)) {
            return true;
        } else {
            System.out.println("This password is incorrect.");
            return false;
        }
    }

    public static void printList(Map<String, String> users) {
        for (Map.Entry<String, String> user : users.entrySet()) {
            System.out.printf("%s - %s\n", user.getKey(), user.getValue());
        }
    }
}
