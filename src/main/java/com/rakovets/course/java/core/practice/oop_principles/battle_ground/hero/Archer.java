package com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        final int DAMAGE_ARCHER = 10;
        if (enemy.isAlive()) {
            enemy.takeDamage(DAMAGE_ARCHER);
        }
    }

    public void healing(Enemy enemy) {
        int healing = 30;
        if (this.isAlive()) {
            setHealth(this.getHealth() + healing);
        }
    }

    @Override
    public boolean isAlive() {
        return super.getHealth() > 0;
    }
}
