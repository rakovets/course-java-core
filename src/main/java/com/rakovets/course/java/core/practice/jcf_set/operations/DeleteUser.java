package com.rakovets.course.java.core.practice.jcf_set.operations;

import com.rakovets.course.java.core.practice.jcf_set.User;
import com.rakovets.course.java.core.practice.jcf_set.UsersDataBase;

public class DeleteUser extends Operation{
    private String login;
    public DeleteUser(String login){
        this.login = login;
    }
    public void execute(UsersDataBase dataBase){
        dataBase.deleteUser(login);
    }
}
