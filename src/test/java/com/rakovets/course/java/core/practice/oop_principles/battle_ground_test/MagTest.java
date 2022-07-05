package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagTest {

    @Test
    public void testConstructor() {
        Hero mag = new Mag("Mag");
        Assertions.assertEquals("Mag", mag.getName());
        Assertions.assertEquals(100, mag.getHealth());
        Assertions.assertEquals(5, mag.getDamage());
    }

    @Test
    public void testConstructorWithHealth() {
        Hero mag = new Mag("Mag", 85);
        Assertions.assertEquals("Mag", mag.getName());
        Assertions.assertEquals(85, mag.getHealth());
        Assertions.assertEquals(5, mag.getDamage());
    }

    @Test
    public void testSetHealth() {
        Hero archer = new Archer("Mag", 90);
        archer.setHealth(80);
        Assertions.assertEquals(80, archer.getHealth());
    }

    @Test
    public void testIsAlive() {
        Hero mag = new Mag("Mag", 45);
        Assertions.assertTrue(mag.isAlive());
    }

    @Test
    public void testIsNotAlive() {
        Hero mag = new Mag("Mag", 0);
        Assertions.assertFalse(mag.isAlive());
    }

    @Test
    public void testTakeDamage() {
        Hero mag = new Mag("Mag", 90);
        Assertions.assertTrue(mag.isAlive());
        mag.takeDamage(45);
        Assertions.assertEquals(45, mag.getHealth());
        Assertions.assertTrue(mag.isAlive());
    }

    @Test
    public void testTakeDamageHealthBelowZero() {
        Hero mag = new Mag("Mag", 45);
        Assertions.assertTrue(mag.isAlive());
        mag.takeDamage(50);
        Assertions.assertEquals(-5, mag.getHealth());
        Assertions.assertFalse(mag.isAlive());
    }

    @Test
    public void testAttackEnemyWitch() {
        Hero mag = new Mag("Mag", 80);
        Enemy witch = new Witch(100);
        mag.attackEnemy(witch);
        Assertions.assertEquals(90, witch.getHealth());
    }

    @Test
    public void testAttackEnemyVampire() {
        Hero mag = new Mag("Mag", 80);
        Enemy vampire = new Vampire(100);
        mag.attackEnemy(vampire);
        Assertions.assertEquals(95, vampire.getHealth());
    }

    @Test
    public void testAttackEnemyZombie() {
        Hero mag = new Mag("Mag", 80);
        Enemy zombie = new Zombie(100);
        mag.attackEnemy(zombie);
        Assertions.assertEquals(95, zombie.getHealth());
    }
}
