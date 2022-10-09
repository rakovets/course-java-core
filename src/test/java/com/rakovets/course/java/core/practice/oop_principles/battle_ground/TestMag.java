package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMag {
    Mag mag = new Mag("Mag", 100, true);
    Enemy enemy = new EnemyZombie(100, true);

    @Test
    public void testAttackEnemy() {
        final int EXPECTED_ENEMY_HEALTH = 80;

        mag.attackEnemy(enemy);

        Assertions.assertEquals(EXPECTED_ENEMY_HEALTH, enemy.getHealth());
    }

    @Test
    public void testAttackEnemyDecreased() {
        final int EXPECTED_ENEMY_HEALTH_DECREASED = 90;

        mag.attackEnemyDecreased(enemy);

        Assertions.assertEquals(EXPECTED_ENEMY_HEALTH_DECREASED, enemy.getHealth());
    }
}
