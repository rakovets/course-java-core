package com.rakovets.course.java.core.practice.oop_principles.battleground;

import com.rakovets.course.java.core.practice.oop_principles.battleground.enemies.Plant;
import com.rakovets.course.java.core.practice.oop_principles.battleground.enemies.Undead;
import com.rakovets.course.java.core.practice.oop_principles.battleground.enemies.Zombie;
import com.rakovets.course.java.core.practice.oop_principles.battleground.heroes.Archer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArcher {
    @Test
    void testGetArcherName() {
        Archer archer = new Archer("Peter",100);

        String actual = archer.getName();

        Assertions.assertEquals("Peter", actual);
    }

    @Test
    void testSetArcherHealth() {
        Archer archer = new Archer("Peter",100);

        archer.setHealth(100);
        int actual = archer.getHealth();

        Assertions.assertEquals(100, actual);
    }

    @Test
    void testArcherIsAliveTrue() {
        Archer archer = new Archer("Peter",100);

        int currentArcherHp = archer.getHealth();
        boolean actual = archer.isAlive(currentArcherHp);

        Assertions.assertTrue(actual);
    }

    @Test
    void testArcherIsAliveFalse() {
        Archer archer = new Archer("Peter",100);

        archer.setHealth(-1000);
        int currentArcherHp = archer.getHealth();
        boolean actual = archer.isAlive(currentArcherHp);

        Assertions.assertFalse(actual);
    }

    @Test
    void testAttackEnemy() {
        Archer archer = new Archer("Peter",100);
        Zombie zombie = new Zombie(100);

        archer.attackEnemy(zombie);
        int actual = zombie.getHealth();

        Assertions.assertEquals(50, actual);
    }

    @Test
    void testTakeDamage() {
        Archer archer = new Archer("Peter",100);

        archer.takeDamage(10);
        int actual = archer.getHealth();

        Assertions.assertEquals(90, actual);
    }

    @Test
    void testTakeDamageFromZombie() {
        Archer archer = new Archer("Peter",100);
        Zombie zombie = new Zombie(100);

        zombie.attackHero(archer);
        int actual = archer.getHealth();

        Assertions.assertEquals(60, actual);
    }

    @Test
    void testTakeDamageFromPlant() {
        Archer archer = new Archer("Peter",100);
        Plant plant = new Plant(100);

        plant.attackHero(archer);
        int actual = archer.getHealth();

        Assertions.assertEquals(80, actual);
    }

    @Test
    void testTakeDamageFromUndead() {
        Archer archer = new Archer("Peter",100);
        Undead undead = new Undead(400);

        undead.attackHero(archer);
        int actual = archer.getHealth();

        Assertions.assertEquals(40, actual);
    }
}
