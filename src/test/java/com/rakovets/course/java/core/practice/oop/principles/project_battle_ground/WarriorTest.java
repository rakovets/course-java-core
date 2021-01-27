package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    void attackEnemy() {
        //Given
        Hero warrior = new Warrior("Kraken", 100);
        Enemy zombie = new Zombie(100);
        int expectedEnemyHealth = 85;

        //When
        warrior.attackEnemy(zombie);

        //Than
        Assertions.assertEquals(expectedEnemyHealth, zombie.getHealth());
    }

    @Test
    void getHeroName() {
        //Given
        Hero warrior = new Warrior("Kraken",100);
        String expectedName = "Kraken";

        //When
        String actualName = warrior.getHeroName();

        //Than
        Assertions.assertEquals(expectedName,actualName);
    }

    @Test
    void hitHealthHammer() {
        //Given
        Warrior warrior = new Warrior("Sigmund",10);
        Mutant mutant = new Mutant(50);
        int expectedHeroHealth = 20;
        int expectedEnemyHealth = 40;

        //When
        warrior.hitHealthHammer(mutant,warrior);

        //Than
        Assertions.assertEquals(expectedHeroHealth, warrior.getHealth());
        Assertions.assertEquals(expectedEnemyHealth, mutant.getHealth());
    }
}
