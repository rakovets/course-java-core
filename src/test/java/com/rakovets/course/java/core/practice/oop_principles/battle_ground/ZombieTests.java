package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy_types.Zombie;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero_types.Warrior;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZombieTests {
    static Stream<Arguments> provideArgumentsAttackEnemy() {
        return Stream.of(
                Arguments.of(200, 190),
                Arguments.of(150, 140),
                Arguments.of(0, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsAttackEnemy")
    void testAttackEnemy(int healthHero, int expected) {
        Zombie zombie = new Zombie(100);
        Warrior warrior = new Warrior("Aragorn", healthHero);

        zombie.attackHero(warrior);
        int actual = warrior.getHealth();

        assertEquals(expected, actual);
    }

    /**
     * Parameterized tests I can't be written because the method is called by a random value.
     */
    @Test
    void testTakeDamage() {
        Zombie zombie = new Zombie(100);
        int enemyHealth;
        int heroDamage = 120;

        zombie.takeDamage(heroDamage);
        enemyHealth = zombie.getHealth();
        System.out.println("Enemy health: " + enemyHealth);
        zombie.setHealth(100);

        zombie.takeDamage(heroDamage);
        enemyHealth = zombie.getHealth();
        System.out.println("Enemy health: " + enemyHealth);
        zombie.setHealth(100);

        zombie.takeDamage(heroDamage);
        enemyHealth = zombie.getHealth();
        System.out.println("Enemy health: " + enemyHealth);
        zombie.setHealth(100);

        zombie.takeDamage(heroDamage);
        enemyHealth = zombie.getHealth();
        System.out.println("Enemy health: " + enemyHealth);
        zombie.setHealth(100);

        zombie.takeDamage(heroDamage);
        enemyHealth = zombie.getHealth();
        System.out.println("Enemy health: " + enemyHealth);
        zombie.setHealth(100);
    }
}
