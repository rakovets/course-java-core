package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHero {
    Hero hero = new Mag("Mag", 100, true);
    Enemy enemy = new Skeleton(100, true);

    @Test
    public void testIsAliveTrue() {
        Assertions.assertEquals(true, hero.isAlive());
    }

    @Test
    public void testIsAliveFalse() {
        do {
            enemy.attackHero(hero);
        } while (hero.getHealth() > 0);

        Assertions.assertEquals(false, hero.isAlive());
    }

    @Test
    public void testTakeDamage() {
        final int TEST_DAMAGE = 20;
        final int EXPECTED_HEALTH = 80;

        hero.takeDamage(TEST_DAMAGE);

        Assertions.assertEquals(EXPECTED_HEALTH, hero.getHealth());
    }
}
