package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;

public class Werewolf extends Enemy {
    final int MIDNIGHT = 1;
    final int DAWN = 6;
    final int DAMAGE_WEREWOLF = 20;
    final int DAMAGE_WEREWOLF_NIGHT = 40;
    private int time;

    public Werewolf(int health, int time) {
        super(health);
        this.time = time;
    }

    /**
     * Deals damage to the hero.
     *
     * @param hero type enemy.
     */
    @Override
    public void attackHero(Hero hero) {
        if (secondGuise(time)) {
            hero.takingDamage(DAMAGE_WEREWOLF_NIGHT);
        } else {
            hero.takingDamage(DAMAGE_WEREWOLF);
        }
    }

    /**
     * Current HP after taking damage.
     *
     * @param damage damage taken.
     */
    @Override
    public void takingDamage(int damage) {
        if (isAlive()) {
            setHealth(Math.max(getHealth() - damage, 0));
        } else {
            setHealth(0);
        }
    }

    /**
     * Checks if the werewolf is in the second form.
     *
     * @param time current time.
     * @return boolean comparison.
     */
    boolean secondGuise(int time) {
        boolean secondGuise = false;

        if (timeCheck(time)) {
            secondGuise = time >= MIDNIGHT && time <= DAWN;
        }
        return secondGuise;
    }

    /**
     * Validation of the bounds of a variable.
     * <p>
     * If the value is greater than 25 or less than 0 then it returns 0.
     *
     * @param time time to check.
     * @return boolean comparison.
     */
    private boolean timeCheck(int time) {
        return time <= 24 && time > 0;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if (!timeCheck(time)) {
            this.time = 0;
        } else {
            this.time = time;
        }
    }

    public int getDAMAGE_WEREWOLF() {
        return DAMAGE_WEREWOLF;
    }

    public int getDAMAGE_WEREWOLF_NIGHT() {
        return DAMAGE_WEREWOLF_NIGHT;
    }
}
