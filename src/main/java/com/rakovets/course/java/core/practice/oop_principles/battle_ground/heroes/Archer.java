package com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        int damage = 13;
        enemy.takeDamage(damage);
        return "Attacks enemy!";
    }
}
