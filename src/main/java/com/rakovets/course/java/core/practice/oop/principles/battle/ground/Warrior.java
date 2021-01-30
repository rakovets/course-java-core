package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Warrior extends Hero {
    int damageFromWarrior = 25;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damageFromWarrior);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(getHealth() - damage);
    }

    public void useShield(int damage) {
        this.setHealth((this.getHealth() - (damage - 20)));
    }
}
