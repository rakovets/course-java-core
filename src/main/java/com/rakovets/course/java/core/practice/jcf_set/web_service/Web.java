package com.rakovets.course.java.core.practice.jcf_set.web_service;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Web {
    Map<String, String> user = new TreeMap<>();
    Scanner scanner = new Scanner(System.in);

    public void createNewUser() {
        System.out.println("Put Username");
        String name = scanner.nextLine();
        System.out.println("Put password");
        String password = scanner.nextLine();
        user.put(name, password);
    }

    public void deleteUser() {
        System.out.println("User");
        String name = scanner.nextLine();
        if (user.containsKey(name)) {
            user.remove(name);
            System.out.println("Done");
        } else {
            System.out.println("There is no User");
        }
    }

    public void checkUser() {
        System.out.println("Check is Username is free");
        String name = scanner.nextLine();
        if (user.containsKey(name)) {
            System.out.println("There is already a User with the same name");
        } else {
            System.out.println("There is no User with the same name");
        }
    }

    public void changeLogin() {
        System.out.println("Write Username");
        String name = scanner.nextLine();
        if (user.containsKey(name)) {
            System.out.println("Create new username");
            String newName = scanner.nextLine();
            user.put(newName, user.get(name));
            user.remove(name);
            System.out.println("Success");
        } else {
            System.out.println("There is no User with the same name");
        }
    }

    public void changePassword() {
        System.out.println("Chose User");
        String name = scanner.nextLine();
        System.out.println("Write your password");
        String password = scanner.nextLine();
        if (user.containsKey(name) && user.get(name).equals(password)) {
            System.out.println("Create new password");
            String newPassword = scanner.nextLine();
            user.put(name, newPassword);
            System.out.println("Success");
        } else {
            System.out.println("There is no User with the same name or incorrect User password");
        }
    }
}
