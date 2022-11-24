package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

public class SkyNetDemo {
    public static void main(String[] args) throws InterruptedException {
        Factory factory = new Factory(3);
        factory.setName("Factory");
        Fraction wednesday = new Fraction(factory, 5);
        wednesday.setName("Wednesday");
        Fraction world = new Fraction(factory, 5);
        world.setName("World");
        factory.start();
        wednesday.start();
        world.start();
        factory.join();
        wednesday.join();
        world.join();
        System.out.println(wednesday.getWinnerFraction(world));
    }
}
