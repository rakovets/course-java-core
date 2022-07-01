package com.rakovets.course.java.core.practice.oop_principles.BattleGroundTest;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagTest {

    @Test
    public void testConstructor() {
        Hero mag = new Mag("Mag");
        Assertions.assertEquals("Mag", mag.getName());
    }

    @Test
    public void testConstructorWithHealthTypeHero() {
        Hero mag = new Mag("Mag", 100);
        Assertions.assertEquals("Mag", mag.getName());
        Assertions.assertEquals(100, mag.getHealth());
        Assertions.assertEquals(TypeHero.MAG,mag.getTypeHero());
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
    public void testAttackEnemyWitchEnemyType() {
        Hero mag = new Mag("Mag", 80);
        Enemy witch = new Witch(100);
        mag.attackEnemy(witch);
        Assertions.assertEquals(90, witch.getHealth());
    }

    @Test
    public void testAttackEnemyVampireEnemyType() {
        Hero mag = new Mag("Mag", 80);
        Enemy vampire = new Vampire(100);
        mag.attackEnemy(vampire);
        Assertions.assertEquals(95, vampire.getHealth());
    }

    @Test
    public void testAttackEnemyZombieEnemyType() {
        Hero mag = new Mag("Mag", 80);
        Enemy zombie = new Zombie(100);
        mag.attackEnemy(zombie);
        Assertions.assertEquals(95, zombie.getHealth());
    }
}
