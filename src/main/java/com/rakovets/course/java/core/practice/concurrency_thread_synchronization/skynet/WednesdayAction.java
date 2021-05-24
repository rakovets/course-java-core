package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

public class WednesdayAction extends Thread {
    private Wednesday wednesday;

    public WednesdayAction(String name, Wednesday wednesday){
        super(name);
        this.wednesday = wednesday;
    }

    @Override
    public void run() {
        while (wednesday.getFactory().getDays() >= 0) {
            if(!wednesday.getFactory().isDayTime()) {
                if (!wednesday.getFactory().robotpartsIsEmpty()) {
                    wednesday.getParts();
                    if (wednesday.getFactory().robotpartsIsEmpty()) {
                        wednesday.getFactory().setDayTime(true);
                    }
                }
            }
        }
    }
}

