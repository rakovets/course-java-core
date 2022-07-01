package com.rakovets.course.java.core.practice.oop_principles.BattleGroundTest;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTest {

    @Test
    public void testConstructor() {
        Hero warrior = new Warrior("Warrior");
        Assertions.assertEquals("Warrior", warrior.getName());
    }

    @Test
    public void testConstructorHealthTypeHero() {
        Hero warrior = new Warrior("Warrior", 100);
        Assertions.assertEquals("Warrior", warrior.getName());
        Assertions.assertEquals(100, warrior.getHealth());
        Assertions.assertEquals(TypeHero.WARRIOR,warrior.getTypeHero());
    }

    @Test
    public void testSetHealth() {
        Hero warrior = new Warrior("Warrior", 100);
        warrior.setHealth(90);
        Assertions.assertEquals(90, warrior.getHealth());
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
        warrior.takeDamage(20);
        Assertions.assertEquals(13, warrior.getHealth());
    }

    @Test
    public void testAttackEnemy() {
        Hero warrior = new Warrior("Warrior", 80);
        Enemy witch = new Witch(100);
        warrior.attackEnemy(witch);
        Assertions.assertEquals(85, witch.getHealth());
    }
}
