package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SuperEnemyTests {
    SuperEnemy superEnemy = new SuperEnemy(100);
    Mag mag = new Mag("Tom");

    @Test
    public void testDeadHit() {
        mag.setHealth(1000);
        superEnemy.deadHit(mag);
        Assertions.assertEquals(0, mag.getHealth());
    }
}
