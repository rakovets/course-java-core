package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MagTest {

    @Test
    void testAttackEnemy() {
        //Given
        Hero mag = new Mag("Sigmund",100);
        Enemy zombie = new Zombie(100);
        int expectedEnemyHealth = 85;

        //When
        mag.attackEnemy(zombie);

        //Than
        Assertions.assertEquals(expectedEnemyHealth, zombie.getHealth());
    }

    @Test
    void getHeroName() {
        //Given
        Hero mag = new Mag("Sigmund",100);
        String expectedName = "Sigmund";

        //When
        String actualName = mag.getHeroName();

        //Than
        Assertions.assertEquals(expectedName,actualName);
    }

    @Test
    void healthSpell() {

        //given
        Mag mag = new Mag("Sigmund", 100);
        Archer archer = new Archer("Tarus", 5);
        int expectedHeroHealth = 35;

        //when
        mag.healthSpell(archer);

        //than
        Assertions.assertEquals(expectedHeroHealth, archer.getHealth());
        }
    }
