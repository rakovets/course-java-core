package com.rakovets.course.java.core.practice.oop.principles.battle_ground_homework;

public class Warrior extends Hero {
    private final int WARRIOR_DAMAGE = 15;
    private final int WARRIOR_SKILL_DAMAGE = 20;

    public Warrior(String name, int healthPoint) {
        super(name, healthPoint);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(WARRIOR_DAMAGE);
    }

    public void warriorSkillAttackEnemy(Enemy enemy) {
        enemy.takeDamage(WARRIOR_SKILL_DAMAGE);
    }

}
