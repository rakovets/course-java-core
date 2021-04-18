package com.rakovets.course.java.core.practice.oop.principles.battle_ground_homework;

public class Archer extends Hero {
    private final int ARCHER_DAMAGE = 25;
    private final int ARCHER_SKILL_DAMAGE = 30;

    public Archer (String name , int healthPoint) {
        super(name, healthPoint);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(ARCHER_DAMAGE);
    }

    public void archerSkillAttackEnemy(Enemy enemy) {
        enemy.takeDamage(ARCHER_SKILL_DAMAGE);
    }



}
