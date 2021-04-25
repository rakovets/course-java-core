package com.rakovets.course.java.core.practice.jcf_set.web_service;

import java.util.Scanner;

public class Menu {
    public void menu(UserBase userBase) {
        int choose;
        String name;
        String password;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("What do we do???");
            System.out.print("1 - Добавить нового пользователя.\n" +
                    "2 - Удалить существующего пользователя.\n" +
                    "3 - Проверить существует ли пользователь.\n" +
                    "4 - Изменить логин существующего пользователя.\n" +
                    "5 - Изменить пароль существующего пользователя.\n" +
                    "0 - Выход\n");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    userBase.addUser(inputDataForUser());
                    break;
                case 2:
                    userBase.deleteUser(inputDataForUser());
                    break;
                case 3:
                    System.out.println("Введите имя");
                    name = scanner.nextLine();
                    userBase.isExist(name);
                    break;
                case 4:
                    System.out.println("Введите новый логин");
                    Scanner scanner1 = new Scanner(System.in);
                    name = scanner1.nextLine();
                    userBase.changeNickName(inputDataForUser(), name);
                    break;
                case 5:
                    System.out.println("Введите новый пароль");
                    Scanner scanner2 = new Scanner(System.in);
                    password = scanner2.nextLine();
                    userBase.changePassword(inputDataForUser(), password);
                    break;
                default:
                    return;
            }
        }while (true);
    }

    private User inputDataForUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String nickName = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        return new User(nickName, password);
    }
}

