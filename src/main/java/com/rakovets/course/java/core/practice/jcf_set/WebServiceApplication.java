package com.rakovets.course.java.core.practice.jcf_set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WebServiceApplication {
    public static Map<String, Client> map = new HashMap<>();

    public static String enterLogin() throws IOException {
        ClientController.message(1);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static String enterPassword() throws IOException {
        ClientController.message(2);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static boolean checkClient(String login) throws IOException {
        return map.containsKey(login) ? true : false;
    }

    public static boolean checkPassword(String login, String password) throws IOException {
        boolean status;

        if (checkClient(login)) {
            status = map.get(login).getPassword().equals(password) ? true : false;
        } else {
            ClientController.message(5);
            status = false;
        }
        return status;
    }

    public static void addNewClient() throws IOException {
        String password;
        String login = enterLogin();

        if (!checkClient(login)) {
            password = enterPassword();
            map.put(login, new Client(login, password));
        } else {
            ClientController.message(3);
        }
    }

    public static void removeClient() throws IOException {
        String login = enterLogin();

        if (checkClient(login)) {
            String password = enterPassword();

            if (checkPassword(login, password)) {
                map.remove(login);
                ClientController.message(8);
            } else {
                ClientController.message(4);
            }
        }

    }

    public static void checkClient() throws IOException {
        String login = enterLogin();
        if (checkClient(login)) {
            ClientController.message(3);
        } else {
            ClientController.message(5);
        }
    }

    public static void changeLogin() throws IOException {
        String newLogin;
        String login = enterLogin();
        String password = enterPassword();

        if (checkPassword(login, password)) {
            ClientController.message(6);
            newLogin = enterLogin();
            if (!checkClient(newLogin)) {
                map.get(login).setLogin(newLogin);
                map.put(newLogin, map.get(login));
                map.remove(login);
            } else {
                ClientController.message(3);
            }
        } else {
            ClientController.message(4);
        }
    }

    public static void changePassword() throws IOException {
        String newPassword;
        String login = enterLogin();
        String password = enterPassword();

        if (checkPassword(login, password)) {
            ClientController.message(7);
            newPassword = enterPassword();
            map.get(login).setPassword(newPassword);
            ClientController.message(9);
        } else {
            ClientController.message(4);
        }
    }
}
