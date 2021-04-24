package com.rakovets.course.java.core.practice.jcf_set.web_service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DataStorage {
    static Map<String, Integer> usersDataList = new HashMap<>();

    public static void addNewUser() {
        usersDataList.put(ClientController.inputLogin(), ClientController.inputPassword());
        System.out.println("User successfully added");
    }

    public static Set<Map.Entry<String, Integer>> printUsersData() {
        return usersDataList.entrySet();
    }

    public static void deleteExistingUser() {
        usersDataList.remove(ClientController.inputUserForDeleting());
        System.out.println("User successfully removed");
    }

    public static void checkIfUserExists() {
       if (usersDataList.containsKey(ClientController.inputUserForCheck())) {
           System.out.println("This user exists");
       } else {
           System.out.println("This user not exists");
       }
    }

    public static void changeExistingUserLogin() {
        String oldKey = ClientController.inputForChangeLogin();
        if (usersDataList.containsKey(oldKey)) {
            usersDataList.put(ClientController.inputLogin(), usersDataList.remove(oldKey));
        }
    }

    public static void changeExistingUserPassword() {
        String oldValue = ClientController.inputForChangePassword();
        if (usersDataList.containsKey(oldValue)) {
            usersDataList.put(oldValue, ClientController.inputPassword());
        }
    }
}
