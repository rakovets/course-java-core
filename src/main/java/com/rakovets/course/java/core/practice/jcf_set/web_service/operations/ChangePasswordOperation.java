package com.rakovets.course.java.core.practice.jcf_set.web_service.Exceptions.operations;

import com.rakovets.course.java.core.practice.jcf_set.UsersDataBase;

public class ChangePasswordOperation extends Operation {
    String login;
    String newPassword;

    public ChangePasswordOperation(String login, String newPassword) {
        super("Change Password");
        this.login = login;
        this.newPassword = newPassword;
    }

    @Override
    public void execute(UsersDataBase dataBase) {
        dataBase.changePassword(login, newPassword);
    }
}
