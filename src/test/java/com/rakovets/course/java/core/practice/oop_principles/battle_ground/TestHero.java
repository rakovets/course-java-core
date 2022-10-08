package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHero {
    Zombie zombie = new Zombie(50);
    Alligator alligator = new Alligator(50);
    Godzilla godzilla = new Godzilla(50);
    Mag mag = new Mag("Mag", 50);
    Archer archer = new Archer("Archer", 50);
    Warrior warrior = new Warrior("Warrior", 50);

    @Test
    public void testHeroArcher() {
        //WHEN
        godzilla.attackHero(archer);
        int actual = archer.getHealth();

        //THEN
        Assertions.assertEquals(40, actual);

    }

    @Test
    void TestHeroMagGetName() {
        //WHEN
        String actual = mag.getName();

        //THEN
        Assertions.assertEquals("Mag", actual);
    }

    @Test
    public void testHeroMagAttackEnemy() {
        //WHEN
        mag.attackEnemy(alligator);
        int actual = alligator.getHealth();

        //THEN
        Assertions.assertEquals(48, actual);

    }

    @Test
    public void testHeroWarriorAttackEnemy() {
        //WHEN
        warrior.attackEnemy(zombie);
        int actual = zombie.getHealth();

        //THEN
        Assertions.assertEquals(41, actual);

    }

    @Test
    public void testHeroWarriorTakeDamageHero() {
        //WHEN
        zombie.attackHero(warrior);
        int actual = warrior.getHealth();

        //THEN
        Assertions.assertEquals(30, actual);

    }
}
