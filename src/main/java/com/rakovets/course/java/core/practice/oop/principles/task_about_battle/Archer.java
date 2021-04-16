package com.rakovets.course.java.core.practice.oop.principles.task_about_battle;

public class Archer extends Hero {
    private final int DAMAGE_ARCHER = 35;
    private final int ENEMY_HEALTH_FOR_OWN_REDUCE = 100;
    private final int AMOUNT_OF_REDUCE_OWN_HEALTH = 20;


    public Archer(String name) {
        super(name);
    }

    public Archer() {}

    public int attackEnemy(Enemy enemy) {
        return enemy.takeDamage(DAMAGE_ARCHER);
    }

    public int reduceOwnHealth(Enemy enemy) {
        if (enemy.getHealth() > ENEMY_HEALTH_FOR_OWN_REDUCE) {
            setIndicatorHealth(getIndicatorHealth() - AMOUNT_OF_REDUCE_OWN_HEALTH);
            return getIndicatorHealth();
        }
        return getIndicatorHealth();
    }
}
