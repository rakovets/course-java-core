package com.rakovets.course.java.core.practice.oop_principles.BattleGroundTest;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WitchTest {

    @Test
    public void testConstructor() {
        Enemy witch = new Witch();
        Assertions.assertEquals(100, witch.getHealth());
        Assertions.assertEquals(TypeEnemy.WITCH, witch.getTypeEnemy());
        Assertions.assertEquals(5, witch.getDamage());
    }

    @Test
    public void testConstructorWithHealth() {
        Enemy witch = new Witch(90);
        Assertions.assertEquals(90, witch.getHealth());
        Assertions.assertEquals(TypeEnemy.WITCH, witch.getTypeEnemy());
        Assertions.assertEquals(5, witch.getDamage());
    }

    @Test
    public void testSetHealth() {
        Enemy witch = new Witch(80);
        witch.setHealth(70);
        Assertions.assertEquals(70, witch.getHealth());
    }

    @Test
    public void testIsAlive() {
        Enemy witch = new Witch(100);
        Assertions.assertTrue(witch.isAlive());
    }

    @Test
    public void testIsNotAlive() {
        Enemy witch = new Witch(-5);
        Assertions.assertFalse(witch.isAlive());
    }

    @Test
    public void testTakeDamage() {
        Enemy witch = new Witch(60);
        Assertions.assertTrue(witch.isAlive());
        witch.takeDamage(30);
        Assertions.assertEquals(30, witch.getHealth());
        Assertions.assertTrue(witch.isAlive());
    }

    @Test
    public void testTakeDamageHealthBelowZero() {
        Enemy witch = new Witch(10);
        Assertions.assertTrue(witch.isAlive());
        witch.takeDamage(30);
        Assertions.assertEquals(-20, witch.getHealth());
        Assertions.assertFalse(witch.isAlive());
    }

    @Test
    public void testAttackHeroArcher() {
        Enemy witch = new Witch(90);
        Hero archer = new Archer("Archer", 90);
        witch.attackHero(archer);
        Assertions.assertEquals(85, archer.getHealth());
    }

    @Test
    public void testAttackHeroWarrior() {
        Enemy witch = new Witch(90);
        Hero warrior = new Warrior("Warrior", 90);
        witch.attackHero(warrior);
        Assertions.assertEquals(88, warrior.getHealth());
    }

    @Test
    public void testAttackHeroMag() {
        Enemy witch = new Witch(90);
        Hero mag = new Mag("Mag", 90);
        witch.attackHero(mag);
        Assertions.assertEquals(80, mag.getHealth());
    }
}
