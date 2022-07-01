package com.rakovets.course.java.core.practice.oop_principles.BattleGroundTest;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VampireTest {

    @Test
    public void testConstructor() {
        Enemy vampire = new Vampire(100);
        Assertions.assertEquals(100, vampire.getHealth());
        Assertions.assertEquals(TypeEnemy.VAMPIRE, vampire.getTypeEnemy());
    }

    @Test
    public void testSetHealth() {
        Enemy vampire = new Vampire(100);
        vampire.setHealth(90);
        Assertions.assertEquals(90, vampire.getHealth());
    }

    @Test
    public void testTakeDamage() {
        Enemy vampire = new Vampire(100);
        vampire.takeDamage(45);
        Assertions.assertEquals(55, vampire.getHealth());
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
    public void testAttackHeroTypeHeroArcher() {
        Enemy vampire = new Vampire(100);
        Hero archer = new Archer("Archer", 100);
        vampire.attackHero(archer);
        Assertions.assertEquals(90, archer.getHealth());
        Assertions.assertEquals(105, vampire.getHealth());
    }

    @Test
    public void testAttackHeroTypeHeroWarrior() {
        Enemy vampire = new Vampire(100);
        Hero warrior = new Warrior("Warrior", 100);
        vampire.attackHero(warrior);
        Assertions.assertEquals(93, warrior.getHealth());
        Assertions.assertEquals(105, vampire.getHealth());
    }

    @Test
    public void testAttackHeroTypeHeroMag() {
        Enemy vampire = new Vampire(100);
        Hero mag = new Mag("Mag", 100);
        vampire.attackHero(mag);
        Assertions.assertEquals(95, mag.getHealth());
        Assertions.assertEquals(105, vampire.getHealth());
    }
}
