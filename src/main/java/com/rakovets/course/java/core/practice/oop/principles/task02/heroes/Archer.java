package com.rakovets.course.java.core.practice.oop.principles.task02.heroes;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.Enemy;

public class Archer extends Hero {

    public Archer(String name, int health,int attack){
        super(name, health, attack);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("I will hunt you down!");
        enemy.getDamage(getAttack());
    }

    @Override
    public void getDamageFromEnemy(int damage) {

    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
