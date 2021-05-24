package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

public class WorldAction extends Thread {
    private World world;

    public WorldAction(String name, World world) {
        super(name);
        this.world = world;
    }
    @Override
    public void run() {
        while (world.getFactory().getDays() > 0) {
                world.getParts();
        }
        System.out.println("wo" + world.getArmyCounter());
        System.out.println(world.getRobotParts().toString());
    }
}

