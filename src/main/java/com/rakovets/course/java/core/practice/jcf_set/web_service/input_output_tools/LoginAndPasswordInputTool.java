package com.rakovets.course.java.core.practice.jcf_set.input_output_tools;

import com.rakovets.course.java.core.practice.jcf_set.web_service.Exceptions.LoginAlreadyExistsException;
import com.rakovets.course.java.core.practice.jcf_set.web_service.Exceptions.LoginDoesNotExistException;
import com.rakovets.course.java.core.practice.jcf_set.UsersDataBase;

import java.util.Scanner;

public class LoginAndPasswordInputTool {
   Scanner scanner;
   private UsersDataBase dataBase;

   public LoginAndPasswordInputTool(UsersDataBase dataBase) {
       scanner = new Scanner(System.in);
       this.dataBase = dataBase;
   }

    public String chooseLogin()  {
        System.out.println("Please input Login");
        return scanner.nextLine();
    }
    public String choosePassword() {
        System.out.println("Please choose Password");
        return scanner.nextLine();
    }

    public String inputLogin() throws LoginDoesNotExistException {
       System.out.println("Login:");
       String login = scanner.nextLine();
       if (!dataBase.getLoginAndPasswords().containsKey(login)){
           throw new LoginDoesNotExistException();
       }
       return login;
    }

    public String inputNewPassword() {
       System.out.println("New Password:");
       return scanner.nextLine();
    }

    public String inputNewLogin() throws LoginAlreadyExistsException {
       System.out.println("New Login");
       String login =  scanner.nextLine();
       if (dataBase.getLoginAndPasswords().containsKey(login)){
           throw new LoginAlreadyExistsException();
       }
       return login;
    }

}
