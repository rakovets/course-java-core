package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Map;
import java.util.Scanner;

public class Menu {
    Web web = new Web();
    Scanner scanner = new Scanner(System.in);
    int item;

    public void menu() {
        System.out.println("Menu" + "\n1. Create new User" + "\n2. Delete existing User" + "\n3. Check if the User exist"
                + "\n4. Change the login of an existing User" + "\n5. Change password of an existing User\n");

        /*int item = scanner.nextInt();*/
        while (scanner.hasNextInt()) {
            item = scanner.nextInt();
            switch (item) {
                case 1:
                    web.createNewUser();
                    break;
                case 2:
                    System.out.println(web.deleteUser());
                    break;
                case 3:
                    System.out.println(web.checkUser());
                    break;
                case 4:
                    System.out.println(web.changeLogin());
                    break;
                case 5:
                    System.out.println(web.changePassword());
                    break;
                default:
                    System.out.println("Chose something");
            }
        }
    }
}
