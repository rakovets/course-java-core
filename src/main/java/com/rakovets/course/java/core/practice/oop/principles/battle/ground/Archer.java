package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Archer extends Hero {
    int damageFromArcher = 10;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damageFromArcher);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
    }

    public void arrowByArrow(Enemy enemy) {
        enemy.takeDamage(damageFromArcher * 3);
    }
}
