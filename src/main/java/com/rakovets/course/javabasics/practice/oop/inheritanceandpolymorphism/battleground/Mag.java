package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Mag extends Hero {
    int damage = 66;
    int health = 400;

    Mag(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy unit) {
        System.out.println("Magician" + name +  " has attacked enemy unit and takes " + damage + " of Health");
        unit.takeDamage(damage);



    }
}
