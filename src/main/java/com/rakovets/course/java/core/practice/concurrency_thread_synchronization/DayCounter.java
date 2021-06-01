package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class DayCounter {
    private int days;
    private final Clan world;
    private final Clan wednesday;
    private final Factory factory;
    private static boolean night = true;
    private final int TIME = 50;

    public static boolean isNight() {
        return night;
    }

    public static void setNight(boolean night) {
        DayCounter.night = night;
    }

    public DayCounter(int days, Clan world, Clan wednesday, Factory factory) {
        this.days = days;
        this.world = world;
        this.wednesday = wednesday;
        this.factory = factory;
    }

    public void start() throws InterruptedException {
        Thread fractionWorld = new Thread(world, "Clan World");
        Thread fractionWednesday = new Thread(wednesday, "Clan Wednesday");
        Thread threadFactory = new Thread(factory);

        threadFactory.start();
        fractionWednesday.start();
        fractionWorld.start();

        while (days > 0) {
            setNight(false);
            Thread.sleep(TIME);
            setNight(true);
            Thread.sleep(TIME);
            days--;
        }

        world.setStatus(false);
        wednesday.setStatus(false);
        factory.setStatusFactory(false);
    }
}
