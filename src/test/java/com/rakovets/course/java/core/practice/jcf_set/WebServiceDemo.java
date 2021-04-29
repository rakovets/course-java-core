package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.web_service.Client;
import com.rakovets.course.java.core.practice.jcf_set.web_service.Server;
import com.rakovets.course.java.core.practice.jcf_set.web_service.User;
import com.rakovets.course.java.core.practice.jcf_set.web_service.UsersDataBase;
import com.rakovets.course.java.core.practice.jcf_set.web_service.input_output_tools.LoginAndPasswordInputTool;
import com.rakovets.course.java.core.practice.jcf_set.web_service.input_output_tools.MenuButtonInputTool;
import com.rakovets.course.java.core.practice.jcf_set.web_service.operations.*;

public class WebServiceDemo {
    public static void main(String[] args) {
        UsersDataBase dataBase = new UsersDataBase();
        Server server = new Server(dataBase);
        LoginAndPasswordInputTool input = new LoginAndPasswordInputTool(dataBase);
        User nik = new User("nik", "123");
        User kin = new User("kin", "123");
        dataBase.addNewUser(nik);
        dataBase.addNewUser(kin);
        int positionInMenu = 1;
        while (positionInMenu != 0) {
            try {
                System.out.println("----Choose Action----");
                System.out.println(" 1. Add new User ");
                System.out.println(" 2. Delete existing User ");
                System.out.println(" 3. Chek if User Exist ");
                System.out.println(" 4. Change User's Password ");
                System.out.println(" 5. Change User's Login ");
                System.out.println(" 0. Exit ");

                positionInMenu = MenuButtonInputTool.button();
                switch (positionInMenu) {
                    case (1):
                        User user = new User(input.chooseLogin(), input.choosePassword());
                        Operation addUser = new AddNewUserOperation(user);
                        Client newUserAdder = new Client(server, addUser);
                        newUserAdder.executeOperation();
                        System.out.println("User was successfully added");
                        break;
                    case (2):
                        System.out.println("Please enter the Login of User you want to delete");
                        Operation deleteUser = new DeleteUserOperation(input.inputLogin());
                        Client userDeleter = new Client(server, deleteUser);
                        userDeleter.executeOperation();
                        System.out.println("User was successfully deleted");
                        break;
                    case (3):
                        System.out.println("Please enter the Login of User you want to chek");
                        Operation isExist = new UserExistOperation(input.inputLogin());
                        Client userChecker = new Client(server, isExist);
                        userChecker.executeOperation();
                        System.out.println("User was successfully checked");
                        break;
                    case (4):
                        System.out.println("Please enter the Login and new password to change");
                        Operation changePassword = new ChangePasswordOperation(input.inputLogin(), input.inputNewPassword());
                        Client passwordChanger = new Client(server, changePassword);
                        passwordChanger.executeOperation();
                        System.out.println("Password was successfully changed");
                        break;
                    case (5):
                        System.out.println("Login was successfully changed");
                        Operation changeLogin = new ChangeLoginOperation(input.inputLogin(), input.inputNewLogin());
                        Client loginChanger = new Client(server, changeLogin);
                        loginChanger.executeOperation();
                        break;

                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        server.addOperationsToQue();
        server.executeQue();
        dataBase.showUsersDatabase();
        server.showOperationsLog();

    }
}
