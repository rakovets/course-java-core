package com.rakovets.course.java.core.practice.oop.principles.project.battle.ground;

public class Archer extends Hero {
    private static final int DAMAGE = 20;

    public Archer(String name, int healthPoint) {
        super(name, healthPoint);
    }

    @Override
    public int getHealthPoint() {
        return super.getHealthPoint();
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print("Archer " + getName() + " attack enemy!\n");
        enemy.takeDamage(DAMAGE);
    }

    @Override
    public void skill(Enemy... enemy) {
        System.out.println("\nDouble damage");
        enemy[0].takeSkillDamage(DAMAGE * 2);
    }
}
