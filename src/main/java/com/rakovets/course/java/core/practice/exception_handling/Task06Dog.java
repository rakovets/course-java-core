package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask06CollarIsPutOn;
import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask06LeashIsPutOn;
import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask06MuzzleIsPutOn;

public class Task06Dog {
    private String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Task06Dog(String name, boolean isCollarPutOn, boolean isLeashPutOn, boolean isMuzzlePutOn) {
        this.name = name;
        this.isCollarPutOn = isCollarPutOn;
        this.isLeashPutOn = isLeashPutOn;
        this.isMuzzlePutOn = isMuzzlePutOn;
    }

    public String checkReadinessDogForWalk() {
        if (!isCollarPutOn) {
            throw new ExceptionTask06CollarIsPutOn("The collar is not on the dog!");
        }
        if (!isLeashPutOn) {
            throw new ExceptionTask06LeashIsPutOn("The dog is not on a leash!");
        }
        if (!isMuzzlePutOn) {
            throw new ExceptionTask06MuzzleIsPutOn("The muzzle is not worn by the dog!");
        }
        return "Dog ready for a walk!";
    }
}
