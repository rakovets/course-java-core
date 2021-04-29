package com.rakovets.course.java.core.practice.jcf_set.web_service.Exceptions.operations;

import com.rakovets.course.java.core.practice.jcf_set.UsersDataBase;

public class DeleteUserOperation extends Operation {
    private String login;

    public DeleteUserOperation(String login) {
        super("Delete User");
        this.login = login;
    }
    public void execute(UsersDataBase dataBase) {
        dataBase.deleteUser(login);

    }
}
