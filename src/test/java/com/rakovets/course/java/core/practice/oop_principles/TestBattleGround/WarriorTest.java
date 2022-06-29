package com.rakovets.course.java.core.practice.oop_principles.TestBattleGround;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Hero;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Warrior;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Witch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTest {

    @Test
    public void testConstructor1() {
        Hero warrior = new Warrior("Warrior");
        Assertions.assertEquals("Warrior", warrior.getName());
    }

    @Test
    public void testConstructor2() {
        Hero warrior = new Warrior("Warrior", 100);
        Assertions.assertEquals("Warrior", warrior.getName());
        Assertions.assertEquals(100, warrior.getHealth());
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
        Assertions.assertEquals(15, warrior.getHealth());
    }

    @Test
    public void testAttackEnemy() {
        Hero warrior = new Warrior("Warrior", 80);
        Enemy witch = new Witch(100);
        warrior.attackEnemy(witch);
        Assertions.assertEquals(85, witch.getHealth());
    }
}
