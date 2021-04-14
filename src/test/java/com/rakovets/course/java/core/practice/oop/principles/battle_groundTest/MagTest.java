package com.rakovets.course.java.core.practice.oop.principles.battle_groundTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

class MagTest {
    static Enemy enemy = new Enemy(100) {
        @Override
        public void attackEnemy(Hero hero) {
            System.out.println("Enemy attacks!");
        }
    };

    static Stream<Arguments> attackEnemyTest() {
        return Stream.of(
                Arguments.of(90, enemy));
    }

    @ParameterizedTest
    @MethodSource("attackEnemyTest")
    void attackEnemyTest(int expected, Enemy enemy) {
        enemy.setHealth(100);
        Mag mag = new Mag("Mag", 100);
        mag.attackEnemy(enemy);
        assertEquals(expected, enemy.getHealth());
    }

    static Stream<Arguments> blizzardTest() {
        return Stream.of(
                Arguments.of(80, enemy));
    }

    @ParameterizedTest
    @MethodSource("blizzardTest")
    void blizzardTest(int expected, Enemy enemy) {
        Mag mag = new Mag("Mag", 100);
        enemy.setHealth(100);
        mag.blizzard(enemy);
        assertEquals(expected, enemy.getHealth());
    }
}
