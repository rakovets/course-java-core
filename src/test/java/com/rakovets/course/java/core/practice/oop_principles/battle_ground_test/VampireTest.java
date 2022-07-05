package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VampireTest {

    @Test
    public void testConstructor() {
        Enemy vampire = new Vampire();
        Assertions.assertEquals(100, vampire.getHealth());
        Assertions.assertEquals(5, vampire.getDamage());
    }

    @Test
    public void testConstructorWithHealth() {
        Enemy vampire = new Vampire(90);
        Assertions.assertEquals(90, vampire.getHealth());
        Assertions.assertEquals(5, vampire.getDamage());
    }

    @Test
    public void testSetHealth() {
        Enemy vampire = new Vampire(90);
        vampire.setHealth(80);
        Assertions.assertEquals(80, vampire.getHealth());
    }

    @Test
    public void testIsAlive() {
        Enemy vampire = new Vampire(100);
        Assertions.assertTrue(vampire.isAlive());
    }

    @Test
    public void testIsNotAlive() {
        Enemy vampire = new Vampire(-5);
        Assertions.assertFalse(vampire.isAlive());
    }

    @Test
    public void testTakeDamage() {
        Enemy vampire = new Vampire(90);
        Assertions.assertTrue(vampire.isAlive());
        vampire.takeDamage(45);
        Assertions.assertEquals(45, vampire.getHealth());
        Assertions.assertTrue(vampire.isAlive());
    }

    @Test
    public void testTakeDamageHealthBelowZero() {
        Enemy vampire = new Vampire(40);
        Assertions.assertTrue(vampire.isAlive());
        vampire.takeDamage(45);
        Assertions.assertEquals(-5, vampire.getHealth());
        Assertions.assertFalse(vampire.isAlive());
    }

    @Test
    public void testAttackHeroArcher() {
        Enemy vampire = new Vampire(80);
        Hero archer = new Archer("Archer", 90);
        vampire.attackHero(archer);
        Assertions.assertEquals(80, archer.getHealth());
        Assertions.assertEquals(85, vampire.getHealth());
    }

    @Test
    public void testAttackHeroWarrior() {
        Enemy vampire = new Vampire(80);
        Hero warrior = new Warrior("Warrior", 90);
        vampire.attackHero(warrior);
        Assertions.assertEquals(83, warrior.getHealth());
        Assertions.assertEquals(85, vampire.getHealth());
    }

    @Test
    public void testAttackHeroMag() {
        Enemy vampire = new Vampire(80);
        Hero mag = new Mag("Mag", 90);
        vampire.attackHero(mag);
        Assertions.assertEquals(85, mag.getHealth());
        Assertions.assertEquals(85, vampire.getHealth());
    }
}
