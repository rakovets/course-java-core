package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero_types.Warrior;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarriorTests {
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
    void testTakeDamage(int healthHero, int damage, int expected) {
        Warrior warrior = new Warrior("Aragorn", healthHero);

        warrior.takeDamage(damage);
        int actual = warrior.getHealth();

        assertEquals(expected, actual);
    }

    /**
     * Parameterized tests I can't be written because the method is called by a random value.
     */
    @Test
    void testAttackEnemy() {
        Warrior warrior = new Warrior("Aragorn", 100);
        Enemy enemy = new Enemy(200);
        int enemyHealth;

        warrior.attackEnemy(enemy);
        enemyHealth = enemy.getHealth();
        System.out.println("Enemy health: " + enemyHealth);
        enemy.setHealth(200);

        warrior.attackEnemy(enemy);
        enemyHealth = enemy.getHealth();
        System.out.println("Enemy health: " + enemyHealth);
        enemy.setHealth(200);

        warrior.attackEnemy(enemy);
        enemyHealth = enemy.getHealth();
        System.out.println("Enemy health: " + enemyHealth);
        enemy.setHealth(200);

        warrior.attackEnemy(enemy);
        enemyHealth = enemy.getHealth();
        System.out.println("Enemy health: " + enemyHealth);
        enemy.setHealth(200);

        warrior.attackEnemy(enemy);
        enemyHealth = enemy.getHealth();
        System.out.println("Enemy health: " + enemyHealth);
        enemy.setHealth(200);
    }
}
