package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.project_pubg.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.lang.reflect.Field;

public class NecromancerTest {
    private Necromancer necromancer;

    @BeforeEach
    public void instanceNecromancer() {
        necromancer = new Necromancer();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/enemy/enemyConstructor.csv", numLinesToSkip = 1)
    public void necromancerConstructorTest(int expectedHealth, String healthFieldName, int inputHealth) {
        necromancer = new Necromancer(inputHealth);

        int actualHealth = Integer.parseInt(getValueFromPrivateField(healthFieldName));

        Assertions.assertEquals(expectedHealth, actualHealth);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/enemy/class_necromancer/attackHero.csv", numLinesToSkip = 1)
    public void attackHeroTest(int expectedHealth, String heroName, int heroHealth) {
        Hero mag = new Mag(heroName, heroHealth);

        necromancer.attackHero(mag);
        int actualMagHealth = mag.getHealth();

        Assertions.assertEquals(expectedHealth, actualMagHealth);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/enemy/class_necromancer/changeHeroHp.csv", numLinesToSkip = 1)
    public void changeHeroHpTest(int expectedHealth, String heroName, int heroHealth) {
        Hero mag = new Mag(heroName, heroHealth);

        necromancer.changeHeroHp(mag);
        int resultMagHealthPoint = mag.getHealth();

        Assertions.assertEquals(expectedHealth, resultMagHealthPoint);
    }

    private String getValueFromPrivateField(String fieldName) {
        String fieldValue = null;
        try {
            Field privateClassField = Enemy.class.getDeclaredField(fieldName);
            privateClassField.setAccessible(true);
            fieldValue = privateClassField.get(necromancer).toString();
        } catch (IllegalAccessException | NoSuchFieldException exception) {
            exception.printStackTrace();
        }
        return fieldValue;
    }
}
