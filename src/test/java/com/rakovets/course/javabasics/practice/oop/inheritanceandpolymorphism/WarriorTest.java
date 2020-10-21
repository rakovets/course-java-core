package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Warrior;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground.Zoomby;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WarriorTest {

    @Test
    void isAliveTest() {
        Warrior hero = new Warrior("Vasya");
        Zoomby enemy = new Zoomby(50);
        hero.setHeath(220);
        enemy.setDamage(100);
        enemy.attackHero(hero);
        Assertions.assertFalse(hero.isAlive());
    }
}
