package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.Hero;

public class Warrior extends Hero {

    protected Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(40);
    }

    public void swordAttackEnemy(Enemy enemy) {
        enemy.takeDamage(70);
    }
}
