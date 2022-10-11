package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEnemy {
    Zombie zombie = new Zombie(50);
    Alligator alligator = new Alligator(50);
    Godzilla godzilla = new Godzilla(50);
    Mag mag = new Mag("Mag", 50);
    Archer archer = new Archer("Archer", 50);
    Warrior warrior = new Warrior("Warrior", 50);


    @Test
    public void testEnemyZombie() {
        //WHEN
        int actual = zombie.attackMag();

        //THEN
        Assertions.assertEquals(24, actual);
    }

    @Test
    public void testEnemyZombieAttackHero() {
        //WHEN
        zombie.attackHero(mag);
        int actual = mag.getHealth();

        //THEN
        Assertions.assertEquals(30, actual);
    }

    @Test
    public void testEnemyZombieTakeDamage() {
        //WHEN
        archer.attackEnemy(alligator);
        int actual = alligator.getHealth();

        //THEN
        Assertions.assertEquals(49, actual);
    }

    @Test
    void TestEnemyAlligatorScreams() {
        //WHEN
        warrior.attackEnemy(alligator);
        String actual = alligator.screams();

        //THEN
        Assertions.assertEquals("I will finish you", actual);
    }

    @Test
    void TestEnemyGodzillaResurrection() {
        //WHEN
        warrior.attackEnemy(godzilla);
        godzilla.resurrection(godzilla);
        int actual = godzilla.getHealth();

        //THEN
        Assertions.assertEquals(41, actual);

    }

    @Test
    void TestEnemyGodzillaIsAlive() {
        //WHEN
        mag.attackEnemy(godzilla);
        boolean actual = godzilla.isAlive();

        //THEN
        Assertions.assertTrue(actual);

    }
}
