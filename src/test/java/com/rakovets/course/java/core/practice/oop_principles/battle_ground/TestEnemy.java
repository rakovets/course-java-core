package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEnemy {
    Enemy enemy = new Zombie(100, true);
    Hero hero = new Mag("Mag", 100, true);

    @Test
    public void testTakeDamage() {
        final int DAMAGE = 20;
        final int EXPECTED_HEALTH = 80;

        enemy.takeDamage(DAMAGE);

        Assertions.assertEquals(EXPECTED_HEALTH, enemy.getHealth());
    }

    @Test
    public void testIsAliveTrue() {
        Assertions.assertEquals(true, enemy.isAlive());
    }

    @Test
    public void testIsAliveFalse() {
        do {
            hero.attackEnemy(enemy);
        } while (enemy.getHealth() > 0);

        Assertions.assertEquals(false, enemy.isAlive());
    }
}
