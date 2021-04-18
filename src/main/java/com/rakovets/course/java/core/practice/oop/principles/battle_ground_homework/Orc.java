package com.rakovets.course.java.core.practice.oop.principles.battle_ground_homework;

public class Orc extends Enemy{
    private final int ORC_DAMAGE = 30;
    private final int ORC_SKILL_DAMAGE = 45;

    public Orc (int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(ORC_DAMAGE);
    }

    public void OrcSkillAttackHero(Hero hero) {
        hero.takeDamage(ORC_SKILL_DAMAGE);
    }

}
