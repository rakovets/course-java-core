package com.rakovets.course.java.core.practice.jcf_set.operations;

import com.rakovets.course.java.core.practice.jcf_set.User;
import com.rakovets.course.java.core.practice.jcf_set.UsersDataBase;

public class AddNewUser extends Operation{
    private User user;
    public AddNewUser(User user){
        this.user = user;
    }

    public void execute(UsersDataBase dataBase){
        dataBase.addNewUser(user);
    }
}
