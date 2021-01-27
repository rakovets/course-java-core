package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VampiresTest {

    @Test
    void setHealth() {
        //Given
        Vampires vampires = new Vampires(100);
        int expectedHealth = 80;

        //When
        vampires.setHealth(80);

        //Than
        Assertions.assertEquals(expectedHealth, vampires.getHealth());
    }

    @Test
    void getHealth() {
        //Given
        Vampires vampires = new Vampires(100);
        int expectedHealth = 100;

        //When
        int actualHealth = vampires.getHealth();

        //Than
        Assertions.assertEquals(expectedHealth, actualHealth);

    }

    @Test
    void takeDamage() {
        //Given
        Vampires vampires = new Vampires(100);
        int expectedHealth = 80;

        //When
        vampires.takeDamage(20);

        //Than
        Assertions.assertEquals(expectedHealth, vampires.getHealth());
    }

    @Test
    void attackHero() {
        //Given
        Hero mag = new Mag("Sigmund",100);
        Vampires vampires = new Vampires(100);
        int expectedHeroHealth = 80;

        //When
        vampires.attackHero(mag);

        //Than
        Assertions.assertEquals(expectedHeroHealth, mag.getHealth());
    }
}
