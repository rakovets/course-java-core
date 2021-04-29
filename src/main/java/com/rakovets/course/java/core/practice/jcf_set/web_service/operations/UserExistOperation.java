package com.rakovets.course.java.core.practice.jcf_set.web_service.operations;

import com.rakovets.course.java.core.practice.jcf_set.web_service.UsersDataBase;

public class UserExistOperation extends Operation {
    String login;

    public UserExistOperation(String login) {
        super("User Exist Chek");
        this.login = login;
    }

    @Override
    public void execute(UsersDataBase dataBase) {
        dataBase.exists(login);
    }
}
