package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.project_pubg.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.lang.reflect.Field;

public class ZombieTest {
    private Zombie zombie;

    @BeforeEach
    public void instanceZombie() {
        zombie = new Zombie();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/enemy/enemyConstructor.csv", numLinesToSkip = 1)
    public void cyborgConstructorTest(int expectedHealth, String healthFieldName, int inputHealth) {
        zombie = new Zombie(inputHealth);

        int actualHealth = Integer.parseInt(getValueFromPrivateField(healthFieldName));

        Assertions.assertEquals(expectedHealth, actualHealth);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/enemy/class_zombie/attackHero.csv", numLinesToSkip = 1)
    public void attackHeroTest(int expectedHealth, String heroName, int heroHealth) {
        Hero archer = new Archer(heroName, heroHealth);

        zombie.attackHero(archer);
        int actualArcherHealth = archer.getHealth();

        Assertions.assertEquals(expectedHealth, actualArcherHealth);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/enemy/class_zombie/resurrection.csv", numLinesToSkip = 1)
    public void resurrectionTest(int expectedHealth) {
        zombie.resurrection();
        int resultHealthPoint = zombie.getHealth();

        Assertions.assertEquals(expectedHealth, resultHealthPoint);
    }

    private String getValueFromPrivateField(String fieldName) {
        String fieldValue = null;
        try {
            Field privateClassField = Enemy.class.getDeclaredField(fieldName);
            privateClassField.setAccessible(true);
            fieldValue = privateClassField.get(zombie).toString();
        } catch (IllegalAccessException | NoSuchFieldException exception) {
            exception.printStackTrace();
        }
        return fieldValue;
    }
}
