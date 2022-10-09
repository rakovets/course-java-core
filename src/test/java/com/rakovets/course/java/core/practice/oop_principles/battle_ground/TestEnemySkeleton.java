package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEnemySkeleton {
    EnemySkeleton enemySkeleton = new EnemySkeleton(100, true);
    Hero hero = new Mag("Mag", 100, true);

    @Test
    public void testAttackHero() {
        final int EXPECTED_HEALTH_HERO = 75;

        enemySkeleton.attackHero(hero);

        Assertions.assertEquals(EXPECTED_HEALTH_HERO, hero.getHealth());
    }

    @Test
    public void testAttackHeroIncreased() {
        final int EXPECTED_HEALTH_HERO_INCREASED = 50;

        enemySkeleton.attackHeroIncreased(hero);

        Assertions.assertEquals(EXPECTED_HEALTH_HERO_INCREASED, hero.getHealth());
    }

}
