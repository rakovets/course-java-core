package com.rakovets.course.java.core.practice.oop_principles.BattleGroundTest;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArcherTest {

    @Test
    public void testConstructor() {
        Hero archer = new Archer("Archer");
        Assertions.assertEquals("Archer", archer.getName());
        Assertions.assertEquals(100, archer.getHealth());
        Assertions.assertEquals(TypeHero.ARCHER, archer.getTypeHero());
        Assertions.assertEquals(5, archer.getDamage());
    }

    @Test
    public void testConstructorWithHealth() {
        Hero archer = new Archer("Archer", 85);
        Assertions.assertEquals("Archer", archer.getName());
        Assertions.assertEquals(85, archer.getHealth());
        Assertions.assertEquals(TypeHero.ARCHER, archer.getTypeHero());
        Assertions.assertEquals(5, archer.getDamage());
    }

    @Test
    public void testSetHealth() {
        Hero archer = new Archer("Archer", 90);
        archer.setHealth(80);
        Assertions.assertEquals(80, archer.getHealth());
    }

    @Test
    public void testIsAlive() {
        Hero archer = new Archer("Archer", 45);
        Assertions.assertTrue(archer.isAlive());
    }

    @Test
    public void testIsNotAlive() {
        Hero archer = new Archer("Archer", 0);
        Assertions.assertFalse(archer.isAlive());
    }

    @Test
    public void testTakeDamage() {
        Hero archer = new Archer("Archer", 90);
        Assertions.assertTrue(archer.isAlive());
        archer.takeDamage(45);
        Assertions.assertEquals(45, archer.getHealth());
        Assertions.assertTrue(archer.isAlive());
    }

    @Test
    public void testTakeDamageHealthBelowZero() {
        Hero archer = new Archer("Archer", 45);
        Assertions.assertTrue(archer.isAlive());
        archer.takeDamage(50);
        Assertions.assertEquals(-5, archer.getHealth());
        Assertions.assertFalse(archer.isAlive());
    }

    @Test
    public void testAttackEnemyArcherHealthGreaterThan50() {
        Hero archer = new Archer("Archer", 80);
        Enemy witch = new Witch(20);
        archer.attackEnemy(witch);
        Assertions.assertEquals(10, witch.getHealth());
    }

    @Test
    public void testAttackEnemyArcherHealthLessThan50() {
        Hero archer = new Archer("Archer", 45);
        Enemy witch = new Witch(20);
        archer.attackEnemy(witch);
        Assertions.assertEquals(15, witch.getHealth());
    }
}
