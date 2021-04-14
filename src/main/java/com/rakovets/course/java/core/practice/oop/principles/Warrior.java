package com.rakovets.course.java.core.practice.oop.principles;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public String attackEnemy() {
        return getName() + " attacks with sword and dagger";
    }
}
