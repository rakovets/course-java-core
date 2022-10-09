package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero_types.Mag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagTests {
    static Stream<Arguments> provideArgumentsAttackEnemy() {
        return Stream.of(
                Arguments.of(200, 160),
                Arguments.of(150, 110),
                Arguments.of(0, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsAttackEnemy")
    void testAttackEnemy(int healthEnemy, int expected) {
        Mag mag = new Mag("Gandalf", 100);
        Enemy enemy = new Enemy(healthEnemy);

        mag.attackEnemy(enemy);
        int actual = enemy.getHealth();

        assertEquals(expected, actual);
    }

    /**
     * Parameterized tests I can't be written because the method is called by a random value.
     */
    @Test
    void testTakeDamage() {
        Mag mag = new Mag("Gandalf", 150);
        int heroHealth;
        int enemyDamage = 50;

        mag.takeDamage(enemyDamage);
        heroHealth = mag.getHealth();
        System.out.println("Hero health: " + heroHealth);
        mag.setHealth(30);

        mag.takeDamage(enemyDamage);
        heroHealth = mag.getHealth();
        System.out.println("Hero health: " + heroHealth);
        mag.setHealth(10);

        mag.takeDamage(enemyDamage);
        heroHealth = mag.getHealth();
        System.out.println("Hero health: " + heroHealth);
        mag.setHealth(150);

        mag.takeDamage(enemyDamage);
        heroHealth = mag.getHealth();
        System.out.println("Hero health: " + heroHealth);
        mag.setHealth(150);

        mag.takeDamage(enemyDamage);
        heroHealth = mag.getHealth();
        System.out.println("Hero health: " + heroHealth);
        mag.setHealth(150);
    }
}
