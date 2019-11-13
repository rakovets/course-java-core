package com.rakovets.course.challenge.polimorphism;

public class Mag extends Hero {
    Mag(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy){
        System.out.println("Mag is attacking the enemy");
        enemy.takeDamage(7);
    }
}
