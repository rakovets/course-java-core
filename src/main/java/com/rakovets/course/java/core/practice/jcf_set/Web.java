package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Web {
    Map<String, String> user = new TreeMap<>();
    Scanner scanner = new Scanner(System.in);

    public void createNewUser() {
        System.out.println("Put User name");
        String name = scanner.nextLine();
        System.out.println("Put password");
        String password = scanner.nextLine();
        user.put(name, password);
    }

    public String deleteUser() {
        System.out.println("User");
        String name = scanner.nextLine();
        if (user.containsKey(name)) {
            user.remove(name);
            return "Done";
        } else {
            return "There is no User";
        }
    }

    public String checkUser() {
        System.out.println("Check is Username is free");
        String name = scanner.nextLine();
        if (user.containsKey(name)) {
            return "There is already a User with the same name";
        } else {
            return "There is no User with the same name";
        }
    }

    public String changeLogin() {
        System.out.println("Change login");
        String name = scanner.nextLine();
        if (user.containsKey(name)) {
            System.out.println("Create new username");
            String newName = scanner.nextLine();
            user.put(newName, user.get(name));
            user.remove(name);
            return "Success";
        } else {
            return "There is no User with the same name";
        }
    }

    public String changePassword() {
        System.out.println("Change password");
        String name = scanner.nextLine();
        if (user.containsKey(name)) {
            System.out.println("Create new password");
            String password = scanner.nextLine();
            user.put(name, password);
            return "Success";
        } else {
            return "There is no User with the same name";
        }
    }
}
