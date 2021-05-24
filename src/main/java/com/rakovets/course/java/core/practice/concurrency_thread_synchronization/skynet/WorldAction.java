package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

public class WorldAction extends Thread{
    private World world;

    public WorldAction(String name, World world){
        super(name);
        this.world = world;
    }
    @Override
    public void run() {
        while (world.getFactory().getDays() >= 0) {
            if(!world.getFactory().isDayTime()) {
                if(!world.getFactory().robotpartsIsEmpty()) {
                    world.getParts();
                    if (world.getFactory().robotpartsIsEmpty()) {
                        world.getFactory().setDayTime(false);
                    }
                }
            }
        }
    }
}

