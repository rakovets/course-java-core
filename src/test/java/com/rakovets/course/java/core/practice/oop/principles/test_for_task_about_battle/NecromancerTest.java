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

    static Stream<Arguments> provideArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(300, 150, 285),
                Arguments.of(150, 300, 260),
                Arguments.of(300, 10, 0),
                Arguments.of(10, 300, 285)
        );
    }

    @ParameterizedTest(name = "IndicatorHealth - {0}, health - {1}, Expected: {2}")
    @MethodSource("provideArgumentsForAttackHero")
    void attackEnemyOfArcherTest(int indicatorHealth, int health, int expected) {
        Necromancer necromancer = new Necromancer(health);
        Hero hero = new Warrior();
        hero.setIndicatorHealth(indicatorHealth);
        int actual = necromancer.attackHero(hero);
        Assertions.assertEquals(expected, actual);
    }

}
