package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EnemyTest {

    @Test
    void getHealth() {
        assertEquals(200, new Enemy(200).getHealth());
    }

    @Test
    void setHealth() {
        Enemy health = new Enemy(50);
        health.setHealth(50);
        assertEquals(50, health.getHealth());
    }

    @Test
    void isAlive() {
        assertTrue(new Enemy(100).isAlive());
    }
}
