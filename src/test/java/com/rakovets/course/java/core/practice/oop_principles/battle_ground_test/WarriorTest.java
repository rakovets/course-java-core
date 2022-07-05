package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTest {

    @Test
    public void testConstructor() {
        Hero warrior = new Warrior("Warrior");
        Assertions.assertEquals("Warrior", warrior.getName());
        Assertions.assertEquals(100, warrior.getHealth());
        Assertions.assertEquals(15, warrior.getDamage());
    }

    @Test
    public void testConstructorHealth() {
        Hero warrior = new Warrior("Warrior", 82);
        Assertions.assertEquals("Warrior", warrior.getName());
        Assertions.assertEquals(82, warrior.getHealth());
        Assertions.assertEquals(15, warrior.getDamage());
    }

    @Test
    public void testSetHealth() {
        Hero warrior = new Warrior("Warrior", 90);
        warrior.setHealth(80);
        Assertions.assertEquals(80, warrior.getHealth());
    }

    @Test
    public void testIsAlive() {
        Hero warrior = new Warrior("Warrior", 45);
        Assertions.assertTrue(warrior.isAlive());
    }

    @Test
    public void testIsNotAlive() {
        Hero warrior = new Warrior("Warrior", 0);
        Assertions.assertFalse(warrior.isAlive());
    }

    @Test
    public void testTakeDamage() {
        Hero warrior = new Warrior("Warrior", 30);
        Assertions.assertTrue(warrior.isAlive());
        warrior.takeDamage(20);
        Assertions.assertEquals(13, warrior.getHealth());
        Assertions.assertTrue(warrior.isAlive());
    }

    @Test
    public void testTakeDamageHealthBelowZero() {
        Hero warrior = new Warrior("Warrior", 10);
        Assertions.assertTrue(warrior.isAlive());
        warrior.takeDamage(30);
        Assertions.assertEquals(-17, warrior.getHealth());
        Assertions.assertFalse(warrior.isAlive());
    }

    @Test
    public void testAttackEnemy() {
        Hero warrior = new Warrior("Warrior", 80);
        Enemy witch = new Witch(100);
        warrior.attackEnemy(witch);
        Assertions.assertEquals(85, witch.getHealth());
    }
}
