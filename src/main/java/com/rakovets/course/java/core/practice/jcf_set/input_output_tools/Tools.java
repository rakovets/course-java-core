package com.rakovets.course.java.core.practice.jcf_set.input_output_tools;

import java.util.Scanner;

public class Tools {
   static Scanner scanner = new Scanner(System.in);

    public static String chooseLogin() {
        System.out.println("Please input Login");
        return scanner.nextLine();
    }
    public static String choosePassword() {
        System.out.println("Please choose Password");
        return scanner.nextLine();
    }

    public static String inputLogin() {
        System.out.println("Login:");
        return scanner.nextLine();
    }

    public static String inputNewPassword() {
        System.out.println("New Password:");
        return scanner.nextLine();
    }

    public static String inputNewLogin() {
        System.out.println("New Login");
        return scanner.nextLine();
    }

    public static int button() {
        System.out.println("Button:");
        int button = scanner.nextInt();
        scanner.nextLine();
        return button;
    }
}
