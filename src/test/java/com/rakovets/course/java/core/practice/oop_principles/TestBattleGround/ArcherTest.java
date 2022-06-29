package com.rakovets.course.java.core.practice.oop_principles.TestBattleGround;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Archer;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Hero;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Witch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArcherTest {

    @Test
    public void testConstructor1() {
        Hero archer = new Archer("Archer");
        Assertions.assertEquals("Archer", archer.getName());
    }

    @Test
    public void testConstructor2() {
        Hero archer = new Archer("Archer", 100);
        Assertions.assertEquals("Archer", archer.getName());
        Assertions.assertEquals(100, archer.getHealth());
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
    public void testAttackHeroHealthGreaterThan50() {
        Hero archer = new Archer("Archer", 80);
        Enemy witch = new Witch(20);
        archer.attackEnemy(witch);
        Assertions.assertEquals(10, witch.getHealth());
    }

    @Test
    public void testAttackHeroHealthLessThan50() {
        Hero archer = new Archer("Archer", 45);
        Enemy witch = new Witch(20);
        archer.attackEnemy(witch);
        Assertions.assertEquals(15, witch.getHealth());
    }

}
