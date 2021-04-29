package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.input_output_tools.Tools;
import com.rakovets.course.java.core.practice.jcf_set.operations.*;

public class WebService {
    public static void main(String[] args) {
        UsersDataBase dataBase = new UsersDataBase();
        Server server = new Server(dataBase);
        int positionInMenu = 1;
        while (positionInMenu != 0) {
            System.out.println("----Choose Action----");
            System.out.println(" 1. Add new User ");
            System.out.println(" 2. Delete existing User ");
            System.out.println(" 3. Chek if User Exist ");
            System.out.println(" 4. Change User's Password ");
            System.out.println(" 5. Change User's Login ");
            System.out.println(" 0. Exit ");
            positionInMenu = Tools.button();
            switch (positionInMenu) {
                case (1):
                    User user = new User(Tools.chooseLogin(), Tools.choosePassword());
                    Operation addUser = new AddNewUserOperation(user);
                    Client newUserAdder = new Client(server, addUser);
                    newUserAdder.executeOperation();
                    break;
                case (2):
                    System.out.println("Please enter the Login of User you want to delete");
                    Operation deleteUser = new DeleteUserOperation(Tools.inputLogin());
                    Client userDeleter = new Client(server, deleteUser);
                    userDeleter.executeOperation();
                    break;
                case (3):
                    System.out.println("Please enter the Login of User you want to chek");
                    Operation isExist = new UserExistOperation(Tools.inputLogin());
                    Client userChecker = new Client(server, isExist);
                    userChecker.executeOperation();
                    break;
                case (4):
                    System.out.println("Please enter the Login and new password to change");
                    Operation changePassword = new ChangePasswordOperation(Tools.inputLogin(), Tools.inputNewPassword());
                    Client passwordChanger = new Client(server, changePassword);
                    passwordChanger.executeOperation();
                    break;
                case (5):
                    System.out.println("Please enter Login and new Login to Change");
                    Operation changeLogin = new ChangeLoginOperation(Tools.inputLogin(), Tools.inputNewLogin());
                    Client loginChanger = new Client(server, changeLogin);
                    loginChanger.executeOperation();
                    break;
            }
        }
        server.addOperationsToQue();
        server.executeQue();
        dataBase.showUsersDatabase();
        server.showOperationsLog();

    }
}
