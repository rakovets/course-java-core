package com.rakovets.course.java.core.practice.oop.principles.task02.enemies;

import com.rakovets.course.java.core.practice.oop.principles.task02.enemies.enemySkills.Poison;
import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Hero;

public class Beast extends Enemy implements Poison {

    public Beast(int health, int attack) {
        super(health, attack);
    }

    @Override
    public void getDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void attack(Hero hero) {
        hero.getDamageFromEnemy(poisonAbility(hero));
    }

    @Override
    public int poisonAbility(Hero hero) {
        return hero.getHealth();
    }
}
