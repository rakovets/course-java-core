package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Mag extends Hero {

    private final int DAMAGE = 40;
    private final int SUPER_DAMAGE = 80;

    protected Mag(String name, int heroHealth) {
        super(name, heroHealth);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE);
    }

    public void witchcraftAttackEnemy(Enemy enemy) {
        enemy.takeDamage(SUPER_DAMAGE);
    }
}
