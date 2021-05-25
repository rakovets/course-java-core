package com.rakovets.course.java.core.practice.skynet;

public class World extends Thread{
    private Storage storage;

    public World(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        storage.getDetail();
    }
}
