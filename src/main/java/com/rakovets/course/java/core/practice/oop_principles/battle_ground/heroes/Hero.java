package com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String attackEnemy(Enemy enemy) {
        int damage = 5;
        enemy.takeDamage(damage);
        return "Attacks enemy!";
    }

    public String getName() {
        return name;
    }
}
