package com.rakovets.course.java.core.practice.oop_principles.BattleGroundTest;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WitchTest {

    @Test
    public void testConstructor() {
        Enemy witch = new Witch(100);
        Assertions.assertEquals(100, witch.getHealth());
        Assertions.assertEquals(TypeEnemy.WITCH,witch.getTypeEnemy());
    }

    @Test
    public void testSetHealth() {
        Enemy witch = new Witch(100);
        witch.setHealth(90);
        Assertions.assertEquals(90, witch.getHealth());
    }

    @Test
    public void testTakeFatalDamage() {
        Enemy witch = new Witch(20);
        Hero archer = new Archer("Archer", 100);
        witch.takeDamage(30, archer);
        Assertions.assertEquals(-10, witch.getHealth());
        Assertions.assertEquals(70, archer.getHealth());
    }

    @Test
    public void testTakeDamage() {
        Enemy witch = new Witch(60);
        Hero archer = new Archer("Archer", 100);
        witch.takeDamage(30, archer);
        Assertions.assertEquals(30, witch.getHealth());
        Assertions.assertEquals(100, archer.getHealth());
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
    public void testAttackHeroTypeHeroArcher() {
        Enemy witch = new Witch(100);
        Hero archer = new Archer("Archer", 100);
        witch.attackHero(archer);
        Assertions.assertEquals(95, archer.getHealth());
    }

    @Test
    public void testAttackHeroTypeHeroWarrior() {
        Enemy witch = new Witch(100);
        Hero warrior = new Warrior("Warrior", 100);
        witch.attackHero(warrior);
        Assertions.assertEquals(98, warrior.getHealth());
    }

    @Test
    public void testAttackHeroTypeHeroMag() {
        Enemy witch = new Witch(100);
        Hero mag = new Mag("Mag", 100);
        witch.attackHero(mag);
        Assertions.assertEquals(90, mag.getHealth());
    }
}



