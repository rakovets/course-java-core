package com.rakovets.course.java.core.practice.jcf_set;

public class UserListDemo {
    public static void main(String[] args) {
        UserList userList = new UserList();
        userList.addNewUser("Sam", "Nagibator", "12345678");
        userList.addNewUser("Tom", "Destroyer", "321321321");
        System.out.println(userList);
        userList.changeLogin("Sam", "Nagibator9000");
        System.out.println(userList);
        userList.changePassword("Tom","111111111");
        System.out.println(userList);
        System.out.println(userList.isPresent("Tom"));
        System.out.println(userList.isPresent("Tim"));
        userList.deleteUser("Tom");
        System.out.println(userList);
    }
}
