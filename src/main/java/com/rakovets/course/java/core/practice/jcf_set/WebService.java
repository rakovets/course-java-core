package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WebService {
    static Scanner scanner = new Scanner(System.in);
    public static Map<String, Client> map = new HashMap();

    public static String enterLogin() {
        System.out.println("Enter you login");
        return scanner.nextLine();
    }

    public static String enterPassword(){
        System.out.println("Enter you Password");
        return scanner.nextLine();
    }

    public static boolean checkClient(String login) {
        return map.containsKey(login) ? true : false;
    }

    public static void addNewClient() {
        String login = enterLogin();

        if (!checkClient(login)) {
            String password;
            password = enterPassword();
            map.put(login, new Client(login, password));
        } else {
            System.out.println("Пользователя не существует");
        }
    }

    public static void removeClient(){
        String login = enterLogin();

        if (checkClient(login)) {
            String password = enterPassword();
            if (checkPassword(login, password)) {
                map.remove(login);
                System.out.println("User delete");
            } else {
                System.out.println("Wrong password or user");
            }
        }
    }

    public static boolean checkPassword(String login, String password) {
        return  map.get(login).getPassword().equals(password) ? true : false;
    }

    public static void changeLogin(){
        String newLogin;
        String login = enterLogin();
        String password = enterPassword();

        if (checkPassword(login, password)) {
            System.out.println("Enter login ");
            newLogin = enterLogin();
            if (!checkClient(newLogin)) {
                map.get(login).setLogin(newLogin);
                map.put(newLogin, map.get(login));
                map.remove(login);
            } else {
                System.out.println("Client exists ");
            }
        } else {
            System.out.println("Incorrect password ");
        }
    }

    public static void changePassword(){
        String newPassword;
        String login = enterLogin();
        String password = enterPassword();

        if (checkPassword(login, password)) {
            System.out.println("Enter password ");
            newPassword = enterPassword();
            map.get(login).setPassword(newPassword);
        } else {
           System.out.println("Incorrect password");
        }
    }

    public static void checkClient(){
        String login = enterLogin();
        if (checkClient(login)) {
            System.out.println(login + " login exists");
        } else {
            System.out.println(login + " login  not exists");
        }
    }

    public static void showMenu() {
        System.out.println("Select an action\n" + "1 - Add a new user.\n" + "2 - Delete an existing user.\n" +
                "3 - Check if the user exists.\n" + "4 - Change the username of an existing user.\n" +
                "5 - Change the password of an existing user.\n" + "6 - Finish the program.");
    }
}
