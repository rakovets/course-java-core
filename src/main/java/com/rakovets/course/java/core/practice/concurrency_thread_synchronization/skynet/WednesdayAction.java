package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

public class WednesdayAction extends Thread {
    private Wednesday wednesday;

    public WednesdayAction(String name, Wednesday wednesday){
        super(name);
        this.wednesday = wednesday;
    }

    @Override
    public void run() {
        while (wednesday.getFactory().getDays() > 0) {
            wednesday.getParts();
        }
        System.out.println("We" + wednesday.getArmyCounter());
        System.out.println(wednesday.getRobotParts().toString());
    }
}

