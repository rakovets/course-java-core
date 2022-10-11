package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArcher {
    Archer archer = new Archer("Archer", 100, true);
    Enemy enemy = new Skeleton(100, true);

    @Test
    public void testAttackEnemy() {
        final int EXPECTED_ENEMY_HEALTH = 90;

        archer.attackEnemy(enemy);

        Assertions.assertEquals(EXPECTED_ENEMY_HEALTH, enemy.getHealth());
    }

    @Test
    public void testAttackEnemyFatality() {
        final int EXPECTED_ENEMY_HEALTH_FATALITY = 0;

        archer.attackEnemyFatality(enemy);

        Assertions.assertEquals(EXPECTED_ENEMY_HEALTH_FATALITY, enemy.getHealth());
    }
}
