package com.rakovets.course.java.core.practice.oop_principles.BattleGroundTest;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZombieTest {

    @Test
    public void testConstructor() {
        Enemy zombie = new Zombie();
        Assertions.assertEquals(100, zombie.getHealth());
        Assertions.assertEquals(TypeEnemy.ZOMBIE, zombie.getTypeEnemy());
    }

    @Test
    public void testConstructorWitHealth() {
        Enemy zombie = new Zombie(90);
        Assertions.assertEquals(90, zombie.getHealth());
        Assertions.assertEquals(TypeEnemy.ZOMBIE, zombie.getTypeEnemy());
    }

    @Test
    public void testSetHealth() {
        Enemy zombie = new Zombie(70);
        zombie.setHealth(80);
        Assertions.assertEquals(80, zombie.getHealth());
    }

    @Test
    public void testIsAlive() {
        Enemy zombie = new Zombie(100);
        Assertions.assertTrue(zombie.isAlive());
    }

    @Test
    public void testIsNotAlive() {
        Enemy zombie = new Zombie(-5);
        Assertions.assertFalse(zombie.isAlive());
    }

    @Test
    public void testTakeDamage() {
        Enemy zombie = new Zombie(50);
        Assertions.assertTrue(zombie.isAlive());
        zombie.takeDamage(10);
        Assertions.assertEquals(40, zombie.getHealth());
        Assertions.assertTrue(zombie.isAlive());
    }

    @Test
    public void testTakeDamageNotResurrection() {
        Enemy zombie = new Zombie(5);
        Assertions.assertTrue(zombie.isAlive());
        zombie.takeDamage(10);
        Assertions.assertEquals(-5, zombie.getHealth());
        Assertions.assertFalse(zombie.isAlive());
    }

    @Test
    public void testTakeDamageResurrection() {
        Enemy zombie = new Zombie(1);
        Assertions.assertTrue(zombie.isAlive());
        zombie.takeDamage(5);
        Assertions.assertEquals(50, zombie.getHealth());
        Assertions.assertTrue(zombie.isAlive());
    }

    @Test
    public void testAttackHeroArcher() {
        Enemy zombie = new Zombie(80);
        Hero archer = new Archer("Archer", 80);
        zombie.attackHero(archer);
        Assertions.assertEquals(70, archer.getHealth());
    }

    @Test
    public void testAttackHeroWarrior() {
        Enemy zombie = new Zombie(80);
        Hero warrior = new Warrior("Warrior", 90);
        zombie.attackHero(warrior);
        Assertions.assertEquals(83, warrior.getHealth());
    }

    @Test
    public void testAttackHeroMag() {
        Enemy zombie = new Zombie(80);
        Hero mag = new Mag("Mag", 90);
        zombie.attackHero(mag);
        Assertions.assertEquals(85, mag.getHealth());
    }
}
