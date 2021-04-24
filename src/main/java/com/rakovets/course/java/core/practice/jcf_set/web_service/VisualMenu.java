package com.rakovets.course.java.core.practice.jcf_set.web_service;

public class VisualMenu {

    public static void showVisualMenu() {
        String[] visualMenu = new String[] {
                "Add new user",
                "Delete existing user",
                "Check if user exists",
                "Change existing user login",
                "Change existing user password",
                "Print all users data",
                "Exit"
        };
        for (int i = 0; i < visualMenu.length; i++) {
            System.out.println(i + 1 + ". " + visualMenu[i]);
        }
    }
}
