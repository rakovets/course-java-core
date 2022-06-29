package com.rakovets.course.java.core.practice.oop_principles.TestBattleGround;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Archer;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Hero;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Witch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WitchTest {

    @Test
    public void testConstructor() {
        Enemy witch = new Witch(100);
        Assertions.assertEquals(100, witch.getHealth());
    }

    @Test
    public void testSetHealth() {
        Enemy witch = new Witch(100);
        witch.setHealth(90);
        Assertions.assertEquals(90, witch.getHealth());
    }

    @Test
    public void testTakeDamage() {
        Enemy witch = new Witch(20);
        Hero archer = new Archer("Archer", 100);
        witch.takeDamage(30, archer);
        Assertions.assertEquals(-10, witch.getHealth());
        Assertions.assertEquals(70, archer.getHealth());
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
    public void testAttackHero() {
        Enemy witch = new Witch(100);
        Hero archer = new Archer("Archer", 100);
        witch.attackHero(archer);
        Assertions.assertEquals(95, archer.getHealth());
    }
}
