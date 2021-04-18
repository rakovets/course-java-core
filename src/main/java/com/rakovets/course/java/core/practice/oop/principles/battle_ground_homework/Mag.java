package com.rakovets.course.java.core.practice.oop.principles.battle_ground_homework;

public class Mag extends Hero {
    private final int MAG_DAMAGE = 30;
    private final int MAG_SKILL_DAMAGE = 40;

    public Mag(String name , int healthPoint) {
        super(name, healthPoint);

    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(MAG_DAMAGE );
    }

    public void magSkillAttackEnemy(Enemy enemy) {
        enemy.takeDamage(MAG_SKILL_DAMAGE);
    }

}
