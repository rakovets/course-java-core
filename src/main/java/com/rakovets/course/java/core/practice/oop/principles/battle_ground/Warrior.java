package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Warrior extends Hero {

    private final int DAMAGE = 50;
    private final int SUPER_DAMAGE = 90;

    protected Warrior(String name, int heroHealth) {
        super(name, heroHealth);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE);
    }

    public void superPowerAttackEnemy(Enemy enemy) {
        enemy.takeDamage(SUPER_DAMAGE);
    }
}
