package com.rakovets.course.challenge.polimorphism;

public class Warrior extends Hero {
    private final int DEFAULT_DAMAGE = 10;

    Warrior(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy){
        System.out.println("Warrior is attacking the enemy damage is: " + DEFAULT_DAMAGE);
        enemy.takeDamage(DEFAULT_DAMAGE);
    }
}
