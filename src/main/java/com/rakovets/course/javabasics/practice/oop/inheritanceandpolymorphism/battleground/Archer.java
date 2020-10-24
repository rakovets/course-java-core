package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

import java.util.Arrays;

class Archer extends Hero {
    private int damage = 38;

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy unit) {
        System.out.println(this.name + " has attacked enemy unit and takes " + damage + " of Health");
        unit.takeDamage(damage);
    }
}
