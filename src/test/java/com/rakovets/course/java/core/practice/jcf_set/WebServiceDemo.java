package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Scanner;

public class WebServiceDemo {
    public static void main(String[] args) {
        boolean isAlive = true;
        while (isAlive) {
            WebService.showMenu();

            Scanner scanner = new Scanner(System.in);
            int inputValue = Integer.parseInt(scanner.nextLine());

            switch (inputValue) {
                case 1:
                    WebService.addNewClient();
                    break;
                case 2:
                    WebService.removeClient();
                    break;
                case 3:
                    WebService.checkClient();
                    break;
                case 4:
                    WebService.changeLogin();
                    break;
                case 5:
                    WebService.changePassword();
                    break;
                case 6:
                    isAlive = false;
                    System.out.println("Close.");
                    break;
            }
        }
    }
}
