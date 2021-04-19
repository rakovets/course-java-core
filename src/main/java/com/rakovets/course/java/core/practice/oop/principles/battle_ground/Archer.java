package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Archer extends Hero {

    private final int DAMAGE = 30;
    private final int SUPER_DAMAGE = 50;

    protected Archer(String name, int heroHealth) {
        super(name, heroHealth);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE);
    }

    public void poisonArrowAttackEnemy(Enemy enemy) {
        enemy.takeDamage(SUPER_DAMAGE);
    }
}
