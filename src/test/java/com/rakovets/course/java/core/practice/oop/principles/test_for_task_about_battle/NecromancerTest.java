package com.rakovets.course.java.core.practice.oop.principles.test_for_task_about_battle;

import com.rakovets.course.java.core.practice.oop.principles.task_about_battle.Hero;
import com.rakovets.course.java.core.practice.oop.principles.task_about_battle.Necromancer;
import com.rakovets.course.java.core.practice.oop.principles.task_about_battle.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class NecromancerTest {

    static Stream<Arguments> provideArgumentsForAttackHeroWithNecromancer() {
        return Stream.of(
                Arguments.of(300, 150, 285),
                Arguments.of(150, 300, 260),
                Arguments.of(300, 10, 0),
                Arguments.of(10, 300, 285)
        );
    }

    static Stream<Arguments> provideArgumentsForRevivalNecromancer() {
        return Stream.of(
                Arguments.of(300, 300),
                Arguments.of(10, 100),
                Arguments.of(5, 100),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest(name = "IndicatorHealth - {0}, health - {1}, Expected: {2}")
    @MethodSource("provideArgumentsForAttackHeroWithNecromancer")
    void attackEnemyWithNecromancerTest(int indicatorHealth, int health, int expected) {
        Necromancer necromancer = new Necromancer(health);
        Hero hero = new Warrior();
        hero.setIndicatorHealth(indicatorHealth);
        int actual = necromancer.attackHero(hero);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Health - {0}, Expected: {1}")
    @MethodSource("provideArgumentsForRevivalNecromancer")
    void revivalNecromancerTest(int health, int expected) {
        Necromancer necromancer = new Necromancer(health);
        int actual = necromancer.revivalNecromancer();
        Assertions.assertEquals(expected, actual);
    }
}
