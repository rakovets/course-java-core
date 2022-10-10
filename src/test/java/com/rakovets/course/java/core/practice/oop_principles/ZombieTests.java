package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZombieTests {
    Zombie zombie = new Zombie(100);
    Mag mag = new Mag("Andrew");

    @Test
    public void testZombieAttackHero() {
        mag.setHealth(100);
        zombie.attackHeroes(mag);
        Assertions.assertEquals(80, mag.getHealth());
    }

    @Test
    public void testZombieStartNewLife() {
        zombie.setHealth(0);
        zombie.startNewLife();
        Assertions.assertEquals(100, zombie.getHealth());
    }


}
