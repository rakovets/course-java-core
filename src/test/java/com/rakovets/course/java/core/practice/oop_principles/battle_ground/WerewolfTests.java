package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy_types.Werewolf;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero_types.Warrior;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WerewolfTests {
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
        Werewolf werewolf = new Werewolf(healthEnemy);

        werewolf.takeDamage(damage);
        int actual = werewolf.getHealth();

        assertEquals(expected, actual);
    }

    /**
     * Parameterized tests I can't be written because the method is called by a random value.
     */
    @Test
    void testAttackEnemy() {
        Werewolf werewolf = new Werewolf(300);
        Warrior warrior = new Warrior("Aragorn", 100);
        int enemyHealth;
        int heroHealth;

        werewolf.attackHero(warrior);
        enemyHealth = werewolf.getHealth();
        heroHealth = warrior.getHealth();
        System.out.println("Enemy health: " + enemyHealth + ", Hero health: " + heroHealth);
        werewolf.setHealth(300);
        warrior.setHealth(100);

        werewolf.attackHero(warrior);
        enemyHealth = werewolf.getHealth();
        heroHealth = warrior.getHealth();
        System.out.println("Enemy health: " + enemyHealth + ", Hero health: " + heroHealth);
        werewolf.setHealth(300);
        warrior.setHealth(100);

        werewolf.attackHero(warrior);
        enemyHealth = werewolf.getHealth();
        heroHealth = warrior.getHealth();
        System.out.println("Enemy health: " + enemyHealth + ", Hero health: " + heroHealth);
        werewolf.setHealth(300);
        warrior.setHealth(100);

        werewolf.attackHero(warrior);
        enemyHealth = werewolf.getHealth();
        heroHealth = warrior.getHealth();
        System.out.println("Enemy health: " + enemyHealth + ", Hero health: " + heroHealth);
        werewolf.setHealth(300);
        warrior.setHealth(100);

        werewolf.attackHero(warrior);
        enemyHealth = werewolf.getHealth();
        heroHealth = warrior.getHealth();
        System.out.println("Enemy health: " + enemyHealth + ", Hero health: " + heroHealth);
        werewolf.setHealth(300);
        warrior.setHealth(100);
    }
}
