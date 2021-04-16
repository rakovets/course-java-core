package com.rakovets.course.java.core.practice.oop.principles.task_about_battle;

public class Necromancer extends Enemy {
    private final int DAMAGE_NECROMANCER = 40;

    public Necromancer(int health) {
        super(health);
    }

    @Override
    public int attackHero(Hero hero) {
        if (hero.getIndicatorHealth() >= 20) {
           return hero.takeDamageFromEnemy(DAMAGE_NECROMANCER);
        } else {
            return hero.takeDamageFromEnemy(getDAMAGE_ENEMY());
        }
    }
}
