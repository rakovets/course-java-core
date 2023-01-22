package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Archer;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Mag;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Naga;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Undead;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MagTest {
    static Mag mag;

    @BeforeAll
    static void init() {
        mag = new Mag("Antonidas", 180);
    }

    @Test
    public void attackEnemyTest1() {
        Undead undead = new Undead(300);

        mag.attackEnemy(undead);

        Assertions.assertEquals(292, undead.getHealth());
    }

    @Test
    public void attackEnemyTest2() {
        Undead undead = new Undead(200);

        mag.attackEnemy(undead);

        Assertions.assertEquals(192, undead.getHealth());
    }

    @Test
    public void attackEnemyTest3() {
        Naga naga = new Naga(380);

        mag.attackEnemy(naga);

        Assertions.assertEquals(372, naga.getHealth());
    }

    @Test
    public void healthRegenerationTest1() {
        Mag mag = new Mag("Antonidas", 10);

        mag.healthRegeneration();

        Assertions.assertEquals(40, mag.getHealth());
    }

    @Test
    public void healthRegenerationTest2() {
        Mag mag = new Mag("Antonidas", 18);

        mag.healthRegeneration();

        Assertions.assertEquals(48, mag.getHealth());
    }

    @Test
    public void healthRegenerationTest3() {
        Mag mag = new Mag("Antonidas", 5);

        mag.healthRegeneration();

        Assertions.assertEquals(35, mag.getHealth());
    }
}
