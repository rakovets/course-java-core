package com.rakovets.course.java.core.practice.oop_principles.BattleGroundTest;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZombieTest {

    @Test
    public void testConstructor() {
        Enemy zombie = new Zombie(100);
        Assertions.assertEquals(100, zombie.getHealth());
        Assertions.assertEquals(TypeEnemy.ZOMBIE,zombie.getTypeEnemy());
    }

    @Test
    public void testSetHealth() {
        Enemy zombie = new Zombie(100);
        zombie.setHealth(90);
        Assertions.assertEquals(90, zombie.getHealth());
    }

    @Test
    public void testTakeDamage() {
        Enemy zombie = new Zombie(5);
        zombie.takeDamage(10);
        Assertions.assertEquals(-5, zombie.getHealth());
    }

    @Test
    public void testTakeDamageResurrection() {
        Enemy zombie = new Zombie(1);
        zombie.takeDamage(5);
        Assertions.assertEquals(50, zombie.getHealth());
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
    public void testAttackHero() {
        Enemy zombie = new Zombie(100);
        Hero archer = new Archer("Archer", 100);
        zombie.attackHero(archer);
        Assertions.assertEquals(90, archer.getHealth());
    }
}
