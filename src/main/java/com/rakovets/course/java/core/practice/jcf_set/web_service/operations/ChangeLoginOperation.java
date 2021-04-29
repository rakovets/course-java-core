package com.rakovets.course.java.core.practice.jcf_set.web_service.operations;

import com.rakovets.course.java.core.practice.jcf_set.web_service.UsersDataBase;

public class ChangeLoginOperation extends Operation {
    String login;
    String newLogin;

    public ChangeLoginOperation(String login, String newLogin) {
        super("Change Login");
        this.login = login;
        this.newLogin = newLogin;
    }

    @Override
    public void execute(UsersDataBase dataBase) {
        dataBase.changeLogin(login,newLogin);
    }
}
