package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies.Demon;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies.Werewolf;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies.Zombie;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Archer;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Hero;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Mag;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BattleGroundTest {
    static Stream<Arguments> provideArgumentsForIsAlive() {
        return Stream.of(
                Arguments.of(new Warrior("Gingo", 300, 50), true),
                Arguments.of(new Archer("Sam", 0, 5), false),
                Arguments.of(new Mag("Herald", -2, 30), false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsAlive")
    void testIsAlive(Hero hero, boolean expected) {
        boolean actual = hero.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAttackEnemy() {
        return Stream.of(
                Arguments.of(new Warrior("Gingo", 300, 50), new Demon("Baltazar", 400, 2), 380.0),
                Arguments.of(new Archer("Sam", 300, 5), new Zombie("Groat", 200, 2), 187.0),
                Arguments.of(new Mag("Herald", 250, 30), new Werewolf("Jakob", 250), 240.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackEnemy")
    void testForAttackEnemy(Hero hero, Enemy enemy, double expected) {
        hero.attackEnemy(enemy);
        double actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(new Warrior("Gingo", 300, 50), new Demon("Baltazar", 380, 2), 285.0),
                Arguments.of(new Warrior("Gingo", 300, 10), new Demon("Baltazar", 380, 2), 285.0),
                Arguments.of(new Warrior("Gingo", 300, 0), new Demon("Baltazar", 380, 2), 270.0),
                Arguments.of(new Archer("Sam", 300, 5), new Zombie("Groat", 187, 2), 285.0),
                Arguments.of(new Mag("Herald", 250, 30), new Werewolf("Jakob", 240), 235.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackHero")
    void testForAttackHero(Hero hero, Enemy enemy, double expected) {
        enemy.attackHero(hero);
        double actual = hero.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForHealing() {
        return Stream.of(
                Arguments.of(new Mag("Herald", 250, 30), 260.0),
                Arguments.of(new Mag("Herald", 250, 0), 250.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForHealing")
    void testForHealing(Mag mag, double expected) {
        mag.makeHealingSpell();
        double actual = mag.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsFireArrow() {
        return Stream.of(
                Arguments.of(new Archer("Sam", 300, 5), new Zombie("Groat", 187, 2), 167.0),
                Arguments.of(new Archer("Sam", 300, 3), new Zombie("Groat", 167, 2), 147.0),
                Arguments.of(new Archer("Sam", 300, 0), new Zombie("Groat", 187, 2), 187.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsFireArrow")
    void testForFireArrow(Archer arch, Enemy enemy, double expected) {
        arch.fireArrowAttack(enemy);
        double actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsZombie() {
        return Stream.of(
                Arguments.of(new Zombie("Groam", 250, 2), 150.0),
                Arguments.of(new Zombie("Groam", 100, 2), 50.0),
                Arguments.of(new Zombie("Groam", 50, 2), 25.0),
                Arguments.of(new Zombie("Groam", 50, 0), -50.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsZombie")
    void testZombieGetAlive(Zombie zombie, double expected) {
        zombie.takeDamage(100);
        zombie.getAlive();
        double actual = zombie.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsAttackWithHellfire() {
        return Stream.of(
                Arguments.of(new Demon("Devil", 400, 2), new Archer("Sam", 300, 5), 240.0),
                Arguments.of(new Demon("Devil", 400, 1), new Archer("Sam", 240, 5), 180.0),
                Arguments.of(new Demon("Devil", 400, 0), new Archer("Sam", 180, 5), 180.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAttackWithHellfire")
    void testAttackWithHellfire(Demon demon, Hero hero, double expected) {
        demon.attackWithHellfire(hero);
        double actual = hero.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsWerewolfHealth() {
        return Stream.of(
                Arguments.of(new Werewolf("Jake", 250), 150.0),
                Arguments.of(new Werewolf("Jake", 120), 25.0),
                Arguments.of(new Werewolf("Jake", 0), 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsWerewolfHealth")
    void testWerewolfHealth(Werewolf werewolf, double expected) {
        werewolf.takeDamage(100);
        double actual = werewolf.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsClawedHit() {
        return Stream.of(
                Arguments.of(new Werewolf("Jake", 250), new Mag("Herald", 250, 30), 230.0),
                Arguments.of(new Werewolf("Jake", 250), new Mag("Herald", 100, 30), 80.0),
                Arguments.of(new Werewolf("Jake", 250), new Mag("Herald", 20, 30), 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsClawedHit")
    void testClawedHit(Werewolf werewolf, Hero hero, double expected) {
        werewolf.clawedHit(hero);
        double actual = hero.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
