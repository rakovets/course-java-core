package com.rakovets.course.java.core.practice.oop_principles;

public class Siamese extends Cat{
    final int humanExposureFactor = 2;

    public Siamese(String name) {
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
