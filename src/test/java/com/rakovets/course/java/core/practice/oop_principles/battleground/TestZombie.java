package com.rakovets.course.java.core.practice.oop_principles.battleground;

import com.rakovets.course.java.core.practice.oop_principles.battleground.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battleground.enemies.Zombie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestZombie {
    @Test
    void testSetHealth() {
        Zombie zombie = new Zombie(1000);

        int actual = zombie.getHealth();

        Assertions.assertEquals(1000, actual);
    }
}
