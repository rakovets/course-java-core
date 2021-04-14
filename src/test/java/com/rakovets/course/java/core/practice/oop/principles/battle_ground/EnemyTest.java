package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EnemyTest {
    Enemy enemy = new Enemy(100) {
        public void attackEnemy(Hero hero) {
            System.out.println("Enemy attacks!");
        }
    };

    @Test
    void getHealthTest() {
        assertEquals(100, enemy.getHealth());
    }

    @Test
    void setHealthTest() {
        enemy.setHealth(50);
        assertEquals(50, enemy.getHealth());
    }

    @Test
    void isAlive() {
        enemy.setHealth(0);
        assertTrue(!enemy.isAlive());
    }
}
