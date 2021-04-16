package com.rakovets.course.java.core.practice.oop.principles.task_about_battle;

public class Necromancer extends Enemy {
    private final int DAMAGE_NECROMANCER = 12;
    private final int AMOUNT_HERO_HEALTH_FOR_SPECIAL_DAMAGE = 50;
    private final int AMOUNT_OF_HEALTH_REVIVAL = 100;

    public Necromancer(int health) {
        super(health);
    }

    @Override
    public int attackHero(Hero hero) {
        if (hero.getIndicatorHealth() >= AMOUNT_HERO_HEALTH_FOR_SPECIAL_DAMAGE) {
           return hero.takeDamageFromEnemy(DAMAGE_NECROMANCER);
        } else {
            return hero.takeDamageFromEnemy(getDAMAGE_ENEMY());
        }
    }

    public int revivalNecromancer() {
        if (getHealth() <=10 && getHealth() > 0) {
            setHealth(AMOUNT_OF_HEALTH_REVIVAL);
        }
        return getHealth();
    }
}
