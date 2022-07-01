package com.rakovets.course.java.core.practice.oop_principles.BattleGroundTest;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArcherTest {

    @Test
    public void testConstructor() {
        Hero archer = new Archer("Archer");
        Assertions.assertEquals("Archer", archer.getName());
    }

    @Test
    public void testConstructorWithHealthTypeHero() {
        Hero archer = new Archer("Archer", 100);
        Assertions.assertEquals("Archer", archer.getName());
        Assertions.assertEquals(100, archer.getHealth());
        Assertions.assertEquals(TypeHero.ARCHER,archer.getTypeHero());
    }

    @Test
    public void testSetHealth() {
        Hero archer = new Archer("Archer", 100);
        archer.setHealth(90);
        Assertions.assertEquals(90, archer.getHealth());
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
        Hero archer = new Archer("Archer", 45);
        archer.takeDamage(45);
        Assertions.assertEquals(0, archer.getHealth());
    }

    @Test
    public void testAttackEnemyHeroHealthGreaterThan50() {
        Hero archer = new Archer("Archer", 80);
        Enemy witch = new Witch(20);
        archer.attackEnemy(witch);
        Assertions.assertEquals(10, witch.getHealth());
    }

    @Test
    public void testAttackEnemyHeroHealthLessThan50() {
        Hero archer = new Archer("Archer", 45);
        Enemy witch = new Witch(20);
        archer.attackEnemy(witch);
        Assertions.assertEquals(15, witch.getHealth());
    }
}
