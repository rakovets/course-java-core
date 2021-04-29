package com.rakovets.course.java.core.practice.jcf_set.web_service.Exceptions.operations;

import com.rakovets.course.java.core.practice.jcf_set.User;
import com.rakovets.course.java.core.practice.jcf_set.UsersDataBase;

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
