package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

public enum SpeedType {
    HIGH(1), MIDDLE(2), SLOW(3);
    private final int speed;
    SpeedType(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

