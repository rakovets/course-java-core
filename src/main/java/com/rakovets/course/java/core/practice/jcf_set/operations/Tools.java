package com.rakovets.course.java.core.practice.jcf_set.operations;

import java.util.Scanner;

public class Tools {
   static Scanner scanner = new Scanner(System.in);
    public static String inputLogin(){
        System.out.println("Please choose Login");
        return scanner.nextLine();
    }
    public static String inputPassword(){
        System.out.println("Please choose Password");
        return scanner.nextLine();
    }
}
