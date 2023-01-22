package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Archer;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Naga;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Undead;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArcherTest {
    Archer archer = new Archer("Kael’thas", 180);

    @Test
    public void attackEnemyTest1() {
        Undead undead = new Undead(300);

        archer.attackEnemy(undead);

        Assertions.assertEquals(291, undead.getHealth());
    }

    @Test
    public void attackEnemyTest2() {
        Undead undead = new Undead(200);

        archer.attackEnemy(undead);

        Assertions.assertEquals(191, undead.getHealth());
    }

    @Test
    public void attackEnemyTest3() {
        Naga naga = new Naga(380);

        archer.attackEnemy(naga);

        Assertions.assertEquals(371, naga.getHealth());
    }

    @Test
    public void attackEnemyTest4() {
        Naga naga = new Naga(250);

        archer.attackEnemy(naga);

        Assertions.assertEquals(241, naga.getHealth());
    }

    @Test
    public void aimedShotTest1() {
        Naga naga = new Naga(250);

        archer.aimedShot(naga);

        Assertions.assertEquals(170, naga.getHealth());
    }

    @Test
    public void aimedShotTest2() {
        Naga naga = new Naga(300);

        archer.aimedShot(naga);

        Assertions.assertEquals(220, naga.getHealth());
    }

    @Test
    public void aimedShotTest3() {
        Undead undead = new Undead(400);

        archer.aimedShot(undead);

        Assertions.assertEquals(320, undead.getHealth());
    }
}
