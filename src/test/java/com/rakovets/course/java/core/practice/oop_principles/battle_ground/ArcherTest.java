package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.project_pubg.Archer;
import com.rakovets.course.java.core.practice.oop_principles.project_pubg.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.project_pubg.Hero;
import com.rakovets.course.java.core.practice.oop_principles.project_pubg.Zombie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.lang.reflect.Field;

public class ArcherTest {
    private Archer archer;

    @BeforeEach
    public void instanceArcher() {
        archer = new Archer();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/hero/heroConstructor.csv", numLinesToSkip = 1)
    public void archerConstructorTest(ArgumentsAccessor argumentsAccessor) {
        int indexCounter = 0;
        String expectedName = argumentsAccessor.getString(indexCounter++);
        int expectedHealth = argumentsAccessor.getInteger(indexCounter++);
        String nameFieldName = argumentsAccessor.getString(indexCounter++);
        String healthFieldName = argumentsAccessor.getString(indexCounter++);
        String inputName = argumentsAccessor.getString(indexCounter++);
        int inputHealth = argumentsAccessor.getInteger(indexCounter);

        archer = new Archer(inputName, inputHealth);

        String actualName = getValueFromPrivateField(nameFieldName);
        int actualHealth = Integer.parseInt(getValueFromPrivateField(healthFieldName));

        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedHealth, actualHealth);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/hero/class_archer/attackEnemy.csv", numLinesToSkip = 1)
    public void attackEnemyTest(int expectedHealth, int enemyHealth) {
        Enemy zombie = new Zombie(enemyHealth);

        archer.attackEnemy(zombie);
        int actualZombieHealth = zombie.getHealth();

        Assertions.assertEquals(expectedHealth, actualZombieHealth);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/hero/class_archer/ultimateAttackEnemy.csv", numLinesToSkip = 1)
    public void ultimateAttackEnemyTest(int expectedHealth, int enemyHealth) {
        Enemy zombie = new Zombie(enemyHealth);

        archer.ultimateAttackEnemy(zombie);
        int actualZombieHealth = zombie.getHealth();

        Assertions.assertEquals(expectedHealth, actualZombieHealth);
    }

    private String getValueFromPrivateField(String fieldName) {
        String fieldValue = null;
        try {
            Field privateClassField = Hero.class.getDeclaredField(fieldName);
            privateClassField.setAccessible(true);
            fieldValue = privateClassField.get(archer).toString();
        } catch (IllegalAccessException | NoSuchFieldException exception) {
            exception.printStackTrace();
        }
        return fieldValue;
    }
}
