package com.rakovets.course.java.core.practice.oop_principles.battle_ground_test;

import com.rakovets.course.java.core.example.generics.model.restrict.A;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Archer;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Hero;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Naga;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NagaTest {
    Naga naga = new Naga(300);

    @Test
    public void attackHeroTest1() {
        Archer archer = new Archer("Kael’thas", 180);

        int extendHealth = 165;
        naga.attackHero(archer);

        Assertions.assertEquals(extendHealth, archer.getHealth());
    }

    @Test
    public void attackHeroTest2() {
        Archer archer = new Archer("Kael’thas", 270);

        int extendHealth = 255;
        naga.attackHero(archer);

        Assertions.assertEquals(extendHealth, archer.getHealth());
    }

    @Test
    public void attackHeroTest3() {
        Archer archer = new Archer("Kael’thas", 220);

        int extendHealth = 205;
        naga.attackHero(archer);

        Assertions.assertEquals(extendHealth, archer.getHealth());
    }

    @Test
    public void drinkBloodTest1() {
        Archer archer = new Archer("Kael’thas", 210);

        int archerExtendHealth = 185;
        int nagaHealth = 325;
        naga.drinkBlood(archer);

        Assertions.assertEquals(archerExtendHealth, archer.getHealth());
        Assertions.assertEquals(nagaHealth, naga.getHealth());
    }

    @Test
    public void drinkBloodTest2() {
        Archer archer = new Archer("Kael’thas", 180);
        Naga naga = new Naga(200);

        int archerExtendHealth = 155;
        int nagaHealth = 225;
        naga.drinkBlood(archer);

        Assertions.assertEquals(archerExtendHealth, archer.getHealth());
        Assertions.assertEquals(nagaHealth, naga.getHealth());
    }
}
