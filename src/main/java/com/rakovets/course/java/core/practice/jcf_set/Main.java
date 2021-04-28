package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.operations.AddNewUser;
import com.rakovets.course.java.core.practice.jcf_set.operations.DeleteUser;
import com.rakovets.course.java.core.practice.jcf_set.operations.Operation;
import com.rakovets.course.java.core.practice.jcf_set.operations.Tools;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UsersDataBase dataBase = new UsersDataBase();
        Server server = new Server(dataBase);
        String login;
        String password;

        System.out.println("----- 1. Add new User -----" );
        System.out.println("----- 2. Delete existing User -----");
        System.out.println("----- 3. Chek if User Exist ------");
        System.out.println("----- 4. Change User's Login -----");
        System.out.println("----- 5. Change User's Password -----");

        Scanner scanner = new Scanner(System.in);
        int positionInMenu = scanner.nextInt();
        switch (positionInMenu) {
            case (1) :
                User user = new User(Tools.inputLogin(), Tools.inputPassword());
                Operation addUser = new AddNewUser(user);
                Client newUserAdder = new Client(server,addUser);
                newUserAdder.executeOperation();
                break;

            case (2) :
                System.out.println("Please enter User's  Login");
                login = scanner.nextLine();
                DeleteUser deleteUser = new DeleteUser(login);
                Client userDeleter = new Client(server, deleteUser);
                userDeleter.executeOperation();
        }
        server.addOperationsToQue();
        server.executeQue();
        dataBase.showUsersDatabase();
        server.showOperationsLog();

}
}
