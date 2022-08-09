package com.rakovets.course.java.core.example.concurrency_thread_synchronization.skynet;

public class SkyNetDemo {
    public static void main(String[] args) throws InterruptedException {
        Factory factory = new Factory(2);
        factory.setName("Factory");
        Faction world = new Faction(factory);
        world.setName("World");
        Faction wednesday = new Faction(factory);
        wednesday.setName("Wednesday");
        factory.start();
        world.start();
        wednesday.start();
    }
}
