package com.rakovets.course.challenge.polimorphism;

public class Archer extends Hero {
    Archer(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy){
        System.out.println("Archer is attacking the enemy");
        enemy.takeDamage(6);
    }
}
