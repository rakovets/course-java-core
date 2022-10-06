package com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;

public class Mag extends Hero {
    public Mag(String name) {
        super(name);
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        int damage = 10;
        enemy.takeDamage(damage);
        return "Attacks enemy!";
    }
}
