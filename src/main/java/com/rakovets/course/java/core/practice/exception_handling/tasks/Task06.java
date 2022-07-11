package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.isEmptyException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.IsTheTriggerPulledException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.IsTheShutterMovedException;

public class Task06 {
    private final String SHOT_FIRE = "booom!";

    public String shotFire(int countOfBullets, boolean isShutterMoved, boolean isTriggerPulled)
            throws isEmptyException, IsTheShutterMovedException, IsTheTriggerPulledException {
        if (countOfBullets <= 0) {
            throw new isEmptyException("It is empty!");
        }
        if (!isShutterMoved) {
            throw new IsTheShutterMovedException("The shutter isn't moved!");
        }
        if (!isTriggerPulled) {
            throw new IsTheTriggerPulledException("The trigger isn't pulled!");
        }
        return SHOT_FIRE;
    }
}
