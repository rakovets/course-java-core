package com.rakovets.course.java.core.practice.oop_principles.TestBattleGround;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagTest {
    @Test
    public void testConstructor1() {
        Hero mag = new Mag("Mag");
        Assertions.assertEquals("Mag", mag.getName());
    }

    @Test
    public void testConstructor2() {
        Hero mag = new Mag("Mag", 100);
        Assertions.assertEquals("Mag", mag.getName());
        Assertions.assertEquals(100, mag.getHealth());
    }

    @Test
    public void testSetHealth() {
        Hero archer = new Archer("Mag", 100);
        archer.setHealth(90);
        Assertions.assertEquals(90, archer.getHealth());
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
        Hero mag = new Mag("Mag", 45);
        mag.takeDamage(45);
        Assertions.assertEquals(0, mag.getHealth());
    }

    @Test
    public void testAttackEnemyHealthGreaterThan50() {
        Hero mag = new Mag("Mag", 80);
        Enemy witch = new Witch(100);
        mag.attackEnemy(witch);
        Assertions.assertEquals(95, witch.getHealth());
    }

    @Test
    public void testAttackEnemyHealthLessThan50() {
        Hero mag = new Mag("Mag", 45);
        Enemy witch = new Witch(45);
        mag.attackEnemy(witch);
        Assertions.assertEquals(35, witch.getHealth());
    }
}
