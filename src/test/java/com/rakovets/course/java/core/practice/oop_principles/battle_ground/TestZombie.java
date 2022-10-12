package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestZombie {
    Zombie zombie = new Zombie(100, true);
    Hero hero = new Mag("Mag", 100, true);

    @Test
    public void testAttackHero() {
        final int EXPECTED_HEALTH = 50;

        zombie.attackHero(hero);

        Assertions.assertEquals(EXPECTED_HEALTH, hero.getHealth());
    }

    @Test
    public void tesResurrection() {
        final int HEALTH_AFTER_RESURRECTION = 100;

        hero.attackEnemy(zombie);
        zombie.resurrection();

        Assertions.assertEquals(HEALTH_AFTER_RESURRECTION, zombie.getHealth());
    }
}
