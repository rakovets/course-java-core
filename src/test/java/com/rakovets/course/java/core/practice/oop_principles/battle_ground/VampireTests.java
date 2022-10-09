package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy_types.Vampire;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero_types.Warrior;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VampireTests {
    static Stream<Arguments> provideArgumentsTakeDamage() {
        return Stream.of(
                Arguments.of(200, 100, 100),
                Arguments.of(300, 50, 250),
                Arguments.of(0, 100, 0),
                Arguments.of(90, 100, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsTakeDamage")
    void testTakeDamage(int healthEnemy, int damage, int expected) {
        Vampire vampire = new Vampire(healthEnemy);

        vampire.takeDamage(damage);
        int actual = vampire.getHealth();

        assertEquals(expected, actual);
    }

    /**
     * Parameterized tests I can't be written because the method is called by a random value.
     */
    @Test
    void testAttackEnemy() {
        Warrior warrior = new Warrior("Aragorn", 300);
        Vampire vampire = new Vampire(200);
        int heroHealth;

        vampire.attackHero(warrior);
        heroHealth = warrior.getHealth();
        System.out.println("Hero health: " + heroHealth);
        warrior.setHealth(300);

        vampire.attackHero(warrior);
        heroHealth = warrior.getHealth();
        System.out.println("Hero health: " + heroHealth);
        warrior.setHealth(300);

        vampire.attackHero(warrior);
        heroHealth = warrior.getHealth();
        System.out.println("Hero health: " + heroHealth);
        warrior.setHealth(300);

        vampire.attackHero(warrior);
        heroHealth = warrior.getHealth();
        System.out.println("Hero health: " + heroHealth);
        warrior.setHealth(300);

        vampire.attackHero(warrior);
        heroHealth = warrior.getHealth();
        System.out.println("Hero health: " + heroHealth);
        warrior.setHealth(300);
    }
}
