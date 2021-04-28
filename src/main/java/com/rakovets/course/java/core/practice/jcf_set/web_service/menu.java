package com.rakovets.course.java.core.practice.jcf_set.web_service;


import java.util.Scanner;

public class menu {
    public String inputParametrs(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public User inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input loggin");
        String inputLoggin = scanner.nextLine();
        System.out.println("input password");
        String inputPassword = scanner.nextLine();
        return new User(inputLoggin,inputPassword);
    }



    public void menuOf(baseOfClients data) {

        String loggin;
        String password;
        int scanvalue;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("1. add new user\n" +
                    "2. delete user\n" +
                    "3. check exist user or not\n" +
                    "4. change logging\n" +
                    "5. change password\n" +
                    "0. exit\n");
            scanvalue = scan.nextInt();
            switch (scanvalue) {
                case 1:
                    data.addUser(inputData());
                    break;
                case 2:
                    data.deleteUser(inputData());
                    break;
                case 3:
                    System.out.println("Input logging");
                    loggin = inputParametrs();
                    System.out.println(data.nameChecking(loggin));
                    break;
                case 4:
                    System.out.println("Input new loggin");
                    loggin = inputParametrs();
                    data.logginReplace(inputData(), loggin);
                    break;
                case 5:
                    System.out.println("Input new password");
                    password = inputParametrs();
                    data.passwordChange(inputData(), password);
                    break;
                default:
                    return;
            }
        }
            while (1==1);





        }
    }




