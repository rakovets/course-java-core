package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemy.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.hero_types.Archer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArcherTests {
    static Stream<Arguments> provideArgumentsAttackEnemy() {
        return Stream.of(
                Arguments.of(200, 170),
                Arguments.of(150, 120),
                Arguments.of(0, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsAttackEnemy")
    void testAttackEnemy(int healthEnemy, int expected) {
        Archer archer = new Archer("Legolas", 100);
        Enemy enemy = new Enemy(healthEnemy);

        archer.attackEnemy(enemy);
        int actual = enemy.getHealth();

        assertEquals(expected, actual);
    }

    /**
     * Parameterized tests I can't be written because the method is called by a random value.
     */
    @Test
    void testAttackEnemy() {
        Archer archer = new Archer("Legolas", 100);
        int enemyDamage = 30;
        int heroHealth;

        archer.takeDamage(enemyDamage);
        heroHealth = archer.getHealth();
        System.out.println("Hero health: " + heroHealth);
        archer.setHealth(10);

        archer.takeDamage(enemyDamage);
        heroHealth = archer.getHealth();
        System.out.println("Hero health: " + heroHealth);
        archer.setHealth(20);

        archer.takeDamage(enemyDamage);
        heroHealth = archer.getHealth();
        System.out.println("Hero health: " + heroHealth);
        archer.setHealth(100);

        archer.takeDamage(enemyDamage);
        heroHealth = archer.getHealth();
        System.out.println("Hero health: " + heroHealth);
        archer.setHealth(100);

        archer.takeDamage(enemyDamage);
        heroHealth = archer.getHealth();
        System.out.println("Hero health: " + heroHealth);
        archer.setHealth(100);
    }
}
