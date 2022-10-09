package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnemyTests {
    Enemy enemy = new Enemy(100);

    @Test
    public void testEnemy() {
        Assertions.assertEquals(100, enemy.getHealth());
    }

    @Test
    public void testTakeDamage() {
        enemy.takeDamage(20);
        Assertions.assertEquals(80, enemy.getHealth());
    }

    @Test
    public void testSetHealth() {
        enemy.setHealth(200);
        Assertions.assertEquals(200, enemy.getHealth());
    }

    @Test
    public void testIsAlive() {
        enemy.setHealth(0);
        Assertions.assertEquals(false, enemy.isAlive());
    }
}
