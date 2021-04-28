package com.rakovets.course.java.core.practice.oop.principles.project.battle.ground;

public class Mag extends Hero {
    private static final int DAMAGE = 30;

    public Mag(String name, int healthPoint) {
        super(name, healthPoint);
    }

    @Override
    public int getHealthPoint() {
        return super.getHealthPoint();
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print("Mag " + getName() + " attack enemy!\n");
        enemy.takeDamage(DAMAGE);
    }

    @Override
    public void skill(Enemy... enemy) {
        for (Enemy value : enemy) value.takeSkillDamage(DAMAGE);
    }
}
