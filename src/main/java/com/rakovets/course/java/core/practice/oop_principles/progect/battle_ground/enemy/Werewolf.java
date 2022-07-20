package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;

public class Werewolf extends Enemy {
    protected static final int MAXIMUM_TIME = 24;
    protected static final int MINIMAL_TIME = 0;

    private int time;

    /**
     * Constructor.
     *
     * @param healthWerewolf werewolf's maximum health..
     * @param damageWerewolf werewolf maximum damage.
     * @param time           current time.
     */
    public Werewolf(int healthWerewolf, int damageWerewolf, int time) {
        super(healthWerewolf, damageWerewolf);
        this.time = time;
    }

    /**
     * The werewolf attacks the hero.
     *
     * @param hero attacked hero.
     */
    @Override
    public void attackHero(Hero hero) {
        int attackMultiplier = 2;

        if (secondGuise(time)) {
            hero.takeDamage(getDamageEnemy() * attackMultiplier);
        } else {
            hero.takeDamage(getDamageEnemy());
        }
    }

    /**
     * The werewolf takes damage.
     *
     * @param damage the werewolf takes.
     */
    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            setHealthEnemy(Math.max(getHealthEnemy() - damage, MINIMAL_HP));
        } else {
            setHealthEnemy(MINIMAL_TIME);
        }
    }

    /**
     * The werewolf assumes a second form if the current time is greater than 1 am and less than 7 am.
     *
     * @param time current time.
     * @return true werewolf in second form, false werewolf not in second form.
     */
    protected boolean secondGuise(int time) {
        int midnight = 1;
        int dawn = 6;

        boolean secondGuise = false;

        if (timeCheck(time)) {
            secondGuise = time >= midnight && time <= dawn;
        }
        return secondGuise;
    }

    /**
     * Makes a check.
     * <li> Time cannot be more than 25 and less than 0.
     * <li> If it receives values 25 and values less than 0 rounds to 0.
     *
     * @param time current time.
     * @return returns the current time after validation.
     */
    private boolean timeCheck(int time) {
        return time < MAXIMUM_TIME && time > MINIMAL_TIME;
    }

    /**
     * Time cannot be more than 25 and less than 0.
     * <p> If it receives values 25 and values less than 0 rounds to 0.
     *
     * @param time returns the current time after validation.
     */
    public void setTime(int time) {
        if (!timeCheck(time)) {
            this.time = MINIMAL_TIME;
        } else {
            this.time = time;
        }
    }
}
