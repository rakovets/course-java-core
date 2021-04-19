package com.rakovets.course.java.core.practice.exception_handling;

public class Task03 {

    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Task03(String name) {
        this.name = name;
    }

    public void putCollar() {
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("The dog is not ready for a walk!");
        } else {
            throw new DogIsNotReadyException("The dog is not ready for a walk!");
        }
    }
}
