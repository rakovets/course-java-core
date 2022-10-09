package com.rakovets.course.java.core.practice.oop_principles;

public class Persian extends Cat{
    final int humanExposureFactor = 2;

    public Persian(String name) {
        super(name);
    }

    @Override
    public int mew(Person user){
        user.percentHappiness = -(user.percentHappiness * humanExposureFactor);
        return user.changeHappiness(user.percentHappiness);
    }

    @Override
    public int purr(Person user){
        user.percentHappiness = user.percentHappiness * humanExposureFactor;
        return user.changeHappiness(user.percentHappiness);
    }
}
