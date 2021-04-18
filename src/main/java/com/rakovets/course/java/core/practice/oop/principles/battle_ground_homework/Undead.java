package com.rakovets.course.java.core.practice.oop.principles.battle_ground_homework;

public class Undead extends Enemy {
    private final int UNDEAD_DAMAGE = 15;
    private final int VAMPIRIC_DAMAGE = 5;

    public Undead (int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(UNDEAD_DAMAGE);
    }

    public void UndeadVampiricSkill(Hero hero,Enemy enemy) {
        hero.takeDamage(VAMPIRIC_DAMAGE);
        enemy.setHealth(getHealth()+VAMPIRIC_DAMAGE);
    }





}
