package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_set.web_service.ClientController;
import com.rakovets.course.java.core.practice.jcf_set.web_service.DataStorage;
import com.rakovets.course.java.core.practice.jcf_set.web_service.ServerRequestQueue;
import com.rakovets.course.java.core.practice.jcf_set.web_service.VisualMenu;

public class WebServiceDemo {
    public static void main(String[] args) {
        VisualMenu.showVisualMenu();
        int choice = ClientController.inputChoice();
        while (choice != 7) {
            switch (choice) {
                case 1:
                    DataStorage.addNewUser();
                    break;
                case 2:
                    DataStorage.deleteExistingUser();
                    break;
                case 3:
                    DataStorage.checkIfUserExists();
                    break;
                case 4:
                    DataStorage.changeExistingUserLogin();
                    break;
                case 5:
                    DataStorage.changeExistingUserPassword();
                    break;
                case 6:
                    System.out.println(DataStorage.printUsersData());
            }
            VisualMenu.showVisualMenu();
            choice = ClientController.inputChoice();
        }
        System.out.println("End program");
    }
}
