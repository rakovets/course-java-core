package com.rakovets.course.java.core.practice.jcf_set.web_service.operations;

import com.rakovets.course.java.core.practice.jcf_set.web_service.User;
import com.rakovets.course.java.core.practice.jcf_set.web_service.UsersDataBase;

public class AddNewUserOperation extends Operation {
    private User user;

    public AddNewUserOperation(User user) {
        super("Add New User");
        this.user = user;
    }

    public void execute(UsersDataBase dataBase) {
        dataBase.addNewUser(user);
    }
}
