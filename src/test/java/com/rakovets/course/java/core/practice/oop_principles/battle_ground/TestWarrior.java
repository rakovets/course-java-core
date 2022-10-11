package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWarrior {
    Warrior warrior = new Warrior("Warrior", 100, true);
    Enemy enemy = new Zombie(100, true);

    @Test
    public void testAttackEnemy() {
        final int EXPECTED_ENEMY_HEALTH = 70;

        warrior.attackEnemy(enemy);

        Assertions.assertEquals(EXPECTED_ENEMY_HEALTH, enemy.getHealth());
    }

    @Test
    public void testAttackEnemyIncreased() {
        final int EXPECTED_ENEMY_HEALTH_INCREASED = 10;

        warrior.attackEnemyIncreased(enemy);

        Assertions.assertEquals(EXPECTED_ENEMY_HEALTH_INCREASED, enemy.getHealth());
    }
}
