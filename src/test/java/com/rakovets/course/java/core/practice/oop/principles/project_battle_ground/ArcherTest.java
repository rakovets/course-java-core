package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {

    @Test
    void AttackEnemy() {
        //Given
        Archer archer = new Archer("Tarus",100);
        Enemy zombie = new Zombie(100);
        int expectedHealth = 95;

        //When
        archer.attackEnemy(zombie);

        //Than
        Assertions.assertEquals(expectedHealth, zombie.getHealth());
    }

    @Test
    void getHeroName() {
        //Given
        Hero archer = new Archer("Tarus",100);
        String expectedName = "Tarus";

        //When
        String actualName = archer.getHeroName();

        //Than
        Assertions.assertEquals(expectedName,actualName);
    }
}
